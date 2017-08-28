package com.dodoro.tw.myapplicationinclass3;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SixActivity extends AppCompatActivity implements Button.OnClickListener {

    Button btn_c,btn_d;
    FragmentTransaction ft;
    Fragment fc,fd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        btn_c = (Button)findViewById(R.id.button_c);
        btn_d = (Button)findViewById(R.id.button_d);

        btn_c.setOnClickListener(this);
        btn_d.setOnClickListener(this);

        fc = new Fragment_C();
        fd = new Fragment_D();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_c:
                ft = getFragmentManager().beginTransaction();
//                ft.remove(fc);
                ft.replace(R.id.fragment,fd,"f_d");
                ft.commit();
                break;
            case R.id.button_d:
                ft = getFragmentManager().beginTransaction();
//                ft.remove(fd);
                ft.replace(R.id.fragment,fc,"f_c");
                ft.commit();
                break;

        }

    }
}
