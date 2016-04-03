package com.example.taiki.memterslist

import android.util.Log
import android.view.View
import android.widget.AdapterView

/**
 * Created by taiki on 16/04/03.
 */

class MyOnClickListener : AdapterView.OnItemClickListener {
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        Log.e("hoge",position.toString())

    }


}



