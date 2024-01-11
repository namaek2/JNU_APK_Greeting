package com.example.greeting.data

data class Location(
    val id: Int,
    val name: String,
    val latitude: Double,
    val longitude: Double,
    val timestamp: Long
)


fun createRealJejuLocationData(): List<Location> {
    val jejuLocations = listOf(
        Location(1, "제주시청", 33.500770, 126.529150, System.currentTimeMillis()),
        Location(
            2, "제주국제공항", 33.506660, 126.493450, System.currentTimeMillis()
        ),


        Location(
            3, "제주대학교", 33.456670, 126.551170, System.currentTimeMillis()
        ),
        Location(
            4, "한라산", 33.361666, 126.529166, System.currentTimeMillis()
        ),
        Location(
            5, "성산일출봉", 33.458060, 126.942500, System.currentTimeMillis()
        ),
        Location(
            6, "우도", 33.506944, 126.953888, System.currentTimeMillis()
        ),
        Location(
            7, "김녕", 33.536388, 126.820833, System.currentTimeMillis()
        ),
        Location(
            8, "협재", 33.393333, 126.240833, System.currentTimeMillis()
        ),
        Location(
            9, "중문", 33.255833, 126.412500, System.currentTimeMillis()
        ),
        Location(
            10, "함덕", 33.540833, 126.668333, System.currentTimeMillis()
        ),
        Location(
            11, "산방산", 33.246944, 126.565833, System.currentTimeMillis()
        ),
        Location(
            12, "금능", 33.557500, 126.786944, System.currentTimeMillis()
        ),
        Location(
            13, "성읍", 33.389722, 126.802500, System.currentTimeMillis()
        ),
        Location(
            14, "애월", 33.464722, 126.318333, System.currentTimeMillis()
        ),
        Location(
            15,
            "제주시",
            33.500770,
            126.529150,
            System.currentTimeMillis()
        ),
        Location(
            16,
            "서귀포시",
            33.254166,
            126.560278,
            System.currentTimeMillis()
        ),
        Location(
            17,
            "남원읍",
            33.279166,
            126.718333,
            System.currentTimeMillis()
        ),
        Location(
            18,
            "성산읍",
            33.458060,
            126.942500,
            System.currentTimeMillis()
        ),
        Location(
            19,
            "안덕면",
            33.257500,
            126.331666,
            System.currentTimeMillis()
        ),
        Location(
            20,
            "표선면",
            33.348333,
            126.831666,
            System.currentTimeMillis()
        ),
        Location(
            21,
            "송산동",
            33.505833,
            126.523333,
            System.currentTimeMillis()
        ),
        Location(
            22,
            "삼도일동",
            33.511666,
            126.521666,
            System.currentTimeMillis()
        ),
        Location(
            23,
            "삼도이동",
            33.511666,
            126.521666,
            System.currentTimeMillis()
        ),
        Location(
            24,
            "삼도삼동",
            33.511666,
            126.521666,
            System.currentTimeMillis()
        )
    )



    return jejuLocations
}