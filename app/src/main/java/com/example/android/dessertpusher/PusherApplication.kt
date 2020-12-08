package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber
import java.util.*

class PusherApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}