package com.example.greeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        //Intent 전달받기
        val receivedIntent = getIntent()

        //message 받기
        val receivedMessage = receivedIntent.extras?.getString("message")

        //editText_Input2 텍스트 박스의 제어권 가져오기
        val receivedDisplaytxt = findViewById<EditText>(R.id.editText_Input2)

        //텍스트 세팅
        receivedDisplaytxt.setText(receivedMessage)

        //액티비티 종료 버튼 가져오기
        val quitButton = findViewById<Button>(R.id.btn_Finish)

        //버튼 클릭시 이벤트 처리
        quitButton.setOnClickListener {
            //액티비티 종료
            finish()
        }
    }
}