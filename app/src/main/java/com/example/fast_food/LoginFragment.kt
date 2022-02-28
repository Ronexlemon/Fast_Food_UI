package com.example.fast_food

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.fast_food.databinding.FragmentHomeBinding
import com.example.fast_food.databinding.FragmentLoginBinding
import com.example.fast_food.product.ProductActivity

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_login,container,false)
     binding.signup.setOnClickListener {
         view!!.findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToSignUpFragment())
     }
        binding.login1.setOnClickListener {
            val intent = Intent(activity,ProductActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}