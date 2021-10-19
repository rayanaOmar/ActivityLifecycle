package com.example.activitylifecycle

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onPause() {
        super.onPause()
        var date= LocalDateTime.now()
        val dt=date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT))
        textView.text="${textView.text} Last seen on $dt \n"


    }

    override fun onResume() {
        super.onResume()
        textView.text="${textView.text} Online \n"

    }

}