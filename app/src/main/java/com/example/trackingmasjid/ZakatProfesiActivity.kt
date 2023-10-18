package com.example.trackingmasjid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class ZakatProfesiActivity : AppCompatActivity() {

    private lateinit var pendapatan: EditText
    private lateinit var pengeluaran: EditText
    private lateinit var hutang: EditText
    private lateinit var hargaberas: EditText
    private lateinit var liter: CheckBox
    private lateinit var kilogram: CheckBox
    private lateinit var hasil: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zakat_profesi)

        pendapatan = findViewById(R.id.ed_zakat_Fitrah1)
        pengeluaran = findViewById(R.id.ed_zakat_Fitrah2)
        hutang = findViewById(R.id.ed_zakat_Fitrah3)
        hargaberas = findViewById(R.id.ed_zakat_Fitrah4)
        liter = findViewById(R.id.checkBox2)
        kilogram = findViewById(R.id.checkBox1)
        hasil = findViewById(R.id.ed_zakat_Fitrah5)
    }

}