package com.kahuripaninfox.app.modules.five.`data`.model

import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.di.MyApp
import kotlin.String

data class FiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSejarah: String? = MyApp.getInstance().resources.getString(R.string.lbl_sejarah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJelajahiSejara: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jelajahi_sejara)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRajaAirlanggaOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_raja_airlangga)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_airlangga_bali)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKerajaanKahuri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kerajaan_kahuri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKerajaanKahuriOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kerajaan_kahuri2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDesaWotanmas: String? = MyApp.getInstance().resources.getString(R.string.lbl_desa_wotanmas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_desa_wotanmas_j)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKotaDahanapura: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kota_dahanapura)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_airlangga_meru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSejarahOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sejarah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPenamaankahuri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_penamaan_kahuri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCandi: String? = MyApp.getInstance().resources.getString(R.string.lbl_candi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArkeologi: String? = MyApp.getInstance().resources.getString(R.string.lbl_arkeologi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSitus: String? = MyApp.getInstance().resources.getString(R.string.lbl_situs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKaryasastra: String? = MyApp.getInstance().resources.getString(R.string.lbl_karya_sastra)

)
