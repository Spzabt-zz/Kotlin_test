package com.edu.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var button: Button
    lateinit var textView: TextView
    private val simpleViewModel by viewModels<SimpleViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        textView = findViewById(R.id.text_view)

        simpleViewModel.str.observe(this) {
            textView.text = it.toString()
        }

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        simpleViewModel.changeMessage()
    }
}