package com.application.earnmoneyhome

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GuidesPage : AppCompatActivity() {

    private var title: TextView? = null
    private var content: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guides_page)

        title = findViewById(R.id.title)
        content = findViewById(R.id.content)


        title?.text = intent.getStringExtra("title")
        content?.text = intent.getStringExtra("content")
    }
}