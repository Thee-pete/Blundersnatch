package com.apps.pete.blundersnatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class runsawayorstartdrugspage extends AppCompatActivity {
    private AdView firstadview5;
    private InterstitialAd theInterstitialAd4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runsawayorstartdrugspage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~4905903631");
        firstadview5 = findViewById(R.id.fourthadView);
        AdRequest adRequest = new AdRequest.Builder().build();
        firstadview5.loadAd(adRequest);
        theInterstitialAd4 = new InterstitialAd(this);
        theInterstitialAd4.setAdUnitId("ca-app-pub-3609953011019731/7695718501");
        theInterstitialAd4.loadAd(new AdRequest.Builder().build());
        theInterstitialAd4.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                theInterstitialAd4.loadAd(new AdRequest.Builder().build());
            }

        });
    }
    public void sellingdrugsonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(runsawayorstartdrugspage.this, startsellingdrugsendingpage.class);
        startActivity(myintent);
        theInterstitialAd4.show();
        finish();
    }
    public void robbingbanksonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(runsawayorstartdrugspage.this, startrobbingbanksendingpage.class);
        startActivity(myintent);
        theInterstitialAd4.show();
        finish();
    }
}
