package com.pblazquez.primera.ciclovida_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo de vida","Activity: MainActivity - Método: onCreate")
    }
    override fun onStart(){
        super.onStart()
        Log.d("Ciclo de vida","Activity: MainActivity - Método: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de vida","Activity: MainActivity - Método: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de vida","Activity: MainActivity - Método: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de vida","Activity: MainActivity - Método: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de vida","Activity: MainActivity - Método: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de vida","Activity: MainActivity - Método: OnDestroy")
    }
    fun goToSecondActivity(view: View){
        val intent = Intent(this, BActivity::class.java)
        startActivity(intent)
    }
}