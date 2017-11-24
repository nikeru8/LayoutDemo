package com.hello.kaiser.layoutdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by kaiser on 2017/11/24.
 */

public class LayoutOne extends RelativeLayout {

    public LayoutOne(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_one, null);
        addView(view);

        ImageView image = (ImageView) view.findViewById(R.id.image_item);
    }
}
