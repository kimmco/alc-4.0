package com.cokimutai.alc40;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("ALC 4 Phase 1");


    }

    public void openAboutAlc(View view) {
        startActivity(new Intent(this, About_Alc.class));
    }

    public void openMyProfile(View view) {
        startActivity(new Intent(this, MyProfile.class));
    }
}
// #3f51b5 primary color
// Dark Primary #303f9f
//divider/bg color #BDBDBD