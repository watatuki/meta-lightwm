DESCRIPTION = "fluxbox Window Manager image"

inherit core-image

IMAGE_FEATURES += "splash package-management x11-base"
IMAGE_INSTALL += "jwm jwm-session"

LICENSE = "MIT"

