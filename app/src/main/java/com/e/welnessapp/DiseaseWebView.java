package com.e.welnessapp;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class DiseaseWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview_layout);
        WebView web = findViewById(R.id.disease_webview);

        String displayUrl = getIntent().getExtras().getString("url");
        web.loadUrl(displayUrl);
    }
}
