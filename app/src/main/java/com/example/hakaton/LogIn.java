package com.example.hakaton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button GoToHome = findViewById(R.id.GoToHome);
        GoToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this, MainActivity.class);
                startActivity(intent);
            }
        });
        TextView ZabilParol = findViewById(R.id.ZabilParol);
        ZabilParol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this, ZabilParol.class);
                startActivity(intent);
            }
        });
        TextView GoToSignIn = findViewById(R.id.GoToSignIn);
        GoToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogIn.this, SignIn.class);
                startActivity(intent);
            }
        });
        Button loginB = findViewById(R.id.GoToHome);
        EditText login = findViewById(R.id.textView3);
        EditText password = findViewById(R.id.textView4);
        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqlManager manager = new sqlManager(getApplicationContext());
                if(login.getText().toString().trim().length() < 8 || password.getText().length() < 8){
                    Toast.makeText(getApplicationContext(), "Логин или пароль слишком короткий!", Toast.LENGTH_LONG).show();    //регулярное выражение для проверки логина и пароля, чтобы логин и пароль были длиннее 8 символов
                    return;
                }
                if(!manager.getUser(login.getText().toString().trim().toLowerCase(), password.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Не верный пароль!", Toast.LENGTH_LONG).show();       //выводит сообщение на экран, если пользователь указал неправильный пароль
                    return;
                }else{
                    Toast.makeText(getApplicationContext(), "Вы вошли в свой аккаунт!", Toast.LENGTH_LONG).show(); //при правильном логине и пароле переходит на следующую страницу с выводом сообщения, что произошел успешный вход в аккаунт
                    Intent intent = new Intent(LogIn.this, MainActivity.class);
                    startActivity(intent);
                    return;
                }
            }
        });
    }
}