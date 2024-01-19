package com.pblazquez.primera.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.View
import com.pblazquez.primera.ciclodevida.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Lifecycle","MainActivity - onCreate")
    }
    override fun onStart(){
        super.onStart()
        Log.d("Lifecycle","MainActivity ´onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle","MainActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle","MainActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle","MainActivity - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle","MainActivity - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle","MainActivity - OnDestroy")
    }
    fun goToSecondActivity(view: View){
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}