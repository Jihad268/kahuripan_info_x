package com.kahuripaninfox.app.modules.nineteen.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class NineteenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInformasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_informasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKURIPANPrototy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kuripan_prototy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPadaPrortypeK: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pada_prortype_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInformasiOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_informasi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
