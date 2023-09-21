package com.skyblue.selectandunselectbuttonbackgroundchange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.skyblue.selectandunselectbuttonbackgroundchange.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.currentMonthBtn1.setOnClickListener(v -> {

            // Primary button enable logic
            final int sdk = android.os.Build.VERSION.SDK_INT;
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.currentMonthBtn1.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.tp_month_enabled_bg) );
            } else {
                binding.currentMonthBtn1.setBackground(ContextCompat.getDrawable(context, R.drawable.tp_month_enabled_bg));
            }

            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.currentMonthArrowImg.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.tp_current_month_enabled_arrow));
                binding.currentMonthArrowImg.setColorFilter(ContextCompat.getColor(context, R.color.white), android.graphics.PorterDuff.Mode.SRC_IN);
            } else {
                binding.currentMonthArrowImg.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.tp_current_month_enabled_arrow));
                binding.currentMonthArrowImg.setColorFilter(ContextCompat.getColor(context, R.color.white), android.graphics.PorterDuff.Mode.SRC_IN);
            }

            // Secondary button disable logic logic
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.nextMonthBtn1.setBackgroundDrawable(null);
            } else {
                binding.nextMonthBtn1.setBackground(null);
            }

            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.nextMonthArrowImg.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.monthly_back_arrow_white));
                binding.nextMonthArrowImg.setColorFilter(ContextCompat.getColor(context, R.color.monthly_arrow), android.graphics.PorterDuff.Mode.SRC_IN);
            } else {
                binding.nextMonthArrowImg.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.monthly_back_arrow_white));
                binding.nextMonthArrowImg.setColorFilter(ContextCompat.getColor(context, R.color.monthly_arrow), android.graphics.PorterDuff.Mode.SRC_IN);
            }

            binding.nextMonthArrowImg.setScaleX(1);
            binding.currentMonthArrowImg.setScaleX(1);
        });
        binding.nextMonthBtn1.setOnClickListener(v -> {

            final int sdk = Build.VERSION.SDK_INT;
            if(sdk < Build.VERSION_CODES.JELLY_BEAN) {
                binding.currentMonthBtn1.setBackgroundDrawable(null);
            } else {
                binding.currentMonthBtn1.setBackground(null);
            }

            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.nextMonthBtn1.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.tp_month_enabled_bg) );
            } else {
                binding.nextMonthBtn1.setBackground(ContextCompat.getDrawable(context, R.drawable.tp_month_enabled_bg));
            }

            if(sdk < Build.VERSION_CODES.JELLY_BEAN) {
                binding.nextMonthArrowImg.setColorFilter(ContextCompat.getColor(context, R.color.white), android.graphics.PorterDuff.Mode.SRC_IN);
            } else {
                binding.nextMonthArrowImg.setColorFilter(ContextCompat.getColor(context, R.color.white), android.graphics.PorterDuff.Mode.SRC_IN);
            }

            if(sdk < Build.VERSION_CODES.JELLY_BEAN) {
                binding.currentMonthArrowImg.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.tp_current_month_enabled_arrow));
                binding.currentMonthArrowImg.setColorFilter(ContextCompat.getColor(context, R.color.monthly_arrow), android.graphics.PorterDuff.Mode.SRC_IN);
                binding.currentMonthArrowImg.setScaleX(1);
            } else {
                binding.currentMonthArrowImg.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.tp_current_month_enabled_arrow));
                binding.currentMonthArrowImg.setColorFilter(ContextCompat.getColor(context, R.color.monthly_arrow), android.graphics.PorterDuff.Mode.SRC_IN);
                binding.currentMonthArrowImg.setScaleX(1);
            }
        });
    }
}