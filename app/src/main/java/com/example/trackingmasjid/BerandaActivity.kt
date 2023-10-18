package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.res.TypedArray
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trackingmasjid.Adapter.RvMasjidAdapter
import com.example.trackingmasjid.databinding.ActivityBerandaBinding
import com.example.trackingmasjid.Model.RvMasjidModel

class BerandaActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBerandaBinding
    private lateinit var adapterKeren:RvMasjidAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBerandaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val zakatview = findViewById<ImageView>(R.id.iconzakat)
        zakatview.setOnClickListener {
            val intent = Intent(this@BerandaActivity, ZakatActivity::class.java)
            startActivity(intent)
        }

        val donasiview = findViewById<ImageView>(R.id.donasi)
        donasiview.setOnClickListener {
            val intent = Intent(this@BerandaActivity, DonasiActivity::class.java)
            startActivity(intent)
        }

        val search = findViewById<EditText>(R.id.editTextSearch)
        search.setOnClickListener {
            val intent = Intent(this@BerandaActivity, MapsActivity::class.java)
            startActivity(intent)
        }

        val tasbihview = findViewById<ImageView>(R.id.tasbih)
        tasbihview.setOnClickListener {
            val intent = Intent(this@BerandaActivity, TasbihActivity::class.java)
            startActivity(intent)
        }
        val alquranView = findViewById<ImageView>(R.id.alquran)
        alquranView.setOnClickListener {
            val intent = Intent(this@BerandaActivity, Al_QuranActivity::class.java)
            startActivity(intent)
        }



        init()
        setRvAdapter()
    }

    private fun init() {
        binding.rvExample.layoutManager = LinearLayoutManager(this@BerandaActivity, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun setRvAdapter() {

        val dataList:MutableList<RvMasjidModel> = mutableListOf()

        namemj().forEachIndexed { index, name ->
            dataList.add(RvMasjidModel(imageMasjid().get(index),name,jarak()[index]))
        }

        Log.d("ISI DATANYA ",dataList.toString())
        adapterKeren = RvMasjidAdapter(dataList)
        binding.rvExample.adapter = adapterKeren

    }

    private fun namemj():Array<String> = resources.getStringArray(R.array.data_masjid)
    private fun jarak():Array<String> = resources.getStringArray(R.array.data_lokasi)

    private fun imageMasjid():List<Int> = listOf(
        R.drawable.masjid_istiqlal,
        R.drawable.masjid_an_nur,
        R.drawable.masjid_baiturrahman,
        R.drawable.masjid_ics,
        R.drawable.masjid_agung_jateng
    )
}