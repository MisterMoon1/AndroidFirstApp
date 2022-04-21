package com.example.myfirstapp

import android.app.PendingIntent.getActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
    }
    fun createName(view: View) {
        val name = "Богдан"
        val array = arrayOf("Говнов", " снежок-творожок", "лужа", "паскудяра", "скотина")
        val generate = "$name ${array[(Math.random()*array.size).toInt()]}"
        val myToast = Toast.makeText(this, generate, Toast.LENGTH_SHORT)
        myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        myToast.show()
    }
    fun lookEpifania(view: View) {
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        startActivity(intent)
    }
    fun gameRockPaper(view: View) {
        val intent = Intent(this@MainActivity, MainActivity3::class.java)
        startActivity(intent)
    }

}




