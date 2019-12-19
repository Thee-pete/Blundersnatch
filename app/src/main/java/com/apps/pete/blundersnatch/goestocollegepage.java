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

public class goestocollegepage extends AppCompatActivity {
    private AdView firstadview2;
    private InterstitialAd theInterstitialAd3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goestocollegepage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~4905903631");
        firstadview2 = findViewById(R.id.seventhadView);
        AdRequest adRequest = new AdRequest.Builder().build();
        firstadview2.loadAd(adRequest);
        theInterstitialAd3 = new InterstitialAd(this);
        theInterstitialAd3.setAdUnitId("ca-app-pub-3609953011019731/7695718501");
        theInterstitialAd3.loadAd(new AdRequest.Builder().build());
        theInterstitialAd3.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                theInterstitialAd3.loadAd(new AdRequest.Builder().build());
            }

        });
    }
    public void dropsoutcollegeonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(goestocollegepage.this, homeschoolordropsoutofcollegepage.class);
        startActivity(myintent);
        theInterstitialAd3.show();
        finish();
    }
    public void becomesaccountantonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(goestocollegepage.this, becomesaccountantpage.class);
        startActivity(myintent);
        theInterstitialAd3.show();
        finish();
    }
}
