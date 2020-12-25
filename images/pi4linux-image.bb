SUMMARY = "Simple CLI image for the rpi"
HOMEPAGE = "http://www.jumpnowtek.com"

require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "libstdc++ mtd-utils"
IMAGE_INSTALL += "openssh openssl openssh-sftp-server"

DEPENDS += "bootfiles"

LAYERSERIES_COMPAT_rpilinux = "gatesgarth"
