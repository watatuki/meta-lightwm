DESCRIPTION="JWM (Joe's Window Manager) http://www.joewing.net/projects/jwm/"
SECTION = "x11/wm"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "virtual/libx11 jwm-session \
           libxext libxmu libxinerama libxpm jpeg libpng \
           librsvg cairo libxft libfribidi \
"

inherit autotools pkgconfig gettext

SRC_URI = "http://www.joewing.net/projects/jwm/releases/jwm-${PV}.tar.xz"

SRC_URI[md5sum] = "35063dbd19636cdb90335d4ec0f04cb8"
SRC_URI[sha256sum] = "96fa1c396c00ac0adf170863f8fc848e810e0c9953ad435a41b346c3d0f11e5a"

B = "${S}"
