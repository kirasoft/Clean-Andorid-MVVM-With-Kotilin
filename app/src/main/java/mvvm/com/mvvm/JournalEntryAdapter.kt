package mvvm.com.mvvm

import android.arch.lifecycle.LifecycleOwner
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import mvvm.com.business.viewmodel.JournalEntryViewModel
import mvvm.com.mvvm.databinding.JournalEntryItemBinding

class JournalEntryAdapter(private val lifecycleOwner: LifecycleOwner, private var entryList: List<JournalEntryViewModel>): RecyclerView.Adapter<JournalEntryViewHolder>() {

    override fun onBindViewHolder(holder: JournalEntryViewHolder?, position: Int) {
        holder?.bind(lifecycleOwner, entryList[position])
    }

    override fun getItemCount(): Int {
        return entryList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JournalEntryViewHolder {
        val entryBinding = DataBindingUtil.inflate<JournalEntryItemBinding>(
                LayoutInflater.from(parent.context),
                R.layout.journal_entry_item,
                parent,
                false)
        return JournalEntryViewHolder(entryBinding)
    }

    fun updateDataSet(data: List<JournalEntryViewModel>){
        entryList = data
        notifyDataSetChanged()
    }

}