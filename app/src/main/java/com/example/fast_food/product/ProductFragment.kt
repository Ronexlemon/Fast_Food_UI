package com.example.fast_food.product

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.fast_food.R
import com.example.fast_food.databinding.FragmentProductBinding


class ProductFragment : Fragment() {

    private lateinit var binding: FragmentProductBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_product, container, false)
        search()
        binding.card.setOnClickListener{
            Toast.makeText(activity, "clicked search term", Toast.LENGTH_LONG).show()
            view!!.findNavController().navigate(ProductFragmentDirections.actionProductFragmentToItemFragment())
       }
        binding.card1.setOnClickListener{
            Toast.makeText(activity, "clicked search term", Toast.LENGTH_LONG).show()
        }
        binding.card2.setOnClickListener{
            Toast.makeText(activity, "clicked search term", Toast.LENGTH_LONG).show()
        }
        binding.card3.setOnClickListener{
            Toast.makeText(activity, "clicked search term", Toast.LENGTH_LONG).show()
        }
        binding.card4.setOnClickListener{
            Toast.makeText(activity, "clicked search term", Toast.LENGTH_LONG).show()
        }
        binding.card5.setOnClickListener{
            Toast.makeText(activity, "clicked search term", Toast.LENGTH_LONG).show()
        }
        binding.card6.setOnClickListener{
            Toast.makeText(activity, "clicked search term", Toast.LENGTH_LONG).show()
        }
        return binding.root

    }


    private fun search() {
        binding.btnSearch.setOnClickListener {
            if (binding.search.text.isNullOrEmpty()) {
                Toast.makeText(activity, "provide search term", Toast.LENGTH_LONG).show()
            } else {
                var image = binding.search.text
                binding.one.text = image

            }
        }
    }





    }
