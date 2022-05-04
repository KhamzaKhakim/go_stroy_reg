package com.example.reg.presentation.fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.reg.R
import com.example.reg.databinding.FragmentAuthNavigationBinding
import com.example.reg.databinding.FragmentSignInBinding
import com.example.reg.presentation.viewmodel.AuthNavigationViewModel

class AuthNavigationFragment : Fragment(R.layout.fragment_auth_navigation) {

    private var _binding: FragmentAuthNavigationBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = AuthNavigationFragment()
    }

    private val viewModel: AuthNavigationViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentAuthNavigationBinding.bind(view)
        init()
    }

    private fun init()  = with(binding)  {
        buttonGoSignIn.setOnClickListener {
            val action =
                AuthNavigationFragmentDirections.actionAuthNavigationFragmentToSignInFragment(
                )
            findNavController().navigate(action)
        }

        buttonGoSignUp.setOnClickListener{
            val action =
                AuthNavigationFragmentDirections.actionAuthNavigationFragmentToSignUpFragment(
                )
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}