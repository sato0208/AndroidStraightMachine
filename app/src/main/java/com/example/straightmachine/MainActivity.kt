package com.example.straightmachine

import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    soundプールの宣言
    lateinit var soundPool: SoundPool
//    soundIdの宣言
    var soundId:Int = 0
    var soundId2:Int = 0
    var soundId3:Int = 0
    var soundId4:Int = 0
    var soundId5:Int = 0
    var soundId6:Int = 0

    //    画面が開いた時に最初にやることを書く場所
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//    ボタンのクリック処理
        button.setOnClickListener { soundPool.play(soundId,1.0f,1.0f,0,0,1.0f) }
        button2.setOnClickListener { soundPool.play(soundId,1.0f,1.0f,0,0,1.0f) }
        button3.setOnClickListener { soundPool.play(soundId,1.0f,1.0f,0,0,1.0f) }
        button4.setOnClickListener { soundPool.play(soundId,1.0f,1.0f,0,0,1.0f) }
        button5.setOnClickListener { soundPool.play(soundId,1.0f,1.0f,0,0,1.0f) }
        button6.setOnClickListener { soundPool.play(soundId,1.0f,1.0f,0,0,1.0f) }
    }

    //onResumeメソッドのオーバーライド
    override fun onResume() {
        super.onResume()
//効果音を出すためのクラス：Soundpoolの準備
        val soundPool = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            SoundPool.Builder().setAudioAttributes(
                AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
                .setMaxStreams(1)
                .build()
        } else {
            SoundPool(1, AudioManager.STREAM_MUSIC, 0)
        }
//    効果音ファイルをメモリにロードしてサウンドIDをゲットする
        val soundId = soundPool.load(this, R.raw._game_healer_attack3, 1)
        val soundId2 = soundPool.load(this, R.raw._game_healer_special1, 1)
        val soundId3 = soundPool.load(this, R.raw._game_healer_special2, 1)
        val soundId4 = soundPool.load(this, R.raw._game_healer_special3, 1)
        val soundId5 = soundPool.load(this, R.raw._game_healer_win1, 1)
        val soundId6 = soundPool.load(this, R.raw._game_healer_lose1, 1)

    }

    override fun onPause() {
        super.onPause()
//        使い終わった音ファイルを後片付け
        soundPool.release()
    }
}