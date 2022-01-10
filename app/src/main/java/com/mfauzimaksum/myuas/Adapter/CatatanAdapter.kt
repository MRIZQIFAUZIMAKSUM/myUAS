package com.mfauzimaksum.myuas.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mfauzimaksum.myuas.Model.CatatanModel
import com.mfauzimaksum.myuas.R

class CatatanAdapter (
    val catatans: ArrayList<CatatanModel.Data>
): RecyclerView.Adapter<CatatanAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.absenlist, parent, false)
    )

    override fun onBindViewHolder(holder: CatatanAdapter.ViewHolder, position: Int) {
        val data = catatans[position]
        holder.textCatatan.text = data.namasekolah
        holder.textWaktu.text = data.alamatsekolah
    }

    override fun getItemCount() = catatans.size

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val textCatatan = view.findViewById<TextView>(R.id.text_catatan)
        val textWaktu = view.findViewById<TextView>(R.id.text_waktu)
    }

    public fun setData(data: List<CatatanModel.Data>){
        catatans.clear()
        catatans.addAll(data)
        notifyDataSetChanged()
    }

}