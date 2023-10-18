package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Fasilitas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fasilitas)

        val ulasanTextView = findViewById<TextView>(R.id.tv_Ulasan)
        ulasanTextView.setOnClickListener {
            val intent = Intent(this@Fasilitas, Ulasan::class.java)
            startActivity(intent)
        }

        val kegiatantextview = findViewById<TextView>(R.id.tv_info_Kegiatan)
        kegiatantextview.setOnClickListener {
            val intent = Intent(this@Fasilitas, KegiatanActivity::class.java)
            startActivity(intent)
        }
        val deskripsitextview = findViewById<TextView>(R.id.tv_deskripsi)
        deskripsitextview.setOnClickListener {
            val intent = Intent(this@Fasilitas, InfoMasjid::class.java)
            startActivity(intent)

        }
    }
}