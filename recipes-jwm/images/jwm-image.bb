DESCRIPTION = "fluxbox Window Manager image"

inherit core-image

IMAGE_FEATURES += "splash package-management x11-base"
IMAGE_INSTALL += "jwm jwm-session jwm-defaultconf udev-extraconf"
#IMAGE_INSTALL += "midori takao-fonts mpv jack2"

LICENSE = "MIT"

