package com.cokimutai.alc40;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.MenuItem;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.net.http.*;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class About_Alc extends AppCompatActivity {

    public static final String WEBSITE_URL = "https://andela.com/alc/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about__alc);
        WebView webView = findViewById(R.id.alc_web);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new MyWeb(){


            @Override
            public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
                // for SSLErrorHandler
                final AlertDialog.Builder builder = new AlertDialog.Builder(About_Alc.this);
                builder.setMessage(R.string.notification_error_ssl_cert_invalid);
                builder.setPositiveButton("continue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handler.proceed();
                    }
                });
                builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handler.cancel();
                    }
                });
                final AlertDialog dialog = builder.create();
                dialog.show();
            }

        });
        webView.loadUrl(WEBSITE_URL);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.about__alc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class MyWeb extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String request) {
            view.loadUrl(request);
            return true;
        }

    }
}
