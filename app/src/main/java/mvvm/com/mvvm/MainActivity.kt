package mvvm.com.mvvm

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import mvvm.com.business.viewmodel.MainViewModel
import mvvm.com.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding? = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding?.let {
            it.viewModel = viewModel
            it.setLifecycleOwner(this)
        }
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        newsRecyclerView.setHasFixedSize(true)
        newsRecyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = JournalEntryAdapter(this, emptyList())
        newsRecyclerView.adapter = adapter
        viewModel.newsItemViewHolderList.observe(this, Observer {
            if (it?.isNotEmpty() == true){
                adapter.updateDataSet(it)
            }
        })
    }

}
