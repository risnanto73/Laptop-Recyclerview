package com.example.alllaptop.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.alllaptop.R

class ListLaptopAdapter(private val listLaptop: ArrayList<Laptop>): RecyclerView.Adapter<ListLaptopAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view : View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_laptop,viewGroup,false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listLaptop.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val laptop = listLaptop[position]

        Glide.with(holder.itemView.context)
            .load(laptop.photos)
            .apply(RequestOptions())
            .into(holder.imgVPhoto)

        holder.textVName.text = laptop.name
        holder.textVDisplay.text = laptop.display
        holder.imgVPhoto.setOnClickListener {
            //Toast.makeText(holder.itemView.context, phone.photos, Toast.LENGTH_SHORT).show()
        }

        val mauPindah = holder.itemView.context
        holder.itemView.setOnClickListener{
            val pindahDeatil = Intent(mauPindah,LaptopDetailActivity::class.java)
            pindahDeatil.putExtra(LaptopDetailActivity.EXTRA_IMAGE,laptop.photos)
            pindahDeatil.putExtra(LaptopDetailActivity.EXTRA_NAME, laptop.name)
            pindahDeatil.putExtra(LaptopDetailActivity.EXTRA_DISPLAY,laptop.display)
            pindahDeatil.putExtra(LaptopDetailActivity.EXTRA_PROCESSOR,laptop.processor)
            pindahDeatil.putExtra(LaptopDetailActivity.EXTRA_GRAPHIC,laptop.graphic)
            pindahDeatil.putExtra(LaptopDetailActivity.EXTRA_RAM,laptop.ram)
            //Toast.makeText(holder.itemView.context, phone.photos, Toast.LENGTH_SHORT).show()
            mauPindah.startActivity(pindahDeatil)
        }
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var textVName: TextView = itemView.findViewById(R.id.item_name)
        var textVDisplay: TextView = itemView.findViewById(R.id.text_item_display)
        var imgVPhoto: ImageView = itemView.findViewById(R.id.image_item_photo)
    }
}