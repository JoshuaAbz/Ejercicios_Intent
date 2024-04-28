package com.unan.ejerciciosintent

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.unan.ejerciciosintent.databinding.ActivityEjercicio6Binding

class Ejercicio6 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEjercicio6Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnEnviarEj6.setOnClickListener {
            val email = binding.edtEmailEj6.text.toString()
            val asunto = binding.edtAsuntoEj6.text.toString()
            val contenido = binding.edtContenidoEj6.text.toString()

            if (email.isNotEmpty() && asunto.isNotEmpty() && contenido.isNotEmpty()) {
                val enviar = Intent(Intent.ACTION_SEND)
                enviar.type = "message/rfc822"
                enviar.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                enviar.putExtra(Intent.EXTRA_SUBJECT, asunto)
                enviar.putExtra(Intent.EXTRA_TEXT, contenido)
                startActivity(enviar)
            } else {
                Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show()
            }
        }

    }
}