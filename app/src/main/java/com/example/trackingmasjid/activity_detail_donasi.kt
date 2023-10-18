package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class activity_detail_donasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_donasi)

        val detailview = findViewById<TextView>(R.id.tv_buttondonasi)
        detailview.setOnClickListener {
            val intent = Intent(this@activity_detail_donasi, activity_metode_pembayaran::class.java)
            startActivity(intent)
        }
    }
}