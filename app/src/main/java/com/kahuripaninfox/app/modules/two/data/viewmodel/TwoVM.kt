package com.kahuripaninfox.app.modules.two.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.two.`data`.model.TwoModel
import org.koin.core.KoinComponent

class TwoVM : ViewModel(), KoinComponent {
  val twoModel: MutableLiveData<TwoModel> = MutableLiveData(TwoModel())

  var navArguments: Bundle? = null
}
