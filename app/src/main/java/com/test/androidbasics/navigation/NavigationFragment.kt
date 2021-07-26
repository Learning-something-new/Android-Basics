package com.test.androidbasics.navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.androidbasics.R
import com.test.androidbasics.databinding.FragmentRecyclerBinding
import com.test.androidbasics.defaults.NavigationSectionItem
import com.test.androidbasics.defaults.NavigationSectionRecyclerAdapter
import com.test.androidbasics.utils.viewBinding

class NavigationFragment : Fragment(R.layout.fragment_recycler) {

    private val binding by viewBinding(FragmentRecyclerBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler.apply {
            adapter = NavigationSectionRecyclerAdapter(createSectionItems(), findNavController())
            layoutManager = LinearLayoutManager(requireContext())
            addItemDecoration(DividerItemDecoration(requireContext(), RecyclerView.VERTICAL))
        }
    }

    private fun createSectionItems(): List<NavigationSectionItem> {
        return mutableListOf<NavigationSectionItem>().apply {
            this += NavigationSectionItem(
                "Nested with one ViewModel",
                R.id.action_navigationFragment_to_navigation
            )
        }
    }

}