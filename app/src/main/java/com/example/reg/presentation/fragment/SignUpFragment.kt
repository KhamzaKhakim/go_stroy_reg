package com.example.reg.presentation.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.reg.R
import com.example.reg.databinding.FragmentSignInBinding
import com.example.reg.databinding.FragmentSignUpBinding
import com.example.reg.presentation.viewmodel.SignUpViewModel

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    companion object {
        fun newInstance() = SignUpFragment()
    }

    private var _binding: FragmentSignUpBinding? = null
    private val binding get() = _binding!!

    private val viewModel: SignUpViewModel  by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentSignUpBinding.bind(view)
        init()
    }

    private fun init() {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}