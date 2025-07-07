package com.example.webviewapp;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = findViewById(R.id.webView);
        
        // Get URL and title from intent
        String url = getIntent().getStringExtra("url");
        String title = getIntent().getStringExtra("title");
        
        // Set title and enable back button in action bar
        if (title != null) {
            setTitle(title);
        }
        
        // Enable back button in action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        // Configure WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        
        // Allow HTTP traffic and mixed content
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);

        // Set WebViewClient to handle navigation within the WebView
        webView.setWebViewClient(new WebViewClient());

        // Load the URL
        if (url != null) {
            webView.loadUrl(url);
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Handle action bar back button click
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        // If WebView can go back, go back in WebView
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            // Otherwise, close the activity and return to main screen
            super.onBackPressed();
        }
    }
}
