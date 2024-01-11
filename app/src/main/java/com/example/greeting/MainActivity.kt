package com.example.greeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greeting.data.createRealJejuLocationData
import com.example.greeting.ui.adapters.LocationAdapter


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycle_exam)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView2)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val locationAdapter = LocationAdapter(sampleLocations)
        recyclerView.adapter = locationAdapter
    }
}

val sampleLocations = createRealJejuLocationData()