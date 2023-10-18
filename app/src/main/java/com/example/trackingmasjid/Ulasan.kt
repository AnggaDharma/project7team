package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Ulasan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulasan)

        val deskripsiview = findViewById<TextView>(R.id.tv_deskripsi)
        deskripsiview.setOnClickListener {
            val intent = Intent(this@Ulasan, InfoMasjid::class.java)
            startActivity(intent)
        }

        val fasilitasview = findViewById<TextView>(R.id.tv_fasilitas)
        fasilitasview.setOnClickListener {
            val intent = Intent(this@Ulasan, Fasilitas::class.java)
            startActivity(intent)
        }

        val kegiatanview = findViewById<TextView>(R.id.tv_info_Kegiatan)
        kegiatanview.setOnClickListener {
            val intent = Intent(this@Ulasan, KegiatanActivity::class.java)
            startActivity(intent)
        }

        val ulasanview = findViewById<TextView>(R.id.tv_Ulasan)
        ulasanview.setOnClickListener {
            val intent = Intent(this@Ulasan, Ulasan::class.java)
            startActivity(intent)
        }
    }
}