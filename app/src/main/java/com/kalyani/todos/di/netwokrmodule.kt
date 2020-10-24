package com.kalyani.todos.di

import com.kalyani.todos.network.todapi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class netwokrmodule {


    @Provides
    @Singleton
    @JvmSuppressWildcards
    fun provideRetrofit(

    ): Retrofit =
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())


            .build()

    @Provides
    @Singleton
    @JvmSuppressWildcards
    fun provideApiService(retrofit: Retrofit): todapi =
        retrofit.create(todapi::class.java)


}