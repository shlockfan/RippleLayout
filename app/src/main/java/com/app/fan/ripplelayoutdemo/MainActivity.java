package com.app.fan.ripplelayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.app.fan.ripplelayoutdemo.view.RippleLayout;

public class MainActivity extends AppCompatActivity {
    private RippleLayout mRippleLayout;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRippleLayout = (RippleLayout) findViewById(R.id.rp_layout);
        mImageView = (ImageView) findViewById(R.id.image_1);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mRippleLayout.startRippleAnimation();
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (mRippleLayout.isRippleAnimationRunning())
            mRippleLayout.stopRippleAnimation();
        super.onBackPressed();
    }
}
