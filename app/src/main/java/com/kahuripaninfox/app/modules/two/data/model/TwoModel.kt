package com.kahuripaninfox.app.modules.two.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class TwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLupaPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lupa_password2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPesan: String? = MyApp.getInstance().resources.getString(R.string.lbl_pesan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukanemailA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukan_email_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukanEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_masukan_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)

)
