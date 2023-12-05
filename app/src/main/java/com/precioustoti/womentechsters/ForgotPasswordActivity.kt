package com.precioustoti.womentechsters

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val sendBtn: Button = findViewById(R.id.send)
        val emailEdt: EditText = findViewById(R.id.email)

        sendBtn.setOnClickListener {
            val userEmailAddressEntered :String = emailEdt.text.toString()
            var message = ""
            if(!userEmailAddressEntered.matches(Regex("^[a-zA-Z0-9.a-zA-Z0-9.!#\$%&'*+-/=?^_'{|}~]+@[a-zA-z0-9]+\\.[a-zA-Z]+"))){
                message = "Enter a valid email address"
            }else{
                message = "Your recovery code has been sent to $userEmailAddressEntered"}
            Snackbar.make(findViewById(R.id.layout),"Type in the code sent to $userEmailAddressEntered",Snackbar.LENGTH_LONG).show()
        }
    }
}