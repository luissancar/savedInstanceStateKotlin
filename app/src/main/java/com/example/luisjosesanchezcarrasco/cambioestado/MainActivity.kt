package com.example.luisjosesanchezcarrasco.cambioestado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var dato:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)


        println(savedInstanceState.getString("aaaa"))
        dato=savedInstanceState.getString("aaaa")
        if (texto != null)
            texto.setText(dato.toString())

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)


        //outState.putString("aaaa","dddd" )
        dato=dato.toString()+"a"
        outState.putString("aaaa",dato.toString() )
    }



}
