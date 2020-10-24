package com.kalyani.todos.ui

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.kalyani.todos.R
import com.kalyani.todos.adapter.adapt
import com.kalyani.todos.vmodel.todvmodel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var todvmodel = ViewModelProvider(this).get(todvmodel::class.java)

        todvmodel.getdatas()
        pgr.visibility = View.VISIBLE

//first repository cre
        //testing brannch created
        //testing 2 test
        //checked
        //test branch two
        //chccking two branch
        todvmodel.getdata().observe(this, Observer {
            recyclerview.layoutManager = LinearLayoutManager(applicationContext)
            pgr.visibility = View.GONE
            var ada = adapt(applicationContext, it)
            recyclerview.adapter = ada
            recyclerview.setHasFixedSize(true)


        })


    }
}