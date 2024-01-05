package com.kahuripaninfox.app.modules.googlepixel2xltwocontainer.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class GooglePixel2XlTwoContainerModel(
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
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
