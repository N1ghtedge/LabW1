package com.example.example.animal
import android.util.Log

class Hawk: Animal(aVoice = 3) {
    override fun voice(name: String) {
        Log.d(name, "voice")
        super.voice(name)
    }

    override fun fly(name: String) {
        Log.d(name, "Яструб взлітає")
        super.fly(name)
    }
}