package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class BerandaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)


        val zakatview = findViewById<ImageView>(R.id.img_zakat)
                zakatview.setOnClickListener {
                    val intent = Intent(this@BerandaActivity, ZakatActivity::class.java)
                    startActivity(intent)
                }

    }
}