package com.kahuripaninfox.app.modules.eight.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class EightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtySix: String? = MyApp.getInstance().resources.getString(R.string.lbl_pengaturan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBahasa: String? = MyApp.getInstance().resources.getString(R.string.lbl_bahasa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDarkmode: String? = MyApp.getInstance().resources.getString(R.string.lbl_darkmode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogoutOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
