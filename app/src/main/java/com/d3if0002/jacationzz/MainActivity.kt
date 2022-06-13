package com.d3if0002.jacationzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.d3if0002.jacationzz.data.PlacesData
import com.d3if0002.jacationzz.model.Place

class MainActivity : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    private lateinit var placeList: ArrayList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.recyclerView)
        placeList.addAll(PlacesData.listDestinations)
        showLinearList()
    }

    private fun showLinearList() {
        rv.layoutManager = LinearLayoutManager(this)
        val linearAdapter = LinearListAdapter(placeList)
        rv.adapter = linearAdapter
    }
}