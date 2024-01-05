package com.kahuripaninfox.app.modules.twentytwo.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class TwentytwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRajaAirlanggaOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_raja_airlangga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_comment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKHXperience: String? = MyApp.getInstance().resources.getString(R.string.msg_kh_xperience)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtikelyangba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_artikel_yang_ba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame2608590Value: String? = null
)
