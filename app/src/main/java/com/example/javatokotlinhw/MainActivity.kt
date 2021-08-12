package com.example.javatokotlinhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.javatokotlinhw.R
import com.example.javatokotlinhw.MovieCard as MovieCard

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButton()
    }

    private fun initButton() {
        val button = findViewById<Button>(R.id.button)
        var textDataClass1 = findViewById<TextView>(R.id.textViewDataClass1)
        var textDataClass2 = findViewById<TextView>(R.id.textViewDataClass2)
        var textDataClassCopy1 = findViewById<TextView>(R.id.textViewDataClassCopy1)
        var textDataClassCopy2 = findViewById<TextView>(R.id.textViewDataClassCopy2)
        var movieCard1 = MovieCard("Jurassic Park", "Steven Spielberg")
        val movieCard2 = movieCard1.copy()
        val movieCard3 = MovieCard("Aliens", "James Cameron")
        val movieCard4 = MovieCard("2001: A Space Odyssey", "Stanley Kubrick")
        val movieCard5 = MovieCard("The Shining", "Stanley Kubrick")
        val movieCard6 = MovieCard("12 Angry Men", "Sidney Lumet")
        val movieCard7 = MovieCard("The thing", "John Carpenter")
        val movieCard8 = MovieCard("Star Wars", "George Lucas")
        val movieCard9 = MovieCard("Alien", "Ridley Scott")
        val movieCard10 = MovieCard("Blade Runner", "Ridley Scott")


        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val toast = Toast.makeText(applicationContext, "Button pressed", Toast.LENGTH_SHORT).show()
                textDataClass1.setText(movieCard1.title)
                textDataClass2.setText(movieCard1.director)
                textDataClassCopy1.setText(movieCard2.title)
                textDataClassCopy2.setText(movieCard2.director)
            }

        })
    }
}