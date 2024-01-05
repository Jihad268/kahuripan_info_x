package com.kahuripaninfox.app.modules.twelve.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.twelve.`data`.model.TwelveModel
import org.koin.core.KoinComponent

class TwelveVM : ViewModel(), KoinComponent {
  val twelveModel: MutableLiveData<TwelveModel> = MutableLiveData(TwelveModel())

  var navArguments: Bundle? = null
}
