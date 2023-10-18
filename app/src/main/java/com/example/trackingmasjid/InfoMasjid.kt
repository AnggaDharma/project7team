package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InfoMasjid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_masjid)

        val fasilitasTextView = findViewById<TextView>(R.id.tv_fasilitas)
        fasilitasTextView.setOnClickListener {
            val intent = Intent(this@InfoMasjid, Fasilitas::class.java)
            startActivity(intent)
        }

        val kegiatantextview = findViewById<TextView>(R.id.tv_info_Kegiatan)
        kegiatantextview.setOnClickListener {
            val intent = Intent(this@InfoMasjid, KegiatanActivity::class.java)
            startActivity(intent)
        }
        val ulasantextview = findViewById<TextView>(R.id.tv_Ulasan)
        ulasantextview.setOnClickListener {
            val intent = Intent(this@InfoMasjid, Ulasan::class.java)
            startActivity(intent)

        }
    }
}