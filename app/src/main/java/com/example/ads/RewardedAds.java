package com.example.ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

public class RewardedAds extends AppCompatActivity implements RewardedVideoAdListener {

    private RewardedVideoAd mAd;
    private Button nButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewarded_ads);

        nButton = findViewById(R.id.Button2);
        nButton.setEnabled(false);

        MobileAds.initialize(this,"ca-app-pub-4508821759736256~6268108226");

        mAd = MobileAds.getRewardedVideoAdInstance(this);
        mAd.setRewardedVideoAdListener(this);

        mAd.loadAd("ca-app-pub-4508821759736256/9123797237",new AdRequest.Builder().build());

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nButton.setEnabled(false);
                if(mAd.isLoaded()){
                    mAd.show();
                }
            }
        });

    }

    @Override
    public void onRewardedVideoAdLoaded() {
        nButton.setEnabled(true);
    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
}
