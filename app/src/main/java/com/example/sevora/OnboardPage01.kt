package com.example.sevora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class OnboardPage01 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_onboard_page01, container, false)

        val nextButton = view.findViewById<ImageButton>(R.id.imageButton8)
        nextButton.setOnClickListener{

            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, OnboardPage02())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val backButton = view.findViewById<ImageButton>(R.id.imageButton7)

        backButton.setOnClickListener{

            requireActivity().findViewById<View>(R.id.main).visibility = View.VISIBLE

            val fragmentTransaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()

            fragmentTransaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            fragmentTransaction.remove(this)
            fragmentTransaction.commit()

            requireActivity().supportFragmentManager.popBackStack()
        }
        return view
    }
}