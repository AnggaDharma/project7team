package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ZakatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zakat)

        val zakatfitrah = findViewById<Button>(R.id.btn_zakatFitrah)
        zakatfitrah.setOnClickListener {
            val intent = Intent(this, ZakatFitrahActivity::class.java)
            startActivity(intent)

        }

        val zakatprofesi = findViewById<Button>(R.id.btn_zakaProfesi)
        zakatprofesi.setOnClickListener {
            val intent = Intent(this, ZakatProfesiActivity::class.java)
            startActivity(intent)
        }
    }
}