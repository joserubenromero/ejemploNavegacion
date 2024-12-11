package com.example.ejemplonavegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class primerfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val root = inflater.inflate(R.layout.fragment_primerfragment, container, false)
        val bt1 = root.findViewById<Button>(R.id.bt1)
        bt1.setOnClickListener{
            findNavController().navigate(primerfragmentDirections.actionPrimerfragmentToSegundofragment(
                nombre = "pepe"
            )
            )
        }

        val bt2 = root.findViewById<Button>(R.id.bt2)
        bt2.setOnClickListener{
            findNavController().navigate(R.id.action_primerfragment_to_tercerfragment)
        }



        return root
    }
}