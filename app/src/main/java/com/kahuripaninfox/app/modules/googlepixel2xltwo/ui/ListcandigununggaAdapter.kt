package com.kahuripaninfox.app.modules.googlepixel2xltwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kahuripaninfox.app.R
import com.kahuripaninfox.app.databinding.RowListcandigununggaBinding
import com.kahuripaninfox.app.modules.googlepixel2xltwo.`data`.model.ListcandigununggaRowModel
import kotlin.Int
import kotlin.collections.List

class ListcandigununggaAdapter(
  var list: List<ListcandigununggaRowModel>
) : RecyclerView.Adapter<ListcandigununggaAdapter.RowListcandigununggaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcandigununggaVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcandigunungga,parent,false)
    return RowListcandigununggaVH(view)
  }

  override fun onBindViewHolder(holder: RowListcandigununggaVH, position: Int) {
    val listcandigununggaRowModel = ListcandigununggaRowModel()
    // TODO uncomment following line after integration with data source
    // val listcandigununggaRowModel = list[position]
    holder.binding.listcandigununggaRowModel = listcandigununggaRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcandigununggaRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListcandigununggaRowModel
    ) {
    }
  }

  inner class RowListcandigununggaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcandigununggaBinding = RowListcandigununggaBinding.bind(itemView)
    init {
      binding.image500px036View.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListcandigununggaRowModel())
      }
    }
  }
}
