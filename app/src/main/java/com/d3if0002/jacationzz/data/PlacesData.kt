package com.d3if0002.jacationzz.data

import com.d3if0002.jacationzz.model.Place

object PlacesData {
    private val thumbnailPics = arrayOf(
        ""
    )

    private val heroPics = arrayOf(
        ""
    )

    private val names = arrayOf(
        ""
    )

    private val locations = arrayOf(
        ""
    )

    private val ratings = arrayOf(
        0.0
    )

    private val descriptions = arrayOf(
        ""
    )

    val listDestinations: ArrayList<Place>
        get() {
            val list = arrayListOf<Place>()

            for (index in names.indices) {
                val place = Place()
                place.id = index.toLong()
                place.thumbnailPic = thumbnailPics[index]
                place.heroPic = heroPics[index]
                place.name = names[index]
                place.location = locations[index]
                place.rating = ratings[index]
                place.description = descriptions[index]
                list.add(place)
            }

            return list
        }
}