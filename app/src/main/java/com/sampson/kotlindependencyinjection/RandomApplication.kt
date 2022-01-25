package com.sampson.kotlindependencyinjection

import android.app.Application

class RandomApplication : Application(){
    val applicationContainer = ApplicationContainer()
    override fun onCreate() {
        super.onCreate()
    }

}