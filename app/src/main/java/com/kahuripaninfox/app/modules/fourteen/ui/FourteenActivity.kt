package com.kahuripaninfox.app.modules.fourteen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityFourteenBinding
import com.kahuripaninfox.app.modules.fifteen.ui.FifteenActivity
import com.kahuripaninfox.app.modules.fourteen.`data`.viewmodel.FourteenVM
import com.kahuripaninfox.app.modules.twelve.ui.TwelveActivity
import kotlin.String
import kotlin.Unit

class FourteenActivity : BaseActivity<ActivityFourteenBinding>(R.layout.activity_fourteen) {
  private val viewModel: FourteenVM by viewModels<FourteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fourteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKirim.setOnClickListener {
      val destIntent = FifteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBatal.setOnClickListener {
      val destIntent = TwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FOURTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FourteenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
