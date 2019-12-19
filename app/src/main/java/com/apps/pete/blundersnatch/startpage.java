package com.apps.pete.blundersnatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import hotchemi.android.rate.AppRate;

public class startpage extends AppCompatActivity {
    private AdView firstadview6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~4905903631");
        firstadview6 = findViewById(R.id.thirdadView);
        AdRequest adRequest = new AdRequest.Builder().build();
        firstadview6.loadAd(adRequest);
        AppRate.with(this)
                .setInstallDays(0)
                .setLaunchTimes(2)
                .setRemindInterval(2)
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);
    }
    public void goeshighschoolonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(startpage.this, goestohighschoolpage.class);
        startActivity(myintent);
        finish();
    }
    public void doesntgohighschoolonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(startpage.this, doesntgotohighschoolordropsoutofcshoolpage.class);
        startActivity(myintent);
        finish();
    }
}
