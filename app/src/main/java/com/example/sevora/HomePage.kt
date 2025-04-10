package com.example.sevora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class HomePage : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home_page, container, false)

        val Order1 = view.findViewById<ImageButton>(R.id.item_011)
        Order1.setOnClickListener{

            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, Order01())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val Order2 = view.findViewById< ImageButton>(R.id.item_012)
        Order2.setOnClickListener{

            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, Order02())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val Cart = view.findViewById< ImageButton>(R.id.imageButton14)
        Cart.setOnClickListener{

            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, Cart())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val Pbtn = view.findViewById<ImageButton>(R.id.imageButton13)
        Pbtn.setOnClickListener{

            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
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