package com.example.sevora

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageButton
import androidx.fragment.app.FragmentTransaction

class Register : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_register, container, false)

        val logBtn = view.findViewById<Button>(R.id.button)
        logBtn.setOnClickListener{

            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, Login())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        val HomeBtn = view.findViewById<AppCompatImageButton>(R.id.imageButton2)
        HomeBtn.setOnClickListener{

            val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.setCustomAnimations(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            transaction.replace(R.id.main, HomePage())
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return view
    }
}