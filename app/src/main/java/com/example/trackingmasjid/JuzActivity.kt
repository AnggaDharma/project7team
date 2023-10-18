package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class JuzActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juz)

        val SurahTextView = findViewById<TextView>(R.id.tv_Surah)
        SurahTextView.setOnClickListener {
            val intent = Intent(this@JuzActivity, Al_QuranActivity::class.java)
            startActivity(intent)
        }

        val favorittextview = findViewById<TextView>(R.id.tv_favorit)
        favorittextview.setOnClickListener {
            val intent = Intent(this@JuzActivity, FavoritQuranActivity::class.java)
            startActivity(intent)
        }

    }
}