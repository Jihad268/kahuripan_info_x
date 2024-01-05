package com.kahuripaninfox.app.modules.six.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class SixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRajaAirlangga: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_raja_airlangga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_airlangga_bali2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_airlangga_bali3)

)
