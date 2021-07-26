package com.test.androidbasics.viewmodel.di_models.koin

import android.os.Bundle
import android.view.View
import com.test.androidbasics.simple.SimpleFragment
import com.test.androidbasics.viewmodel.defaults.DefaultViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class KoinModelFragment : SimpleFragment() {

    override fun setText(text: String) {
        viewModel.setNewText(text)
    }

    private val viewModel: DefaultViewModel by viewModel()

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