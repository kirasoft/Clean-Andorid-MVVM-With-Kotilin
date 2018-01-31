package mvvm.com.business.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import mvvm.com.business.model.News


class MainViewModel: ViewModel() {

    val title = MutableLiveData<String>()

    val newsItemViewHolderList = MutableLiveData<List<NewsItemViewModel>>()

    init {
        title.postValue("Hi. If you are seeing this then it works")
        newsItemViewHolderList.postValue(listOf(
                NewsItemViewModel(News("Test", "RandomContent.RandomContent")),
                NewsItemViewModel(News("Test2", "RandomContent.RandomContent2")),
                NewsItemViewModel(News("Test3", "RandomContent.RandomContent3"))
                ))
    }

}