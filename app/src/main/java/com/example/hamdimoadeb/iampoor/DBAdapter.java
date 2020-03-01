package com.example.hamdimoadeb.iampoor;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBAdapter extends SQLiteOpenHelper {


    public DBAdapter(Context context) {
        super(context, "formalab", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE contact(id integer Primary key, number text, name text);";
        db.execSQL(createTable);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String deleteTable = "DROP Table IF EXISTS contact;";
        db.execSQL(deleteTable);
        onCreate(db);
    }
}
