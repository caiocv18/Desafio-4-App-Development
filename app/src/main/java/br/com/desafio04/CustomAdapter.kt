package br.com.desafio04

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val context: Activity, private val item : ArrayList<Item>, private val imgIdItem:Array<Int>) : ArrayAdapter<Item>(context, R.layout.custom_listview,item){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val view = inflater.inflate(R.layout.custom_listview, null, true)
        val imageView_Image = view.findViewById(R.id.iv_Item) as ImageView
        val textView_Title = view.findViewById(R.id.tv_title) as TextView
        val textView_Price = view.findViewById(R.id.tv_price) as TextView
        val textView_Date = view.findViewById(R.id.tv_date) as TextView
        val textView_Place = view.findViewById(R.id.tv_place) as TextView

        imageView_Image.setImageResource(imgIdItem[position])
        textView_Title.text = item[position].title
        textView_Price.text = item[position].price.toString()
        textView_Date.text = item[position].date
        textView_Place.text = item[position].place

        return view
    }

}