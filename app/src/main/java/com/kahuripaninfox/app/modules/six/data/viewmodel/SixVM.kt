package com.kahuripaninfox.app.modules.six.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.six.`data`.model.SixModel
import org.koin.core.KoinComponent

class SixVM : ViewModel(), KoinComponent {
  val sixModel: MutableLiveData<SixModel> = MutableLiveData(SixModel())

  var navArguments: Bundle? = null
}
