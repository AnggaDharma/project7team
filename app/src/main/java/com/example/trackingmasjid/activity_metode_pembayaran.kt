package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class activity_metode_pembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metode_pembayaran)

        val dana = findViewById<ImageView>(R.id.dana)
        dana.setOnClickListener {
            val intent = Intent(this@activity_metode_pembayaran, activity_nominal::class.java)
            startActivity(intent)
        }

        val go = findViewById<ImageView>(R.id.go)
        go.setOnClickListener {
            val intent = Intent(this@activity_metode_pembayaran, activity_nominal::class.java)
            startActivity(intent)
        }

        val ovo = findViewById<ImageView>(R.id.ovo)
        ovo.setOnClickListener {
            val intent = Intent(this@activity_metode_pembayaran, activity_nominal::class.java)
            startActivity(intent)
        }

        val mandiri = findViewById<ImageView>(R.id.mandiri)
        mandiri.setOnClickListener {
            val intent = Intent(this@activity_metode_pembayaran, activity_nominal::class.java)
            startActivity(intent)
        }

        val bca = findViewById<ImageView>(R.id.bca)
        bca.setOnClickListener {
            val intent = Intent(this@activity_metode_pembayaran, activity_nominal::class.java)
            startActivity(intent)
        }

        val bni = findViewById<ImageView>(R.id.bni)
        bni.setOnClickListener {
            val intent = Intent(this@activity_metode_pembayaran, activity_nominal::class.java)
            startActivity(intent)
        }

        val bri = findViewById<ImageView>(R.id.bri)
        bri.setOnClickListener {
            val intent = Intent(this@activity_metode_pembayaran, activity_nominal::class.java)
            startActivity(intent)
        }
    }
}