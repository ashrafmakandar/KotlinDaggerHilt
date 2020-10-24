package com.kalyani.todos.network

import com.kalyani.todos.model.TodrespnseItem
import retrofit2.Call
import retrofit2.http.GET

interface todapi {

    @GET("/posts")
    fun gettods(): Call<ArrayList<TodrespnseItem>>
}