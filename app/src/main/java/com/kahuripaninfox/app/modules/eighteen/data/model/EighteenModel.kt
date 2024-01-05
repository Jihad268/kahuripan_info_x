package com.kahuripaninfox.app.modules.eighteen.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class EighteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBALASAN: String? = MyApp.getInstance().resources.getString(R.string.lbl_balasan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKaDhareFinley: String? = MyApp.getInstance().resources.getString(R.string.msg_kh_xperience)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheStrugglewa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_aplikasi_yang_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt1K: String? = MyApp.getInstance().resources.getString(R.string.lbl_1k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPendatangBaru: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pendatang_baru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetujuBanget: String? = MyApp.getInstance().resources.getString(R.string.lbl_setuju_banget)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSevenHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_700)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBalaslahSesuat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_balaslah_sesuat)

)
