package com.d3if0002.jacationzz.data

import com.d3if0002.jacationzz.model.Place
import org.junit.Assert.*

import org.junit.Test

class PlacesDataTest {

    @Test
    fun getPlace() {
        val expectResult = Place(
            id = 0L,
            thumbnailPic = "https://c1.wallpaperflare.com/preview/489/771/631/eiffel-tower-paris-france-night.jpg",
            heroPic = "https://images.wallpapersden.com/image/download/eiffel-tower-paris-beautiful-view_amxuZmaUmZqaraWkpJRobWllrWdpZWU.jpg",
            name = "Eiffel Tower",
            location = "Paris, Paris",
            rating = 4.8,
            description = "The symbol of Paris and one of the most photographed structures in the world, a visit to the Eiffel Tower is a must for all travelers. Few landmarks inspire such a passion for travel as this single iron structure.\nYoung travelers heading out on the road for the first time, couples looking for a special getaway, artists looking to spur their creativity, and romantics of all types are all drawn to Paris. This is a city where history and culture collide and where travelers of all kinds can find the experience they're after."
        )

        val actualResult = PlacesData.getPlace(0L)

        assertEquals(expectResult, actualResult)
    }
}