package com.dodoro.tw.myapplicationinclass3;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;

public class MyService extends Service {
    NotificationManager manager;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent,int flags, int startId) {
        Log.d("Start service","This is service");
        new CountDownTimer(7 * 1000 , 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent it = new Intent(getApplicationContext(),MainActivity.class);
                PendingIntent pi = PendingIntent.getActivity(getApplicationContext(),1212,it,PendingIntent.FLAG_UPDATE_CURRENT);
                Notification.Builder builder = new Notification.Builder(getApplicationContext());
                builder.setSmallIcon(R.mipmap.ic_launcher).setContentTitle("這是提醒時間到了!!!").setContentIntent(pi).setContentText("這是提醒內容").setOngoing(true);
                manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                manager.notify(321,builder.build());
            }
        }.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
