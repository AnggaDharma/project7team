package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val editprofileButton = findViewById<Button>(R.id.btn_editprofile)
        editprofileButton.setOnClickListener {
            val intent = Intent(this@ProfilActivity, EditProfilActivity::class.java)
            startActivity(intent)
        }

        val logoutButton = findViewById<Button>(R.id.btn_logout)
        logoutButton.setOnClickListener {
            val intent = Intent(this@ProfilActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}