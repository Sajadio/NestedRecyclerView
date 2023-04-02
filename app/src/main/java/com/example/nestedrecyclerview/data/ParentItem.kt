package com.example.nestedrecyclerview.data


sealed class ParentItem(val rank: Int) {
    class Advice(val advices: List<HealthAdvice>) : ParentItem(0)
    class RecentFood(val recent: List<Recipe>) : ParentItem(1)
    class RecipeFood(val recipe: Recipe) : ParentItem(2)

}