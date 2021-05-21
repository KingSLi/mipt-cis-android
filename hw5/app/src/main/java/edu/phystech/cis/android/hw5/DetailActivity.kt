package edu.phystech.cis.android.hw5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val key:String = intent.getStringExtra("myvalue").toString()


        val textView = findViewById<TextView>(R.id.detail_text)

        textView.text = ("$key ").repeat(40)
    }
}
