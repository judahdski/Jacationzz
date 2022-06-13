package com.d3if0002.jacationzz

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StartActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val startButton = findViewById<Button>(R.id.start_btn)
        startButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0?.id == R.id.start_btn) {
            val intent = Intent(this@StartActivity, MainActivity::class.java)
            this.startActivity(intent)
        }
    }
}