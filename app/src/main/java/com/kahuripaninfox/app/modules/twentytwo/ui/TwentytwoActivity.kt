package com.kahuripaninfox.app.modules.twentytwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityTwentytwoBinding
import com.kahuripaninfox.app.modules.seventeen.ui.SeventeenActivity
import com.kahuripaninfox.app.modules.twentytwo.`data`.viewmodel.TwentytwoVM
import kotlin.String
import kotlin.Unit

class TwentytwoActivity : BaseActivity<ActivityTwentytwoBinding>(R.layout.activity_twentytwo) {
  private val viewModel: TwentytwoVM by viewModels<TwentytwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.twentytwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRajaairlangga.setOnClickListener {
      val destIntent = SeventeenActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "TWENTYTWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TwentytwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
