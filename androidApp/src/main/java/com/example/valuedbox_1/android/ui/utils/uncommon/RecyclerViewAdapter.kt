package com.example.valuedbox_1.android.ui.utils.uncommon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.valuedbox_1.android.R
import com.example.valuedbox_1.android.ui.utils.uncommon.RecyclerViewAdapter.ViewHolder
import de.hdodenhof.circleimageview.CircleImageView

/**
 *  class which is only used by the home fragment  simply by passing the following parameters
 * list: MutableList<Int> -> the data list which is to be shown on the recycle view
 * layout_id: Int -> the grid container(layout) id which is to be inflated
 */


//TODO : to change the list: MutableList<Int> type according to the data

class RecyclerViewAdapter(private var list: MutableList<Int>, private var layout_id:Int): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(layout_id, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image?.setImageResource(list[position])
        val name="seller name"
        holder.textView?.text=name
    }
    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(
        itemView!!){
        var image:CircleImageView?=itemView?.findViewById(R.id.seller_story)
        var textView: TextView?=itemView?.findViewById(R.id.seller_name)
    }
}