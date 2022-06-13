package com.d3if0002.jacationzz.model

data class Place(
    var id: Long = 0L,
    var thumbnailPic: String = "",
    var heroPic: String = "",
    var name: String = "",
    var location: String = "",
    var rating: Double = 0.0,
    var description: String = ""
)
