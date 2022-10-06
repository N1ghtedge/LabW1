package com.example.example.animal
import android.util.Log

class Hedgehog : Animal(aVoice = 5) {
    override fun voice(name: String) {
        Log.d(name, "voice")
        super.voice(name)
    }

    override fun hide(name: String) {
        if (name == "Їжак")
            Log.d(name, "Їжак ховається")
        super.hide(name)
    }
}