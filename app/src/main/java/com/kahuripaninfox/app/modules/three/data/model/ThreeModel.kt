package com.kahuripaninfox.app.modules.three.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class ThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftar: String? = MyApp.getInstance().resources.getString(R.string.lbl_daftar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukanEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_masukan_email)
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
  var txtMasukankembali: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukan_kembali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSudahmemiliki: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sudah_memiliki)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasuk: String? = MyApp.getInstance().resources.getString(R.string.lbl_masuk)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventeenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEighteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNineteenValue: String? = null
)
