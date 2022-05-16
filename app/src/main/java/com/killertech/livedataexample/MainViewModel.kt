package com.killertech.livedataexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val factsModel: Facts) : ViewModel() {
    val factsLiveData = MutableLiveData<String>("Let's see some facts")

    fun updateFactData() {
        factsLiveData.value = factsModel.getRandomFact()
    }
}