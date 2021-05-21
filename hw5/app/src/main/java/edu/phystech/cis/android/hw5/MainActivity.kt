package edu.phystech.cis.android.hw5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recycler: RecyclerView = findViewById(R.id.items)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = ClickableAdapter()
        recycler.setHasFixedSize(true)
    }

}
