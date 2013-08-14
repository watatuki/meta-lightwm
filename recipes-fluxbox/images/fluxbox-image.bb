DESCRIPTION = "A very basic X11 image with a terminal"

inherit core-image

IMAGE_FEATURES += "splash package-management x11-base"
IMAGE_INSTALL += "fluxbox fluxbox-session"

LICENSE = "MIT"

