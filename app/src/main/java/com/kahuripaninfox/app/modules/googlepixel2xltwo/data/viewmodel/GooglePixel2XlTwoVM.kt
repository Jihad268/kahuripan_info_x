package com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model.GooglePixel2XlTwoModel
import com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model.ListcandigununggaRowModel
import com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model.SpinnerLocationModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class GooglePixel2XlTwoVM : ViewModel(), KoinComponent {
  val googlePixel2XlTwoModel: MutableLiveData<GooglePixel2XlTwoModel> =
      MutableLiveData(GooglePixel2XlTwoModel())

  var navArguments: Bundle? = null

  val spinnerLocationList: MutableLiveData<MutableList<SpinnerLocationModel>> = MutableLiveData()

  val listcandigununggaList: MutableLiveData<MutableList<ListcandigununggaRowModel>> =
      MutableLiveData(mutableListOf())
}
