package com.example.nestedrecyclerview.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.data.ParentItem
import com.example.nestedrecyclerview.databinding.*
import com.example.nestedrecyclerview.databinding.ItemCardViewRecipeFoodBinding
import com.example.nestedrecyclerview.ui.adapter.viewholder.AdviceHolder
import com.example.nestedrecyclerview.ui.adapter.viewholder.RecentFoodHolder
import com.example.nestedrecyclerview.ui.adapter.viewholder.RecipeFoodHolder
import com.example.nestedrecyclerview.ui.base.BaseNestedRecyclerAdapter
import com.example.nestedrecyclerview.ui.base.ParentInteractionListener

class HomeAdapter(private val listener: ParentInteractionListener) :
    BaseNestedRecyclerAdapter<ParentItem>() {

    override fun sortItem(item: ParentItem) = item.rank

    override fun getViewHolder(
        inflater: LayoutInflater,
        parent: ViewGroup,
        viewType: Int
    ): BaseNestedRecyclerViewHolder {
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
                    ItemCardViewRecipeFoodBinding.inflate(inflater, parent, false),
                    listener
                )
            }
        }
    }

    override fun getTypeView(item: ParentItem): Int {
        return when (item) {
            is ParentItem.Advice -> TYPE_ADVICE
            is ParentItem.RecentFood -> TYPE_RECENT_FOOD
            is ParentItem.RecipeFood -> TYPE_RECIPE_FOOD
        }
    }

    override fun bindItem(holder: BaseNestedRecyclerViewHolder, item: ParentItem) {
        when (item) {
            is ParentItem.Advice -> {
                (holder as AdviceHolder).bind(item.advices)
            }
            is ParentItem.RecentFood -> {
                (holder as RecentFoodHolder).bind(item.recent)
            }
            is ParentItem.RecipeFood -> {
                (holder as RecipeFoodHolder).bind(item.recipe)
            }
        }
    }


    companion object {
        const val TYPE_ADVICE = R.layout.item_recycler_view_advice
        const val TYPE_RECENT_FOOD = R.layout.item_recycler_view_recent_food
        const val TYPE_RECIPE_FOOD = R.layout.item_card_view_recipe_food
    }
}