package com.example.trackingmasjid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trackingmasjid.Adapter.RvMasjidPencarian
import com.example.trackingmasjid.Model.RvMasjidModel
import com.example.trackingmasjid.databinding.ActivityMasjidBinding

class MasjidActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMasjidBinding
    private lateinit var adapterKeren: RvMasjidPencarian
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMasjidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        setRvAdapter()
    }

    private fun init() {
        binding.rvExamples.layoutManager = LinearLayoutManager(this@MasjidActivity)
    }
    private fun setRvAdapter() {

        val dataList:MutableList<RvMasjidModel> = mutableListOf()

        namemj().forEachIndexed { index, name ->
            dataList.add(RvMasjidModel(imageMasjid().get(index),name,jarak()[index]))
        }

        Log.d("ISI DATANYA ",dataList.toString())
        adapterKeren = RvMasjidPencarian(dataList) { selectedMasjid ->
            val intent = Intent(this@MasjidActivity, InfoMasjid::class.java)
            intent.putExtra("masjidName", selectedMasjid.name)
            startActivity(intent)
        }

        binding.rvExamples.adapter = adapterKeren

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