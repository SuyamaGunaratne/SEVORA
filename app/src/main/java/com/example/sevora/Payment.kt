package com.example.sevora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class Payment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_payment, container, false)

        val hBtn = view.findViewById< ImageButton>(R.id.imageButton28)

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

        val pBtn = view.findViewById<ImageButton>(R.id.imageButton42)

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

        val PBtn = view.findViewById< ImageButton>(R.id.imageButton34)

        PBtn.setOnClickListener{
            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()

            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, PaymentSuccess())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return view
    }
}