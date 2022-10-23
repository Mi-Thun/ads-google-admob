package com.example.ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BannerAds extends AppCompatActivity {

    private AdView AdView,AdView1,AdView2,AdView3,AdView4,AdView5,AdView6,AdView7,AdView8,AdView9,AdView10,AdView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_ads);

        MobileAds.initialize(this,"ca-app-pub-4508821759736256~6268108226");

        AdView = findViewById(R.id.adView);
        AdView1 = findViewById(R.id.adView1);
        AdView2 = findViewById(R.id.adView2);
        AdView3 = findViewById(R.id.adView3);
        AdView4 = findViewById(R.id.adView4);
        AdView5 = findViewById(R.id.adView5);
        AdView6 = findViewById(R.id.adView6);
        AdView7 = findViewById(R.id.adView7);
        AdView8 = findViewById(R.id.adView8);
        AdView9 = findViewById(R.id.adView9);
        AdView10 = findViewById(R.id.adView10);
        AdView11 = findViewById(R.id.adView11);

        AdRequest adRequest = new AdRequest.Builder().build();
        AdView.loadAd(adRequest);
        AdView1.loadAd(adRequest);
        AdView2.loadAd(adRequest);
        AdView3.loadAd(adRequest);
        AdView4.loadAd(adRequest);
        AdView5.loadAd(adRequest);
        AdView6.loadAd(adRequest);
        AdView7.loadAd(adRequest);
        AdView8.loadAd(adRequest);
        AdView9.loadAd(adRequest);
        AdView10.loadAd(adRequest);
        AdView11.loadAd(adRequest);

    }
}
