package com.example.emergency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button map, police, Tp, Ambulance, ChildLine, WomenhelpLine, Fire, RailwayPoliceHelpLine, AntiRaggingcomplaints, DISASTERHELPLINE, CoronaTollfree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        police = findViewById(R.id.police);

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:100"));
                startActivity(intent);
            }
        });

        Tp = findViewById(R.id.TRAFFICPOLICE);

        Tp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:103"));
                startActivity(intent);
            }
        });

        Ambulance = findViewById(R.id.Ambulance);

        Ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:108"));
                startActivity(intent);
            }
        });

        ChildLine = findViewById(R.id.ChildLine);

        ChildLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1098"));
                startActivity(intent);
            }
        });

        WomenhelpLine = findViewById(R.id.WomenhelpLine);

        WomenhelpLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1091"));
                startActivity(intent);
            }
        });

        Fire = findViewById(R.id.Fire);

        Fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:101"));
                startActivity(intent);
            }
        });

        AntiRaggingcomplaints = findViewById(R.id.AntiRaggingcomplaints);

        AntiRaggingcomplaints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:18001805522"));
                startActivity(intent);
            }
        });

        RailwayPoliceHelpLine = findViewById(R.id.RailwayPoliceHelpLine);

        RailwayPoliceHelpLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1512"));
                startActivity(intent);
            }
        });

        DISASTERHELPLINE = findViewById(R.id.DISASTERHELPLINE);

        DISASTERHELPLINE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1077"));
                startActivity(intent);
            }
        });

        CoronaTollfree = findViewById(R.id.CoronaTollfree);

        CoronaTollfree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1075"));
                startActivity(intent);
            }
        });

    }
}
