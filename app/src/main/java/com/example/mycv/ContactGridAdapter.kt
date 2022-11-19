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

    private lateinit var binding : ContactInfoGridItemBinding

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val listView : View

        if(convertView == null){
            binding =
                ContactInfoGridItemBinding.inflate(LayoutInflater.from(context),parent,false)
                listView = binding.root
        }else{
            listView = convertView
        }

        val contactGridItem : ContactGridItemModel? = getItem(position)

        binding.imgGridItemImage.setImageResource(contactGridItem!!.imageId)
        binding.txtGridItemName.text = contactGridItem.itemName


        return listView
    }
}