package com.kahuripaninfox.app.modules.twenty.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityTwentyBinding
import com.kahuripaninfox.app.modules.twenty.`data`.viewmodel.TwentyVM
import kotlin.String
import kotlin.Unit

class TwentyActivity : BaseActivity<ActivityTwentyBinding>(R.layout.activity_twenty) {
  private val viewModel: TwentyVM by viewModels<TwentyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.twentyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TWENTY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TwentyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
