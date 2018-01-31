package mvvm.com.mvvm

import android.arch.lifecycle.LifecycleOwner
import android.support.v7.widget.RecyclerView
import mvvm.com.business.viewmodel.JournalEntryViewModel
import mvvm.com.business.viewmodel.NewsItemViewModel
import mvvm.com.mvvm.databinding.NewsItemBinding


class JournalEntryViewHolder(private val binding: NewsItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(lifecycleOwner: LifecycleOwner?, newsViewModel: JournalEntryViewModel) {
        binding.setVariable(BR.journalEntryViewModel, newsViewModel)
        binding.setLifecycleOwner(lifecycleOwner)
        binding.executePendingBindings()
    }

}