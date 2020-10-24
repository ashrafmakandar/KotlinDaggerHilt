package com.kalyani.todos.repos

import androidx.lifecycle.MutableLiveData
import com.kalyani.todos.model.TodrespnseItem
import com.kalyani.todos.network.todapi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class todoreps @Inject constructor(var api: todapi) {
    var list = ArrayList<TodrespnseItem>()
    var daras = MutableLiveData<ArrayList<TodrespnseItem>>()

    fun getdata() {
        api.gettods().enqueue(object : Callback<ArrayList<TodrespnseItem>> {
            override fun onResponse(
                call: Call<ArrayList<TodrespnseItem>>,
                response: Response<ArrayList<TodrespnseItem>>
            ) {
                daras.value = response.body()
            }

            override fun onFailure(call: Call<ArrayList<TodrespnseItem>>, t: Throwable) {
                TODO("Not yet implemented")
            }


        })

    }

    fun getdd(): MutableLiveData<ArrayList<TodrespnseItem>> {
        return daras
    }

}