package com.killertech.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val factsModel: Facts) : ViewModel() {
    private val factsMutableLiveData = MutableLiveData<String>("Let's see some facts")

    val factsLiveData: LiveData<String>
    get() = factsMutableLiveData


    fun updateFactData() {
        factsMutableLiveData.value = factsModel.getRandomFact()
    }
}