package com.unan.ejerciciosintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.unan.ejerciciosintent.databinding.ActivityEjercicio4Binding

class Ejercicio4 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEjercicio4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnLlamarEj4.setOnClickListener {
            val contacto = binding.txtNumeroEj4.text
            if (contacto.isNotEmpty()) {
                val llamar = Intent(Intent.ACTION_CALL, Uri.parse("tel:${contacto}"))
                startActivity(llamar)
            } else {
                Toast.makeText(this, "Debe ingresar un número de teléfono", Toast.LENGTH_SHORT)
                    .show()
            }
        }

    }
}