package com.kahuripaninfox.app.modules.googlepixel2xltwo.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.kahuripaninfox.app.databinding.SlideritemGooglePixel2XlTwo1Binding
import com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model.ImageSliderSliderbaganscenemyaModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbaganscenemyaAdapter(
  val dataList: ArrayList<ImageSliderSliderbaganscenemyaModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbaganscenemyaModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemGooglePixel2XlTwo1Binding) {
      binding.imageSliderSliderbaganscenemyaModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemGooglePixel2XlTwo1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
