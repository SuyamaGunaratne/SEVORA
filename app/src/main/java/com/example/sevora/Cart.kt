package com.example.sevora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

class Cart : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_cart, container, false)

        val regBtn = view.findViewById<ImageButton>(R.id.imageButton25)
        regBtn.setOnClickListener {

            val fragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()

            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, Payment())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val hBtn = view.findViewById<ImageButton>(R.id.imageButton32)
        hBtn.setOnClickListener {

            val fragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()

            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, HomePage())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val PBtn = view.findViewById<ImageButton>(R.id.imageButton31)
        PBtn.setOnClickListener {

            val fragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()

            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, Profile())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return view
    }

}