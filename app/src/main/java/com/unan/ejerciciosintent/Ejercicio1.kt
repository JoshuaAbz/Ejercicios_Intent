package com.unan.ejerciciosintent

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.unan.ejerciciosintent.databinding.ActivityEjercicio1Binding

class Ejercicio1 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEjercicio1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnSolucionEj1.setOnClickListener {
            val entrada = binding.txtEntradaEj1.text.toString()
            if (entrada.isNotEmpty()) {
                escribir(entrada)
            } else {
                Toast.makeText(this, "No ha ingresado ningún texto", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun escribir(entrada: String) {
        binding.txtDinamicoEj1.text = entrada
    }
}