package com.hello.kaiser.layoutdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mLayout;

    private Button mButton;
    //整理招喚出來的View，可能有多個 拿ArrayList控制
    private ArrayList<RelativeLayout> layoutview = new ArrayList<>();

    private Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivity = this;
        mLayout = (LinearLayout) findViewById(R.id.frame_layout);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layoutview.size() == 0) {
                    LayoutOne layaout = new LayoutOne(mActivity);
                    layoutview.add(layaout);//加入控制View陣列
                    mLayout.addView(layaout);
                } else {
                    //do nothing
                }
            }
        });
    }

    @Override
    public void onBackPressed() {

        if (layoutview.size() != 0) {//返回紐刪除layout
            mLayout.removeAllViews();
            layoutview.remove(layoutview.size() - 1);
            Log.d("checkpoint", "checkpoint = " + layoutview.size());
        } else {
            finish();
        }
    }
}
