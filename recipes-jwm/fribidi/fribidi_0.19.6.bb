SUMMARY = "Fribidi library for bidirectional text"
SECTION = "libs"
PR = "r1"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=a916467b91076e631dd8edb7424769c7"
BBCLASSEXTEND = "native"

PROVIDES = "libfribidi"

inherit autotools lib_package pkgconfig

CFLAGS_append = "  -DPAGE_SIZE=4096 "

SRC_URI = "http://fribidi.org/download/fribidi-${PV}.tar.bz2"

SRC_URI[md5sum] = "ce93d862344991173dabb609bf93ca1d"
SRC_URI[sha256sum] = "cba8b7423c817e5adf50d28ec9079d14eafcec9127b9e8c8f1960c5ad585e17d"

