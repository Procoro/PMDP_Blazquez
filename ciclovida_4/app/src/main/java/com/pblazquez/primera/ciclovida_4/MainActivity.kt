package com.pblazquez.primera.ciclovida_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goToMainActivity(view: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
    fun goToWinActivity(view: View){
        val intent = Intent(this, WinActivity::class.java)
        startActivity(intent)
    }
    fun goToLoseActivity(view: View){
        val intent = Intent(this, LoseActivity::class.java)
        startActivity(intent)
    }
}