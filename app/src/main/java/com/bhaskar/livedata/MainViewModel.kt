package com.bhaskar.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val factsLiveDataObject = MutableLiveData<String>("This is a fact")

    val factsLiveData: LiveData<String>
        get() = factsLiveDataObject

    fun updateLiveData(s: String) {
        factsLiveDataObject.value = s
    }

}