package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast

class KegiatanActivity : AppCompatActivity() {

    private lateinit var calendarView: CalendarView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kegiatan)

        val deskripsiview = findViewById<TextView>(R.id.tv_deskripsi)
        deskripsiview.setOnClickListener {
            val intent = Intent(this@KegiatanActivity, InfoMasjid::class.java)
            startActivity(intent)
        }

        val fasilitasview = findViewById<TextView>(R.id.tv_fasilitas)
        fasilitasview.setOnClickListener {
            val intent = Intent(this@KegiatanActivity, Fasilitas::class.java)
            startActivity(intent)
        }

        val kegiatanview = findViewById<TextView>(R.id.tv_info_Kegiatan)
        kegiatanview.setOnClickListener {
            val intent = Intent(this@KegiatanActivity, KegiatanActivity::class.java)
            startActivity(intent)
        }

        val ulasanview = findViewById<TextView>(R.id.tv_Ulasan)
        ulasanview.setOnClickListener {
            val intent = Intent(this@KegiatanActivity, Ulasan::class.java)
            startActivity(intent)
        }

        val calendarView = findViewById<CalendarView>(R.id.calender)
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            // Lakukan sesuatu dengan tanggal yang dipilih
            val selectedDate = "$dayOfMonth/${month + 1}/$year"
            Toast.makeText(this, "Tanggal dipilih: $selectedDate", Toast.LENGTH_SHORT).show()
        }

    }
}