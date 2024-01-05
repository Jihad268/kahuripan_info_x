package com.kahuripaninfox.app.modules.sixteen.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class SixteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifikasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_notifikasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKomentar: String? = MyApp.getInstance().resources.getString(R.string.lbl_komentar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPenggunaBaru: String? = MyApp.getInstance().resources.getString(R.string.lbl_pengguna_baru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMembalasChatA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_membalas_chat_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJamCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_jam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_lihat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInformasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_informasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdaInfomasiBa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ada_infomasi_ba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMenitCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_menit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lihat)

)
