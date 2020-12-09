package com.e.testjitpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.liba.LibAMain

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LibAMain().test()
    }
}