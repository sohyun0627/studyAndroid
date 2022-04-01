package org.techtown.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.study01.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.study01)


      /* Code for 'activity_main.xml' */
//        button1.setOnClickListener {
//            Toast.makeText(applicationContext, "Toast!", Toast.LENGTH_LONG).show()
//        }
//
//        button2.setOnClickListener{
//            val input1 = editText1.text.toString()
////            textView1.setText("입력한 값: ${input1}")
//            textView1.text = "입력한 값은 바로 '${input1}'"
//        }
      /* Code for 'study01.xml' */
        button3.setOnClickListener {
            val input2 = editText2.text.toString()
            textView2.text = "입력한 값 : ${input2}"

        }
        button4.setOnClickListener {
            val input3 = editText3.text.toString()
            textView2.text = "입력한 값 : ${input3}"

        }
    }
}