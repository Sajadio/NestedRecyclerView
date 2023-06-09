package com.example.nestedrecyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.data.DataSource
import com.example.nestedrecyclerview.data.ParentItem
import com.example.nestedrecyclerview.databinding.ActivityHomeBinding
import com.example.nestedrecyclerview.ui.adapter.HomeAdapter
import com.example.nestedrecyclerview.ui.base.ParentInteractionListener
import com.example.nestedrecyclerview.utils.toRecipe

class HomeActivity : AppCompatActivity(), ParentInteractionListener {

    lateinit var binding: ActivityHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupParentRecyclerView()
    }

    private fun setupParentRecyclerView() {
        binding.recyclerViewHome.adapter = HomeAdapter(this)
        (binding.recyclerViewHome.adapter as HomeAdapter).apply {

            val nestedItem = mutableListOf<ParentItem>()
            nestedItem.addAll(DataSource.getRecipes().map { it.toRecipe() })
            nestedItem.add(ParentItem.Advice(DataSource.getAdvices()))
            nestedItem.add(ParentItem.RecentFood(DataSource.getRecipes()))

            this.addNestedItem(nestedItem)
            this.addNestedItem(nestedItem)
            this.addNestedItem(nestedItem)
        }
    }

    override fun onClickAdvice(id: Int) {
        makeToast("Advice $id")
    }

    override fun onClickRecentFood(id: Int) {
        makeToast("Recent Food $id")

    }

    override fun onClickRecipeFood(id: Int) {
        makeToast("Recipe Food $id")
    }

    private fun makeToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}