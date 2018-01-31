package mvvm.com.business.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import mvvm.com.business.model.JournalEntry

class JournalEntryViewModel(journalEntry: JournalEntry) : ViewModel() {

    private val Tag = "JournalEntryVM"

    val title = MutableLiveData<String>()
    val content = MutableLiveData<String>()

    init {
        this.title.postValue(journalEntry.title)
        this.content.postValue(journalEntry.content)
    }

    fun journalItemClicked() {
       Log.v(Tag, "Journal Item Clicked")
    }



}