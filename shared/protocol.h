#ifndef _PROTOCOL_H_
#define _PROTOCOL_H_

typedef enum {
    RESOURCE_SYNC_ID_SYNC      = 0,

    RESOURCE_SYNC_ID_SIGNAL_CAPTURE, 
    RESOURCE_SYNC_ID_SIGNAL_PLAYBACK, 
} ResourceID; 

static inline const char *resoruce_id2str(int id) {
    switch(id) {
    case RESOURCE_SYNC_ID_SIGNAL_CAPTURE:
        return "\"SIGNAL_CAPTURE\"";
    case RESOURCE_SYNC_ID_SIGNAL_PLAYBACK:
        return "\"SIGNAL_PLAYBACK\"";
    default:
        return "\"UNKNOW\"";
    }
}

#include <ti/ipc/MessageQ.h>

#define SCREEN_WIDTH        800
#define SCREEN_HEIGHT       480
#define SCREEN_DEPTH        2 

#define IMAGE_WIDTH         640
#define IMAGE_HEIGHT        SCREEN_HEIGHT
#define IMAGE_BYTES_PER_PIX SCREEN_DEPTH 
#define IMAGE_SIZE          (IMAGE_WIDTH * IMAGE_HEIGHT * IMAGE_BYTES_PER_PIX)

typedef struct _Message {
    MessageQ_MsgHeader parent;
    uint8_t buffer[IMAGE_SIZE];
} Message;

#endif
