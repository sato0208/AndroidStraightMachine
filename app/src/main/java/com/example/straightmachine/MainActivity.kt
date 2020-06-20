package com.example.straightmachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    画面が開いた時に最初にやることを書く場所
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//    ボタンのクリック処理
    button.setOnClickListener { /*効果音を鳴らす*/ }
    button2.setOnClickListener {  }
    button3.setOnClickListener {  }
    button4.setOnClickListener {  }
    button5.setOnClickListener {  }
    button6.setOnClickListener {  }


    }
}