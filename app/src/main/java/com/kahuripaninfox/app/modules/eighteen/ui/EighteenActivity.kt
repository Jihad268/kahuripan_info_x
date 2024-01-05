package com.kahuripaninfox.app.modules.eighteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityEighteenBinding
import com.kahuripaninfox.app.modules.eighteen.`data`.viewmodel.EighteenVM
import kotlin.String
import kotlin.Unit

class EighteenActivity : BaseActivity<ActivityEighteenBinding>(R.layout.activity_eighteen) {
  private val viewModel: EighteenVM by viewModels<EighteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.eighteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EIGHTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EighteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
