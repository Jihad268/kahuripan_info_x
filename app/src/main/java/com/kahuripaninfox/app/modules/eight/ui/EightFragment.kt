package com.kahuripaninfox.app.modules.eight.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseFragment
import com.kahuripaninfox.app.databinding.FragmentEightBinding
import com.kahuripaninfox.app.modules.eight.`data`.viewmodel.EightVM
import com.kahuripaninfox.app.modules.nine.ui.NineActivity
import com.kahuripaninfox.app.modules.ten.ui.TenActivity
import com.kahuripaninfox.app.modules.twenty.ui.TwentyActivity
import com.kahuripaninfox.app.modules.twentyone.ui.TwentyoneActivity
import kotlin.String
import kotlin.Unit

class EightFragment : BaseFragment<FragmentEightBinding>(R.layout.fragment_eight) {
  private val viewModel: EightVM by viewModels<EightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.eightVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLogoutOne.setOnClickListener {
      val destIntent = TenActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.txtDarkmode.setOnClickListener {
      val destIntent = TwentyoneActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageArrowrightTwo.setOnClickListener {
      val destIntent = TenActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageArrowrightOne.setOnClickListener {
      val destIntent = TwentyoneActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageArrowright.setOnClickListener {
      val destIntent = TwentyActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.txtBahasa.setOnClickListener {
      val destIntent = TwentyActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.btnEditProfile.setOnClickListener {
      val destIntent = NineActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "EIGHT_FRAGMENT"


    fun getInstance(bundle: Bundle?): EightFragment {
      val fragment = EightFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
