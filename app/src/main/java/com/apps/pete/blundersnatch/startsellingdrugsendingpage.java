package com.apps.pete.blundersnatch;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import hotchemi.android.rate.AppRate;

public class startsellingdrugsendingpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startsellingdrugsendingpage);
        AppRate.with(this)
                .setInstallDays(0)
                .setLaunchTimes(2)
                .setRemindInterval(2)
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);
    }
    public void replaybtn1onClick(View view)
    {
        Intent myintent;
        myintent = new Intent(startsellingdrugsendingpage.this, startpage.class);
        startActivity(myintent);
        finish();
    }

}
