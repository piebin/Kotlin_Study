package com.example.kotlin_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlin_study.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.button.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                //to do
            }
        })

        //람다식 이용 조건
        //1. 자바 인터페이스여야됨
        //2. 그 인터페이스에 딱 하나의 메소드만 존재

        binding.button.setOnClickListener {
            //to do
        }





    }
}