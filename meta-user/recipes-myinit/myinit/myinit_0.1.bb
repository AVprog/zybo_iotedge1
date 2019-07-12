#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

SUMMARY = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://myinit.sh \
            "

S = "${WORKDIR}"

#inherit update-rc.d
#INITSCRIPT_NAME = "myinit"
#INITSCRIPT_PARAMS = "start 99 S ."


do_install() {
	 	# myinit is init daemon
	install -d ${D}/${sysconfdir}/init.d
	install -m 0755 ${S}/myinit.sh ${D}/${sysconfdir}/init.d/myinit.sh
	install -d ${D}/${sysconfdir}/rc5.d
	ln -s /etc/init.d/myinit.sh ${D}/${sysconfdir}/rc5.d/S99myinit.sh	
}