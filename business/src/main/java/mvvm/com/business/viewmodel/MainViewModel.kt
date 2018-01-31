package mvvm.com.business.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import mvvm.com.business.model.JournalEntry

class MainViewModel: ViewModel() {

    val title = MutableLiveData<String>()

    val newsItemViewHolderList = MutableLiveData<List<JournalEntryViewModel>>()

    init {
        title.postValue("Hi. If you are seeing this then it works")
        newsItemViewHolderList.postValue(listOf(
                JournalEntryViewModel(JournalEntry("Test", "RandomContent.RandomContent")),
                JournalEntryViewModel(JournalEntry("Test2", "RandomContent.RandomContent2")),
                JournalEntryViewModel(JournalEntry("Test3", "RandomContent.RandomContent3"))
                ))
    }

}