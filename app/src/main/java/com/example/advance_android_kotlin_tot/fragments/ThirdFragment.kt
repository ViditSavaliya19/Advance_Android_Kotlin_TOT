package com.example.advance_android_kotlin_tot.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.advance_android_kotlin_tot.R
import com.example.advance_android_kotlin_tot.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    lateinit var binding : FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)


        var data = arguments?.getString("data")
        binding.txtData.setText(data)

        return binding.root
    }


}