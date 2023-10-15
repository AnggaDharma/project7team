package com.example.trackingmasjid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trackingmasjid.databinding.ItemMasjidBinding
import com.example.trackingmasjid.Models.MasjidModel

class RvMasjidAdapter(private val list: List<MasjidModel>) :
    RecyclerView.Adapter<RvMasjidAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemMasjidBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMasjidBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.ivMasjid.setImageResource(this.image)
                binding.tvMasjid.text = this.name
                binding.tvDesc.text = this.desc
            }
        }
    }
}