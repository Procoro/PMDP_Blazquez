package com.pblazquez.primera.ciclovida_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class DActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dactivity)
        Log.d("Ciclo de vida","Activity: Activity D - Método: onCreate")
    }
    override fun onStart(){
        super.onStart()
        Log.d("Ciclo de vida","Activity: Activity D - Método: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de vida","Activity: Activity D - Método: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de vida","Activity: Activity D - Método: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de vida","Activity: Activity D - Método: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de vida","Activity: Activity D - Método: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de vida","Activity: Activity D - Método: OnDestroy")
    }
    fun goToFirstActivity(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}