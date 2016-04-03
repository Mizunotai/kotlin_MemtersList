package com.example.taiki.memterslist

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.util.*

class MainActivity : AppCompatActivity() {

    var namesArray: ArrayList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array = arrayOf("しのき", "えーぜっと", "づめ", "みーたん", "UK", "量産型ディズニーギャル", "こもさま", "しゅんぺい", "NAGATA", "はなちゃん",
                "とってぃー", "いずみん", "つーぶろ", "ほなみ", "村長", "ゆーゆー", "ゆーき", "ちっち", "りきまる", "らんど", "がおー", "ばっは", "ばうむ", "ボルコフ"
                , "とらちゃん", "たなか", "わかちゃん", "かじー", "kei", "ちゃま", "きむてつ", "りきまる", "ふんじん", "いっしー", "きゃあ")

        val objects = ArrayList<CustomData>()

        val count = array.size

        for (i in 0..count-1) {

            val imageId = resources.getIdentifier("image" + (i + 1), "drawable", packageName)

            val item = CustomData()
            item.setImageDate(imageId)
            item.textDate = array[i]

            objects.add(item)
        }

        val customAdapter = MyArrayAdapter(this, 0, objects)
        val listView : ListView = findViewById(R.id.listView) as ListView
        listView.adapter = customAdapter

        listView.onItemClickListener = MyOnClickListener()

    }
}
