package com.kahuripaninfox.app.modules.sixteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivitySixteenBinding
import com.kahuripaninfox.app.modules.nineteen.ui.NineteenActivity
import com.kahuripaninfox.app.modules.seventeen.ui.SeventeenActivity
import com.kahuripaninfox.app.modules.sixteen.`data`.viewmodel.SixteenVM
import kotlin.String
import kotlin.Unit

class SixteenActivity : BaseActivity<ActivitySixteenBinding>(R.layout.activity_sixteen) {
  private val viewModel: SixteenVM by viewModels<SixteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sixteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtButton.setOnClickListener {
      val destIntent = SeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtButtonOne.setOnClickListener {
      val destIntent = NineteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIXTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SixteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
