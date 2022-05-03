package com.example.reg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnc = findViewById<Button>(R.id.HaveBtn)
        btnc.setOnClickListener{
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }
        val btnc1 = findViewById<Button>(R.id.CreateBTN)
        btnc1.setOnClickListener{
            val Intent1 = Intent(this,MainActivity3::class.java)
            startActivity(Intent1)
        }
    }
}