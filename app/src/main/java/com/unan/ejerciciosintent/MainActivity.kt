package com.unan.ejerciciosintent

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.unan.ejerciciosintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnEjercicio1.setOnClickListener {
            val layoutEj1 = Intent(this, Ejercicio1::class.java)
            startActivity(layoutEj1)
        }

        binding.btnEjercicio2.setOnClickListener {
            val layoutEj2 = Intent(this, Ejercicio2::class.java)
            startActivity(layoutEj2)
        }

        binding.btnEjercicio3.setOnClickListener {
            val layoutEj3 = Intent(this, Ejercicio3::class.java)
            startActivity(layoutEj3)
        }

        binding.btnEjercicio4.setOnClickListener {
            val layoutEj4 = Intent(this, Ejercicio4::class.java)
            startActivity(layoutEj4)
        }

        binding.btnEjercicio5.setOnClickListener {
            val layoutEj5 = Intent(this, Ejercicio5::class.java)
            startActivity(layoutEj5)
        }

        binding.btnEjercicio6.setOnClickListener {
            val layoutEj6 = Intent(this, Ejercicio6::class.java)
            startActivity(layoutEj6)
        }

        binding.btnEjercicio9.setOnClickListener {
            val layoutEj9 = Intent(this, Ejercicio9::class.java)
            startActivity(layoutEj9)
        }

        binding.btnEjercicio10.setOnClickListener {
            val layoutEj10 = Intent(this, Ejercicio10::class.java)
            startActivity(layoutEj10)
        }

    }
}