package com.example.hakaton;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sqlManager extends SQLiteOpenHelper {

    private final Context context;

    public sqlManager(Context context) {
        super(context, "app", null, 1);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE users (id INTEGER PRIMARY KEY, email TEXT, password TEXT, pass TEXT, name TEXT, surname TEXT)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");
        onCreate(db);
    }

    public void addUser(String userEmail, String userPassword, String userName, String userSurname) {
        ContentValues values = new ContentValues();
        values.put("email", userEmail);
        values.put("password", userPassword);
        values.put("name", userName);
        values.put("surname", userSurname);

        SQLiteDatabase db = getWritableDatabase();
        db.insert("users", null, values);
        db.close();
    }

    public boolean isUserInBase(String email){
        SQLiteDatabase db = getReadableDatabase();
        String[] selectionArgs = {email};
        Cursor cursor = db.rawQuery("SELECT * FROM users WHERE email=?", selectionArgs);

        boolean userExists = cursor.moveToFirst();
        cursor.close();
        db.close();
        return userExists;
    }

    public boolean getUser(String login, String pass) {
        SQLiteDatabase db = getReadableDatabase();
        String[] selectionArgs = {login, pass};
        Cursor cursor = db.rawQuery("SELECT * FROM users WHERE email=? AND password=?", selectionArgs);

        boolean userExists = cursor.moveToFirst();
        cursor.close();
        db.close();
        return userExists;
    }
}