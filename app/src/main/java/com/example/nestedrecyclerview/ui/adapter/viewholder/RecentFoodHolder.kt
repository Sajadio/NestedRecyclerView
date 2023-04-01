package com.example.nestedrecyclerview.ui.adapter.viewholder

import com.example.nestedrecyclerview.data.Recipe
import com.example.nestedrecyclerview.databinding.ItemRecyclerViewRecentFoodBinding
import com.example.nestedrecyclerview.ui.adapter.RecentFoodAdapter
import com.example.nestedrecyclerview.ui.base.BaseNestedRecyclerAdapter
import com.example.nestedrecyclerview.ui.base.ParentInteractionListener

class RecentFoodHolder(binding: ItemRecyclerViewRecentFoodBinding, private val listener: ParentInteractionListener) :
    BaseNestedRecyclerAdapter.BaseNestedRecyclerViewHolder(binding) {
    override fun bind(item: Any?) {
        with(binding as ItemRecyclerViewRecentFoodBinding) {
            val adapter = RecentFoodAdapter()
            adapter.submitList(item as List<Recipe>)
            recyclerViewRecentFood.adapter = adapter
            adapter.onItemClickListener {
                listener.onClickRecentFood(it)
            }
        }
    }
}