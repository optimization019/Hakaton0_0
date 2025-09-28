package com.example.hakaton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ZabilParol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_zabil_parol);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView Vhod = findViewById(R.id.Vhod);
        Vhod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZabilParol.this, LogIn.class);
                startActivity(intent);
            }
        });
        Button GoToHome = findViewById(R.id.GoToHome);
        GoToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZabilParol.this, LogIn.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Ссылка на восстановление пароля отправлена на почту", Toast.LENGTH_LONG).show();
            }
        });
        TextView GoToSign = findViewById(R.id.GoToSignIn);
        GoToSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZabilParol.this, SignIn.class);
                startActivity(intent);
            }
        });
    }
}