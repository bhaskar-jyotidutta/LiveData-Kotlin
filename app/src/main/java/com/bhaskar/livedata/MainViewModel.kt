package com.bhaskar.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val factsLivedata = MutableLiveData<String>("This is a fact")

}