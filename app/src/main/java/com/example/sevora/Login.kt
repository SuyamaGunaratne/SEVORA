package com.example.sevora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class Login : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val regBtn = view.findViewById<Button>(R.id.button2)
        regBtn.setOnClickListener{

            val fragmentManager = requireActivity().supportFragmentManager
            val transaction = fragmentManager.beginTransaction()

            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, Register())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return view
    }

}