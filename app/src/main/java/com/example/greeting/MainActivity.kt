package com.example.greeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //activity_main_2.xml의 레이아웃 가져오기
        setContentView(R.layout.activity_main_2)

        //btn_StartActivity 버튼 가져오기
        val sendButton = findViewById<Button>(R.id.btn_StartActivity)

        //버튼 클릭시 이벤트 처리
        sendButton.setOnClickListener {
            //editText_Input 텍스트 박스 가져오기
            val sendText = findViewById<EditText>(R.id.editText_Input)

            //전송할 메시지 정의
            val sendMessage = sendText.text.toString()

            //전송할 메시지를 SubActivity로 전달
            val sendIntent = Intent(this, SubActivity::class.java)
            sendIntent.putExtra("message", sendMessage)

            //SubActivity 실행
            startActivity(sendIntent)
        }
    }
}