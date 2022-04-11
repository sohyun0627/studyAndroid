package org.techtown.function1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        addButton.setOnClickListener {
            val firstStr = firstInput.text.toString()
            val secondStr = secondInput.text.toString()
            val first = firstStr.toInt()
            val second = secondStr.toInt()

            val result = add1(first, second)

            textView.setText("Add1의 결과 : ${result}")
        }

        addButton2.setOnClickListener {
            val result = add2(getFirst(), getSecond())
            textView.setText("Add2의 결과는 ${result}")
        }

        addButton3.setOnClickListener {
            val first = getFirst()
            val second = getSecond()

            val result = add1(a=first, b=second)
            textView.setText("Add3의 결과는 ${result}")
        }

        addButton4.setOnClickListener {
            val first = getFirst()
            val result = add4(a=first)

            textView.setText("Add4의 결과는 ${result}")
        }

        addButton5.setOnClickListener {
            val result = add5(10, 20, 30)
            showToast("Add5의 결과는 ${result}")
        }
    }

    fun add1(a: Int, b: Int): Int {
        return a + b
    }

    fun add2(a: Int, b: Int): Int = a + b


    fun add3(a: Int, b: Int) = a + b

    fun add4(a:Int, b:Int=0):Int {
        return a + b
    }

    fun add5(vararg  inputs:Int):Int {
        var output = 0

        for (num in inputs) {
            output += num
        }
        return output
    }

    fun getFirst(): Int {
        val firstStr = firstInput.text.toString().trim()
        val first = firstStr.toInt()

        return first
    }

    fun getSecond(): Int {
        val secondStr = secondInput.text.toString().trim()
        val second = secondStr.toInt()

        return second
    }

    fun showToast(message:String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }


}