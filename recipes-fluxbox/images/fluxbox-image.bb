DESCRIPTION = "fluxbox Window Manager image"

inherit core-image

IMAGE_FEATURES += "splash package-management x11-base"
IMAGE_INSTALL += "fluxbox fluxbox-session udev-extraconf"

LICENSE = "MIT"

