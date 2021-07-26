package com.test.androidbasics.viewmodel.provider

import android.os.Bundle
import android.view.View
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.test.androidbasics.simple.SimpleFragment
import com.test.androidbasics.viewmodel.defaults.DefaultStateViewModel

class ProviderStateModelFragment : SimpleFragment() {

    private lateinit var viewModel: DefaultStateViewModel

    override fun setText(text: String) {
        viewModel.setNewText(text)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel = ViewModelProvider(this, SavedStateViewModelFactory(requireActivity().application, this)).get(
            DefaultStateViewModel::class.java)

        bindObservers()
    }

    fun bindObservers() {
        viewModel.text.observe(this.viewLifecycleOwner) {
            binding.textView.text = it
        }
    }

}