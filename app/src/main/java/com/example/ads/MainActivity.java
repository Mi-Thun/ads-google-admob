package com.example.ads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BannerAds(View view) {
        startActivity(new Intent(getApplicationContext(),BannerAds.class));
    }

    public void RewardedAds(View view) {
        startActivity(new Intent(getApplicationContext(),RewardedAds.class));
    }

    public void InterstitialAds(View view) {
        startActivity(new Intent(getApplicationContext(),InterstitialAds.class));
    }

    public void NativeAds(View view) {
        startActivity(new Intent(getApplicationContext(),NativeAds.class));
    }
}
