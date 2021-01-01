require recipes-sato/images/core-image-sato-dev.bb

IMAGE_INSTALL += "libstdc++ mtd-utils"
IMAGE_INSTALL += "wget git vim screen "
IMAGE_INSTALL += "cmake ninja"
DEPENDS += "bootfiles"

LAYERSERIES_COMPAT_rpilinux = "dunfell"
