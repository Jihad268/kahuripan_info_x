package com.kahuripaninfox.app.modules.eleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.eleven.`data`.model.ElevenModel
import org.koin.core.KoinComponent

class ElevenVM : ViewModel(), KoinComponent {
  val elevenModel: MutableLiveData<ElevenModel> = MutableLiveData(ElevenModel())

  var navArguments: Bundle? = null
}
