package com.kahuripaninfox.app.modules.fifteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityFifteenBinding
import com.kahuripaninfox.app.modules.fifteen.`data`.viewmodel.FifteenVM
import com.kahuripaninfox.app.modules.twelve.ui.TwelveActivity
import kotlin.String
import kotlin.Unit

class FifteenActivity : BaseActivity<ActivityFifteenBinding>(R.layout.activity_fifteen) {
  private val viewModel: FifteenVM by viewModels<FifteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fifteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnOk.setOnClickListener {
      val destIntent = TwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FIFTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FifteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
