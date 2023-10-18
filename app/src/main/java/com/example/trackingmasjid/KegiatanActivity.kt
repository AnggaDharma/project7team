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

        val calendarView = findViewById<CalendarView>(R.id.calender)
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            // Lakukan sesuatu dengan tanggal yang dipilih
            val selectedDate = "$dayOfMonth/${month + 1}/$year"
            Toast.makeText(this, "Tanggal dipilih: $selectedDate", Toast.LENGTH_SHORT).show()
        }

        val fasilitasTextView = findViewById<TextView>(R.id.tv_fasilitas)
        fasilitasTextView.setOnClickListener {
            val intent = Intent(this@KegiatanActivity, Fasilitas::class.java)
            startActivity(intent)
        }

        val deskripsitextview = findViewById<TextView>(R.id.tv_deskripsi)
        deskripsitextview.setOnClickListener {
            val intent = Intent(this@KegiatanActivity, InfoMasjid::class.java)
            startActivity(intent)
        }
        val ulasantextview = findViewById<TextView>(R.id.tv_Ulasan)
        ulasantextview.setOnClickListener {
            val intent = Intent(this@KegiatanActivity, Ulasan::class.java)
            startActivity(intent)

        }

    }
}