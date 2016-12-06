package com.kelly.pulltorefresh.activity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.kelly.pulltorefresh.MyListener;
import com.kelly.pulltorefresh.PullToRefreshLayout;
import com.kelly.pulltorefresh.R;


public class PullableWebViewActivity extends Activity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        ((PullToRefreshLayout) findViewById(R.id.refresh_view))
                .setOnRefreshListener(new MyListener());
        webView = (WebView) findViewById(R.id.content_view);
        webView.loadUrl("http://www.baidu.com");
    }
}
