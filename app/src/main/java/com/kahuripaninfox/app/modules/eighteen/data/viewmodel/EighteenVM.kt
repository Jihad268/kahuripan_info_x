package com.kahuripaninfox.app.modules.eighteen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.eighteen.`data`.model.EighteenModel
import org.koin.core.KoinComponent

class EighteenVM : ViewModel(), KoinComponent {
  val eighteenModel: MutableLiveData<EighteenModel> = MutableLiveData(EighteenModel())

  var navArguments: Bundle? = null
}
