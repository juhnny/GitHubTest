package com.juhnny.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "GitHub 연동 테스트"
        
        var s = "이 문장은 깃헙 사이트에서 추가한 문장. Android Studio로 어떻게 가져가지?"

    }
}
