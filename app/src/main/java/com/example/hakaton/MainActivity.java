package com.example.hakaton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import Books.Books;
import Coffee.Capuchino;
import Coffee.Doppio;
import Coffee.IceLatte;
import Tea.GreenTea;
import Tea.TeaUlun;
import Tea.WhiteTea;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScrollView scrollView = new ScrollView(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView GoDoppio = findViewById(R.id.imageGoDoppio);
        GoDoppio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Doppio.class);
                startActivity(intent);
            }
        });
        ImageView GoIce = findViewById(R.id.imageGoIce);
        GoIce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IceLatte.class);
                startActivity(intent);
            }
        });
        ImageView GoCap = findViewById(R.id.imageGoCap);
        GoCap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Capuchino.class);
                startActivity(intent);
            }
        });
        ImageView GoUlun = findViewById(R.id.imageGoUlun);
        GoUlun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TeaUlun.class);
                startActivity(intent);
            }
        });
        ImageView GoWhite = findViewById(R.id.imageGoWhite);
        GoWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WhiteTea.class);
                startActivity(intent);
            }
        });
        ImageView GoGreen = findViewById(R.id.imageGoGreen);
        GoGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GreenTea.class);
                startActivity(intent);
            }
        });
        ImageView GoBooks = findViewById(R.id.imageGoBooks);
        GoBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Books.class);
                startActivity(intent);
            }
        });
        ImageView GoSub = findViewById(R.id.imageGoSub);
        GoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SplashScreen2.class);
                startActivity(intent);
            }
        });
        ImageView GoProfile = findViewById(R.id.imageGoProfile);
        GoProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });

    }
}