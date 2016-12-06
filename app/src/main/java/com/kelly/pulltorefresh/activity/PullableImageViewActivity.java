package com.kelly.pulltorefresh.activity;


import android.app.Activity;
import android.os.Bundle;

import com.kelly.pulltorefresh.MyListener;
import com.kelly.pulltorefresh.PullToRefreshLayout;
import com.kelly.pulltorefresh.R;

public class PullableImageViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageview);
        ((PullToRefreshLayout) findViewById(R.id.refresh_view))
                .setOnRefreshListener(new MyListener());
    }
}
