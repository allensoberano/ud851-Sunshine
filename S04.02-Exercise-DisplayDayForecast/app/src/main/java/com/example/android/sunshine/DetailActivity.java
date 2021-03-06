package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        mDisplayText = (TextView) findViewById(R.id.weather_display);
        Intent intentThatStartedThisactivity = getIntent();

        if (intentThatStartedThisactivity.hasExtra(Intent.EXTRA_TEXT)){
            String weatherData = intentThatStartedThisactivity.getStringExtra(Intent.EXTRA_TEXT);
            mDisplayText.setText(weatherData);
        }


    }
}