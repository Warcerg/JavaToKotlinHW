package com.example.javatokotlinhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.javatokotlinhw.MovieCard as MovieCard

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val button = findViewById<Button>(R.id.button)
        val textDataClass1 = findViewById<TextView>(R.id.textViewDataClass1)
        val textDataClass2 = findViewById<TextView>(R.id.textViewDataClass2)
        val textDataClassCopy1 = findViewById<TextView>(R.id.textViewDataClassCopy1)
        val textDataClassCopy2 = findViewById<TextView>(R.id.textViewDataClassCopy2)
        val textCycle1 = findViewById<TextView>(R.id.textViewCycle1)
        val textCycle2 = findViewById<TextView>(R.id.textViewCycle2)
        val textCycle3 = findViewById<TextView>(R.id.textViewCycle3)
        val movieCard1 = MovieCard("Jurassic Park", "Steven Spielberg")
        val movieCard2 = movieCard1.copy()
        val movieCard3 = MovieCard("Aliens", "James Cameron")
        val movieCard4 = MovieCard("2001: A Space Odyssey", "Stanley Kubrick")
        val movieCard5 = MovieCard("The Shining", "Stanley Kubrick")
        val movieCard6 = MovieCard("12 Angry Men", "Sidney Lumet")
        val movieCard7 = MovieCard("The thing", "John Carpenter")
        val movieCard8 = MovieCard("Star Wars", "George Lucas")
        val movieCard9 = MovieCard("Alien", "Ridley Scott")
        val movieCard10 = MovieCard("Blade Runner", "Ridley Scott")
        val movieList: List<MovieCard> = listOf(movieCard1,movieCard2,movieCard3,movieCard4,movieCard5,movieCard6,movieCard7,movieCard8,movieCard9,movieCard10)

        button.setOnClickListener {
            Toast.makeText(applicationContext, "Button pressed", Toast.LENGTH_SHORT).show()
            textDataClass1.text = movieCard1.title
            textDataClass2.text = movieCard1.director
            textDataClassCopy1.text = movieCard2.title
            textDataClassCopy2.text = movieCard2.director
        }

        initCycles(movieList, textCycle1, textCycle2, textCycle3)
    }


    private fun initCycles(movieList: List<MovieCard>, textCycle1: TextView, textCycle2: TextView, textCycle3: TextView) {
        cycle1(movieList, textCycle1)
        cycle2(movieList, textCycle2)
        cycle3(movieList, textCycle3)

    }

    private fun cycle1(movieList: List<MovieCard>, textCycle1: TextView) {
        println("Cycle 1")
        for (moviecard in movieList) {
            println(moviecard.toString())
            textCycle1.append(moviecard.title + " // ")
        }
    }

    private fun cycle2(movieList: List<MovieCard>, textCycle2: TextView) {
        println("Cycle 2")
        for (i in movieList.size - 1 downTo 0 step 2) {
            println(movieList[i].toString())
            textCycle2.append(movieList[i].director + " // ")
        }
    }

    private fun cycle3(movieList: List<MovieCard>, textCycle3: TextView) {
        println("Cycle 3")
        for (i in movieList.indices) {
            if (movieList[i].director == "Stanley Kubrick") {
                println(movieList[i].toString())
                textCycle3.append(movieList[i].toString() + " \n ")
            }
        }
    }
}