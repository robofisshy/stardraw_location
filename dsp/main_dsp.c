#include <xdc/std.h>
#include <ti/sysbios/BIOS.h>

#include "server.h"

Int main(Int argc, Char* argv[]) {

    Server *server = server_new();
    server_start(server);

    BIOS_start();

    return 0;
}
