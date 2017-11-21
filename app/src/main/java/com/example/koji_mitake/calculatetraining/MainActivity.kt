package com.example.koji_mitake.calculatetraining

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        var arrayAdapter : ArrayAdapter<Int> = ArrayAdapter<Int>(this,android.R.layout.simple_spinner_item)
//        arrayAdapter.add(10)
//        arrayAdapter.add(20)
//        arrayAdapter.add(30)

        //arrayAdapterに値を入れる
        val arrayAdapter = ArrayAdapter.createFromResource(this,R.array.nuber_of_question,android.R.layout.simple_spinner_item)

        // Spinnerに値を入れる
        spinner.adapter = arrayAdapter

        button.setOnClickListener {

            //Spinnerの値を取る
        val selectedItem : Int = spinner.selectedItem.toString().toInt()

            //インテントを作り、値を入れ、画面を開く
            val intent = Intent(this@MainActivity,TestActivity::class.java)
            intent.putExtra("selectecItem",selectedItem)
            startActivity(intent)
        }


    }
}
