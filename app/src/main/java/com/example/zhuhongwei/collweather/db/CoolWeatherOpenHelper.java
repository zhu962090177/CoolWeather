package com.example.zhuhongwei.collweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sunzhengchun on 16/5/17.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    public static final String CREATE_PROVINCE = "create table Province (\n" +
            "            id integer primary key autoincrement,\n" +
            "            province_name text,\n" +
            "            province_code text)";

    public static final String CREATE_CITY = "create table City (\n" +
            "            id integer primary key autoincrement,\n" +
            "            city_name text,\n" +
            "            city_code text,\n" +
            "            province_id integer)";

    public static final String CREATE_COUNTY = "create table County (\n" +
            "            id integer primary key autoincrement,\n" +
            "            county_name text,\n" +
            "            county_code text,\n" +
            "            city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
