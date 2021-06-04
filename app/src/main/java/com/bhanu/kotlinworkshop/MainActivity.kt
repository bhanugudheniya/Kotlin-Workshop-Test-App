package com.bhanu.kotlinworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

   lateinit var toastBtn : Button
   lateinit var mainTitle : TextView
   lateinit var apppic : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toastBtn = findViewById(R.id.toastButton)

        mainTitle = findViewById(R.id.main_title)
        
        apppic = findViewById((R.id.app_pic))

        toastBtn.setOnClickListener{
            Toast.makeText(this, "qwerty", Toast.LENGTH_LONG).show()
        }
    }

    fun changeTitle(view: View) {
        mainTitle.text = "Change Title"
        
        apppic.setImageResource(R.drawable.download)
    }
}

