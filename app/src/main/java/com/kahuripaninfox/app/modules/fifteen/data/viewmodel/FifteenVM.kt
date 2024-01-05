package com.kahuripaninfox.app.modules.fifteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.fifteen.`data`.model.FifteenModel
import org.koin.core.KoinComponent

class FifteenVM : ViewModel(), KoinComponent {
  val fifteenModel: MutableLiveData<FifteenModel> = MutableLiveData(FifteenModel())

  var navArguments: Bundle? = null
}
