package com.example.mycv

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.mycv.databinding.ActivityMainBinding
import com.example.mycv.databinding.ContactInfoGridItemBinding

class ContactGridAdapter(context: Context, gridItems: ArrayList<ContactGridItemModel>) :
    ArrayAdapter<ContactGridItemModel>(context, 0, gridItems) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listView = convertView
        val  binding :ContactInfoGridItemBinding =
            ContactInfoGridItemBinding.inflate(LayoutInflater.from(context),parent,false)

        if(listView == null){

                listView = binding.root
        }

        val contactGridItem : ContactGridItemModel? = getItem(position)

        binding.imgGridItemImage.setImageResource(contactGridItem!!.imageId)
        binding.txtGridItemName.text = contactGridItem.itemName


        return listView
    }
}