package com.fontmaster.app.masterfontlibrary.edittext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created on 3/1/17.
 * @author Debdeep
 */
@SuppressLint("AppCompatCustomView")
public class Custom_EditText_mountainsof_christmas_regular extends EditText {

    public Custom_EditText_mountainsof_christmas_regular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public Custom_EditText_mountainsof_christmas_regular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Custom_EditText_mountainsof_christmas_regular(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface dashboardtf = Typeface.createFromAsset(getContext().getAssets(),
                "fonts/mountainsof_christmas_regular.ttf");
        setTypeface(dashboardtf);
    }
}