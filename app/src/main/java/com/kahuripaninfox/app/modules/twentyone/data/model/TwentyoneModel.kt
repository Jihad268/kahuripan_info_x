package com.kahuripaninfox.app.modules.twentyone.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class TwentyoneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDarkmodeAplika: String? =
      MyApp.getInstance().resources.getString(R.string.msg_darkmode_aplika)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame2608591Value: String? = null
)
