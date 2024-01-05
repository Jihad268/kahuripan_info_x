package com.kahuripaninfox.app.modules.two.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityTwoBinding
import com.kahuripaninfox.app.modules.googlepixel2xltwocontainer.ui.GooglePixel2XlTwoContainerActivity
import com.kahuripaninfox.app.modules.two.`data`.viewmodel.TwoVM
import kotlin.String
import kotlin.Unit

class TwoActivity : BaseActivity<ActivityTwoBinding>(R.layout.activity_two) {
  private val viewModel: TwoVM by viewModels<TwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.twoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKirim.setOnClickListener {
      val destIntent = GooglePixel2XlTwoContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
