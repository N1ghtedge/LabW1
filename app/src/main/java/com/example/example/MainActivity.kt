package com.example.example

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.example.animal.Badger
import com.example.example.animal.Hawk
import com.example.example.animal.Hedgehog

class MainActivity : AppCompatActivity() {


    private lateinit var hawkArray: Array<Button>
    private lateinit var hedgehogArray: Array<Button>
    private lateinit var badgerArray: Array<Button>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hedgehogArray = arrayOf(findViewById<Button>(R.id.btn_0), findViewById<Button>(R.id.btn_1))
        badgerArray = arrayOf(findViewById(R.id.btn_2), findViewById(R.id.btn_3))
        hawkArray = arrayOf(findViewById<Button>(R.id.btn_4), findViewById<Button>(R.id.btn_5))

        click()
    }


    private fun click() {
        hedgehogArray.first().setOnClickListener {
            val hedgehog = Hedgehog()
            hedgehog.voice("Їжак")
        }
        hedgehogArray.last().setOnClickListener {
            val hedgehog = Hedgehog()
            hedgehog.hide("Їжак")
        }
        hawkArray.first().setOnClickListener {
            val hawk = Hawk()
            hawk.voice("Яструб")
        }
        hawkArray.last().setOnClickListener {
            val hawk = Hawk()
            hawk.fly("Яструб")
        }
        badgerArray.first().setOnClickListener {
            val badger = Badger()
            badger.voice("Борсук")
        }
        badgerArray.last().setOnClickListener {
            val badger = Badger()
            badger.burrow("Борсук")
        }
    }
}