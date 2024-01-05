package com.kahuripaninfox.app.modules.seventeen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.seventeen.`data`.model.SeventeenModel
import org.koin.core.KoinComponent

class SeventeenVM : ViewModel(), KoinComponent {
  val seventeenModel: MutableLiveData<SeventeenModel> = MutableLiveData(SeventeenModel())

  var navArguments: Bundle? = null
}
