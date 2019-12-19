package com.apps.pete.blundersnatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class storypage extends AppCompatActivity {
    private InterstitialAd theInterstitialAd6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storypage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~4905903631");
        theInterstitialAd6 = new InterstitialAd(this);
        theInterstitialAd6.setAdUnitId("ca-app-pub-3609953011019731/7695718501");
        theInterstitialAd6.loadAd(new AdRequest.Builder().build());
        theInterstitialAd6.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                theInterstitialAd6.loadAd(new AdRequest.Builder().build());
            }

        });
    }
     public void continuebtnonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(storypage.this, startpage.class);
        startActivity(myintent);
        theInterstitialAd6.show();
        finish();

     }
}
