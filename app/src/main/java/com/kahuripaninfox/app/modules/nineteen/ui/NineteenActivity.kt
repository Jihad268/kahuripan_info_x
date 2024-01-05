package com.kahuripaninfox.app.modules.nineteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityNineteenBinding
import com.kahuripaninfox.app.modules.nineteen.`data`.viewmodel.NineteenVM
import kotlin.String
import kotlin.Unit

class NineteenActivity : BaseActivity<ActivityNineteenBinding>(R.layout.activity_nineteen) {
  private val viewModel: NineteenVM by viewModels<NineteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.nineteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NINETEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NineteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
