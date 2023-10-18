package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.ScrollView

class DonasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donasi)

        val donasi1 = findViewById<ImageView>(R.id.conten_donasi1)
        donasi1.setOnClickListener {
            val intent = Intent(this@DonasiActivity, activity_detail_donasi::class.java)
            startActivity(intent)
        }

    }
}