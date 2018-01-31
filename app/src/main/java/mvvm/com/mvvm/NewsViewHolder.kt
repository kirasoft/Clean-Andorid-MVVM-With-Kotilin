package mvvm.com.mvvm

import android.arch.lifecycle.LifecycleOwner
import android.support.v7.widget.RecyclerView
import mvvm.com.business.viewmodel.NewsItemViewModel
import mvvm.com.mvvm.databinding.NewsItemBinding


class NewsViewHolder(private val binding: NewsItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(lifecycleOwner: LifecycleOwner?, newsViewModel: NewsItemViewModel) {
        binding.setVariable(BR.newsViewModel, newsViewModel)
        binding.setLifecycleOwner(lifecycleOwner)
        binding.executePendingBindings()
    }

}