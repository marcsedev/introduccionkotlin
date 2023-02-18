package com.marcsedev.introduccionkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    companion object {
        const val moneda ="EUR" //constant you can use in all code
         }

    override fun onCreate(savedInstanceState: Bundle?) { //proceso de reación de la ventana
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date = "05/06/2023"
        var name = "marc"
        // is the same var name: String = "marc"

        name = "Laura"



        Log.i("nombre ", name)
        println(name)
    }
}