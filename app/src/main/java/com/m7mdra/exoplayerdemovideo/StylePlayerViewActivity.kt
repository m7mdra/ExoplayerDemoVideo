package com.m7mdra.exoplayerdemovideo

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.exoplayer2.util.MimeTypes

class StylePlayerViewActivity : AppCompatActivity() {
    private lateinit var player: SimpleExoPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_style_player_view)
        player = SimpleExoPlayer.Builder(this)
            .build()
        val playerView = findViewById<StyledPlayerView>(R.id.playerView)
        playerView.player = player

        val subtitle = MediaItem.Subtitle(
            Uri.parse("https://thepaciellogroup.github.io/AT-browser-tests/video/subtitles-en.ttml"),
            MimeTypes.APPLICATION_TTML,
            "english"
        )
        val mediaItem = MediaItem.Builder()
            .setUri("https://thepaciellogroup.github.io/AT-browser-tests/video/ElephantsDream.mp4")
            .setSubtitles(listOf(subtitle))
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