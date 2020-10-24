package com.kalyani.todos.vmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kalyani.todos.model.TodrespnseItem
import com.kalyani.todos.repos.todoreps

class todvmodel @ViewModelInject constructor(var repos: todoreps) : ViewModel() {

    var data = MutableLiveData<ArrayList<TodrespnseItem>>()
    var list = ArrayList<ArrayList<TodrespnseItem>>()

    fun getdatas() {
        repos.getdata()
        data = repos.getdd()
    }

    fun getdata(): MutableLiveData<ArrayList<TodrespnseItem>> {
        return data
    }
}