package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FavoritQuranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorit_quran)

        val juzTextView = findViewById<TextView>(R.id.tv_Juz)
        juzTextView.setOnClickListener {
            val intent = Intent(this@FavoritQuranActivity, JuzActivity::class.java)
            startActivity(intent)
        }

        val surahTextView = findViewById<TextView>(R.id.tv_Surah)
        surahTextView.setOnClickListener {
            val intent = Intent(this@FavoritQuranActivity, Al_QuranActivity::class.java)
            startActivity(intent)
        }
    }
}