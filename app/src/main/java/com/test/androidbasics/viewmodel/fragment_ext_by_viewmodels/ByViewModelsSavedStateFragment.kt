package com.test.androidbasics.viewmodel.fragment_ext_by_viewmodels

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.SavedStateViewModelFactory
import com.test.androidbasics.simple.SimpleFragment
import com.test.androidbasics.viewmodel.defaults.DefaultViewModel

class ByViewModelsSavedStateFragment : SimpleFragment() {

    override fun setText(text: String) {
        viewModel.setNewText(text)
    }

    // implementation "androidx.fragment:fragment-ktx:1.3.6"
    private val viewModel: DefaultViewModel by viewModels()

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