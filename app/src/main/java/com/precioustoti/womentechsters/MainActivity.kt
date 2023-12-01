package com.precioustoti.womentechsters

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Access the button on our UI

        var signinButton:AppCompatButton = this.findViewById(R.id.signinButton)
        //Set a listener to it

        signinButton.setOnClickListener {
            //navigates user to sign in activity
            val intent = Intent(this, SigninActivity::class.java)

            this.startActivity(intent)
        }

    }
}

