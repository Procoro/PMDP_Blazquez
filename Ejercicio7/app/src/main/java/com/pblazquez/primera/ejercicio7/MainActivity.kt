package com.pblazquez.primera.ejercicio7

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)

        btnStart.setOnClickListener {
            validateForm()
        }
    }

    private fun validateForm() {
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        val etApellidos = findViewById<AppCompatEditText>(R.id.etApellido)
        val etCurso = findViewById<AppCompatEditText>(R.id.etCurso)
        val etAsignatura = findViewById<AppCompatEditText>(R.id.etAsignatura)
        val etNota = findViewById<AppCompatEditText>(R.id.etNota)


        val name = etName.text.toString()
        val apellidos = etApellidos.text.toString()
        val curso = etCurso.text.toString()
        val asignatura = etAsignatura.text.toString()
        val nota = etNota.text.toString()

        var hasFormError = false

        if (name.isEmpty()) {
            etName.error = "El campo es requerido"
            hasFormError = true
        }

        if (apellidos.isEmpty()) {
            etApellidos.error = "No existe una persona sin apellidos";
            hasFormError = true
        }
        if (curso.isEmpty()){
            etCurso.error = "Es necesario indicar el curso al que perteneces"
            hasFormError = true
        }
        if (asignatura.isEmpty()){
            etAsignatura.error = "Es necesario indicar la asignatura a la que perteneces"
            hasFormError = true
        }
        if (nota.isEmpty()){
            etNota.error = "Es necesario indicar el curso al que perteneces"
            hasFormError = true
        }

        if (!hasFormError) {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("EXTRA_NAME", name)
            intent.putExtra("EXTRA_APELLIDOS", apellidos)
            intent.putExtra("EXTRA_CURSO", curso)
            intent.putExtra("EXTRA_ASIGNATURA", asignatura)
            intent.putExtra("EXTRA_NOTA", nota)
            startActivity(intent)
        }
    }
}