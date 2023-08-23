package com.example.travel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class recycle_view : AppCompatActivity() {


    private lateinit var adapter: RecyclerViewAdapter
    private lateinit var recycleView: recycle_view

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view = findViewById(R.id.recycle_view)
                recyclerView.layoutManager = GridLayoutManager(
                this,1,GridLayoutManager.VERTICAL,false)

        val adapter = RecyclerViewAdapter(SeriesList.getModel())
        recycleView.adapter = adapter
    }
}