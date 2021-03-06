package com.test.androidbasics.viewmodel.provider

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.test.androidbasics.AndroidBasicsApp
import com.test.androidbasics.simple.SimpleFragment
import com.test.androidbasics.viewmodel.defaults.DefaultStateViewModel
import com.test.androidbasics.viewmodel.defaults.DefaultViewFactoryModel
import com.test.androidbasics.viewmodel.defaults.DefaultViewModel

class ProviderModelFragment : SimpleFragment() {

    private lateinit var viewModel: DefaultViewModel

    override fun setText(text: String) {
        viewModel.setNewText(text)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel = ViewModelProvider(this).get(
            DefaultViewModel::class.java)

        bindObservers()
    }

    fun bindObservers() {
        viewModel.text.observe(this.viewLifecycleOwner) {
            binding.textView.text = it
        }
    }

}