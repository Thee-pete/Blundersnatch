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

public class becomesaccountantpage extends AppCompatActivity {
    private AdView firstadview;
    private InterstitialAd theInterstitialAd1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_becomesaccountantpage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~4905903631");
        firstadview = findViewById(R.id.ninthadView);
        AdRequest adRequest = new AdRequest.Builder().build();
        firstadview.loadAd(adRequest);
        theInterstitialAd1 = new InterstitialAd(this);
        theInterstitialAd1.setAdUnitId("ca-app-pub-3609953011019731/7695718501");
        theInterstitialAd1.loadAd(new AdRequest.Builder().build());
        theInterstitialAd1.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                theInterstitialAd1.loadAd(new AdRequest.Builder().build());
            }

        });
    }
    public void getsjobonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(becomesaccountantpage.this, getsregularjobendingpage.class);
        startActivity(myintent);
        theInterstitialAd1.show();
        finish();
    }
    public void startowncompanyonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(becomesaccountantpage.this, startsowncompanyendingpage.class);
        startActivity(myintent);
        theInterstitialAd1.show();
        finish();
    }
}
