package com.kahuripaninfox.app.modules.five.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.five.`data`.model.FiveModel
import org.koin.core.KoinComponent

class FiveVM : ViewModel(), KoinComponent {
  val fiveModel: MutableLiveData<FiveModel> = MutableLiveData(FiveModel())

  var navArguments: Bundle? = null
}
