package com.apps.pete.blundersnatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class homeschoolordropsoutofcollegepage extends AppCompatActivity {
    private AdView firstadview4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeschoolordropsoutofcollegepage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~4905903631");
        firstadview4 = findViewById(R.id.fifthadView);
        AdRequest adRequest = new AdRequest.Builder().build();
        firstadview4.loadAd(adRequest);
    }
    public void runsawayonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(homeschoolordropsoutofcollegepage.this, runsawayorstartdrugspage.class);
        startActivity(myintent);
        finish();
    }
    public void startscodingonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(homeschoolordropsoutofcollegepage.this, startscodingpage.class);
        startActivity(myintent);
        finish();
    }
}
