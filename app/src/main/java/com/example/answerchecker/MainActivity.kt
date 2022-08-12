package com.example.answerchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var textView : TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.textView3)
        textView.text = " "
    }

    var resultNo = arrayOf(0, 0, 0)
    var size = 0

    fun btnPressed(view: View) {
        if (size <= 0){
            textView.text = "Select A Box"
        }else if (size == 1 && resultNo[0] == 1){
            textView.text = "Correct Answer"
        }else if (size > 1) {
            textView.text = "Select a Single Box"
        }else if(size == 1 && resultNo[0] != 1){
            textView.text = "Wrong Answer"
        }
    }

    fun checkBoxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkBox1 -> {
                    if (checked) {
                        resultNo[0] = 1
                        size += 1
                    }else{
                        resultNo[0] = 0
                        size -= 1
                    }
                }
                R.id.checkBox2 -> {
                    if (checked) {
                        resultNo[1] = 1
                        size += 1
                    }else{
                        resultNo[1] = 0
                        size -= 1
                    }
                }
                R.id.checkBox3 -> {
                    if (checked) {
                        resultNo[2] = 1
                        size += 1
                    }else{
                        resultNo[2] = 0
                        size -= 1
                    }
                }
            }
        }
    }

}