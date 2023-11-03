package com.example.emergency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity2 extends AppCompatActivity {
    private int SLEEP_TIMER = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main2);

        LogoLauncher logoLauncher =new LogoLauncher();
        logoLauncher.start();


    }

    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(1000 * SLEEP_TIMER);

            }catch (InterruptedException e){
                e.printStackTrace();
            }

            Intent intent=new Intent(MainActivity2.this,MainActivity.class);
            startActivity(intent);
            MainActivity2.this.finish();
        }
    }}