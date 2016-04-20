package com.example.ti.ble.sensortag;

 import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void OnClickgld (View v){
        TextView gldview = (TextView)findViewById(R.id.gldtext);
        gldview.setText("test");


    }

}
