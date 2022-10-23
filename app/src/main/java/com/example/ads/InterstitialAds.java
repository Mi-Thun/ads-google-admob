package com.example.ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class InterstitialAds extends AppCompatActivity {

    private InterstitialAd mInterstitialAd;
    private android.widget.Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interstitial_ads);

        Button = findViewById(R.id.Button);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mInterstitialAd.isLoaded()){
                    mInterstitialAd.show();
                }
                else {
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());
                }

            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4508821759736256/1820022286");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }
}
