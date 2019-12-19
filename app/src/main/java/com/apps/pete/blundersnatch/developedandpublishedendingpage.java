package com.apps.pete.blundersnatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import hotchemi.android.rate.AppRate;

public class developedandpublishedendingpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developedandpublishedendingpage);
        AppRate.with(this)
                .setInstallDays(0)
                .setLaunchTimes(2)
                .setRemindInterval(2)
                .monitor();

        AppRate.showRateDialogIfMeetsConditions(this);
    }
    public void replaybtn4onClick(View view)
    {
        Intent myintent;
        myintent = new Intent(developedandpublishedendingpage.this, startpage.class);
        startActivity(myintent);
        finish();
    }
}
