package com.example.mycv

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mycv.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val view = binding.root

        val contactItems : ArrayList<ContactGridItemModel>  = ArrayList<ContactGridItemModel>()

        contactItems.add(ContactGridItemModel(R.drawable.ic_baseline_my_location_24,"Nairobi, Kenya"))
        contactItems.add(ContactGridItemModel(R.drawable.ic_baseline_email_24,"nich.otieno@gmail.com"))
        contactItems.add(ContactGridItemModel(R.drawable.ic_baseline_local_phone_24,"+254 726575615"))
        contactItems.add(ContactGridItemModel(R.drawable.linkedin,"nich-otieno"))
        contactItems.add(ContactGridItemModel(R.drawable.github,"Cruciajun"))
        contactItems.add(ContactGridItemModel(R.drawable.stackoverflow,"Cruciajun"))
        contactItems.add(ContactGridItemModel(R.drawable.youtube,"Crucial Tech"))
        contactItems.add(ContactGridItemModel(R.drawable.hackerrank32,"Crucial Tech"))

        val adapter = ContactGridAdapter(requireContext(),contactItems)

        binding.gridContactItems.adapter = adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.experienceCard.setOnClickListener {
            Log.d("TAG", "onViewCreated:experience card clicked ")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}