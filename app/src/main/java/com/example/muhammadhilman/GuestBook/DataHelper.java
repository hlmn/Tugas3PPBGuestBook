package com.example.muhammadhilman.GuestBook;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "guestbook.db";
    private static final int DATABASE_VERISON = 1;


    public DataHelper (Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERISON);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table guestbook(no integer primary key, nama text null, tgl text null, alamat text null, perusahaan text null);";
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        
    }

}
