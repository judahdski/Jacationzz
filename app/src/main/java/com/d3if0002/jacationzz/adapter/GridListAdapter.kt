package com.d3if0002.jacationzz.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.d3if0002.jacationzz.R
import com.d3if0002.jacationzz.model.Place

class GridListAdapter(private val placeList: ArrayList<Place>) :
    RecyclerView.Adapter<GridListAdapter.GridViewHolder>() {
    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var gridImage: ImageView
        var gridTitle: TextView
        var gridSubTitle: TextView

        init {
            gridImage = itemView.findViewById(R.id.thumbnail_pic_grid)
            gridTitle = itemView.findViewById(R.id.grid_title)
            gridSubTitle = itemView.findViewById(R.id.grid_sub_title)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_grid_layout, parent, false)

        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val place = placeList[position]

        Glide.with(holder.itemView.context)
            .load(Uri.parse(place.thumbnailPic))
            .error(R.drawable.pexels_rachel_claire_4577707)
            .into(holder.gridImage)

        holder.gridTitle.text = place.name
        holder.gridSubTitle.text = place.location
    }

    override fun getItemCount() = placeList.size
}