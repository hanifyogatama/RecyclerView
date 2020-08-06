package com.binar.synrgyrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.football_club.view.*

class FootballClubAdapter(val listFootbalClub: ArrayList<FootballClub>) :
    RecyclerView.Adapter<FootballClubAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    // method yang menyiapkan layout baris
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FootballClubAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.football_club, parent, false)
        return ViewHolder(view)
    }

    // menghitung jumlah semua baris
    override fun getItemCount(): Int {
        return listFootbalClub.size
    }

    // mengisi setiap data tampilan yang ada
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var images = holder.itemView.image

        holder.itemView.tvClubName.setText(listFootbalClub[position].name)
        holder.itemView.tvOrigin.setText(listFootbalClub[position].clubOrigin)

        Glide.with(holder.itemView.context).load(listFootbalClub[position].clubImage).into(images)

        //holder.itemView.image.setImageResource(listFootbalClub[position].clubImage)
    }
}


