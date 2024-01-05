package com.kahuripaninfox.app.modules.thirteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityThirteenBinding
import com.kahuripaninfox.app.modules.thirteen.`data`.viewmodel.ThirteenVM
import kotlin.String
import kotlin.Unit

class ThirteenActivity : BaseActivity<ActivityThirteenBinding>(R.layout.activity_thirteen) {
  private val viewModel: ThirteenVM by viewModels<ThirteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.thirteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "THIRTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThirteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
