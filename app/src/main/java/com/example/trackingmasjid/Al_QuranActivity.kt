package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Al_QuranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_al_quran)

        val juzTextView = findViewById<TextView>(R.id.tv_Juz)
        juzTextView.setOnClickListener {
            val intent = Intent(this@Al_QuranActivity, JuzActivity::class.java)
            startActivity(intent)
        }

        val favorittextview = findViewById<TextView>(R.id.tv_favorit)
        favorittextview.setOnClickListener {
            val intent = Intent(this@Al_QuranActivity, FavoritQuranActivity::class.java)
            startActivity(intent)
        }
    }
}