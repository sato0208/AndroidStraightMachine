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
//onResumeメソッドのオーバーライド
    override fun onResume() {
        super.onResume()
//効果音を出すためのクラス：Soundpoolの準備
    val soundPool =  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                         SoundPool.Builder().setAudioAttributes(AudioAttributes.Builder()
                            .setUsage(AudioAttributes.USAGE_MEDIA)
                            .build())
                            .setMaxStreams(1)
                            .build()
                        }
                    else {
                        SoundPool(1, AudioManager.STREAM_MUSIC, 0)
                    }
//    効果音ファイルをメモリにロードしてサウンドIDをゲットする
    val soundId = soundPool.load(this, R.raw._game_healer_attack3,1)
    val soundId2 = soundPool.load(this, R.raw._game_healer_special1,1)
    val soundId3 = soundPool.load(this, R.raw._game_healer_special2,1)
    val soundId4 = soundPool.load(this, R.raw._game_healer_special3,1)
    val soundId5 = soundPool.load(this, R.raw._game_healer_win1,1)
    val soundId6 = soundPool.load(this, R.raw._game_healer_lose1,1)

}