package com.olair.calculator.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.olair.calculator.R;

/**
 * Create by oLair on 2020/1/16.
 */
public class CalculatorButton extends FrameLayout {

    private AppCompatTextView tvMain;

    private AppCompatTextView tvMinor;

    public CalculatorButton(@NonNull Context context) {
        this(context, null);
    }

    public CalculatorButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CalculatorButton(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.item_superscript, this, true);
        tvMain = findViewById(R.id.element_main);
        tvMinor = findViewById(R.id.element_minor);
    }

}
