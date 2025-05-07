package com.jmagradey.ahelpfulnudge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class HappyAppsActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var appAdapter: AppAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_happy_apps)

        recyclerView = findViewById(R.id.recyclerView)
        appAdapter = AppAdapter()
        recyclerView.adapter = appAdapter
    }
}