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

        binding.leftButton.setOnClickListener(v -> {

            // Primary button enable logic
            final int sdk = android.os.Build.VERSION.SDK_INT;
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.leftButton.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.selected_bg) );
            } else {
                binding.leftButton.setBackground(ContextCompat.getDrawable(context, R.drawable.selected_bg));
            }

            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.leftImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.back_arrow_left_white));
                binding.leftImage.setColorFilter(ContextCompat.getColor(context, R.color.white), android.graphics.PorterDuff.Mode.SRC_IN);
            } else {
                binding.leftImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.back_arrow_left_white));
                binding.leftImage.setColorFilter(ContextCompat.getColor(context, R.color.white), android.graphics.PorterDuff.Mode.SRC_IN);
            }

            // Secondary button disable logic logic
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.rightButton.setBackgroundDrawable(null);
            } else {
                binding.rightButton.setBackground(null);
            }

            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.rightImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.back_arrow_right_white));
                binding.rightImage.setColorFilter(ContextCompat.getColor(context, R.color.monthly_arrow), android.graphics.PorterDuff.Mode.SRC_IN);
            } else {
                binding.rightImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.back_arrow_right_white));
                binding.rightImage.setColorFilter(ContextCompat.getColor(context, R.color.monthly_arrow), android.graphics.PorterDuff.Mode.SRC_IN);
            }

            binding.rightImage.setScaleX(1);
            binding.leftImage.setScaleX(1);
        });
        binding.rightButton.setOnClickListener(v -> {

            final int sdk = Build.VERSION.SDK_INT;
            if(sdk < Build.VERSION_CODES.JELLY_BEAN) {
                binding.leftButton.setBackgroundDrawable(null);
            } else {
                binding.leftButton.setBackground(null);
            }

            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                binding.rightButton.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.selected_bg) );
            } else {
                binding.rightButton.setBackground(ContextCompat.getDrawable(context, R.drawable.selected_bg));
            }

            if(sdk < Build.VERSION_CODES.JELLY_BEAN) {
                binding.rightImage.setColorFilter(ContextCompat.getColor(context, R.color.white), android.graphics.PorterDuff.Mode.SRC_IN);
            } else {
                binding.rightImage.setColorFilter(ContextCompat.getColor(context, R.color.white), android.graphics.PorterDuff.Mode.SRC_IN);
            }

            if(sdk < Build.VERSION_CODES.JELLY_BEAN) {
                binding.leftImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.back_arrow_left_white));
                binding.leftImage.setColorFilter(ContextCompat.getColor(context, R.color.monthly_arrow), android.graphics.PorterDuff.Mode.SRC_IN);
                binding.leftImage.setScaleX(1);
            } else {
                binding.leftImage.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.back_arrow_left_white));
                binding.leftImage.setColorFilter(ContextCompat.getColor(context, R.color.monthly_arrow), android.graphics.PorterDuff.Mode.SRC_IN);
                binding.leftImage.setScaleX(1);
            }
        });
    }
}