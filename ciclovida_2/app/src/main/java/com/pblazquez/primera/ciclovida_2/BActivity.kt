package com.pblazquez.primera.ciclovida_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class BActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bactivity)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo de vida","Activity: SecondActivity - Método: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de vida","Activity: SecondActivity - Método: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de vida","Activity: SecondActivity - Método: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de vida","Activity: SecondActivity - Método: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de vida","Activity: SecondActivity - Método: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de vida","Activity: SecondActivity - Método: onDestroy")
    }
    fun goToFirstActivity(view: View){
        finish()
    }
}