package com.jmagradey.ahelpfulnudge

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AppAdapter : RecyclerView.Adapter<AppAdapter.AppViewHolder>() {

    // Temporary hardcoded list of apps (you can replace this with real apps later)
    private val appList = listOf("Instagram", "YouTube", "TikTok", "Reddit", "Twitter")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_1, parent, false)
        return AppViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.bind(appList[position])
    }

    override fun getItemCount(): Int = appList.size

    class AppViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val appNameTextView: TextView = itemView.findViewById(android.R.id.text1)

        fun bind(appName: String) {
            appNameTextView.text = appName
        }
    }
}
