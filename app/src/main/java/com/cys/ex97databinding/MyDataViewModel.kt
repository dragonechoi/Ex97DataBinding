package com.cys.ex97databinding

import androidx.databinding.ObservableField
import androidx.databinding.OnRebindCallback

//MVVM 패턴의 View 에서 사용할 데이터 (model) 을 연결해주는 viewModle 역할의 클래스정의
class MyDataViewModel {

    //이미지뷰 에서 보여줄 이미지 source URL(문자열 경로)
    val img:ObservableField<String> = ObservableField("https://cdn.pixabay.com/photo/2020/03/04/17/31/tongue-4902262_1280.jpg")

    // Recycler View 가 사용할 대라양의 데이터
    val items:ObservableField<MutableList<String>> = ObservableField(mutableListOf()) //빈 MutableList 생성 초기화

}