package com.example.cob1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import java.math.BigDecimal

class activity_second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val editTextResi2 = findViewById<TextView>(R.id.editTextResi2)
        val editTextNama2 = findViewById<TextView>(R.id.editTextNama2)
        val editTextPenerima2 = findViewById<TextView>(R.id.editTextPenerima2)
        val editTextAlamat2 = findViewById<TextView>(R.id.editTextAlamat2)
        val editTextBerat2 = findViewById<TextView>(R.id.editTextBerat2)
        val editTextLayanan2 = findViewById<TextView>(R.id.editTextLayanan2)
        val editTextTujuan2 = findViewById<TextView>(R.id.editTextTujuan2)
        val editTextBayar = findViewById<TextView>(R.id.editTextBayar)

        val resi = intent.getStringExtra("EXTRA_RESI")
        val nama = intent.getStringExtra("EXTRA_NAMA")
        val penerima = intent.getStringExtra("EXTRA_PENERIMA")
        val alamat = intent.getStringExtra("EXTRA_ALAMAT")
        val berat = intent.getStringExtra("EXTRA_BERAT")
        val layanan = intent.getStringExtra("EXTRA_LAYANAN")
        val firtItem = intent.getStringExtra("EXTRA_TUJUAN")

        val hasilResi = "$resi"
        val hasilNama = "$nama"
        val hasilPenerima = "$penerima"
        val hasilAlamat = "$alamat"
        val hasilBerat = "$berat"
        val hasilLayanan = "$layanan"
        val hasilTujuan = "$firtItem"

        editTextResi2.text = hasilResi
        editTextNama2.text = hasilNama
        editTextPenerima2.text = hasilPenerima
        editTextAlamat2.text = hasilAlamat
        editTextBerat2.text = hasilBerat
        editTextLayanan2.text = hasilLayanan
        editTextTujuan2.text = hasilTujuan

        val weight = hasilBerat.toInt()
        val destination = hasilTujuan

        val cost = when (destination) {
            "Makassar" -> weight * 20000
            "Bone" -> weight * 75000
            "Sinjai" -> weight * 75000
            "Palopo" -> weight * 100000
            "Barru" -> weight * 50000
            "Bulukumba" -> weight * 50000
            "Soppeng" -> weight * 60000
            "Takalar" -> weight * 40000
            "Enrekang" -> weight * 65000
            else -> 0
        }


        editTextBayar.text = "Rp. "+ cost.toString()



    }
}