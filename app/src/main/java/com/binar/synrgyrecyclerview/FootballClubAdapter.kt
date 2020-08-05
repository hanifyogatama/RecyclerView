package com.binar.synrgyrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.football_club.view.*

class FootballClubAdapter (val listFootbalClub: ArrayList<FootballClub>) : RecyclerView.Adapter<FootballClubAdapter.ViewHolder>() {

    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {}

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
        holder.itemView.tvClubName.setText(listFootbalClub[position].clubName)
        holder.itemView.tvPoint.setText(listFootbalClub[position].clubPoint.toString())

    }
}