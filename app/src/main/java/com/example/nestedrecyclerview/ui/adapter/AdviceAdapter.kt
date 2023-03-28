package com.example.nestedrecyclerview.ui.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.nestedrecyclerview.data.HealthAdvice
import com.example.nestedrecyclerview.databinding.ItemCardViewAdviceBinding
import com.example.nestedrecyclerview.ui.base.BaseAdapter
import com.example.nestedrecyclerview.utils.setImage

class AdviceAdapter : BaseAdapter<HealthAdvice, ItemCardViewAdviceBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> ItemCardViewAdviceBinding =
        ItemCardViewAdviceBinding::inflate

    private var onItemClickListener: ((Int) -> Unit)? = null
    fun onItemClickListener(listener: (Int) -> Unit) {
        onItemClickListener = listener
    }

    override fun bindItem(binding: ItemCardViewAdviceBinding, item: HealthAdvice) {
        binding.apply {
            imageViewAdvice.setImage(item.imageUrl)
            textViewRecipeFoodName.text = item.title
            imageViewAdvice.setOnClickListener {
                onItemClickListener?.let { it(item.id) }
            }
        }
    }

    override fun <T> areItemsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int,
        newItems: List<T>
    ) = getOldItems()[oldItemPosition].title == (newItems[newItemPosition] as HealthAdvice).title
}
