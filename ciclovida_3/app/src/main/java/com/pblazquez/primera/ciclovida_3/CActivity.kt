package com.pblazquez.primera.ciclovida_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class CActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cactivity)
        Log.d("Ciclo de vida","Activity: Activity C - Método: onCreate")
    }
    override fun onStart(){
        super.onStart()
        Log.d("Ciclo de vida","Activity: Activity C - Método: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de vida","Activity: Activity C - Método: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de vida","Activity: Activity C - Método: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de vida","Activity: Activity C - Método: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de vida","Activity: Activity C - Método: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de vida","Activity: Activity C - Método: OnDestroy")
    }
    fun goToFourthActivity(view: View){
        val intent = Intent(this, DActivity::class.java)
        startActivity(intent)
    }
}