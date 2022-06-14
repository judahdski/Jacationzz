package com.d3if0002.jacationzz.data

import com.d3if0002.jacationzz.model.Place

object PlacesData {
    private val thumbnailPics = arrayOf(
        "https://c1.wallpaperflare.com/preview/489/771/631/eiffel-tower-paris-france-night.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Colosseo_2020.jpg/1200px-Colosseo_2020.jpg",
        "https://cdn.mos.cms.futurecdn.net/XsbvTN6PRi6PZtgEGvRsiE.jpg",
        "https://besthqwallpapers.com/Uploads/29-1-2018/38644/thumb2-acropolis-of-athens-4k-landmark-summer-ruins.jpg",
        "https://wallpapercave.com/wp/CPeQsAv.jpg",
        "https://p4.wallpaperbetter.com/wallpaper/724/198/515/peter-rock-petra-desert-wallpaper-preview.jpg",
        "https://wallpaperaccess.com/full/1454779.jpg",
    )

    private val heroPics = arrayOf(
        "https://images.wallpapersden.com/image/download/eiffel-tower-paris-beautiful-view_amxuZmaUmZqaraWkpJRobWllrWdpZWU.jpg",
        "https://images6.alphacoders.com/458/thumb-1920-458510.jpg",
        "https://wallpaper.dog/large/20388218.jpg",
        "https://www.desktopbackground.org/p/2013/06/15/592330_top-parthenon-temple-athens-greece-wallpapers_1235x776_h.jpg",
        "https://wallpapercave.com/wp/CPeQsAv.jpg",
        "https://c4.wallpaperflare.com/wallpaper/246/806/550/nature-landscape-desert-sand-wallpaper-preview.jpg",
        "https://images5.alphacoders.com/594/594362.jpg",
    )

    private val names = arrayOf(
        "Eiffel Tower",
        "The Colosseum",
        "Statue of Liberty",
        "The Acropolis",
        "Great Pyramid of Giza",
        "Petra",
        "The Louvre"
    )

    private val locations = arrayOf(
        "Paris, France",
        "Rome, Italy",
        "NYC, USA",
        "Athens, Attica, Greece",
        "Egypt",
        "Ma'an Governorate, Jordan",
        "Paris, France"
    )

    private val ratings = arrayOf(
        4.8,
        4.5,
        4.1,
        4.3,
        3.9,
        4.6,
        4.2
    )

    private val descriptions = arrayOf(
        "The symbol of Paris and one of the most photographed structures in the world, a visit to the Eiffel Tower is a must for all travelers. Few landmarks inspire such a passion for travel as this single iron structure.\nYoung travelers heading out on the road for the first time, couples looking for a special getaway, artists looking to spur their creativity, and romantics of all types are all drawn to Paris. This is a city where history and culture collide and where travelers of all kinds can find the experience they're after.",
        "The most famous and largest structure still standing from the Roman Empire, the Colosseum is also the biggest attraction of modern-day Rome. It's been a bucket-list destination for travelers for generations. And it does not disappoint.\nSet in the heart of the city, the Colosseum is an easy place to visit. Direct flights from around the world land in Rome daily, making it a destination you can visit on a weekend if you choose. Wander through Rome's ancient streets, tour the colosseum, and if time allows, plan a trip to other areas of Italy.",
        "America is full of great sights and places to visit, but it's the Statue of Liberty that represents the United States like no other place. This symbol of freedom in New York City was gifted by the French to the American people in 1896.\nOf all the attractions in New York City, this is one every tourist must-see. The best thing to do at the Statue of Liberty is to take a ride up to her crown and soak up the view over the city. Access to the statue is via ferry, also a highlight of a visit.",
        "Perched above present-day Athens, the Acropolis draws you up and in. Follow in the footsteps of ancients as you walk up the same steps that have been walked on since 438 BC - 2,500 years.\nViews out over the city are incredible as you walk between the meticulously restored ancient buildings. Near the end of the day, you'll want to linger and watch the sunset from the stairs near the entrance. This is a nightly ritual in Athens.\nThe site is also impressive looking up at it from the city below. Spend an evening dining on a rooftop patio to soak in the view of the hilltop ruins lit up at night.",
        "If you've visited places like the Colosseum in Rome or the Acropolis in Athens, built over 2,000 years ago, you may think you have a good handle on ancient sites. But the Pyramids of Giza take ancient to a whole other level. These were built over 4,500 years ago. Tourists were coming to see these magnificent structures thousands of years ago.\nLocated just outside Cairo, the pyramids, which are also where you'll find the Sphinx, are easy to get to, and tours are easy to arrange. A sunset camel ride around the structures is a wonderful experience.",
        """You may have an Indiana Jones feeling as you walk through a 1.2-kilometer-long narrow crack in the sandstone hills and emerge into a hidden city. First built over 2,000 years ago and lost to the outside world for 600 years, the city was only discovered in 1812.
        Stunning buildings are carved directly into the red rock walls and are wonderfully preserved, just begging to be explored and photographed.
        If you arrive early, an eerie silence, coupled with long shadows, gives this abandoned city a special feel.""".trimIndent(),
        """
            The Louvre (English: /ˈluːv(rə)/ LOOV(-rə)), or the Louvre Museum (French: Musée du Louvre [myze dy luvʁ] (listen)), is the world's most-visited museum, and a historic landmark in Paris, France. It is the home of some of the best-known works of art, including the Mona Lisa and the Venus de Milo. A central landmark of the city, it is located on the Right Bank of the Seine in the city's 1st arrondissement (district or ward). At any given point in time, approximately 38,000 objects from prehistory to the 21st century are being exhibited over an area of 72,735 square meters (782,910 square feet). Attendance in 2021 was 2.8 million due to the COVID-19 pandemic. The museum was closed for 150 days in 2020, and attendance plunged by 72 percent to 2.7 million. Nonetheless, the Louvre still topped the list of most-visited art museums in the world in 2021.
        The museum is housed in the Louvre Palace, originally built in the late 12th to 13th century under Philip II. Remnants of the Medieval Louvre fortress are visible in the basement of the museum. Due to urban expansion, the fortress eventually lost its defensive function, and in 1546 Francis I converted it into the primary residence of the French Kings. The building was extended many times to form the present Louvre Palace. In 1682, Louis XIV chose the Palace of Versailles for his household, leaving the Louvre primarily as a place to display the royal collection, including, from 1692, a collection of ancient Greek and Roman sculpture. In 1692, the building was occupied by the Académie des Inscriptions et Belles-Lettres and the Académie Royale de Peinture et de Sculpture, which in 1699 held the first of a series of salons. The Académie remained at the Louvre for 100 years. During the French Revolution, the National Assembly decreed that the Louvre should be used as a museum to display the nation's masterpieces.
        """.trimIndent()
    )

    private val links = arrayOf(
        "https://www.toureiffel.paris/en",
        "https://romesite.com/colosseum.html",
        "https://www.nps.gov/stli/index.htm",
        "https://www.acropolisofathens.gr/aoa/",
        "https://www.britannica.com/topic/Pyramids-of-Giza",
        "https://whc.unesco.org/en/list/326/",
        "https://www.louvre.fr/en",
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
                place.link = links[index]
                list.add(place)
            }

            return list
        }

    fun getPlace(id: Long): Place {
        var place = Place()

        for (destination in listDestinations)
            if (destination.id == id) destination.also { place = it }

        return place
    }
}