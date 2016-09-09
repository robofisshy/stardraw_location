################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Each subdirectory must supply rules for building sources it contributes
configPkg/linker.cmd: ../dsp.cfg
	@echo 'Building file: $<'
	@echo 'Invoking: XDCtools'
	"/home/tl/ti/xdctools_3_25_03_72/xs" --xdcpath="/home/tl/ti/bios_6_35_04_50/packages;/home/tl/ti/ccsv5/ccs_base;/home/tl/nfs/omapl138/stardraw_location/shared;/home/tl/ti/syslink_2_21_01_05/packages;/home/tl/ti/ipc_1_25_03_15/packages;" xdc.tools.configuro -o configPkg -t ti.targets.elf.C674 -p yyq.omapl138.location -r release -c "/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4" --compileOptions "-g --optimize_with_debug" "$<"
	@echo 'Finished building: $<'
	@echo ' '

configPkg/compiler.opt: | configPkg/linker.cmd
configPkg/: | configPkg/linker.cmd

main_dsp.obj: ../main_dsp.c $(GEN_OPTS) $(GEN_HDRS)
	@echo 'Building file: $<'
	@echo 'Invoking: C6000 Compiler'
	"/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/bin/cl6x" -mv6740 --abi=eabi -g --include_path="/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include/hw" --include_path="/home/tl/nfs/omapl138/stardraw_location/dsp/opencv/include" --display_error_number --diag_warning=225 --diag_wrap=off --preproc_with_compile --preproc_dependency="main_dsp.pp" $(GEN_OPTS__FLAG) "$(shell echo $<)"
	@echo 'Finished building: $<'
	@echo ' '

message_heap.obj: ../message_heap.c $(GEN_OPTS) $(GEN_HDRS)
	@echo 'Building file: $<'
	@echo 'Invoking: C6000 Compiler'
	"/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/bin/cl6x" -mv6740 --abi=eabi -g --include_path="/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include/hw" --include_path="/home/tl/nfs/omapl138/stardraw_location/dsp/opencv/include" --display_error_number --diag_warning=225 --diag_wrap=off --preproc_with_compile --preproc_dependency="message_heap.pp" $(GEN_OPTS__FLAG) "$(shell echo $<)"
	@echo 'Finished building: $<'
	@echo ' '

resource_sync.obj: ../resource_sync.c $(GEN_OPTS) $(GEN_HDRS)
	@echo 'Building file: $<'
	@echo 'Invoking: C6000 Compiler'
	"/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/bin/cl6x" -mv6740 --abi=eabi -g --include_path="/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include/hw" --include_path="/home/tl/nfs/omapl138/stardraw_location/dsp/opencv/include" --display_error_number --diag_warning=225 --diag_wrap=off --preproc_with_compile --preproc_dependency="resource_sync.pp" $(GEN_OPTS__FLAG) "$(shell echo $<)"
	@echo 'Finished building: $<'
	@echo ' '

server.obj: ../server.c $(GEN_OPTS) $(GEN_HDRS)
	@echo 'Building file: $<'
	@echo 'Invoking: C6000 Compiler'
	"/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/bin/cl6x" -mv6740 --abi=eabi -g --include_path="/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include/hw" --include_path="/home/tl/nfs/omapl138/stardraw_location/dsp/opencv/include" --display_error_number --diag_warning=225 --diag_wrap=off --preproc_with_compile --preproc_dependency="server.pp" $(GEN_OPTS__FLAG) "$(shell echo $<)"
	@echo 'Finished building: $<'
	@echo ' '

syslink.obj: ../syslink.c $(GEN_OPTS) $(GEN_HDRS)
	@echo 'Building file: $<'
	@echo 'Invoking: C6000 Compiler'
	"/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/bin/cl6x" -mv6740 --abi=eabi -g --include_path="/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include/hw" --include_path="/home/tl/nfs/omapl138/stardraw_location/dsp/opencv/include" --display_error_number --diag_warning=225 --diag_wrap=off --preproc_with_compile --preproc_dependency="syslink.pp" $(GEN_OPTS__FLAG) "$(shell echo $<)"
	@echo 'Finished building: $<'
	@echo ' '

syslink_service.obj: ../syslink_service.c $(GEN_OPTS) $(GEN_HDRS)
	@echo 'Building file: $<'
	@echo 'Invoking: C6000 Compiler'
	"/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/bin/cl6x" -mv6740 --abi=eabi -g --include_path="/home/tl/ti/ccsv5/tools/compiler/c6000_7.4.4/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include" --include_path="/home/tl/OMAPL138_StarterWare_1_10_04_01/include/hw" --include_path="/home/tl/nfs/omapl138/stardraw_location/dsp/opencv/include" --display_error_number --diag_warning=225 --diag_wrap=off --preproc_with_compile --preproc_dependency="syslink_service.pp" $(GEN_OPTS__FLAG) "$(shell echo $<)"
	@echo 'Finished building: $<'
	@echo ' '


