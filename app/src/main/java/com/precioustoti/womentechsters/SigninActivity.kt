package com.precioustoti.womentechsters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        var regActButton: Button = findViewById(R.id.registerButton)

        regActButton.setOnClickListener {
            var i = Intent(this.RegisterActivity::class.java)

            startActivity(i)
        }
    }
}