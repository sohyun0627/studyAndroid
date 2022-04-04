package org.techtown.basic2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var name:String = ""
    var mobile:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            name = nameInput.text.toString()
            mobile = mobileInput.text.toString()

            Toast.makeText(applicationContext, "name : ${name}, mobile : ${mobile}", Toast.LENGTH_LONG).show()
        }
    }
}