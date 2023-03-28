package com.example.nestedrecyclerview.ui.adapter.viewholder

import com.example.nestedrecyclerview.data.Recipe
import com.example.nestedrecyclerview.databinding.ItemRecyclerViewRecipeBinding
import com.example.nestedrecyclerview.ui.adapter.RecipeFoodAdapter
import com.example.nestedrecyclerview.ui.base.BaseParentAdapter
import com.example.nestedrecyclerview.ui.base.ParentInteractionListener

class RecipeFoodHolder(binding: ItemRecyclerViewRecipeBinding, private val listener: ParentInteractionListener) :
    BaseParentAdapter.BaseParentViewHolder(binding) {
    override fun bind(item: Any?) {
        with(binding as ItemRecyclerViewRecipeBinding) {
            val adapter = RecipeFoodAdapter()
            adapter.submitList(item as List<Recipe>)
            recyclerViewRecipeFood.adapter = adapter
            adapter.onItemClickListener {
                listener.onClickRecipeFood(it)
            }
        }
    }
}