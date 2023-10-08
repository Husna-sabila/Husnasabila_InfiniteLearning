package com.example.husnasabila1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login: Button = findViewById(R.id.login)
        login.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.login -> {
                val intent = Intent(this@LoginActivity, BerandaActivity::class.java)
                startActivity(intent)
            }
        }
    }
}