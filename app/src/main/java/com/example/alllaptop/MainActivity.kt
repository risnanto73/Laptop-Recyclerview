package com.example.alllaptop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alllaptop.Adapter.Laptop
import com.example.alllaptop.Adapter.LaptopData
import com.example.alllaptop.Adapter.LaptopDetailActivity
import com.example.alllaptop.Adapter.ListLaptopAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var recvLaptop : RecyclerView
    private var list: ArrayList<Laptop> = arrayListOf()
    var adapter:LaptopData?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recvLaptop = findViewById(R.id.rv_laptop)
        recvLaptop.setHasFixedSize(true)

        list.addAll(LaptopData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        recvLaptop.layoutManager = LinearLayoutManager(this)
        val listLaptopAdapter    = ListLaptopAdapter(list)
        recvLaptop.adapter = listLaptopAdapter
    }

}