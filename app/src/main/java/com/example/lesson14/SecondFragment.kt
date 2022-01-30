package com.example.lesson14

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        tvCongratulations.text = getString(R.string.conratulations)
        ivCongratulations.setImageResource(R.drawable.puh)

        Toast.makeText(requireContext(), "Вы создали Git Repository!",
            Toast.LENGTH_SHORT).show()
    }
}