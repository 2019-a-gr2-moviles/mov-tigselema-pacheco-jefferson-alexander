package com.example.parcelables

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_parce.setOnClickListener{irAParcelable()}
        btn_adapter.setOnClickListener{irAListView()}

    }

    fun irAParcelable(){
        val intentExplicito = Intent(this, Parcelable:: class.java)
        val alexander = Usuario("Alexander",29, Date(), 35.00 )
        intentExplicito.putExtra("usuario", alexander);
        val cachetes = Mascota("cachetes", alexander)
        startActivity(intentExplicito)
    }

    fun irAListView(){
        val intentExplicito = Intent(
            this,
            ListViewActivity::class.java
        )
        startActivity(intentExplicito)
    }
}
