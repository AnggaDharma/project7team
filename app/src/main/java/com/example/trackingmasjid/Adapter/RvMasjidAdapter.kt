package com.example.trackingmasjid.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trackingmasjid.databinding.ViewRecycleBinding
import com.example.trackingmasjid.Model.RvMasjidModel

class RvMasjidAdapter(private val list: List<RvMasjidModel>,
                      private val onItemClick: (RvMasjidModel) -> Unit) :
    RecyclerView.Adapter<RvMasjidAdapter.ViewHolder>() {

    class ViewHolder(val binding: ViewRecycleBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =  ViewRecycleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.ivMasjid.setImageResource(this.image)
                binding.tvMasjid.text = this.name
                binding.tvJarak.text = this.desc

                itemView.setOnClickListener {
                    onItemClick(this)
                }
            }
        }
    }
}