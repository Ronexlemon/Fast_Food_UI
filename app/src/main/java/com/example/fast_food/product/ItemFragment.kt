package com.example.fast_food.product

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.fast_food.R
import com.example.fast_food.databinding.FragmentItemBinding


class ItemFragment : Fragment() {

 private lateinit var binding: FragmentItemBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

      binding = DataBindingUtil.inflate(inflater,R.layout.fragment_item,container,false)
        if(binding.check1.isChecked){
            Toast.makeText(activity,"yes its checked", Toast.LENGTH_SHORT).show()
        }
        return  binding.root
    }


}