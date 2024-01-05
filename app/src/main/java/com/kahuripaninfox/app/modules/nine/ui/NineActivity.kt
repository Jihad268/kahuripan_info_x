package com.kahuripaninfox.app.modules.nine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityNineBinding
import com.kahuripaninfox.app.modules.nine.`data`.viewmodel.NineVM
import kotlin.String
import kotlin.Unit

class NineActivity : BaseActivity<ActivityNineBinding>(R.layout.activity_nine) {
  private val viewModel: NineVM by viewModels<NineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.nineVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
