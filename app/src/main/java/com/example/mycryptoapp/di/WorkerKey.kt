package com.example.mycryptoapp.di

import androidx.work.ListenableWorker
import dagger.MapKey
import kotlin.reflect.KClass

@MapKey
@Retention
annotation class WorkerKey(val value: KClass<out ListenableWorker>)
