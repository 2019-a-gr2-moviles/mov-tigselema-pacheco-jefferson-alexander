package com.example.parcelables

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view.*
import android.support.design.widget.Snackbar

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listaNombres = arrayListOf<String>()
        listaNombres.add("Vicente")
        listaNombres.add("Adrian")
        listaNombres.add("Alexander")
        listaNombres.add("Andres")
        listaNombres.add("Ali")
        listaNombres.add("Kevin")

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaNombres)
        lv_ejemplo.adapter = adapter

        lv_ejemplo.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Log.i("list-view", "Posicion $position")
            Snackbar.make(view, "Ha seleccionado $position", Snackbar.LENGTH_LONG).setAction("Action",null).show()
        }
    }
}
