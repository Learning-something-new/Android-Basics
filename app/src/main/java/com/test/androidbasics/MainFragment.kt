package com.test.androidbasics

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.test.androidbasics.databinding.FragmentRecyclerBinding
import com.test.androidbasics.defaults.NavigationSectionItem
import com.test.androidbasics.defaults.NavigationSectionRecyclerAdapter
import com.test.androidbasics.utils.viewBinding

class MainFragment : Fragment(R.layout.fragment_recycler) {

    val binding by viewBinding(FragmentRecyclerBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recycler.apply {
            adapter = NavigationSectionRecyclerAdapter(createItems(), findNavController())
            layoutManager = LinearLayoutManager(requireContext())
            addItemDecoration(DividerItemDecoration(requireContext(), RecyclerView.VERTICAL))
        }
    }

    private fun createItems(): List<NavigationSectionItem> {
        return mutableListOf<NavigationSectionItem>().apply {
            this += NavigationSectionItem(
                "View Models",
                R.id.action_mainFragment_to_viewModelsFragment
            )
        }
    }

}