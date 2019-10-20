package com.example.greendaojavatutorial.View

import android.widget.TextView
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.greendaojavatutorial.R


/**
 * Created by Franz Andel on 2019-08-18.
 * Android Engineer
 */

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var name: TextView
        internal set

    init {
        name = itemView.findViewById(R.id.item_name)
    }
}