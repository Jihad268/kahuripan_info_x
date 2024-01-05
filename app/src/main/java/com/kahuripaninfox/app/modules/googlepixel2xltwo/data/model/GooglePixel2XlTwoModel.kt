package com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class GooglePixel2XlTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTempatWisataK: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tempat_wisata_k)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopCategories: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_top_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtikel: String? = MyApp.getInstance().resources.getString(R.string.lbl_artikel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLokasiWisata: String? = MyApp.getInstance().resources.getString(R.string.lbl_lokasi_wisata)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKomentar: String? = MyApp.getInstance().resources.getString(R.string.lbl_komentar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFeedback: String? = MyApp.getInstance().resources.getString(R.string.lbl_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRekomendasiWis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rekomendasi_wis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeallOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)
