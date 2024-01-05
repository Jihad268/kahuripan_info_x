package com.kahuripaninfox.app.modules.seven.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class SevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatdatang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPadaPrortypeK: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pada_prortype_k)

)
