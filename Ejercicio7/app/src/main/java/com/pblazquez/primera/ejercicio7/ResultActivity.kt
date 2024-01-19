package com.pblazquez.primera.ejercicio7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.util.*
import com.pblazquez.primera.ejercicio7.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvNombre=findViewById<TextView>(R.id.tvNombre)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        val tvApellidos=findViewById<TextView>(R.id.tvApellidos)
        val apellidos: String = intent.extras?.getString("EXTRA_APELLIDOS").orEmpty()
        val tvCurso=findViewById<TextView>(R.id.tvCurso)
        val curso: String = intent.extras?.getString("EXTRA_CURSO").orEmpty()
        val tvAsignatura=findViewById<TextView>(R.id.tvAsignatura)
        val asignatura: String = intent.extras?.getString("EXTRA_ASIGNATURA").orEmpty()
        val tvNota=findViewById<TextView>(R.id.tvNota)
        val nota: String = intent.extras?.getString("EXTRA_NOTA").orEmpty()

        tvNombre.text = "Hola $name"
        tvApellidos.text="Detalles: \n$apellidos\n$curso\n$asignatura\n$nota"

    }
}