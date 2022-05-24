package com.example.ldpthree

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {

    var liveData = MutableLiveData<String>()

    init {
        startTimer()
    }

    fun startTimer() {

        object : CountDownTimer(60000, 1000) {
            override fun onFinish() {
            }
            override fun onTick(abc: Long) {
               liveData.value = (abc / 1000).toString()
            }
        }.start()
    }
}