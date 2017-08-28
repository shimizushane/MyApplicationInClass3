package com.dodoro.tw.myapplicationinclass3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FiveActivity extends AppCompatActivity implements Button.OnClickListener{

    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        btn = (Button)findViewById(R.id.button_b);
        tv  = (TextView)findViewById(R.id.textview_a);

        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        tv.setText(new java.util.Date().toString());
    }
}
