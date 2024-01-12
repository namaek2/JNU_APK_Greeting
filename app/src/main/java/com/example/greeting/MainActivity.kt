package com.example.greeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        val sendButton = findViewById<Button>(R.id.buttonGreat)

        //버튼 클릭시 이벤트 처리
        sendButton.setOnClickListener {
            val sendIntent = Intent(this, MapsActivity::class.java)
            startActivity(sendIntent)
        }
    }
}

val sampleLocations = createRealJejuLocationData()