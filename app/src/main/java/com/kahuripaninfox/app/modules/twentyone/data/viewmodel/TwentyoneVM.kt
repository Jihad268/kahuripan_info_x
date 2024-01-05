package com.kahuripaninfox.app.modules.twentyone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.twentyone.`data`.model.TwentyoneModel
import org.koin.core.KoinComponent

class TwentyoneVM : ViewModel(), KoinComponent {
  val twentyoneModel: MutableLiveData<TwentyoneModel> = MutableLiveData(TwentyoneModel())

  var navArguments: Bundle? = null
}
