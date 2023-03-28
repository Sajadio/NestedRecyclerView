package com.example.nestedrecyclerview.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.data.ParentItem
import com.example.nestedrecyclerview.databinding.*
import com.example.nestedrecyclerview.ui.adapter.viewholder.AdviceHolder
import com.example.nestedrecyclerview.ui.adapter.viewholder.RecentFoodHolder
import com.example.nestedrecyclerview.ui.adapter.viewholder.RecipeFoodHolder
import com.example.nestedrecyclerview.ui.base.BaseParentAdapter
import com.example.nestedrecyclerview.ui.base.ParentInteractionListener

class ParentAdapter(private val listener: ParentInteractionListener) : BaseParentAdapter() {

    override fun getBindingViewHolder(
        inflater: LayoutInflater,
        parent: ViewGroup,
        viewType: Int
    ): BaseParentViewHolder {
        return when (viewType) {
            TYPE_ADVICE -> AdviceHolder(
                ItemRecyclerViewAdviceBinding.inflate(
                    inflater,
                    parent,
                    false
                ), listener
            )
            TYPE_RECENT_FOOD -> {
                RecentFoodHolder(
                    ItemRecyclerViewRecentFoodBinding.inflate(inflater, parent, false),
                    listener
                )
            }
            else -> {
                RecipeFoodHolder(
                    ItemRecyclerViewRecipeBinding.inflate(inflater, parent, false),
                    listener
                )
            }
        }
    }

    override fun getTypeView(parentItem: ParentItem): Int {
        return when (parentItem) {
            is ParentItem.Advice -> TYPE_ADVICE
            is ParentItem.RecentFood -> TYPE_RECENT_FOOD
            is ParentItem.RecipeFood -> TYPE_RECIPE_FOOD
        }
    }

    override fun bindItem(holder: BaseParentViewHolder, parentItem: ParentItem) {
        when (parentItem) {
            is ParentItem.Advice -> {
                (holder as AdviceHolder).bind(parentItem.advices)
            }
            is ParentItem.RecentFood -> {
                (holder as RecentFoodHolder).bind(parentItem.recipes)
            }
            is ParentItem.RecipeFood -> {
                (holder as RecipeFoodHolder).bind(parentItem.recipes)
            }
        }
    }


    companion object {
        const val TYPE_ADVICE = R.layout.item_recycler_view_advice
        const val TYPE_RECENT_FOOD = R.layout.item_card_view_recent_food
        const val TYPE_RECIPE_FOOD = R.layout.item_card_view_recipe_food
    }
}