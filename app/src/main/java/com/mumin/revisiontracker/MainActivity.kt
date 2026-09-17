package com.mumin.revisiontracker

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.allowFileAccess = true
        web.settings.allowContentAccess = true
        web.webViewClient = WebViewClient()
        web.webChromeClient = WebChromeClient()
        web.setBackgroundColor(android.graphics.Color.rgb(247,247,251))
        web.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        web.loadUrl("file:///android_asset/index.html")
        setContentView(web)
    }

    override fun onBackPressed() {
        // Let the WebView handle browser-like navigation if it has any.
        val web = (window.decorView.findViewById<View>(android.R.id.content) as? android.view.ViewGroup)
        super.onBackPressed()
    }
}
