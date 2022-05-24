package com.example.ldpthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.ldpthree.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var VM: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        VM = ViewModelProvider(this).get(MyViewModel::class.java)

    }


    override fun onStart() {
        super.onStart()
        VM.liveData.observe(this, Observer {
          binding.tv1.text = it
        })
    }
}