package com.unan.ejerciciosintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.unan.ejerciciosintent.databinding.ActivityEjercicio10Binding

class Ejercicio10 : AppCompatActivity() {
    private lateinit var binding: ActivityEjercicio10Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEjercicio10Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnAceptarEj10.setOnClickListener {
            val videoId = binding.txtEntradaEj10.text.toString()
            if (videoId.isNotEmpty()) {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:$videoId"))
                intent.putExtra("VIDEO_ID", videoId)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Debe ingresar un ID", Toast.LENGTH_SHORT).show()
            }
        }

    }
}