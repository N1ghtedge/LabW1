package com.example.example.animal
import android.util.Log

class Badger: Animal(aVoice = 3) {
    override fun voice(name: String) {
        Log.d(name, "voice")
        super.voice(name)
    }

    override fun burrow(name: String) {
        Log.d(name, "Борсук закопується")
        super.burrow(name)
    }
}