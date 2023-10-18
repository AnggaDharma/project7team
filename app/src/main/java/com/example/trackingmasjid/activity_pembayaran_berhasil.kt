package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class activity_pembayaran_berhasil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran_berhasil)

        val berhasil = findViewById<TextView>(R.id.textView14)
        berhasil.setOnClickListener {
            val intent = Intent(this@activity_pembayaran_berhasil, BerandaActivity::class.java)
            startActivity(intent)
        }
    }
}