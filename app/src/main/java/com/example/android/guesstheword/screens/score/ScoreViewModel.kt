package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {
    private val logTagClass = "ScoreViewModel"

    // The final score
    var score = finalScore

    init {
        Log.i(logTagClass, "Final score is $finalScore")
    }
}