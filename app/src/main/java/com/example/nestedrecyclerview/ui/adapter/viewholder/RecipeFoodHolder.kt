package com.example.nestedrecyclerview.ui.adapter.viewholder

import com.example.nestedrecyclerview.data.ParentItem
import com.example.nestedrecyclerview.data.Recipe
import com.example.nestedrecyclerview.databinding.ItemCardViewRecipeFoodBinding
import com.example.nestedrecyclerview.databinding.ItemRecyclerViewRecipeBinding
import com.example.nestedrecyclerview.ui.adapter.RecipeFoodAdapter
import com.example.nestedrecyclerview.ui.base.BaseNestedRecyclerAdapter
import com.example.nestedrecyclerview.ui.base.ParentInteractionListener
import com.example.nestedrecyclerview.utils.setImage

class RecipeFoodHolder(
    binding: ItemCardViewRecipeFoodBinding,
    private val listener: ParentInteractionListener
) :
    BaseNestedRecyclerAdapter.BaseNestedRecyclerViewHolder(binding) {

    override fun bind(item: Any?) {
        val recipe = item as Recipe
        with(binding as ItemCardViewRecipeFoodBinding) {
            item.let {
                textViewRecipeFoodName.text = recipe.translatedRecipeName
                textViewCuisineName.text = recipe.cuisine
                textViewTimerMeal.text = recipe.totalTimeInMin.toString()
                imageViewRecipeFood.setImage(recipe.imageUrl)
                root.setOnClickListener {
                    listener.onClickRecipeFood(recipe.id)
                }
            }
        }
    }
}