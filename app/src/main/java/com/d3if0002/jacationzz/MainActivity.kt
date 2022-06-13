package com.d3if0002.jacationzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.d3if0002.jacationzz.adapter.GridListAdapter
import com.d3if0002.jacationzz.adapter.LinearListAdapter
import com.d3if0002.jacationzz.data.PlacesData
import com.d3if0002.jacationzz.model.Place

class MainActivity : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    var placeList: ArrayList<Place> = arrayListOf()
    private var isLinearLayoutManager = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.recyclerView)
        placeList.addAll(PlacesData.listDestinations)
        showLinearList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        val layoutBtn = menu?.findItem(R.id.action_switch_layout)
        setIcon(layoutBtn)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_switch_layout -> {
                isLinearLayoutManager = !isLinearLayoutManager
                chooseLayout()
                setIcon(item)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setIcon(menuItem: MenuItem?) {
        menuItem?.icon =
            if (isLinearLayoutManager)
                ContextCompat.getDrawable(this, R.drawable.ic_grid_view)
            else ContextCompat.getDrawable(this, R.drawable.ic_linear_view)
    }

    private fun chooseLayout() {
        if (isLinearLayoutManager) showLinearList()
        else showGridList()
    }

    private fun showLinearList() {
        rv.layoutManager = LinearLayoutManager(this)
        val linearAdapter = LinearListAdapter(placeList)
        rv.adapter = linearAdapter
    }

    private fun showGridList() {
        rv.layoutManager = GridLayoutManager(this, 2)
        val gridAdapter = GridListAdapter(placeList)
        rv.adapter = gridAdapter
    }
}