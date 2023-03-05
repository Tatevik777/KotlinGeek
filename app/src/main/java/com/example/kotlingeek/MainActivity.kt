package com.example.kotlingeek
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_press_me = findViewById(R.id.press_me_btn)as Button

        val btn_press_me2 = findViewById(R.id.press_me_btn2)as Button

// set on-click listener
        btn_press_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "Welcome to Kotlin", Toast.LENGTH_SHORT).show()



            val student1= Student("Тата","пишет код")

            btn_press_me2.setOnClickListener {
                Toast.makeText(this@MainActivity, student1.toString(), Toast.LENGTH_SHORT).show()




            }
         }
    }
}