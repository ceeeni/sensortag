package com.example.ti.ble.sensortag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button btnCtlr;
        btnCtlr = (Button) findViewById(R.id.button2);
    }
    public void onConfirm(View v) {
        Intent i = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(i);

           }
}
