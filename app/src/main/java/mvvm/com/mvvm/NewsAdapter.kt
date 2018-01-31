package mvvm.com.mvvm

import android.arch.lifecycle.LifecycleOwner
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import mvvm.com.business.model.News
import mvvm.com.business.viewmodel.NewsItemViewModel
import mvvm.com.mvvm.databinding.NewsItemBinding


class NewsAdapter(private val lifecycleOwner: LifecycleOwner, private var newsList: List<NewsItemViewModel>): RecyclerView.Adapter<NewsViewHolder>() {

    override fun onBindViewHolder(holder: NewsViewHolder?, position: Int) {
        holder?.bind(lifecycleOwner, newsList[position])
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val newsBinding = DataBindingUtil.inflate<NewsItemBinding>(
                LayoutInflater.from(parent.context),
                R.layout.news_item,
                parent,
                false)
        return NewsViewHolder(newsBinding)
    }

    fun updateDataSet(data: List<NewsItemViewModel>){
        newsList = data
        notifyDataSetChanged()
    }

}