DESCRIPTION = "Yocto Linux config file for JWM"
HOMEPAGE = "https://github.com/watatuki/meta-lightwm"

LICENSE = "MIT"

SECTION = "x11"

LIC_FILES_CHKSUM = "file://COPYING;md5=1b71f681713d1256e1c23b0890920874"

SRC_URI = "http://ja.best-wallpaper.net/wallpaper/1920x1080/1411/Art-painting-winter-snow-bench-lantern-trees_1920x1080.jpg \
           file://default.jwmrc \
           file://COPYING "
           
SRC_URI[md5sum] = "9b2f14935b64f1770af9ed8d1e50f819"
SRC_URI[sha256sum] = "399b7798d8f5481bdf5009b27263ae423d9f2a1dc7e8d6b71ddbd3e2de52acca"

S = "${WORKDIR}"

do_install() {
	install -d ${D}/home/root 
	install -m 0666 ${WORKDIR}/default.jwmrc ${D}/home/root/.jwmrc
	install -d ${D}/home/root/.jwm
	install -m 0666 ${WORKDIR}/Art-painting-winter-snow-bench-lantern-trees_1920x1080.jpg ${D}/home/root/.jwm/bg.jpg
}

FILES_${PN} = "/home/root/.jwmrc /home/root/.jwm/*"
