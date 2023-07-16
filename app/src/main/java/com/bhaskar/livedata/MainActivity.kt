package com.bhaskar.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel : MainViewModel

    private val updateBtn : Button
    get() = findViewById(R.id.update_button_id)

    private val factsView : TextView
    get() = findViewById(R.id.textView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this, MainViewModelFactory()).get(MainViewModel::class.java)

        //Observer class method is automatically invoked when LiveData is updated
        mainViewModel.factsLiveData.observe(this, Observer{
            factsView.text = it
        })

        updateBtn.setOnClickListener(View.OnClickListener {
            mainViewModel.updateLiveData("Ram Krishna")
        })

    }
}