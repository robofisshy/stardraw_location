#
_XDCBUILDCOUNT = 1
ifneq (,$(findstring path,$(_USEXDCENV_)))
override XDCPATH = 
override XDCROOT = /home/tl/ti/xdctools_3_25_03_72
override XDCBUILDCFG = ./config.bld
endif
ifneq (,$(findstring args,$(_USEXDCENV_)))
override XDCARGS = 
override XDCTARGETS = 
endif
#
ifeq (0,1)
PKGPATH = /home/tl/ti/xdctools_3_25_03_72/packages;../../..
HOSTOS = Linux
endif
