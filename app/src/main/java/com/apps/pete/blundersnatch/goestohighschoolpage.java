package com.apps.pete.blundersnatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class goestohighschoolpage extends AppCompatActivity {
    private AdView firstadview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goestohighschoolpage);
        MobileAds.initialize(this, "ca-app-pub-3609953011019731~49059036311");
        firstadview3 = findViewById(R.id.sixthadView);
        AdRequest adRequest = new AdRequest.Builder().build();
        firstadview3.loadAd(adRequest);
    }
    public void dropsouthighschonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(goestohighschoolpage.this, doesntgotohighschoolordropsoutofcshoolpage.class);
        startActivity(myintent);
        finish();
    }
    public void goestocollegeonClick(View view)
    {
        Intent myintent;
        myintent = new Intent(goestohighschoolpage.this, goestocollegepage.class);
        startActivity(myintent);
        finish();
    }
}
