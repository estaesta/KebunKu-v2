package com.example.kebunku_v2

class NotificationModel {
    fun getList(): ArrayList<Plant> {
        return notificationList
    }

    fun addNotification(plant: Plant) {
        notificationList.add(plant)
    }

    var notificationList: ArrayList<Plant> = arrayListOf()
}