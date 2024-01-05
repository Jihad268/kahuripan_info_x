package com.kahuripaninfox.app.modules.googlepixel2xltwo.ui

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.appcomponents.base.BaseFragment
import com.kahuripaninfox.app.databinding.FragmentGooglePixel2XlTwoBinding
import com.kahuripaninfox.app.modules.eleven.ui.ElevenActivity
import com.kahuripaninfox.app.modules.five.ui.FiveActivity
import com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model.ImageSliderSliderbaganscenemyaModel
import com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model.ListcandigununggaRowModel
import com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model.SpinnerLocationModel
import com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.viewmodel.GooglePixel2XlTwoVM
import com.kahuripaninfox.app.modules.sixteen.ui.SixteenActivity
import com.kahuripaninfox.app.modules.twelve.ui.TwelveActivity
import com.kahuripaninfox.app.modules.twentytwo.ui.TwentytwoActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class GooglePixel2XlTwoFragment :
    BaseFragment<FragmentGooglePixel2XlTwoBinding>(R.layout.fragment_google_pixel_2_xl_two) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.kahuripaninfox.app/drawable/img_baganscenemya")


  private val imageSliderSliderbaganscenemyaItems: ArrayList<ImageSliderSliderbaganscenemyaModel> =
      arrayListOf(ImageSliderSliderbaganscenemyaModel(imageBaganscenemya =
  imageUri.toString()),ImageSliderSliderbaganscenemyaModel(imageBaganscenemya =
  imageUri.toString()))


  private val viewModel: GooglePixel2XlTwoVM by viewModels<GooglePixel2XlTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    viewModel.spinnerLocationList.value = mutableListOf(
    SpinnerLocationModel("Item1"),
    SpinnerLocationModel("Item2"),
    SpinnerLocationModel("Item3"),
    SpinnerLocationModel("Item4"),
    SpinnerLocationModel("Item5")
    )
    val spinnerLocationAdapter =
    SpinnerLocationAdapter(requireActivity(),R.layout.spinner_item,viewModel.spinnerLocationList.value?:
    mutableListOf())
    binding.spinnerLocation.adapter = spinnerLocationAdapter
    val sliderbaganscenemyaAdapter =
    SliderbaganscenemyaAdapter(imageSliderSliderbaganscenemyaItems,true)
    binding.imageSliderSliderbaganscenemya.adapter = sliderbaganscenemyaAdapter
    binding.imageSliderSliderbaganscenemya.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorGroupThirtyNine.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroupThirtyNine.updateIndicatorCounts(binding.imageSliderSliderbaganscenemya.indicatorCount)
    val listcandigununggaAdapter =
    ListcandigununggaAdapter(viewModel.listcandigununggaList.value?:mutableListOf())
    binding.recyclerListcandigunungga.adapter = listcandigununggaAdapter
    listcandigununggaAdapter.setOnItemClickListener(
    object : ListcandigununggaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcandigununggaRowModel) {
        onClickRecyclerListcandigunungga(view, position, item)
      }
    }
    )
    viewModel.listcandigununggaList.observe(requireActivity()) {
      listcandigununggaAdapter.updateData(it)
    }
    binding.googlePixel2XlTwoVM = viewModel
    setUpSearchViewInputTextListener()
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderbaganscenemya.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderbaganscenemya.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageOnlinearticle.setOnClickListener {
      val destIntent = FiveActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageV804sasilifes.setOnClickListener {
      val destIntent = TwentytwoActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.btnMdibellnotifi.setOnClickListener {
      val destIntent = SixteenActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageGapuraBaliGa.setOnClickListener {
      val destIntent = ElevenActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageS4k6pdjv22081.setOnClickListener {
      val destIntent = ElevenActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListcandigunungga(
    view: View,
    position: Int,
    item: ListcandigununggaRowModel
  ): Unit {
    when(view.id) {
      R.id.image500px036View ->  {
        val destIntent = TwelveActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  private fun setUpSearchViewInputTextListener(): Unit {
    binding.searchViewInputText.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "GOOGLE_PIXEL2XL_TWO_FRAGMENT"


      fun getInstance(bundle: Bundle?): GooglePixel2XlTwoFragment {
        val fragment = GooglePixel2XlTwoFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
