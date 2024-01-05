package com.kahuripaninfox.app.modules.six.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivitySixBinding
import com.kahuripaninfox.app.modules.five.ui.FiveActivity
import com.kahuripaninfox.app.modules.six.`data`.viewmodel.SixVM
import kotlin.String
import kotlin.Unit

class SixActivity : BaseActivity<ActivitySixBinding>(R.layout.activity_six) {
  private val viewModel: SixVM by viewModels<SixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnFrame2608590.setOnClickListener {
      val destIntent = FiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
