package com.example.trackingmasjid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class TasbihActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var countTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbih)

        countTextView = findViewById(R.id.countTextView)
    }

    fun incrementCount(view: View) {
        count++
        countTextView.text = count.toString()
    }

    fun resetCount(view: View) {
        count = 0
        countTextView.text = "0"
    }

}