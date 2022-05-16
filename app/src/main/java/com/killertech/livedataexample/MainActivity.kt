package com.killertech.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var factsClass: Facts
    private lateinit var viewModel: MainViewModel

    private val updateButton: Button
    get() = findViewById(R.id.btn_update)

    private val factText: TextView
    get() = findViewById(R.id.tv_fact)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        factsClass = Facts()
        viewModel = ViewModelProvider(this, MainViewModelFactory(factsClass)).get(MainViewModel::class.java)
        viewModel.factsLiveData.observe(this, Observer {
            factText.text = it
        })

        updateButton.setOnClickListener(View.OnClickListener {
            viewModel.updateFactData()
        })
    }
}