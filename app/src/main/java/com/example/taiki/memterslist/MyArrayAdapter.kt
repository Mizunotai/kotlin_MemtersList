package com.example.taiki.memterslist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView


class MyArrayAdapter(context: Context, textViewResourceId: Int, objects: List<CustomData>) : ArrayAdapter<CustomData>(context, textViewResourceId, objects) {private val layoutInflater_: LayoutInflater

    init {

        layoutInflater_ = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var convertView = convertView
        // 特定の行(position)のデータを得る

        // convertViewは使い回しされている可能性があるのでnullの時だけ新しく作る
        if (null == convertView) {
            convertView = layoutInflater_.inflate(R.layout.custom_layout, null)
        }

        // CustomDataのデータをViewの各Widgetにセットする
        val imageView: ImageView
        imageView = convertView!!.findViewById(R.id.imageView) as ImageView
//        imageView.setImageBitmap(getItem(position).imageData)
        imageView.setImageResource(getItem(position).imageDate!!)

        val textView: TextView
        textView = convertView.findViewById(R.id.textView) as TextView
        textView.text = getItem(position).textDate

        return convertView
    }
}
