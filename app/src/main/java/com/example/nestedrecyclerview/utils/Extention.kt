package com.example.nestedrecyclerview.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.nestedrecyclerview.data.ParentItem
import com.example.nestedrecyclerview.data.Recipe

fun ImageView.setImage(url: String) {
    Glide.with(context).load(url)
        .into(this)
}

fun Recipe.toRecipe() = ParentItem.RecipeFood(recipe = this)

