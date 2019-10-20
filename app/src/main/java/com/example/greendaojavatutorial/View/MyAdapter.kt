package com.example.greendaojavatutorial.View

import androidx.recyclerview.widget.RecyclerView
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.greendaojavatutorial.R
import com.example.greendaojavatutorial.database.User


/**
 * Created by Franz Andel on 2019-08-18.
 * Android Engineer
 */

class MyAdapter(private var list: List<User>, private var context: Context) :
    RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item, viewGroup, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder, i: Int) {
        val user = list[i]

        viewHolder.name.text = user.name

        Log.e("name", user.name)
    }


    override fun getItemCount(): Int {

        return list.size
    }
}