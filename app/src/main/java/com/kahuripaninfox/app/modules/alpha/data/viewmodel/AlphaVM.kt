package com.kahuripaninfox.app.modules.alpha.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.alpha.`data`.model.AlphaModel
import org.koin.core.KoinComponent

class AlphaVM : ViewModel(), KoinComponent {
  val alphaModel: MutableLiveData<AlphaModel> = MutableLiveData(AlphaModel())

  var navArguments: Bundle? = null
}
