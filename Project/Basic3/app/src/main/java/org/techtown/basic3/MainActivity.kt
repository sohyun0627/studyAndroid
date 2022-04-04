package org.techtown.basic3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var name: String? = null
    lateinit var mobile: String

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mobile = ""

        button.setOnClickListener{
            /* 변수에 들어있는 값이 null이 아닌 경우에만 */
//            val nameLenth = name?.length

            /* 변수에 들어있는 값이 null인 경우에도 */
//            val nameLenth2 = name?.length ?: 0

            /* if ~ else문 */
//            val name2 = name

            name = nameInput.text.toString()
            mobile = mobileInput.text.toString()

            if (name != null) {
                Toast.makeText(applicationContext, "name의 글자 길이가 ${name?.length}, mobile의 값은 ${mobile}",  Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "name의 값이 null임. mobile의 값은 ${mobile}", Toast.LENGTH_LONG).show()
            }

        }
    }
}