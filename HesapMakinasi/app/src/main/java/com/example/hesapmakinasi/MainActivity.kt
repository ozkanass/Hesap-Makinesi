package com.example.hesapmakinasi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val kutu1 = findViewById<EditText>(R.id.kutu1)
        val kutu2 = findViewById<EditText>(R.id.kutu2)
        val btnTopla = findViewById<Button>(R.id.btnTopla)
        val sonucText = findViewById<TextView>(R.id.sonucText)

        btnTopla.setOnClickListener {

            val sayi1 = kutu1.text.toString().toIntOrNull()
            val sayi2 = kutu2.text.toString().toIntOrNull()

            if (sayi1 != null && sayi2 != null) {
                val toplam = sayi1 + sayi2
                sonucText.text = "Sonuç: $toplam"
            } else {
                sonucText.text = "Lütfen geçerli iki sayı girin"
            }
        }
    }
}