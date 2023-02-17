package com.example.mycv

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.window.OnBackInvokedDispatcher
import com.example.mycv.databinding.FragmentExperienceBinding


class ExperienceFragment : Fragment() {

    private var _binding : FragmentExperienceBinding? = null

    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentExperienceBinding.inflate(inflater,container,false)
        val view = binding.root

        binding.imgBackExperience.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }

        return view;


    }



}