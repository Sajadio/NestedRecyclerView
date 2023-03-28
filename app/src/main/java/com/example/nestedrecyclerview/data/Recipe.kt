package com.example.nestedrecyclerview.data

data class Recipe(
    val id: Int,
    val translatedRecipeName: String,
    val totalTimeInMin: Int,
    val cuisine: String,
    val imageUrl: String,
)