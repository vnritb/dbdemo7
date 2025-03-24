package cat.itb.damv2.m78.dbdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform