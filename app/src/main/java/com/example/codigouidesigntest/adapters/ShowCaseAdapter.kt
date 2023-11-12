package com.example.codigouidesigntest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.codigouidesigntest.databinding.ViewHolderBannerBinding
import com.example.codigouidesigntest.databinding.ViewHolderShowCaseBinding
import com.example.codigouidesigntest.viewHolders.BannerViewHolder
import com.example.codigouidesigntest.viewHolders.ShowCaseVIewHolder

class ShowCaseAdapter: RecyclerView.Adapter<ShowCaseVIewHolder>() {

  //  private var mShowList = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ShowCaseVIewHolder {
        val binding =
            ViewHolderShowCaseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShowCaseVIewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: ShowCaseVIewHolder, position: Int) {
//        if (mBannerList.isNotEmpty())
//            holder.bindData(mBannerList[position])

    }

//    @Suppress("NotifyDataSetChanged")
//    fun setNewData(showList: List<String>) {
//        mShowList = showList
//        notifyDataSetChanged()
//    }
}