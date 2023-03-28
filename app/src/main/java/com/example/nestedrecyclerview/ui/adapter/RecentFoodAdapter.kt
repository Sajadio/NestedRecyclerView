package com.example.nestedrecyclerview.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.nestedrecyclerview.data.Recipe
import com.example.nestedrecyclerview.databinding.ItemCardViewRecentFoodBinding
import com.example.nestedrecyclerview.ui.base.BaseAdapter
import com.example.nestedrecyclerview.utils.setImage


class RecentFoodAdapter() :
    BaseAdapter<Recipe, ItemCardViewRecentFoodBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) ->
    ItemCardViewRecentFoodBinding = ItemCardViewRecentFoodBinding::inflate

    private var onItemClickListener: ((Int) -> Unit)? = null
    fun onItemClickListener(listener: (Int) -> Unit) {
        onItemClickListener = listener
    }

    override fun bindItem(binding: ItemCardViewRecentFoodBinding, item: Recipe) {
        with(binding) {
            imageViewRecentFood.setImage(item.imageUrl)
            textViewRecentFoodName.text = item.translatedRecipeName
            textViewCuisineName.text = item.cuisine
            textViewTimerMeal.text = item.totalTimeInMin.toString()
            root.setOnClickListener {
                onItemClickListener?.let { it(item.id) }
            }
        }
    }

    override fun <T> areItemsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int,
        newItems: List<T>
    ) = getOldItems()[oldItemPosition].id == (newItems[newItemPosition] as Recipe).id


}