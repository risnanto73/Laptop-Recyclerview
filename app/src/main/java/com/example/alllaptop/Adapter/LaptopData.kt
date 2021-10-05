package com.example.alllaptop.Adapter

import com.example.alllaptop.R

object LaptopData{
    private val laptopPhoto = arrayOf(
        R.drawable.satu,
        R.drawable.dua,
        R.drawable.tiga,
        R.drawable.empat,
        R.drawable.lima,
        R.drawable.enam,
        R.drawable.tujung,
        R.drawable.delapan,
        R.drawable.sembilang,
        R.drawable.sepuluh
    )
    private val laptopName = arrayOf(
        "Asus TUF FX504GE i5 8300H GTX1050",
        "MSI GL63 9SC i5 9300H GTX1650",
        "Acer Nitro 5 AN515 54 5942 i5 9300H",
        "MSI GF75 9RCX 270 i7 9750H GTX 1050 Ti",
        "HP Pavilion Gaming 15 DK0042TX i7 9750H",
        "Asus ROG Strix III G531GD I505G3T i5 9300H",
        "Lenovo IdeaPad L340 i7-9750H GTX 1650",
        "Acer Nitro 5 AN515-54-76RU i7-9750H",
        "HP Pavilion Gaming 15 EC0022AX R7 3750H GTX1660Ti",
        "Asus ROG G531GT i7 9750H GTX1650"
    )
    private val laptopDisplay = arrayOf(
        "15.6″ (16:9) LED-backlit FHD (1920×1080) Anti-Glare IPS-level 60Hz Panel with 45% NTSC",
        "15.6″ FHD (1920×1080), IPS-Level",
        "15.6″ FHD (1920×1080), IPS",
        "17.3-inch Full HD IPS",
        "15.6-inch Full HD (1920 x 1080)",
        "15.6” FHD (1920×1080) IPS-Level 60Hz Anti-Glare NTSC 45%",
        "15.6″ FHD (1920 x 1080) IPS, anti-glare, 250 nits 45% color gamut",
        "15.6″ FHD (1920 x 1080) IPS",
        "15.6″ diagonal FHD IPS anti-glare micro-edge WLED-backlit (1920 x 1080)",
        "15.6-inch Full HD (1920×1080) IPS-level panel 60Hz, 100% sRGB"
    )
    private  val laptopProcessor = arrayOf(
        "Intel® Core™ i5 8300H",
        "9th Gen Intel Core i5-9300H (2.40 – 4.10 GHz, 8 MB SmartCache)",
        "Intel® Core™ i5-9300H processor (8MB cache, up to 4.10GHz)",
        "9th Gen Intel Core i7-9750H (2.60 – 4.50 GHz, 12 MB SmartCache)",
        "9th Gen Intel Core i7-9750H (2.60 – 4.50 GHz, 12 MB SmartCache)",
        "Intel® Core™ i5-9300H Processor 2.4GHz (8M Cache, up to 4.1GHz)",
        "Intel Core i7-9750H Processor (2.60Hz, up to 4.50GHz with Turbo Boost, 6 Cores, 12MB Cache)",
        "Intel® Core™ i7-9750H Processor (2.60 GHz. up to 4.50 GHz. 12M Cache)",
        "AMD Ryzen 7 3750H 2.3 – 4.00 GHz",
        "Intel® Core™ i7-9750H 2.6GHz up to 4.5GHz"
    )
    private val laptopGraphic = arrayOf(
        "NVIDIA® GeForce® GTX1050",
        "NVIDIA® GeForce GTX 1650 4 GB DDR6",
        "NVIDIA® GeForce® GTX 1650 with 4GB of GDDR5",
        "Intel UHD Graphics 630, Nvidia GeForce GTX 1050 Ti 4 GB",
        "Intel UHD Graphics 630, Nvidia GeForce GTX 1650 4 GB",
        "Intel® Core™ i5-9300H Processor 2.4GHz (8M Cache, up to 4.1GHz)",
        "NVIDIA GeForce GTX 1650 DDR5 4G",
        "NVIDIA GeForce GTX 1650 4GB",
        "NVIDIA® GeForce® GTX1660Ti 6 GB GDDR5",
        "NVIDIA® GeForce GTX™ 1650 with 4GB GDDR5 VRAM"
    )
    private val laptopRam = arrayOf(
        "4 GB DDR4 2666MHz, 16 GB Intel® Optane™",
        "8 GB DDR4",
        "8 GB DDR4",
        "8 GB DDR4",
        "8 GB 2666 MHz DDR4",
        "8 GB DDR4",
        "8 GB DDR4",
        "8 GB DDR4",
        "8 GB DDR4",
        "8 GB DDR4"
    )
    val listData: ArrayList<Laptop>
        get() {
            val list = arrayListOf<Laptop>()
            for (position in laptopName.indices) {
                val laptop = Laptop()
                laptop.name = laptopName[position]
                laptop.display = laptopDisplay[position]
                laptop.processor = laptopProcessor[position]
                laptop.graphic = laptopGraphic[position]
                laptop.ram = laptopRam[position]
                laptop.photos = laptopPhoto[position]
                list.add(laptop)
            }
            return list
        }
}