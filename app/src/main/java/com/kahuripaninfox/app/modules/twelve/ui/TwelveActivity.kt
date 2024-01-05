package com.kahuripaninfox.app.modules.twelve.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityTwelveBinding
import com.kahuripaninfox.app.modules.fourteen.ui.FourteenActivity
import com.kahuripaninfox.app.modules.thirteen.ui.ThirteenActivity
import com.kahuripaninfox.app.modules.twelve.`data`.viewmodel.TwelveVM
import kotlin.String
import kotlin.Unit

class TwelveActivity : BaseActivity<ActivityTwelveBinding>(R.layout.activity_twelve) {
  private val viewModel: TwelveVM by viewModels<TwelveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.twelveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtButton.setOnClickListener {
      val destIntent = FourteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArahkanKePetaOne.setOnClickListener {
      val destIntent = ThirteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TWELVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TwelveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
