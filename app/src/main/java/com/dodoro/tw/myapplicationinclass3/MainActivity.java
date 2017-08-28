package com.dodoro.tw.myapplicationinclass3;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
    }
    public void click1(View v)
    {
        Intent it = new Intent(MainActivity.this,DetailActivity.class);
        PendingIntent pi = PendingIntent.getActivity(MainActivity.this,1212,it,PendingIntent.FLAG_UPDATE_CURRENT);

        Notification.Builder builder = new Notification.Builder(MainActivity.this);
        builder.setSmallIcon(R.mipmap.ic_launcher).setContentTitle("這是提醒!!!").setContentText("這是提醒內容").setContentIntent(pi).setOngoing(true);

        manager.notify(321,builder.build());
    }
    public void onCancel(View v)
    {
        manager.cancel(321);
    }
    public void clicktwo(View v)
    {
        startActivity(new Intent(MainActivity.this,TwoActivity.class));
    }
    public void clickservice(View v)
    {
        startService(new Intent(MainActivity.this, MyService.class));
    }
    public void clickthree(View v)
    {
        startActivity(new Intent(MainActivity.this,ThreeActivity.class));
    }
    public void clickfour(View v)
    {
        startActivity(new Intent(MainActivity.this,FourActivity.class));
    }
    public void clickfive(View v)
    {
        startActivity(new Intent(MainActivity.this,FiveActivity.class));
    }
    public void clicksix(View v)
    {
        startActivity(new Intent(MainActivity.this,SixActivity.class));
    }
    public void clickseven(View v)
    {
        startActivity(new Intent(MainActivity.this,SevenActivity.class));
    }
}
