package com.wil.listofcountries

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list_view= findViewById<ListView>(R.id.listview)
        val majina= arrayOf("Kenya", "Uganda", "Burundi", "South Sudan")
        val arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,majina)

        list_view.adapter=arrayAdapter
        list_view.setOnItemClickListener { adapterView, view, position, l ->
    Toast.makeText(this, "you have clicked on" + majina[position], Toast.LENGTH_LONG).show()
    }
    }
}