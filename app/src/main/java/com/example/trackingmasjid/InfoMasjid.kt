package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class InfoMasjid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_masjid)

        val deskripsiview = findViewById<TextView>(R.id.tv_deskripsi)
        deskripsiview.setOnClickListener {
            val intent = Intent(this@InfoMasjid, InfoMasjid::class.java)
            startActivity(intent)
        }

        val fasilitasview = findViewById<TextView>(R.id.tv_fasilitas)
        fasilitasview.setOnClickListener {
            val intent = Intent(this@InfoMasjid, Fasilitas::class.java)
            startActivity(intent)
        }

        val kegiatanview = findViewById<TextView>(R.id.tv_info_Kegiatan)
        kegiatanview.setOnClickListener {
            val intent = Intent(this@InfoMasjid, KegiatanActivity::class.java)
            startActivity(intent)
        }

        val ulasanview = findViewById<TextView>(R.id.tv_Ulasan)
        ulasanview.setOnClickListener {
            val intent = Intent(this@InfoMasjid, Ulasan::class.java)
            startActivity(intent)
        }
    }
}