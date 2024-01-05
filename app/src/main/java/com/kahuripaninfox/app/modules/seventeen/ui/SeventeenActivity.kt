package com.kahuripaninfox.app.modules.seventeen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivitySeventeenBinding
import com.kahuripaninfox.app.modules.eighteen.ui.EighteenActivity
import com.kahuripaninfox.app.modules.seventeen.`data`.viewmodel.SeventeenVM
import kotlin.String
import kotlin.Unit

class SeventeenActivity : BaseActivity<ActivitySeventeenBinding>(R.layout.activity_seventeen) {
  private val viewModel: SeventeenVM by viewModels<SeventeenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.seventeenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtRepliesCounter.setOnClickListener {
      val destIntent = EighteenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SEVENTEEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SeventeenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
