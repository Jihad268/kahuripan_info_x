package com.kahuripaninfox.app.modules.eleven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseActivity
import com.kahuripaninfox.app.databinding.ActivityElevenBinding
import com.kahuripaninfox.app.modules.eleven.`data`.viewmodel.ElevenVM
import com.kahuripaninfox.app.modules.twelve.ui.TwelveActivity
import kotlin.String
import kotlin.Unit

class ElevenActivity : BaseActivity<ActivityElevenBinding>(R.layout.activity_eleven) {
  private val viewModel: ElevenVM by viewModels<ElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.elevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.image500px036View.setOnClickListener {
      val destIntent = TwelveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ELEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ElevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
