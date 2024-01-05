package com.kahuripaninfox.app.modules.alpha.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityAlphaBinding
import com.kahuripaninfox.app.modules.alpha.`data`.viewmodel.AlphaVM
import com.kahuripaninfox.app.modules.one.ui.OneActivity
import kotlin.String
import kotlin.Unit

class AlphaActivity : BaseActivity<ActivityAlphaBinding>(R.layout.activity_alpha) {
  private val viewModel: AlphaVM by viewModels<AlphaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.alphaVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = OneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "ALPHA_ACTIVITY"

    }
  }
