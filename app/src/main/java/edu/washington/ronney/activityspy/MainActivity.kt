package edu.washington.ronney.activityspy

import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate fired")

        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity", "We’re going down, Captain!")
    }


}
