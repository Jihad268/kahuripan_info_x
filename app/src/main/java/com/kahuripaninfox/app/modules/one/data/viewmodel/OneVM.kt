package com.kahuripaninfox.app.modules.one.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.one.`data`.model.OneModel
import org.koin.core.KoinComponent

class OneVM : ViewModel(), KoinComponent {
  val oneModel: MutableLiveData<OneModel> = MutableLiveData(OneModel())

  var navArguments: Bundle? = null
}
