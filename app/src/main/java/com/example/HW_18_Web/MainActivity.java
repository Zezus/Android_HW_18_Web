package com.example.HW_18_Web;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://developer.android.com/");
    }
}
