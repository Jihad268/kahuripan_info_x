package com.kahuripaninfox.app.modules.fourteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.fourteen.`data`.model.FourteenModel
import org.koin.core.KoinComponent

class FourteenVM : ViewModel(), KoinComponent {
  val fourteenModel: MutableLiveData<FourteenModel> = MutableLiveData(FourteenModel())

  var navArguments: Bundle? = null
}
