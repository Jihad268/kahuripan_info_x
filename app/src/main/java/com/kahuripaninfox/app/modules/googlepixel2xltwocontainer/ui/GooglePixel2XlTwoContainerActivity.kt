package com.kahuripaninfox.app.modules.googlepixel2xltwocontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityGooglePixel2XlTwoContainerBinding
import com.kahuripaninfox.app.extensions.loadFragment
import com.kahuripaninfox.app.modules.eight.ui.EightFragment
import com.kahuripaninfox.app.modules.googlepixel2xltwo.ui.GooglePixel2XlTwoFragment
import com.kahuripaninfox.app.modules.googlepixel2xltwocontainer.`data`.viewmodel.GooglePixel2XlTwoContainerVM
import com.kahuripaninfox.app.modules.seven.ui.SevenFragment
import kotlin.String
import kotlin.Unit

class GooglePixel2XlTwoContainerActivity :
    BaseActivity<ActivityGooglePixel2XlTwoContainerBinding>(R.layout.activity_google_pixel_2_xl_two_container)
    {
  private val viewModel: GooglePixel2XlTwoContainerVM by viewModels<GooglePixel2XlTwoContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.googlePixel2XlTwoContainerVM = viewModel
    val destFragment = GooglePixel2XlTwoFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = GooglePixel2XlTwoFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearProfile.setOnClickListener {
      val destFragment = EightFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = EightFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearSearch.setOnClickListener {
      val destFragment = SevenFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = SevenFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearHome.setOnClickListener {
      val destFragment = GooglePixel2XlTwoFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = GooglePixel2XlTwoFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "GOOGLE_PIXEL2XL_TWO_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GooglePixel2XlTwoContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
