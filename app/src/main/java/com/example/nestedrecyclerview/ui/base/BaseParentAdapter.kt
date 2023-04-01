package com.example.nestedrecyclerview.ui.base

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.nestedrecyclerview.data.ParentItem


abstract class BaseParentAdapter : RecyclerView.Adapter<BaseParentAdapter.BaseParentViewHolder>() {

    private val itemsNested = mutableListOf<ParentItem>()

    @SuppressLint("NotifyDataSetChanged")
    fun addNestedItem(newItems: ParentItem) {
        itemsNested.apply {
            add(newItems)
            sortBy {
                it.rank
            }
        }
        notifyDataSetChanged()
    }

    abstract fun getViewHolder(
        inflater: LayoutInflater,
        parent: ViewGroup,
        viewType: Int,
    ): BaseParentViewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseParentViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return getViewHolder(inflater, parent, viewType)
    }

    abstract fun bindItem(holder: BaseParentViewHolder, parentItem: ParentItem)

    override fun onBindViewHolder(holder: BaseParentViewHolder, position: Int) {
        bindItem(holder, itemsNested[position])
    }

    override fun getItemCount() = itemsNested.size

    abstract fun getTypeView(parentItem: ParentItem): Int

    override fun getItemViewType(position: Int): Int {
        return getTypeView(itemsNested[position])
    }

    abstract class BaseParentViewHolder(val binding: ViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        abstract fun bind(item: Any? = null)
    }

}