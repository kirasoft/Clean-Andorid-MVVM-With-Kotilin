package mvvm.com.business.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import mvvm.com.business.model.News


class NewsItemViewModel(newsItem: News) : ViewModel() {

    val title = MutableLiveData<String>()
    val content = MutableLiveData<String>()

    init {
        this.title.postValue(newsItem.title)
        this.content.postValue(newsItem.content)
    }



}