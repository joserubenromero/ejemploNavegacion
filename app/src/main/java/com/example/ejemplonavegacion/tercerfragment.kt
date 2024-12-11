package com.example.ejemplonavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class tercerfragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



       val root = inflater.inflate(R.layout.fragment_tercerfragment, container, false)

        val bt3 = root.findViewById<Button>(R.id.bt3)
        bt3.setOnClickListener{
            findNavController().navigate(R.id.action_tercerfragment_to_cuartofragment)
        }

        return root
    }


    }
