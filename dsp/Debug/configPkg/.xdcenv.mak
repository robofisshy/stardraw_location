#
_XDCBUILDCOUNT = 
ifneq (,$(findstring path,$(_USEXDCENV_)))
override XDCPATH = /home/tl/ti/bios_6_35_04_50/packages;/home/tl/ti/ccsv5/ccs_base;/home/tl/nfs/omapl138/stardraw_location/shared;/home/tl/ti/syslink_2_21_01_05/packages;/home/tl/ti/ipc_1_25_03_15/packages
override XDCROOT = /home/tl/ti/xdctools_3_25_03_72
override XDCBUILDCFG = ./config.bld
endif
ifneq (,$(findstring args,$(_USEXDCENV_)))
override XDCARGS = 
override XDCTARGETS = 
endif
#
ifeq (0,1)
PKGPATH = /home/tl/ti/bios_6_35_04_50/packages;/home/tl/ti/ccsv5/ccs_base;/home/tl/nfs/omapl138/stardraw_location/shared;/home/tl/ti/syslink_2_21_01_05/packages;/home/tl/ti/ipc_1_25_03_15/packages;/home/tl/ti/xdctools_3_25_03_72/packages;..
HOSTOS = Linux
endif
