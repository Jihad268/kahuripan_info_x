package com.kahuripaninfox.app.modules.seven.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseFragment
import com.kahuripaninfox.app.databinding.FragmentSevenBinding
import com.kahuripaninfox.app.modules.seven.`data`.viewmodel.SevenVM
import kotlin.String
import kotlin.Unit

class SevenFragment : BaseFragment<FragmentSevenBinding>(R.layout.fragment_seven) {
  private val viewModel: SevenVM by viewModels<SevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.sevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEVEN_FRAGMENT"


    fun getInstance(bundle: Bundle?): SevenFragment {
      val fragment = SevenFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
