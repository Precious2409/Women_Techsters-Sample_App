package com.precioustoti.womentechsters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.ButtonBarLayout

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        var regActButton: AppCompatButton = findViewById(R.id.loginButton2)

        regActButton.setOnClickListener {
            val i = Intent (this,RegisterActivity::class.java)

            startActivity(i)
        }
    }
}