package com.example.mycryptoapp.presentation

import android.app.Application
import androidx.work.Configuration
import com.example.mycryptoapp.data.workers.CoinWorkerFactory
import com.example.mycryptoapp.di.DaggerApplicationComponent

import javax.inject.Inject

class CoinApp : Application(), Configuration.Provider {

    @Inject
    lateinit var coinWorkerFactory: CoinWorkerFactory

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

    override fun onCreate() {
        component.inject(this)
        super.onCreate()
    }

    override fun getWorkManagerConfiguration(): Configuration {
        return Configuration.Builder()
            .setWorkerFactory(coinWorkerFactory)
            .build()
    }
}