package com.apps.pete.blundersnatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import hotchemi.android.rate.AppRate;

public class welcomepage extends AppCompatActivity {
    private AdView firstadview8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcomepage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~4905903631");
        firstadview8 = findViewById(R.id.firstadView);
        AdRequest adRequest = new AdRequest.Builder().build();
        firstadview8.loadAd(adRequest);
        AppRate.with(this)
                .setInstallDays(0)
                .setLaunchTimes(2)
                .setRemindInterval(2)
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);

    }
    public void startbtnonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(welcomepage.this, storypage.class);
        startActivity(myintent);
    }
}
