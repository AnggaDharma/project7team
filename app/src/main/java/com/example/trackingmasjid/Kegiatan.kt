package com.example.trackingmasjid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast

class Kegiatan : AppCompatActivity() {

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

    }
}