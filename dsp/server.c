#include <xdc/std.h>
#include <xdc/runtime/Error.h>

#include <ti/sysbios/knl/Task.h>

#include <stdlib.h>
#include <string.h>

//#include "log.h"
#include "server.h"
#include "syslink_service.h"
#include "resource_sync.h"
#include "../shared/sys_config.h"
#include "../shared/protocol.h"
#include "message_heap.h"

struct _Server {
    SyslinkService *service;
    ResourceSync *sync;
};

static void server_working(void *server_ptr); 
static void server_destroy(Server *server);

Server *server_new() {
    Server *server = (Server *)calloc(1, sizeof(Server));

    server->service = syslink_service_new("HOST");

    return server;
}

void server_destroy(Server *server) {
    if (! server)
        return;

    syslink_service_destroy(server->service);
    free(server);
}

bool server_start(Server *server) {
  //  ASSERT(server);

    syslink_service_install(server->service, server_working, server);
    return syslink_service_start(server->service);
}

void server_working(void *server_ptr) {
    Server *server = (Server *)server_ptr;

    server->sync = resource_sync_new(syslink_service_host_id(server->service),
            SYS_CFG_LINE_ID, SYS_CFG_EVT_ID_RESOURCE_SYNC, RESOURCE_SYNC_ID_SYNC);

    // wait sync object ready
    if (! resource_sync_pair_wait(server->sync)) {
     //   LOG_ERROR("fail to be synchronize with the slave resouce sync object");
        return;
    }
    //LOG_TRACE("synchronised sync object");

    // message heap for malloc message instance
    MessageHeap *heap = message_heap_new(SYS_CFG_SR_ID_MSG_HEAP);
    uint32_t heap_id = message_heap_id(heap);

    // create capture message queue to receive image from arm 
    MessageQ_Params params;
    MessageQ_Params_init(&params);
    MessageQ_Handle msgq_capture = MessageQ_create(SYS_CFG_MSGQ_CAPTURE, &params);
    resource_sync_post(server->sync, RESOURCE_SYNC_ID_SIGNAL_CAPTURE);

    // open playback message queue to send image to arm
    resource_sync_wait(server->sync, RESOURCE_SYNC_ID_SIGNAL_PLAYBACK);
    MessageQ_QueueId msgq_playback;
    MessageQ_open(SYS_CFG_MSGQ_PLAYBACK, &msgq_playback);

    while (1) {
        // wait capture message 
        MessageQ_Msg msg_ipc = NULL;
        MessageQ_get(msgq_capture, &msg_ipc, MessageQ_FOREVER);

        Message *msg = (Message *)msg_ipc;

        // mark face
    //    lazy_face_marker_process(marker, msg->buffer);
        
        // send playback message
   //     MessageQ_put(msgq_playback, (MessageQ_Msg)msg);

        uint32_t count = MessageQ_count(msgq_capture);
     //   LOG_DEBUG("remain %d entries in capture queue", count);
    }

    //release
   // lazy_face_marker_destroy(marker);
    message_heap_destroy(heap);
    MessageQ_close(&msgq_playback);
    MessageQ_delete(&msgq_capture);
    resource_sync_destroy(server->sync);

    server_destroy(server);
}

