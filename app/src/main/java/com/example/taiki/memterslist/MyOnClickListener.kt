package com.example.taiki.memterslist

import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.AdapterView

/**
 * Created by taiki on 16/04/03.
 */

class MyOnClickListener : AdapterView.OnItemClickListener {
    //    var pref: SharedPreferences by Delegates.notNull()
    //    var edit: SharedPreferences.Editor? = null

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {


        val activity: MainActivity = view!!.context as MainActivity
        //        pref = activity.getSharedPreferences("KEY", AppCompatActivity.MODE_PRIVATE)
        //        edit = pref?.edit()
        //
        //        edit?.putInt("SAVE",position)
        //        edit?.commit()

        Log.e("hoge", position.toString())
        //しぇあぷりでポジションの値保存　画面遷移

        when (position) {

            0, 1, 7, 8, 13, 14, 28 -> Intent(activity.applicationContext, NetaActivity::class.java).apply {
                putExtra("position", position)
            }.let {
                view.context.startActivity(it)
            }
            else -> print("そのた")
        }


    }


}



