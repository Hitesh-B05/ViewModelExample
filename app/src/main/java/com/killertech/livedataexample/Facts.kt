package com.killertech.livedataexample

import kotlin.random.Random

class Facts {
    private val index: Int = 0
    private val factsArray: Array<String>
    = arrayOf("It is impossible for most people to lick their own elbow.",
        "A crocodile cannot stick its tongue out.",
        "A shrimp's heart is in its head.",
        "It is physically impossible for pigs to look up into the sky.",
        "If you sneeze too hard, you could fracture a rib.",
        "Wearing headphones for just an hour could increase the bacteria in your ear by 700 times")

    fun getRandomFact(): String {
        return factsArray.random()
    }
}