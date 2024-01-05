package com.kahuripaninfox.app.modules.ten.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class TenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPengaturan: String? = MyApp.getInstance().resources.getString(R.string.lbl_pengaturan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
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
  var txtLogoutOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtText: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSupportingtext: String? =
      MyApp.getInstance().resources.getString(R.string.msg_apakah_yakin_un)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInformasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_informasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
