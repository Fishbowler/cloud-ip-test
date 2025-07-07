package com.example.webviewapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        WebView webView = findViewById(R.id.webView);
        
        // Get URL and title from intent
        String url = getIntent().getStringExtra("url");
        String title = getIntent().getStringExtra("title");
        
        // Set title
        if (title != null) {
            setTitle(title);
        }

        // Configure WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);

        // Set WebViewClient to handle navigation within the WebView
        webView.setWebViewClient(new WebViewClient());

        // Load the URL
        if (url != null) {
            webView.loadUrl(url);
        }
    }
}
