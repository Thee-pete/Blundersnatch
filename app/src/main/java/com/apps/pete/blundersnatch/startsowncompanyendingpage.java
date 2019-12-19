package com.apps.pete.blundersnatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import hotchemi.android.rate.AppRate;

public class startsowncompanyendingpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startsowncompanyendingpage);
        AppRate.with(this)
                .setInstallDays(0)
                .setLaunchTimes(2)
                .setRemindInterval(2)
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);
    }
    public void replaybtn6onClick(View view)
    {
        Intent myintent;
        myintent = new Intent(startsowncompanyendingpage.this, startpage.class);
        startActivity(myintent);
        finish();
    }
}
