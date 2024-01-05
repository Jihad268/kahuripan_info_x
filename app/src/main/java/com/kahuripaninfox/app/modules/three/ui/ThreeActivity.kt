package com.kahuripaninfox.app.modules.three.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityThreeBinding
import com.kahuripaninfox.app.modules.googlepixel2xltwocontainer.ui.GooglePixel2XlTwoContainerActivity
import com.kahuripaninfox.app.modules.one.ui.OneActivity
import com.kahuripaninfox.app.modules.three.`data`.viewmodel.ThreeVM
import kotlin.String
import kotlin.Unit

class ThreeActivity : BaseActivity<ActivityThreeBinding>(R.layout.activity_three) {
  private val viewModel: ThreeVM by viewModels<ThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.threeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDaftarOne.setOnClickListener {
      val destIntent = GooglePixel2XlTwoContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtMasuk.setOnClickListener {
      val destIntent = OneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
    }
  }

  companion object {
    const val TAG: String = "THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
