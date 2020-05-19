package com.cadastralshop.kalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var angkaPertama: String = ""
    var angkaKedua: String = ""
    var hasil: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTambah.setOnClickListener {
            angkaPertama = etSatu.text.toString()
            angkaKedua = etDua.text.toString()

            if (angkaPertama.isEmpty() || angkaKedua.isEmpty()) {
                toastInfo(it, "Anda Belum Mengisi")
            } else {
                hasil = angkaPertama.toDouble() + angkaKedua.toDouble()
                tvHasil.text = "$hasil"
            }

        }

        btnMinus.setOnClickListener {
            angkaPertama = etSatu.text.toString()
            angkaKedua = etDua.text.toString()

            if (angkaPertama.isEmpty() || angkaKedua.isEmpty()) {
                toastInfo(it, "Anda Belum Mengisi")
            } else {
                hasil = angkaPertama.toDouble() - angkaKedua.toDouble()
                tvHasil.text = "$hasil"
            }

        }

        btnKali.setOnClickListener {
            angkaPertama = etSatu.text.toString()
            angkaKedua = etDua.text.toString()

            if (angkaPertama.isEmpty() || angkaKedua.isEmpty()) {
                toastInfo(it, "Anda Belum Mengisi")
            } else {
                hasil = angkaPertama.toDouble() * angkaKedua.toDouble()
                tvHasil.text = "$hasil"
            }

        }

        btnBagi.setOnClickListener {
            angkaPertama = etSatu.text.toString()
            angkaKedua = etDua.text.toString()

            if (angkaPertama.isEmpty() || angkaKedua.isEmpty()) {
                toastInfo(it, "Anda Belum Mengisi")
            } else {
                hasil = angkaPertama.toDouble() / angkaKedua.toDouble()
                tvHasil.text = "$hasil"
            }

        }
    }

    fun toastInfo(it: View, textinfo: String) {
        Toast.makeText(this, textinfo, Toast.LENGTH_LONG).show()
    }

}

