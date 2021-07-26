package com.test.androidbasics.defaults

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.test.androidbasics.R

class NavigationSectionRecyclerAdapter(
    private val items: List<NavigationSectionItem>,
    private val navController: NavController
) : RecyclerView.Adapter<NavigationSectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NavigationSectionViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_navigation_section, parent, false)
        return NavigationSectionViewHolder(view, navController)
    }

    override fun onBindViewHolder(holder: NavigationSectionViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class NavigationSectionViewHolder(
    private val viewItem: View,
    private val navController: NavController
) : RecyclerView.ViewHolder(viewItem) {

    private val textView = viewItem.findViewById<TextView>(R.id.textView)

    fun bind(item: NavigationSectionItem) {
        viewItem.setOnClickListener { navController.navigate(item.resId) }
        textView.text = item.title
    }
}