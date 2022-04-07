package org.techtown.finaltest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var first: Int? = null
    var second: Int? = null
    var third: Int? = null
    var fourth: Int? = null
    var fifth: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {
            var firstStr = editText1.text.toString()

            var secondStr = editText2.text.toString()
            var thirdStr = editText3.text.toString()
            var fourthStr = editText4.text.toString()
            var fifthStr = editText5.text.toString()

            first = firstStr.toInt()
            second = secondStr.toInt()
            third = thirdStr.toInt()
            fourth = fourthStr.toInt()
            fifth = fifthStr.toInt()

            if (first == null || second == null || third == null || fourth == null || fifth == null) {
                textView.setText("Error발생! 모든 숫자가 입력되지 않았음")
                return@setOnClickListener
            }

            val result = first!! + second!! + third!! + fourth!! + fifth!!

            textView.setText("결과 : ${result}")
        }
    }
}