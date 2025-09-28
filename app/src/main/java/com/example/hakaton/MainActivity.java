package com.example.hakaton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
import Tea.TeaHunt;
import Tea.WhiteTea;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
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
        ImageView GoDoppio1 = findViewById(R.id.imageGoDoppio1);
        GoDoppio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Doppio.class);
                startActivity(intent);
            }
        });
        ImageView GoIce1 = findViewById(R.id.imageGoIce1);
        GoIce1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IceLatte.class);
                startActivity(intent);
            }
        });
        ImageView GoCap1 = findViewById(R.id.imageGoCap1);
        GoCap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Capuchino.class);
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
        ImageView GoHunt = findViewById(R.id.imageGoHunt);
        GoHunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TeaHunt.class);
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
        ImageView GoCard = findViewById(R.id.imageGoCard);
        GoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoyalCard.class);
                startActivity(intent);
            }
        });
        ImageView GoWhite1 = findViewById(R.id.imageGoWhite1);
        GoWhite1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WhiteTea.class);
                startActivity(intent);
            }
        });
        ImageView GoGreen1 = findViewById(R.id.imageGoGreen1);
        GoGreen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GreenTea.class);
                startActivity(intent);
            }
        });
        ImageView GoHunt1 = findViewById(R.id.imageGoHunt1);
        GoHunt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TeaHunt.class);
                startActivity(intent);
            }
        });
        ImageView GoProfile = findViewById(R.id.GoProfile);
        GoProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });
        ImageView GoMAX = findViewById(R.id.GoMAX);
        GoMAX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MAX.class);
                startActivity(intent);
            }
        });

    }
}