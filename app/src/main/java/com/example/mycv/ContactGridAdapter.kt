package com.example.mycv

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class ContactGridAdapter(context: Context, gridItems: Array<ContactGridItemModel>) :
    ArrayAdapter<ContactGridItemModel>(context, 0, gridItems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listView = convertView

        if(listView == null){
            listView = LayoutInflater.from(context).inflate(R.layout.contact_info_grid_item,parent,false)
        }


        return super.getView(position, convertView, parent)
    }
}