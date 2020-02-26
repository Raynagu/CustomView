package com.admin.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var icons = mutableListOf<Icon>()
        icons.add(Icon(R.drawable.makeover, "makeover"))
        icons.add(Icon(R.drawable.makeup, "makeup"))
        icons.add(Icon(R.drawable.nail, "nail"))
        icons.add(Icon(R.drawable.salon, "salon"))
        icons.add(Icon(R.drawable.makeup, "makeup"))
        icons.add(Icon(R.drawable.nail, "nail"))
        icons.add(Icon(R.drawable.makeover, "makeover"))
        icons.add(Icon(R.drawable.salon, "salon"))
        icons.add(Icon(R.drawable.nail, "nail"))
        icons.add(Icon(R.drawable.makeup, "makeup"))

        val adapter = IconListAdapter(this, R.layout.icon_list_item, icons)
        iconListView.adapter = adapter
    }
}
