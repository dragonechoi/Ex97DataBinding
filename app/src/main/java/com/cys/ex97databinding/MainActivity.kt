package com.cys.ex97databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.cys.ex97databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //데이터 바인딩에서는 뷰바인딩과 다르게 레이아웃 xml 파일의
    // root 요소가 <layout> 이어야만 binding 클래스가 만들어짐

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

    }
}