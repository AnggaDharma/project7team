package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class activity_nominal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nominal)

        val bayar = findViewById<Button>(R.id.button2)
        bayar.setOnClickListener {
            val intent = Intent(this@activity_nominal, activity_pembayaran_berhasil::class.java)
            startActivity(intent)
        }
    }
}