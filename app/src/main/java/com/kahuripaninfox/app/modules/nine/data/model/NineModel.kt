package com.kahuripaninfox.app.modules.nine.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class NineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangePicture: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_picture)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailId: String? = MyApp.getInstance().resources.getString(R.string.lbl_email_i_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyFourValue: String? = null
)
