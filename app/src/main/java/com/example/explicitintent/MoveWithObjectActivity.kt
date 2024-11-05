package com.example.explicitintent

import android.app.Person
import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MoveWithObjectActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PERSON = "extra_person"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_move_with_object)
        val tvObject: TextView = findViewById(R.id.tv_object_received)


        val person = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra<person>(EXTRA_PERSON, person::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra<person>(EXTRA_PERSON)
        }
        if (person != null) {
            val text = "Name : ${person.name.toString()},\nEmail :" +
                    " ${person.email},\nAge : ${person.age},\nLocation : ${person.city}"
            tvObject.text = text
        }
    }
}
