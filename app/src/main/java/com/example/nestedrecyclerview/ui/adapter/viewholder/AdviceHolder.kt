package com.example.nestedrecyclerview.ui.adapter.viewholder

import com.example.nestedrecyclerview.data.HealthAdvice
import com.example.nestedrecyclerview.databinding.ItemRecyclerViewAdviceBinding
import com.example.nestedrecyclerview.ui.adapter.AdviceAdapter
import com.example.nestedrecyclerview.ui.base.BaseParentAdapter
import com.example.nestedrecyclerview.ui.base.ParentInteractionListener

class AdviceHolder(binding: ItemRecyclerViewAdviceBinding, private val listener: ParentInteractionListener) :
    BaseParentAdapter.BaseParentViewHolder(binding) {
    override fun bind(item: Any?) {
        with(binding as ItemRecyclerViewAdviceBinding) {
            val adapter = AdviceAdapter()
            adapter.submitList(item as List<HealthAdvice>)
            recyclerViewAdvice.adapter = adapter
            adapter.onItemClickListener {
                listener.onClickAdvice(it)
            }
        }
    }
}

