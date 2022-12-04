package com.example.kebunku

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kebunku_v2.Plant
import com.example.kebunku_v2.R

class NotificationAdapter(private val listNotification: ArrayList<Plant>) :
    RecyclerView.Adapter<NotificationAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvLabel: TextView = itemView.findViewById(R.id.tv_label)
        private val btnKategori: Button = itemView.findViewById(R.id.btn_kategori)
        private val ivPemberitahuan: de.hdodenhof.circleimageview.CircleImageView =
            itemView.findViewById(R.id.ivPemberitahuan)

        fun bind(plant: Plant) {
            tvLabel.text = plant.name
            btnKategori.text = plant.kategori?.get(0) ?: " "
            Glide.with(itemView.context)
                .load(plant.photo)
                .into(ivPemberitahuan)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.notification_row, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listNotification[position])
    }

    override fun getItemCount(): Int = listNotification.size
}