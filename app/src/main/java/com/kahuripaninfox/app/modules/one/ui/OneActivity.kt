package com.kahuripaninfox.app.modules.one.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityOneBinding
import com.kahuripaninfox.app.modules.googlepixel2xltwocontainer.ui.GooglePixel2XlTwoContainerActivity
import com.kahuripaninfox.app.modules.one.`data`.viewmodel.OneVM
import com.kahuripaninfox.app.modules.three.ui.ThreeActivity
import com.kahuripaninfox.app.modules.two.ui.TwoActivity
import kotlin.String
import kotlin.Unit

class OneActivity : BaseActivity<ActivityOneBinding>(R.layout.activity_one) {
  private val viewModel: OneVM by viewModels<OneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.oneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnMasuk.setOnClickListener {
      val destIntent = GooglePixel2XlTwoContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLupapassword.setOnClickListener {
      val destIntent = TwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
    binding.txtDaftar.setOnClickListener {
      val destIntent = ThreeActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
