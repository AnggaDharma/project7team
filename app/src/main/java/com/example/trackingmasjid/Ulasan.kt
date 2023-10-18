package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Ulasan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulasan)

        val fasilitasTextView = findViewById<TextView>(R.id.tv_fasilitas)
        fasilitasTextView.setOnClickListener {
            val intent = Intent(this@Ulasan, Fasilitas::class.java)
            startActivity(intent)
        }

        val kegiatantextview = findViewById<TextView>(R.id.tv_info_Kegiatan)
        kegiatantextview.setOnClickListener {
            val intent = Intent(this@Ulasan, KegiatanActivity::class.java)
            startActivity(intent)
        }
        val deskripsitextview = findViewById<TextView>(R.id.tv_deskripsi)
        deskripsitextview.setOnClickListener {
            val intent = Intent(this@Ulasan, InfoMasjid::class.java)
            startActivity(intent)

        }
    }
}