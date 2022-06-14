package com.d3if0002.jacationzz

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.d3if0002.jacationzz.data.PlacesData
import com.d3if0002.jacationzz.model.Place

class DetailActivity : AppCompatActivity() {

    companion object {
        const val BASE_URL = "https://www.google.com/search?q="
    }

    private lateinit var place: Place

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        getPlaceInfo()
        setActionBarTitle()
        setUI()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.share_btn) {
            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, place.link)
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)

            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setUI() {
        val heroPicture = findViewById<ImageView>(R.id.hero_pic)
        val destinationName = findViewById<TextView>(R.id.place_name)
        val location = findViewById<TextView>(R.id.loc_text)
        val rating = findViewById<TextView>(R.id.rating_text)
        val description = findViewById<TextView>(R.id.desc_text)
        val seeMoreBtn = findViewById<Button>(R.id.go_to_google_btn)

        Glide.with(this)
            .load(Uri.parse(place.heroPic))
            .error(R.drawable.pexels_oleksandr_pidvalnyi_1172207)
            .centerCrop()
            .into(heroPicture)

        destinationName.text = place.name
        location.text = place.location
        rating.text = place.rating.toString()
        description.text = place.description
        seeMoreBtn.setOnClickListener { searchOnGoogle("${place.name} ${place.location}") }
    }

    private fun searchOnGoogle(nama: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(BASE_URL+nama))
        startActivity(intent)
    }

    private fun getPlaceInfo() {
        val id = intent.getLongExtra(MainActivity.PLACE_ID, 0L)
        place = PlacesData.getPlace(id)
    }

    private fun setActionBarTitle() {
        supportActionBar?.title = place.name
    }
}