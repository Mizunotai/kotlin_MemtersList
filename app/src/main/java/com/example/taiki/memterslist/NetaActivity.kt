package com.example.taiki.memterslist

import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView

class NetaActivity : AppCompatActivity() {

//    var pref: SharedPreferences by Delegates.notNull()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_neta)

        val imageView: ImageView = findViewById(R.id.imageView) as ImageView
        //       prgetSharedPreferences("KEY", AppCompatActivity.MODE_PRIVATE)

        val intent = intent
        val position: Int = intent.getIntExtra("position", -1);

        //var touch  = Activity.Ontouch/

        when (position) {

            0 -> imageView.setImageResource(R.drawable.shinoki_neta)
            1 -> imageView.setImageResource(R.drawable.az_neta)
            7 -> imageView.setImageResource(R.drawable.syumpei_neta)
            8 -> imageView.setImageResource(R.drawable.nagata_neta)
            13 -> imageView.setImageResource(R.drawable.honami_neta)
            14 -> {
                imageView.setImageResource(R.drawable.image14)
                val musicPlayer = MediaPlayer.create(applicationContext,R.raw.lifeistechver6)
                musicPlayer.start()
            }
            28 -> imageView.setImageResource(R.drawable.chama_neta)
            else -> print("そのた")
        }




    }
}