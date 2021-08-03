package com.test.androidbasics.viewmodel.di_models.hilt

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.test.androidbasics.simple.SimpleFragment
import com.test.androidbasics.viewmodel.defaults.DefaultViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HiltModelFragment : SimpleFragment() {

    override fun setText(text: String) {
        viewModel.setNewText(text)
    }

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