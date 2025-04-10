package com.example.sevora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class OnboardPage02 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_onboard_page02, container, false)

        val nextBtn = view.findViewById<ImageButton>(R.id.imageButton3)
        nextBtn.setOnClickListener{

            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, Page01())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val BackBtn = view.findViewById<ImageButton>(R.id.imageButton10)

        BackBtn.setOnClickListener{

            requireActivity().findViewById<View>(R.id.main).visibility = View.VISIBLE

            val fragmentTransaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()

            fragmentTransaction.setCustomAnimations(
                android.R.anim.fade_out,
                android.R.anim.fade_in,
            )

            fragmentTransaction.remove(this)
            fragmentTransaction.commit()

            requireActivity().supportFragmentManager.popBackStack()
        }
        return view
    }
}