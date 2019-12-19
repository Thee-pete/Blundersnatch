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

public class startscodingpage extends AppCompatActivity {
    private AdView firstadview7;
    private InterstitialAd theInterstitialAd5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startscodingpage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~4905903631");
        firstadview7 = findViewById(R.id.secondadview);
        AdRequest adRequest = new AdRequest.Builder().build();
        firstadview7.loadAd(adRequest);
        theInterstitialAd5 = new InterstitialAd(this);
        theInterstitialAd5.setAdUnitId("ca-app-pub-3609953011019731/7695718501");
        theInterstitialAd5.loadAd(new AdRequest.Builder().build());
        theInterstitialAd5.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                theInterstitialAd5.loadAd(new AdRequest.Builder().build());
            }

        });
    }
    public void developgamesellsonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(startscodingpage.this, developedgameandsoldendingpage.class);
        startActivity(myintent);
        theInterstitialAd5.show();
        finish();
    }
    public void developgamepublishesonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(startscodingpage.this, developedandpublishedendingpage.class);
        startActivity(myintent);
        theInterstitialAd5.show();
        finish();

    }
}
