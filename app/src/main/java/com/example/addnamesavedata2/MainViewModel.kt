package com.example.addnamesavedata2

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel(){

    val names: LiveData<List<String>> = MutableLiveData()
    val addName : MutableLiveData<String> = MutableLiveData()

    fun addName(name: LiveData<List<String>>) {
        names.let {
            if (!it.value?.equals("")!!) {
                addName(names)
            } else {
                "No name entered"
            }
        }

    }
}