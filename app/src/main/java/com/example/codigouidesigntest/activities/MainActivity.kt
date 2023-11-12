package com.example.codigouidesigntest.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.codigouidesigntest.R
import com.example.codigouidesigntest.adapters.BannerAdapter
import com.example.codigouidesigntest.adapters.ButtonsAdapter
import com.example.codigouidesigntest.adapters.ShowCaseAdapter
import com.example.codigouidesigntest.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
 private lateinit var binding : ActivityMainBinding
// val bannerList : List<String> = listOf("https://media.istockphoto.com/id/498283106/photo/underwater-scuba-diver-explore-and-enjoy-coral-reef-sea-life.jpg?s=612x612&w=0&k=20&c=xOj00xaZTpy5-AtKvMvIHHfexz9miSSct_CXb6F9KVA=",)
private lateinit var mBannerAdapter: BannerAdapter
private lateinit var mButtonsAdapter: ButtonsAdapter
private lateinit var mShowCaseAdapter: ShowCaseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpBanner()
        setUpRecyclerView()
        setUpListener()
    }

    private fun setUpBanner(){
        mBannerAdapter = BannerAdapter()
        binding.viewPagerBanner.adapter = mBannerAdapter
        binding.dotsIndicatorBanner.attachTo(binding.viewPagerBanner)

    }

    private fun setUpRecyclerView(){
        mButtonsAdapter = ButtonsAdapter()
        binding.rvbutton.adapter = mButtonsAdapter
        binding.rvbutton.layoutManager = GridLayoutManager(this,4)
        mShowCaseAdapter = ShowCaseAdapter()
        binding.rvUpComingShows.adapter = mShowCaseAdapter
        binding.rvUpComingShows.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    }

   fun buttomSheet(){

        val sheet = BottomSheetBehavior.from(findViewById<RelativeLayout>(R.id.buttomSheet))
        when {
            sheet.state != BottomSheetBehavior.STATE_EXPANDED -> {
                sheet.state = BottomSheetBehavior.STATE_EXPANDED
            }
            else -> sheet.state = BottomSheetBehavior.STATE_COLLAPSED
        }

    }

    fun setUpListener(){
        binding.rlEvent1.setOnClickListener {
            buttomSheet()
        }
    }


}