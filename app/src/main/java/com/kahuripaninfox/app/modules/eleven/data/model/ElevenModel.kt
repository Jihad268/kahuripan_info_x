package com.kahuripaninfox.app.modules.eleven.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class ElevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCandiGunungGa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_candi_gunung_ga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistance: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_0km2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCandiWatutulis: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_candi_watutulis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDistanceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_500_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReviewsCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_4_8_reviews)

)
