package com.kahuripaninfox.app.modules.ten.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityTenBinding
import com.kahuripaninfox.app.modules.one.ui.OneActivity
import com.kahuripaninfox.app.modules.ten.`data`.viewmodel.TenVM
import kotlin.String
import kotlin.Unit

class TenActivity : BaseActivity<ActivityTenBinding>(R.layout.activity_ten) {
  private val viewModel: TenVM by viewModels<TenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.tenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnYa.setOnClickListener {
      val destIntent = OneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
