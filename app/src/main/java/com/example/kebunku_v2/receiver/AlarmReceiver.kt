package com.example.kebunku_v2.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.example.kebunku_v2.NotificationModel
import com.example.kebunku_v2.Plant
import com.example.kebunku_v2.R

class AlarmReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val builder = NotificationCompat.Builder(context, "kebunku")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("Notifikasi siram tanaman")
            .setContentText("Waktunya menyiram ${intent.getStringExtra("plantName")}")
            .setPriority(NotificationCompat.PRIORITY_HIGH)

        val notificationManager = NotificationManagerCompat.from(context)

        Toast.makeText(context, "Waktunya menyiram ${intent.getStringExtra("plantName")}", Toast.LENGTH_SHORT).show()

        Log.d("AlarmReceiver", "onReceive: ${intent.getStringExtra("plantName")}")
        val notificationModel = NotificationModel()
        val plantName = intent.getStringExtra("plantName")
        val plantDesc = intent.getStringExtra("plantDesc")
        val plantImage = intent.getIntExtra("plantImage", 0)
        val plantKategori = intent.getStringArrayExtra("plantKategori")
        val id = intent.getIntExtra("id", 0)
        notificationModel.addNotification(
            Plant(
                id,
                plantName.toString(),
                plantImage,
                "",
                "",
                plantKategori,
            )
        )
        notificationManager.notify(id, builder.build())
    }
}