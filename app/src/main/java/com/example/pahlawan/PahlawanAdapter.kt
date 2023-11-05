package com.example.pahlawan

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.pahlawan.databinding.ActivityMainBinding
import com.example.pahlawan.databinding.ItemPahlawanBinding

class PahlawanAdapter(val pahlawans:List<Pahlawans>):RecyclerView.Adapter<PahlawanAdapter.PahlawanViewHolder>(){
    inner class PahlawanViewHolder(val binding:ItemPahlawanBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PahlawanViewHolder {
        val binding = ItemPahlawanBinding.inflate(LayoutInflater.from(parent.context))
        return PahlawanViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pahlawans.size
    }

    override fun onBindViewHolder(holder: PahlawanViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context,pahlawans[position].nama,Toast.LENGTH_LONG).show()

        }


        holder.itemView.apply {
            with(holder.binding){
                namaPahlawan.text=pahlawans[position].nama
                poster.setImageResource(pahlawans[position].image)
                tanggalLahir.text=pahlawans[position].tanggal
                place.text=pahlawans[position].place
                desc.text=pahlawans[position].desc
            }
        }
    }


}