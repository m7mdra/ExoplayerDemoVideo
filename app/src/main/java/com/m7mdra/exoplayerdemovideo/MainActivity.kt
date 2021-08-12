package com.m7mdra.exoplayerdemovideo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val playerView = findViewById<MaterialButton>(R.id.materialButton)
        val styledPlayerView = findViewById<MaterialButton>(R.id.materialButton1)
        val customPlayerView = findViewById<MaterialButton>(R.id.materialButton3)

        playerView.setOnClickListener {
            startActivity(Intent(this, PlayerViewActivity::class.java))
        }
        styledPlayerView.setOnClickListener {
            startActivity(Intent(this, StylePlayerViewActivity::class.java))

        }
        customPlayerView.setOnClickListener {
            startActivity(Intent(this, CustomPlayerViewActivity::class.java))

        }
    }
}