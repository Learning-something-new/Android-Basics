package com.test.androidbasics.navigation.nested_with_one_viewmodel

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import com.test.androidbasics.R
import com.test.androidbasics.databinding.FragmentSimpleNavigationBinding
import com.test.androidbasics.utils.viewBinding

class ThirdNestedNavigationFragment : Fragment(R.layout.fragment_simple_navigation) {

    private val binding by viewBinding(FragmentSimpleNavigationBinding::bind)
    private val viewModel: MultiNavigationViewModel by navGraphViewModels(R.id.nested_navigation_with_one_viewmodel)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.editText.setText("Third nested fragment")
        binding.next.setOnClickListener {
            viewModel.setThirdData(binding.editText.text.toString())
            findNavController().navigate(R.id.action_thirdNestedNavigationFragment_to_finalNestedNavigationFragment)
        }

        binding.previousData.text = viewModel.getPreviousData()

    }

}