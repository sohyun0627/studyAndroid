package org.techtown.function1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showButton.setOnClickListener {
            show("안녕")
            addFun(2, 5)
        }
    }

    fun show(message: String){
        println("show -> ${message}")
    }

    fun addFun(a:Int, b:Int) {

        println("더하기의 결과는 -> ${a+b}")
    }




}