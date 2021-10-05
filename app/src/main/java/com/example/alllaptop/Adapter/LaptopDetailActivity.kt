package com.example.alllaptop.Adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.alllaptop.R
import kotlinx.android.synthetic.main.activity_laptop_detail.*
import kotlinx.android.synthetic.main.item_row_laptop.*
import kotlinx.android.synthetic.main.item_row_laptop.image_item_photo
import org.w3c.dom.Text

class LaptopDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laptop_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Phone"
        actionbar.setDisplayHomeAsUpEnabled(true)


        val txtSetName: TextView = findViewById(R.id.item_name)
        val txtSetDisplay: TextView = findViewById(R.id.text_item_display)
        val txtSetProcessor: TextView = findViewById(R.id.text_item_processor)
        val txtSetGraphic: TextView = findViewById(R.id.text_item_graphic)
        val txtSetRam: TextView = findViewById(R.id.text_item_ram)

        val txtName = intent.getStringExtra(EXTRA_NAME)
        val txtDisplay   = intent.getStringExtra(EXTRA_DISPLAY)
        val imgGambar   = intent.getIntExtra(EXTRA_IMAGE,0)
        val txtProcessor = intent.getStringExtra(EXTRA_PROCESSOR)
        val txtGraphic = intent.getStringExtra(EXTRA_GRAPHIC)
        val txtRam = intent.getStringExtra(EXTRA_RAM)


        Glide.with(this)
            .load(imgGambar)
            .apply(RequestOptions())
            .into(item_photo)
        txtSetProcessor.text = txtProcessor
        txtSetGraphic.text = txtGraphic
        txtSetName.text = txtName
        txtSetDisplay.text = txtDisplay
        txtSetRam.text = txtRam
        /*item_photo.setOnClickListener {
            Toast.makeText(this,imgGambar,Toast.LENGTH_SHORT).show()
        }*/

    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DISPLAY  = "extra_display"
        const val EXTRA_IMAGE   = "extra_image"
        const val EXTRA_PROCESSOR = "extra_processor"
        const val EXTRA_GRAPHIC = "extra_graphic"
        const val EXTRA_RAM = "extra_ram"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}