package com.jmagradey.ahelpfulnudge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class AppJailActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var appAdapter: AppAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_jail)

        recyclerView = findViewById(R.id.recyclerView)
        appAdapter = AppAdapter()
        recyclerView.adapter = appAdapter
    }

    // Method to handle drag and drop of apps into App Jail
}
