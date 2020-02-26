package com.admin.customview

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.icon_list_item.view.*

class IconListAdapter(val mCtx: Context, val resource: Int, val items:List<Icon>): ArrayAdapter<Icon>(mCtx, resource, items) {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //Inflate the layout
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        //create view
        val view: View = layoutInflater.inflate(resource, null)
        //get the data by using position in items
        val icons: Icon = items.get(position)
        //get list_items views
        view.imageView.setImageDrawable(mCtx.getDrawable(icons.icon))
        view.textView.text = icons.name
        //set value to listView

        return view
    }
}