package com.example.codigouidesigntest.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.codigouidesigntest.databinding.ViewHolderButtonsBinding
import com.example.codigouidesigntest.viewHolders.ButtonsViewHolder

class ButtonsAdapter: RecyclerView.Adapter<ButtonsViewHolder>() {

    private var mButtonList = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ButtonsViewHolder {
        val binding = ViewHolderButtonsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ButtonsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return 6
    }

    override fun onBindViewHolder(holder: ButtonsViewHolder, position: Int) {
//        if (mBannerList.isNotEmpty())
//            holder.bindData(mBannerList[position])

    }

    @Suppress("NotifyDataSetChanged")
    fun setNewData(buttonsList: List<String>) {
        mButtonList = buttonsList
        notifyDataSetChanged()
    }
}