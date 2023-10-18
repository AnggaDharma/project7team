package com.example.trackingmasjid.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trackingmasjid.databinding.PencarianMasjidBinding
import com.example.trackingmasjid.Model.RvMasjidModel

class RvMasjidPencarian(private val list: List<RvMasjidModel>,
                        private val onItemClick: (RvMasjidModel) -> Unit) :
    RecyclerView.Adapter<RvMasjidPencarian.ViewHolder>() {

    class ViewHolder(val binding: PencarianMasjidBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =  PencarianMasjidBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.ivWisata.setImageResource(this.image)
                binding.tvWisata.text = this.name
                binding.tv.text = this.desc

                itemView.setOnClickListener {
                    onItemClick(this)
                }
            }
        }
    }
}