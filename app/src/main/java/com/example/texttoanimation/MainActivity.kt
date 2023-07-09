package com.example.texttoanimation

import android.annotation.SuppressLint
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webview)

        // Enable JavaScript
        webView.settings.javaScriptEnabled = true

        // Enable DOM Storage for video playback
        webView.settings.domStorageEnabled = true

        // Enable mixed content mode
        webView.settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

        // Set a WebViewClient
        webView.webChromeClient = WebChromeClient()

        // Load the video URL
        webView.loadDataWithBaseURL(
            null,
            "<html><body><iframe width=\"100%\" height=\"100%\" src=\"https://api.tribi.adaptivenetlab.site/video\" frameborder=\"0\" allowfullscreen></iframe></body></html>",
            "text/html",
            "UTF-8",
            null
        )
    }
}