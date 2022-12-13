package com.example.recycleviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import com.example.recycleviewtest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var binding : ActivityMainBinding? = null
    private val emailAdapter = EmailAdapter(this)
    private val datas = mutableListOf<EmailData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        datas.apply {
            add(EmailData(img = R.drawable.ic_account_circle, title = "안녕", content = "테스트 메일이야"))
            add(EmailData(img = R.drawable.ic_account_circle, title = "안녕2", content = "테스트 메일이야"))
            add(EmailData(img = R.drawable.ic_account_circle, title = "안녕3", content = "테스트 메일이야"))
            add(EmailData(img = R.drawable.ic_account_circle, title = "안녕4", content = "테스트 메일이야"))
            emailAdapter.datas = datas
            emailAdapter.notifyDataSetChanged()
        }
    }



    }


