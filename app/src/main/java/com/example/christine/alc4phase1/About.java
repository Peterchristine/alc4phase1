package com.example.christine.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class About extends AppCompatActivity {
    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        myWebView = findViewById(R.id.webView);
        myWebView.loadUrl("https://andela.com/alc/");
    }
}
