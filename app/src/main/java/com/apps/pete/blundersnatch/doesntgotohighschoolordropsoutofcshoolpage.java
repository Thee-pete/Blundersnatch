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

public class doesntgotohighschoolordropsoutofcshoolpage extends AppCompatActivity {
    private AdView firstadview1;
    private InterstitialAd theInterstitialAd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doesntgotohighschoolordropsoutofcshoolpage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~4905903631");
        firstadview1 = findViewById(R.id.eightadView);
        AdRequest adRequest = new AdRequest.Builder().build();
        firstadview1.loadAd(adRequest);
        theInterstitialAd2 = new InterstitialAd(this);
        theInterstitialAd2.setAdUnitId("ca-app-pub-3609953011019731/7695718501");
        theInterstitialAd2.loadAd(new AdRequest.Builder().build());
        theInterstitialAd2.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                theInterstitialAd2.loadAd(new AdRequest.Builder().build());
            }

        });

    }
    public void startshomeschoolonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(doesntgotohighschoolordropsoutofcshoolpage.this, homeschoolordropsoutofcollegepage.class);
        startActivity(myintent);
        theInterstitialAd2.show();
        finish();
    }
    public void startsdoingdrugsonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(doesntgotohighschoolordropsoutofcshoolpage.this, runsawayorstartdrugspage.class);
        startActivity(myintent);
        theInterstitialAd2.show();
        finish();
    }
}
