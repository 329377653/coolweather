package com.coolweather.app.db;

import android.database.sqlite.SQLiteDatabase;

public class CoolWeatherDB {
	/*
	 * 数据库名
	 */
	public static final String DB_name = "cool_weather";
	
	/*
	 * 数据库版本
	 */
	
	public static final int VERSION = 1;
	
	private static CoolWeatherDB coolWeatherDB;
	private SQLiteDatabase db;

}
