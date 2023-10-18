package com.example.trackingmasjid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.CheckBox

class ZakatFitrahActivity : AppCompatActivity() {

    private lateinit var jumlahOrangEditText: EditText
    private lateinit var hargaBerasEditText: EditText
    private lateinit var perLiterCheckBox: CheckBox
    private lateinit var perKilogramCheckBox: CheckBox
    private lateinit var hasilZakatEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zakat_fitrah)

        jumlahOrangEditText = findViewById(R.id.ed_zakat_Fitrah1)
        hargaBerasEditText = findViewById(R.id.ed_zakat_Fitrah2)
        perLiterCheckBox = findViewById(R.id.checkBox2)
        perKilogramCheckBox = findViewById(R.id.checkBox1)
        hasilZakatEditText = findViewById(R.id.ed_zakat_Fitrah3)
    }
    fun hitungZakat(view: View) {
        val jumlahOrang = jumlahOrangEditText.text.toString().toInt()
        val hargaBeras = hargaBerasEditText.text.toString().toDouble()

        if (!perLiterCheckBox.isChecked && !perKilogramCheckBox.isChecked) {
            hasilZakatEditText.setText("Pilih satuan (per liter atau per kilogram).")
            return
        }

        val zakatPerPerson = if (perLiterCheckBox.isChecked) {
            hargaBeras *3.5
        } else {
            hargaBeras *2.5
        }

        val totalZakat = zakatPerPerson * jumlahOrang
        hasilZakatEditText.setText("Rp $totalZakat")
    }
}