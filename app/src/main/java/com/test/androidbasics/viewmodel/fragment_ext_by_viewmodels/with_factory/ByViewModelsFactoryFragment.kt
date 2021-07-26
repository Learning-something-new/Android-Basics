package com.test.androidbasics.viewmodel.fragment_ext_by_viewmodels.with_factory

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.test.androidbasics.simple.SimpleFragment
import com.test.androidbasics.viewmodel.defaults.DefaultViewFactoryModel
import com.test.androidbasics.viewmodel.defaults.DefaultViewModel
import com.test.androidbasics.viewmodel.defaults.DefaultViewModelFactory

class ByViewModelsFactoryFragment : SimpleFragment() {

    override fun setText(text: String) {
        viewModel.setNewText(text)
    }

    // implementation "androidx.fragment:fragment-ktx:1.3.6"
    private val viewModel: DefaultViewFactoryModel by viewModels {
        DefaultViewModelFactory("Initial Text")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindObservers()
    }

    fun bindObservers() {
        viewModel.text.observe(this.viewLifecycleOwner) {
            binding.textView.text = it
        }
    }

}