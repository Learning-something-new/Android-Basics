package com.test.androidbasics

import android.app.Application
import com.test.androidbasics.simple.repository.repositoryKoinModule
import com.test.androidbasics.viewmodel.di_models.koin.viewKoinModule
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

@HiltAndroidApp
class AndroidBasicsApp: Application() {

    override fun onCreate() {
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@AndroidBasicsApp)
            // declare modules
            modules(
                repositoryKoinModule,
                viewKoinModule
            )
        }

    }

}