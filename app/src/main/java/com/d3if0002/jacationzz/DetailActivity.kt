package com.d3if0002.jacationzz

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.d3if0002.jacationzz.data.PlacesData
import com.d3if0002.jacationzz.model.Place

class DetailActivity : AppCompatActivity() {

    private lateinit var place: Place

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        getPlaceInfo()
        setActionBarTitle()
        setUI()
    }

    private fun setUI() {
        val heroPicture = findViewById<ImageView>(R.id.hero_pic)
        val destinationName = findViewById<TextView>(R.id.place_name)
        val location = findViewById<TextView>(R.id.loc_text)
        val rating = findViewById<TextView>(R.id.rating_text)
        val description = findViewById<TextView>(R.id.desc_text)

        Glide.with(this)
            .load(Uri.parse(place.heroPic))
            .error(R.drawable.pexels_oleksandr_pidvalnyi_1172207)
            .centerCrop()
            .into(heroPicture)

        destinationName.text = place.name
        location.text = place.location
        rating.text = place.rating.toString()
        description.text = place.description
    }

    private fun getPlaceInfo() {
        val id = intent.getLongExtra(MainActivity.PLACE_ID, 0L)
        place = PlacesData.getPlace(id)
    }

    private fun setActionBarTitle() {
        actionBar?.title = place.name
    }
}