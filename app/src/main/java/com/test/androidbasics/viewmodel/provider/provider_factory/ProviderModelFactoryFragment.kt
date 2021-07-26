package com.test.androidbasics.viewmodel.provider.provider_factory

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.View
import com.test.androidbasics.simple.SimpleFragment
import com.test.androidbasics.viewmodel.defaults.DefaultViewFactoryModel
import com.test.androidbasics.viewmodel.defaults.DefaultViewModel
import com.test.androidbasics.viewmodel.defaults.DefaultViewModelFactory

class ProviderModelFactoryFragment : SimpleFragment() {

    private lateinit var viewModel: DefaultViewFactoryModel

    override fun setText(text: String) {
        viewModel.setNewText(text)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val factory = DefaultViewModelFactory("Initial Text")
        viewModel = ViewModelProvider(this, factory).get(DefaultViewFactoryModel::class.java)

        bindObservers()
    }

    fun bindObservers() {
        viewModel.text.observe(this.viewLifecycleOwner) {
            binding.textView.text = it
        }
    }

}