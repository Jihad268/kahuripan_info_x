package com.kahuripaninfox.app.modules.twentytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.twentytwo.`data`.model.TwentytwoModel
import org.koin.core.KoinComponent

class TwentytwoVM : ViewModel(), KoinComponent {
  val twentytwoModel: MutableLiveData<TwentytwoModel> = MutableLiveData(TwentytwoModel())

  var navArguments: Bundle? = null
}
