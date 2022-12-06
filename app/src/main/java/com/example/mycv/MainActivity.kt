package com.example.mycv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val contactItems : ArrayList<ContactGridItemModel>  = ArrayList<ContactGridItemModel>()

        contactItems.add(ContactGridItemModel(R.drawable.ic_baseline_my_location_24,"Nairobi, Kenya"))
        contactItems.add(ContactGridItemModel(R.drawable.ic_baseline_email_24,"nich.otieno@gmail.com"))
        contactItems.add(ContactGridItemModel(R.drawable.ic_baseline_local_phone_24,"+254 726575615"))
        contactItems.add(ContactGridItemModel(R.drawable.linkedin,"nich-otieno"))
        contactItems.add(ContactGridItemModel(R.drawable.github,"Cruciajun"))
        contactItems.add(ContactGridItemModel(R.drawable.stackoverflow,"Cruciajun"))
        contactItems.add(ContactGridItemModel(R.drawable.youtube,"Crucial Tech"))

        val adapter = ContactGridAdapter(this,contactItems)

        binding.gridContactItems.adapter = adapter
    }
}