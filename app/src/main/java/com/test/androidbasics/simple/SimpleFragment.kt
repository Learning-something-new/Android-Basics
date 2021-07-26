package com.test.androidbasics.simple

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.test.androidbasics.R
import com.test.androidbasics.databinding.FragmentSimpleExampleBinding
import com.test.androidbasics.utils.viewBinding

abstract class SimpleFragment: Fragment(R.layout.fragment_simple_example)  {
    protected val binding by viewBinding(FragmentSimpleExampleBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            setText("Button clicked")
        }
    }

    abstract fun setText(text: String)
}