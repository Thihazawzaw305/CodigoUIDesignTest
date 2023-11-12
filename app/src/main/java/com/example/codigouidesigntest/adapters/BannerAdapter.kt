package com.example.codigouidesigntest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.codigouidesigntest.databinding.ViewHolderBannerBinding
import com.example.codigouidesigntest.viewHolders.BannerViewHolder

class BannerAdapter : RecyclerView.Adapter<BannerViewHolder>() {

    private var mBannerList = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val binding =
            ViewHolderBannerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BannerViewHolder(binding)
    }

    override fun getItemCount(): Int {
      return 3
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
//        if (mBannerList.isNotEmpty())
//            holder.bindData(mBannerList[position])

    }

    @Suppress("NotifyDataSetChanged")
    fun setNewData(bannerList: List<String>) {
        mBannerList = bannerList
        notifyDataSetChanged()
    }
}