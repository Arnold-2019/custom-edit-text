package com.example.customedittext.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customedittext.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        custom_text_input_edit_text.setPreFillText()
    }
}