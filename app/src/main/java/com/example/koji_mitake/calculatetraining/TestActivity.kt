package com.example.koji_mitake.calculatetraining

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity (), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        //前の画面の問題数を表示
        val bundle : Bundle = intent.extras
        val selectedItem : Int = bundle.getInt("selectecItem")

        //画面に表示
        textViewRemaining.text = selectedItem.toString()

        //クリックリスナーの登録
        buttonAnswer.setOnClickListener {
            answerCheck()
        }

        buttonBack.setOnClickListener{

        }

        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        buttonClear.setOnClickListener(this)
        buttonMinus.setOnClickListener(this)

        //一問目を出す
        question()

    }

    override fun onClick(p0: View?) {

    }

    // 答え合わせが押されたら
    private fun answerCheck() {

    }

    private fun question() {

    }


    // 電卓が押された場合



}
