package com.d3if0002.jacationzz

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.d3if0002.jacationzz.model.Place

class LinearListAdapter(private val placeList: ArrayList<Place>) : RecyclerView.Adapter<LinearListAdapter.LinearViewHolder>() {
    class LinearViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var linearImage: ImageView
        var linearTitle: TextView
        var linearSubTitle: TextView

        init {
            linearImage = itemView.findViewById(R.id.thumbnail_pic)
            linearTitle = itemView.findViewById(R.id.linear_title)
            linearSubTitle = itemView.findViewById(R.id.linear_sub_title)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_linear_layout, parent, false)

        return LinearViewHolder(view)
    }

    override fun onBindViewHolder(holder: LinearViewHolder, position: Int) {
        val place = placeList[position]

        Glide.with(holder.itemView.context)
            .load(Uri.parse(place.thumbnailPic))
            .into(holder.linearImage)

        holder.linearTitle.text = place.name
        holder.linearSubTitle.text = place.location
    }

    override fun getItemCount() = placeList.size
}