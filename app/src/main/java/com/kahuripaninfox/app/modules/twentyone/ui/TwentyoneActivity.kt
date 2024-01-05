package com.kahuripaninfox.app.modules.twentyone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityTwentyoneBinding
import com.kahuripaninfox.app.modules.twentyone.`data`.viewmodel.TwentyoneVM
import kotlin.String
import kotlin.Unit

class TwentyoneActivity : BaseActivity<ActivityTwentyoneBinding>(R.layout.activity_twentyone) {
  private val viewModel: TwentyoneVM by viewModels<TwentyoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.twentyoneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TWENTYONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TwentyoneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
