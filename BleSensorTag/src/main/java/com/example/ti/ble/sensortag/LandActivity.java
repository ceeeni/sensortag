package com.example.ti.ble.sensortag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LandActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);
         }

    public void OnreadytoSleep(View v) {
        Intent i = new Intent(LandActivity.this, HomeActivity.class);
        startActivity(i);

    }


}
