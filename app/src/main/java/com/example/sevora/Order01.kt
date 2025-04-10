package com.example.sevora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class Order01 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_order01, container, false)

        val Pay = view.findViewById<ImageButton>(R.id.imageButton16)
        Pay.setOnClickListener {

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

        val Cart = view.findViewById<ImageButton>(R.id.imageButton12)
        Cart.setOnClickListener {

            val fragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()

            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, Cart())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val hBtn = view.findViewById<ImageButton>(R.id.imageButton47)

        hBtn.setOnClickListener{
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()

            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, HomePage())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val pBtn = view.findViewById<ImageButton>(R.id.imageButton48)

        pBtn.setOnClickListener{
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