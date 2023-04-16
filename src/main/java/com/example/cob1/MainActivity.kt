package com.example.cob1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    val tujuan = arrayOf("Makasar","Makassar","Bone","Sinjay","Palopo","Barru","Bulukamba","Soppeng","Takalar","Enrekang")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        val editTextResi = findViewById<EditText>(R.id.editTextResi)
        val editTextNama = findViewById<EditText>(R.id.editTextNama)
        val editTextPenerima = findViewById<EditText>(R.id.editTextPenerima)
        val editTextAlamat = findViewById<EditText>(R.id.editTextAlamat)
        val editTextBerat = findViewById<EditText>(R.id.editTextBerat)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val btnBatal = findViewById<Button>(R.id.btnBatal)
        val spinnerTujuan = findViewById<Spinner>(R.id.spinnerTujuan)





        btnDaftar.setOnClickListener {
            val resi = editTextResi.text.toString()
            val nama = editTextNama.text.toString()
            val penerima = editTextPenerima.text.toString()
            val alamat = editTextAlamat.text.toString()
            val berat = editTextBerat.text.toString()
            val selectedLayanan = radioGroup.checkedRadioButtonId
            val layanan = if (selectedLayanan == R.id.rbRegular) "Regular" else "Kilat"

            val firtItem = spinnerTujuan.selectedItem.toString()



            Intent(this,activity_second::class.java).also {
                it.putExtra("EXTRA_RESI",resi)
                it.putExtra("EXTRA_NAMA",nama)
                it.putExtra("EXTRA_PENERIMA",penerima)
                it.putExtra("EXTRA_ALAMAT",alamat)
                it.putExtra("EXTRA_BERAT",berat)
                it.putExtra("EXTRA_LAYANAN",layanan)
                it.putExtra("EXTRA_TUJUAN",firtItem)

                startActivity(it)
            }

        }

        btnBatal.setOnClickListener {
            editTextResi.setText("")
            editTextNama.setText("")
            editTextPenerima.setText("")
            editTextAlamat.setText("")
            editTextBerat.setText("")

        }
    }
}