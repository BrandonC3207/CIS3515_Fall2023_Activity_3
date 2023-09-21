package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text

class TextSizeAdapter(private val context: Context, val textSizes: Array<Int>) : BaseAdapter (){


    override fun getCount() = textSizes.size

    override fun getItem(p0: Int) = textSizes[p0]

    override fun getItemId(p0: Int) = p0.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        return (getDropDownView(position, convertView, parent) as TextView).apply {
            textSize = 22f
        }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if(convertView != null){
            textView = convertView as TextView
        } else{
            textView = TextView(context)
            textView.setPadding(5,10,0,10)
        }

        textView.text = textSizes[position].toString()
        textView.textSize = textSizes[position].toFloat()

        return textView

    }
}