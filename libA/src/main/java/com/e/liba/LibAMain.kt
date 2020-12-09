package com.e.liba

import android.util.Log
import com.e.libb.LibB

class LibAMain {
    fun test(){

        val b = LibB()

        b.testLibB()

        Log.d("LibAMain", "test: WORKS")
    }
}