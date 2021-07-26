package com.test.androidbasics.viewmodel

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

class ViewModelsFragment: Fragment(R.layout.fragment_recycler) {

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
                "ProviderFactory",
                R.id.action_viewModelsFragment_to_providerModelFactoryFragment
            )
            this += NavigationSectionItem(
                "ProviderState",
                R.id.action_viewModelsFragment_to_providerStateModelFragment
            )
            this += NavigationSectionItem(
                "Provider",
                R.id.action_viewModelsFragment_to_providerModelFragment
            )
            this += NavigationSectionItem(
                "By view models",
                R.id.action_viewModelsFragment_to_byViewModelsFragment
            )
            this += NavigationSectionItem(
                "By view models factory",
                R.id.action_viewModelsFragment_to_byViewModelsFactoryFragment
            )

            this += NavigationSectionItem(
                "Koin DI",
                R.id.action_viewModelsFragment_to_koinModelFragment
            )
            this += NavigationSectionItem(
                "Koin DI factory",
                R.id.action_viewModelsFragment_to_koinModelFactoryFragment
            )
            this += NavigationSectionItem(
                "Koin DI repository",
                R.id.action_viewModelsFragment_to_koinModelRepositoryFragment
            )
        }
    }

}