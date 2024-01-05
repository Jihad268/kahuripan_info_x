package com.kahuripaninfox.app.modules.five.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityFiveBinding
import com.kahuripaninfox.app.modules.five.`data`.viewmodel.FiveVM
import com.kahuripaninfox.app.modules.six.ui.SixActivity
import kotlin.String
import kotlin.Unit

class FiveActivity : BaseActivity<ActivityFiveBinding>(R.layout.activity_five) {
  private val viewModel: FiveVM by viewModels<FiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackrajaairlangga.setOnClickListener {
      val destIntent = SixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRajaairlangga.setOnClickListener {
      val destIntent = SixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
