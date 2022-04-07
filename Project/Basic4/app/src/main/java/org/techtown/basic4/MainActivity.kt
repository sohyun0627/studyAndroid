package org.techtown.basic4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var first: Int = 0
    var second: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            val firstStr = firstInput.text.toString()
            val secondStr = secondInput.text.toString()

            first = firstStr.toInt()
            second = secondStr.toInt()

            val result = first + second
            outputTextView.setText("더하기 결과는 바로 ${result}")

            if (result == 20) {
                outputTextView.append("예상한 값 20입니다.")
            }

            if (firstStr == "10") {
                outputTextView.append("예상한 첫 번째 Input인 10입니다.")
            }

            val input1: Any = "안녕"
            val input2: Any = 10

            if (input1 is String) {
                val output: String = input1 as String
                outputTextView.append("input1은 문자열")
            }

            if (input2 is Int) {
                val output: Int = input2 as Int
                outputTextView.append("input2는 숫자")

            }

            val output2: Int? = input1 as? Int
            outputTextView.append("input2이 숫자라면 표시, 아니라면 null -> ${output2}")
        }


    }
}