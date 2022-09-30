package com.example.madpractical_6_20012011124

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import com.example.madpractical_6_20012011124.databinding.ActivityYoutubeBinding


class YoutubeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityYoutubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initYoutubeVideo()
        binding.backButton.setOnClickListener {
            Intent(this@YoutubeActivity,MainActivity::class.java).apply {
                startActivity(this)
            }
        }
    }

    private val youtubeID = "BddP6PYo2gs"
    private fun initYoutubeVideo(){
        val webSettings: WebSettings = binding.myWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.myWebView.loadUrl("https://www.youtube.com/watch?v=BddP6PYo2gs")
    }
}