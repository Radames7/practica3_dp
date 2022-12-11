package com.example.proyecto3_dp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Buscador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://www.dportenis.mx/?gclid=Cj0KCQiAnNacBhDvARIsABnDa68XG9XRz8rcE5QGVFN6PN0tEjAMqc33N1gHxl5-nvoydyi5nsdCI7oaAnEpEALw_wcB");
    }

    public void irInicio(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }


}