package com.example.koji_mitake.calculatetraining

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_test.*
import java.util.*

class TestActivity : AppCompatActivity (), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        //前の画面の問題数を表示
        val bundle : Bundle = intent.extras
        val selectedItem : Int = bundle.getInt("selectecItem")

        //画面に表示git push -u origin master
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
    // 電卓が押された場合
    override fun onClick(v : View?) {

        val button :Button = v as Button

        when( v?.id ){
            //クリアボタン
            R.id.buttonClear
                -> textViewAnswer.text = ""
            //マイスの場合
            R.id.buttonMinus
                -> if(textViewAnswer.text.toString() == "") {
                        textViewAnswer.text = "-"
                    }
            //０の場合
            R.id.button0
                    -> if (textViewAnswer.text.toString() != "0" &&
                            textViewAnswer.text.toString() != "-" ){
                            textViewAnswer.append(button.text)
                        }
            //その他の場合
            else
                if (textViewAnswer.text.toString() == "0")
                    textViewAnswer.text = button.text
                else textViewAnswer.append((button.text))

        }


    }

    // 答え合わせが押されたら
    private fun answerCheck() {

    }

    private fun question() {
        //戻るボタンを使えなくする
        buttonBack.isEnabled = false

        //答え合わせボタンと電卓ボタンは使えるようにする
        buttonAnswer.isEnabled = true
        button0.isEnabled = true
        button1.isEnabled = true
        button2.isEnabled = true
        button3.isEnabled = true
        button4.isEnabled = true
        button5.isEnabled = true
        button6.isEnabled = true
        button7.isEnabled = true
        button8.isEnabled = true
        button9.isEnabled = true

        //問題の数字を1ｰ100からランダムに設定する
        val random = Random()
        val leftNumber = random.nextInt(100) + 1
        val rightNumber = random.nextInt(100) + 1
        textViewleft.text = leftNumber.toString()
        textViewRight.text = rightNumber.toString()

        // 計算方法を+ と − をランダムに表示
        when(random.nextInt(2)){
            1 -> textViewOperator.text = "+"
            2 -> textViewOperator.text = "-"
        }

        //前の問題で入力した答えを消す
        textViewAnswer.text = ""

        // ◯ ✗ を見えないようにする
        imageView.visibility = View.INVISIBLE

    }


    // 電卓が押された場合



}
