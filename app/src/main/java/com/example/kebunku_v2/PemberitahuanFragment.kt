package com.example.kebunku_v2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kebunku.NotificationAdapter

class PemberitahuanFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_pemberitahuan, container, false)
        val rvNotification = view.findViewById<RecyclerView>(R.id.rvPemberitahuan)

        val notificationModel = NotificationModel()
        val list = notificationModel.getList()

        val notificationAdapter = NotificationAdapter(list)
        rvNotification.adapter = notificationAdapter
        rvNotification.layoutManager = LinearLayoutManager(view.context)

        return view
    }
}