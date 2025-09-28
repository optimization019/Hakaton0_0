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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignIn extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_sign_in);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText Vvodlogin = findViewById(R.id.Vvodlogin);


        Button GoToHome = findViewById(R.id.GoToHome);
        GoToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sqlManager sql = new sqlManager(getApplicationContext());

                EditText login = findViewById(R.id.Vvodlogin);
                EditText password = findViewById(R.id.Vvodparol);

                if(login.getText().toString().trim().length() < 8 || password.getText().length() < 8){
                    Toast.makeText(getApplicationContext(), "Логин или пароль слишком короткий!", Toast.LENGTH_LONG).show();    // проверка на длину пароля
                    return;
                }

                if(!isEmailValid(login.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Введённые данные не являются корректными.", Toast.LENGTH_LONG).show();   // выводит сообщение на экран, если логин и пароль являются некорректными
                    return;
                }

                if(sql.isUserInBase(login.getText().toString().trim().toLowerCase())){
                    Toast.makeText(getApplicationContext(), "Пользователь с такой почтой уже есть в базе данных!", Toast.LENGTH_LONG).show(); // если в БД, есть пользователь с такой почтой, выведит на экран соответсвующее сообщение
                    return;
                }

                sql.addUser(login.getText().toString().trim().toLowerCase(), password.getText().toString(), "", "");   // при правильном вводе логина и пароля выводится сообщение и переход на следующее окно
                Toast.makeText(getApplicationContext(), "Добро пожаловать!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SignIn.this, MainActivity.class);
                startActivity(intent);
                return;
                //Intent intent = new Intent(SignIn.this, MainActivity.class);
                //startActivity(intent);
            }
            public boolean isEmailValid(String email){
                boolean result = false;
                Pattern p = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9]+\\.+[a-z]+", Pattern.CASE_INSENSITIVE);  // регулярное выражение для проверки корректности ввода почты
                Matcher m = p.matcher(email);
                if(m.matches()){
                    result = true;
                }
                return result;
            }
        });
        TextView ZabilParol = findViewById(R.id.ZabilParol);
        ZabilParol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, ZabilParol.class); //переход на следующее окно
                startActivity(intent);
            }
        });
        TextView GoToLogIn = findViewById(R.id.GoToLogIn);
        GoToLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, LogIn.class);
                startActivity(intent);
            }
        });

    }
}