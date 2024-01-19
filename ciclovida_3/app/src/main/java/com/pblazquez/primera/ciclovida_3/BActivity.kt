package com.pblazquez.primera.ciclovida_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class BActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bactivity)
        Log.d("Ciclo de vida","Activity: Activity B - Método: onCreate")
    }
    override fun onStart(){
        super.onStart()
        Log.d("Ciclo de vida","Activity: Activity B - Método: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de vida","Activity: Activity B - Método: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de vida","Activity: Activity B - Método: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de vida","Activity: Activity B - Método: onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de vida","Activity: Activity B - Método: onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de vida","Activity: Activity B - Método: OnDestroy")
    }
    fun goToThirdActivity(view: View){
        val intent = Intent(this, CActivity::class.java)
        startActivity(intent)
    }
}