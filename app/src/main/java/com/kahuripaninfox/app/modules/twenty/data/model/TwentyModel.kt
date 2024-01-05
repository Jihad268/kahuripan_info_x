package com.kahuripaninfox.app.modules.twenty.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class TwentyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBahasa: String? = MyApp.getInstance().resources.getString(R.string.lbl_bahasa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_bahasa_indonesi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl3)

)
