SUMMARY = "Simple CLI image for the rpi"
HOMEPAGE = "http://www.jumpnowtek.com"

require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += "libstdc++ mtd-utils"
IMAGE_INSTALL += "openssh openssl openssh-sftp-server"
IMAGE_INSTALL += "wget git vim "
IMAGE_INSTALL += "python3"
IMAGE_INSTALL += "cmake ninja"
IMAGE_INSTALL += "ncurses bison flex elfutils zlib"
DEPENDS += "bootfiles"

LAYERSERIES_COMPAT_rpilinux = "dunfell"
