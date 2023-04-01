package com.example.nestedrecyclerview.ui.base

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding


abstract class BaseNestedRecyclerAdapter<T : Any> :
    RecyclerView.Adapter<BaseNestedRecyclerAdapter.BaseNestedRecyclerViewHolder>() {

    private val itemsNested = mutableListOf<T>()

    abstract fun sortItem(item: T): Int

    @SuppressLint("NotifyDataSetChanged")
    fun addNestedItem(newItems: T) {
        itemsNested.apply {
            add(newItems)
            sortBy { sortItem(it) }
        }
        notifyDataSetChanged()
    }

    abstract fun getViewHolder(
        inflater: LayoutInflater,
        parent: ViewGroup,
        viewType: Int,
    ): BaseNestedRecyclerViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseNestedRecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return getViewHolder(inflater, parent, viewType)
    }

    abstract fun bindItem(holder: BaseNestedRecyclerViewHolder, item: T)

    override fun onBindViewHolder(holder: BaseNestedRecyclerViewHolder, position: Int) {
        bindItem(holder, itemsNested[position])
    }

    override fun getItemCount() = itemsNested.size

    abstract fun getTypeView(item: T): Int

    override fun getItemViewType(position: Int): Int {
        return getTypeView(itemsNested[position])
    }

    abstract class BaseNestedRecyclerViewHolder(val binding: ViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        abstract fun bind(item: Any? = null)
    }

}