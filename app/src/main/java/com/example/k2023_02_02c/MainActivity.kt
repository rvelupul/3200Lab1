package com.example.k2023_02_02c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val onCreate: String = "onCreate"
    private val onStart: String = "onStart"
    private val onResume: String = "onResume"
    private val onPause: String = "onPause"
    private val onStop: String = "onStop"

    private var count:Int = 0

    private val TAG:String = "TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i(TAG, "On create")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "On start")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "On resume")

    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "On pause")
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "On stop")
    }
}