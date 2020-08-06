package com.binar.synrgyrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.whatsapp_item.view.*

class WhatsAppAdapter(val listWhatsApp: ArrayList<WhatsApp>) :
    RecyclerView.Adapter<WhatsAppAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    // method yang menyiapkan layout baris
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhatsAppAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.whatsapp_item, parent, false)
        return WhatsAppAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listWhatsApp.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = holder.itemView.imagePerson

        Glide.with(holder.itemView.context).load(listWhatsApp[position].contactImage).circleCrop()
            .into(image)

        holder.itemView.tvName.setText(listWhatsApp[position].nameContact)
        holder.itemView.tvMessage.setText(listWhatsApp[position].message)
        holder.itemView.tvTime.setText(listWhatsApp[position].time)


    }
}