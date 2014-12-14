DESCRIPTION="fluxbox Window Manager"
SECTION = "x11/wm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=e90c7c0bee6fc368be0ba779e0eac053"

DEPENDS = "virtual/libx11 fluxbox-session"

PV="1.3.5"
SRC_URI = "git://git.fluxbox.org/fluxbox.git;protocol=git;tag=Release-1_3_5"
inherit autotools pkgconfig

S = "${WORKDIR}/git"
B = "${S}"
