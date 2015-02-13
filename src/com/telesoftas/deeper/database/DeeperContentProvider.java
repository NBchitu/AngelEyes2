package com.telesoftas.deeper.database;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import com.telesoftas.deeper.DeeperApplication;
import java.util.HashMap;

public class DeeperContentProvider
  extends ContentProvider
{
  public static final Uri a = Uri.parse("content://com.fridaylab.deeper.database.DeeperContentProvider/note");
  private static final UriMatcher b = new UriMatcher(-1);
  private static String d = "_id";
  private static String e = "note.note_id as " + d;
  private static String f = "note.body as body";
  private static String g = "note.title as title";
  private static String h = "note.date as date";
  private static String i = "note_location.address as address";
  private static String j = "note_location.latitude as latitude";
  private static String k = "note_location.longitude as longitude";
  private final HashMap<String, String> c = new HashMap();
  private DeeperDatabase l;
  
  static
  {
    b.addURI("com.fridaylab.deeper.database.DeeperContentProvider", "note", 100);
    b.addURI("com.fridaylab.deeper.database.DeeperContentProvider", "note/#", 110);
  }
  
  private String a(String paramString1, String paramString2)
  {
    return paramString1 + "." + paramString2 + " as " + paramString2;
  }
  
  private void a()
  {
    this.c.put("note_id", e);
    this.c.put("body", f);
    this.c.put("title", g);
    this.c.put("date", h);
    this.c.put("address", i);
    this.c.put("latitude", j);
    this.c.put("longitude", k);
    this.c.put("cloud_condition_type", a("weather", "cloud_condition_type"));
    this.c.put("high_temp_c", a("weather", "high_temp_c"));
    this.c.put("high_temp_f", a("weather", "high_temp_f"));
    this.c.put("low_temp_c", a("weather", "low_temp_c"));
    this.c.put("low_temp_f", a("weather", "low_temp_f"));
    this.c.put("moon_phase_type", a("weather", "moon_phase_type"));
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    a();
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    SQLiteQueryBuilder localSQLiteQueryBuilder = new SQLiteQueryBuilder();
    localSQLiteQueryBuilder.setTables("note,note_location,weather");
    localSQLiteQueryBuilder.setProjectionMap(this.c);
    switch (b.match(paramUri))
    {
    default: 
      throw new IllegalArgumentException("Unknown URI");
    case 110: 
      localSQLiteQueryBuilder.appendWhere("note_id=" + paramUri.getLastPathSegment());
    }
    for (;;)
    {
      this.l = ((DeeperApplication)getContext().getApplicationContext()).a();
      Cursor localCursor = localSQLiteQueryBuilder.query(this.l.getReadableDatabase(), paramArrayOfString1, paramString1, paramArrayOfString2, null, null, paramString2);
      localCursor.setNotificationUri(getContext().getContentResolver(), paramUri);
      return localCursor;
      localSQLiteQueryBuilder.appendWhere("note.note_id=note_location.note_id AND note.note_id=weather.note_id");
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.DeeperContentProvider
 * JD-Core Version:    0.7.0.1
 */