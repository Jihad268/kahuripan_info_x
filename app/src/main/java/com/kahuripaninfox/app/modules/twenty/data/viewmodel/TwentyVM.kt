package com.kahuripaninfox.app.modules.twenty.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.twenty.`data`.model.TwentyModel
import org.koin.core.KoinComponent

class TwentyVM : ViewModel(), KoinComponent {
  val twentyModel: MutableLiveData<TwentyModel> = MutableLiveData(TwentyModel())

  var navArguments: Bundle? = null
}
