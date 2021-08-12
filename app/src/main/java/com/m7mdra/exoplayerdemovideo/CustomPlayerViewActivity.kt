package com.m7mdra.exoplayerdemovideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.PlayerView

class CustomPlayerViewActivity : AppCompatActivity() {
    private lateinit var player: SimpleExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_player_view)
        player = SimpleExoPlayer.Builder(this)
            .build()
        val playerView = findViewById<PlayerView>(R.id.playerView)
        playerView.player = player


        val mediaItem = MediaItem.Builder()
            .setUri("https://thepaciellogroup.github.io/AT-browser-tests/video/ElephantsDream.mp4")
            .build()
        player.addMediaItem(mediaItem)

        player.prepare()
        player.playWhenReady = true

    }

    override fun onStop() {
        player.release()
        super.onStop()
    }
}