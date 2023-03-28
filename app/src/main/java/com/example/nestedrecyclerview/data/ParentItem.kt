package com.example.nestedrecyclerview.data

sealed class ParentItem(val rank: Int) {
    class Advice(val advices: List<HealthAdvice>) : ParentItem(0)
    class RecentFood(val recipes: List<Recipe>) : ParentItem(1)
    class RecipeFood(val recipes: List<Recipe>) : ParentItem(2)


}