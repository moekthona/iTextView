package com.mtn.itextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class iTextView extends AppCompatTextView {

    public iTextView(Context context) {
        super(context);
    }

    public iTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context,attrs);
    }

    public iTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context,attrs);
    }

    private void applyCustomFont(Context context,AttributeSet attrs) {

        if (attrs != null) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.iTextView);
            String fontName = typedArray.getString(R.styleable.iTextView_fontName);
            Typeface customFont = FontCache.getTypeface(fontName, context);
            setTypeface(customFont);
        }
    }
}
