package com.kahuripaninfox.app.modules.fourteen.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class FourteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArahkanKePeta: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_arahkan_ke_peta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.msg_jarak_dari_temp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApakahandaper: String? =
      MyApp.getInstance().resources.getString(R.string.msg_apakah_anda_per)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeedback: String? = MyApp.getInstance().resources.getString(R.string.lbl_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApakahsudahya: String? =
      MyApp.getInstance().resources.getString(R.string.msg_apakah_sudah_ya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_ya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_tidak)

)
