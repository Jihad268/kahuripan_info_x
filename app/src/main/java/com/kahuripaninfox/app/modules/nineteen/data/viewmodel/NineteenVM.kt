package com.kahuripaninfox.app.modules.nineteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.nineteen.`data`.model.NineteenModel
import org.koin.core.KoinComponent

class NineteenVM : ViewModel(), KoinComponent {
  val nineteenModel: MutableLiveData<NineteenModel> = MutableLiveData(NineteenModel())

  var navArguments: Bundle? = null
}
