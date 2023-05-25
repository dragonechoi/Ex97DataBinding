package com.cys.ex97databinding

import android.database.Observable
import android.view.View
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import android.widget.Toast
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class User{

    //값 변경이 관찰 되는 멤버변수 생성Observablexxx : primitive type && List or Map --> ObservableField
    var name: ObservableField<String> = ObservableField("")
    var age:ObservableInt= ObservableInt(0)
    var fav:ObservableBoolean= ObservableBoolean()

    constructor(name:String,age:Int, fav:Boolean=true){
        this.name.set(name)
        this.age.set(age)
        this.fav.set(fav)
    }

    //change name button 클릭 callBack Method-클릭 콜백 메소드가 되려면 반드시 파라미터가 존재해야함
    fun changeName(view: View){
        name.set("ROBIN")
    }

    //age 변수 값을 1 증가시키는 기능 콜백 메소드
    fun increaseAge(view: View){
        age.set(age.get()+1)
    }
    //좋아요 표시 true/false 변경 하는 기능 메소드 - 콜백용 메소드가 아닌 그냥 일반 메소드
    // 이 메소드를 xml 버튼의 onClick 속성으로 지정한 익명 콜백함수에서 대신 호출해줄것임
    fun toggleFav(){ //파라미터가 없음!!!!!!!!!
        fav.set(!fav.get())
    }

    //체크 상태가 변경되는 것에 반응하는 콜백 메소드 - 파라미터가 중요!!
    fun changeFav(v:CompoundButton , isChecked:Boolean){
        Toast.makeText(v.context, "${isChecked}", Toast.LENGTH_SHORT).show()
        //체크 상태 값을 관리하는 fav 변수값도 변경해줘야함
        fav.set(isChecked)
    }

}
