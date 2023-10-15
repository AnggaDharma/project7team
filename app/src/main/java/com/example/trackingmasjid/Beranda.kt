package com.example.trackingmasjid

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)


        val zakatview = findViewById<ImageView>(R.id.img_zakat)
                zakatview.setOnClickListener {
                    val intent = Intent(this, zakat::class.java)
                    startActivity(intent)
                }

//        val zakat = findViewById<ImageView>(R.id.img_zakat)
//
//        zakat.setOnClickListener {
//            val intent = Intent(this, zakat::class.java)
//            startActivity(intent)
//        }
    }
}