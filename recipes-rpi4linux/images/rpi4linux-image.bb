require recipes-sato/images/core-image-sato-dev.bb

IMAGE_INSTALL += "libstdc++ mtd-utils"
IMAGE_INSTALL += "wget git vim screen kernel-dev "
IMAGE_INSTALL += "cmake ninja clang"
DEPENDS += "bootfiles"

LAYERSERIES_COMPAT_rpilinux = "dunfell"
