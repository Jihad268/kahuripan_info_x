package com.kahuripaninfox.app.modules.thirteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.thirteen.`data`.model.ThirteenModel
import org.koin.core.KoinComponent

class ThirteenVM : ViewModel(), KoinComponent {
  val thirteenModel: MutableLiveData<ThirteenModel> = MutableLiveData(ThirteenModel())

  var navArguments: Bundle? = null
}
