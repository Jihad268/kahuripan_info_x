package com.kahuripaninfox.app.modules.sixteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.sixteen.`data`.model.SixteenModel
import org.koin.core.KoinComponent

class SixteenVM : ViewModel(), KoinComponent {
  val sixteenModel: MutableLiveData<SixteenModel> = MutableLiveData(SixteenModel())

  var navArguments: Bundle? = null
}
