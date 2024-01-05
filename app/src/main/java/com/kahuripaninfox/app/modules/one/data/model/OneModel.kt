package com.kahuripaninfox.app.modules.one.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class OneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukanPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukan_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirty: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBelumpunyaaku: String? =
      MyApp.getInstance().resources.getString(R.string.msg_belum_punya_aku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLupapassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_lupa_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftar: String? = MyApp.getInstance().resources.getString(R.string.lbl_daftar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGuestMode: String? = MyApp.getInstance().resources.getString(R.string.lbl_guest_mode)

)
