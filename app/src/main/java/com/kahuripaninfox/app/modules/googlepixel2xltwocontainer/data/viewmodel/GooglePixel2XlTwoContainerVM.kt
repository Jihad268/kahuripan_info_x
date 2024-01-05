package com.kahuripaninfox.app.modules.googlepixel2xltwocontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kahuripaninfox.app.modules.googlepixel2xltwocontainer.`data`.model.GooglePixel2XlTwoContainerModel
import org.koin.core.KoinComponent

class GooglePixel2XlTwoContainerVM : ViewModel(), KoinComponent {
  val googlePixel2XlTwoContainerModel: MutableLiveData<GooglePixel2XlTwoContainerModel> =
      MutableLiveData(GooglePixel2XlTwoContainerModel())

  var navArguments: Bundle? = null
}
