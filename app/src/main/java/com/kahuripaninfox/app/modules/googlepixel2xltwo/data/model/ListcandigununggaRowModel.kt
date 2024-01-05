package com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class ListcandigununggaRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCandiGunungGa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_candi_gunung_ga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_0_km)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8_reviews)

)
