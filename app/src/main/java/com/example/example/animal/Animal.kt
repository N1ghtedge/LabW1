package com.example.example.animal
import android.util.Log

open class Animal(private val aVoice: Int) : AnimalInterface {
    private var sayAnimal: String = ""

    val arrayOfAnimal = arrayOf("Їжак", "Борсук", "Яструб")

    override fun voice(name: String) {
        sayAnimal = "відтворює звук"
        if (aVoice > 0) {
            for (i in arrayOfAnimal.indices) {
                if (arrayOfAnimal[i] == name) {
                    Log.d("Animal", "$name $sayAnimal")
                }
            }
        } else {
            sayAnimal = "Мовчить"
            Log.d("Animal", sayAnimal)
        }
    }

    override fun hide(name: String) {
        var counter = 0
        while (counter < arrayOfAnimal.size) {
            if (arrayOfAnimal[counter] == name) {
                Log.d(name, "Заховався")
            }
            ++counter
        }
    }

    override fun burrow(name: String) {
        var counter = 0
        while (counter < arrayOfAnimal.size) {
            if (arrayOfAnimal[counter] == name) {
                Log.d(name, "Закопався")
            }
            ++counter
        }
    }

    override fun fly(name: String) {
        var counter = 0
        while (counter < arrayOfAnimal.size) {
            if (arrayOfAnimal[counter] == name) {
                Log.d(name, "Взлетів")
            }
            ++counter
        }
    }
}