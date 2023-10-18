package com.example.trackingmasjid

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EditProfilActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profil)

        val saveButton = findViewById<Button>(R.id.save_btn)
        saveButton.setOnClickListener {
            val intent = Intent(this@EditProfilActivity, ProfilActivity::class.java)
            startActivity(intent)
        }
    }
}