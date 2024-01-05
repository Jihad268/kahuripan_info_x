package com.kahuripaninfox.app.modules.ten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.ten.`data`.model.TenModel
import org.koin.core.KoinComponent

class TenVM : ViewModel(), KoinComponent {
  val tenModel: MutableLiveData<TenModel> = MutableLiveData(TenModel())

  var navArguments: Bundle? = null
}
