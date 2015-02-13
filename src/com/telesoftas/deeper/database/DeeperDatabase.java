package com.telesoftas.deeper.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.Location;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class DeeperDatabase
  extends SQLiteOpenHelper
{
  private static final SparseIntArray a = new SparseIntArray(11);
  private static final SparseIntArray b;
  
  static
  {
    a.put(2130837586, 2130837619);
    a.put(2130837601, 2130837647);
    a.put(2130837603, 2130837648);
    a.put(2130837606, 2130837649);
    a.put(2130837646, 2130837691);
    a.put(2130837647, 2130837692);
    a.put(2130837652, 2130837697);
    a.put(2130837653, 2130837698);
    a.put(2130837658, 2130837701);
    a.put(2130837659, 2130837702);
    a.put(2130837660, 2130837703);
    b = new SparseIntArray(31);
    b.put(2130837691, 2130837730);
    b.put(2130837692, 2130837731);
    b.put(2130837693, 2130837732);
    b.put(2130837694, 2130837733);
    b.put(2130837695, 2130837734);
    b.put(2130837696, 2130837735);
    b.put(2130837697, 2130837736);
    b.put(2130837698, 2130837737);
    b.put(2130837699, 2130837738);
    b.put(2130837700, 2130837739);
    b.put(2130837701, 2130837740);
    b.put(2130837702, 2130837741);
    b.put(2130837703, 2130837742);
    b.put(2130837704, 2130837743);
    b.put(2130837705, 2130837744);
    b.put(2130837706, 2130837745);
    b.put(2130837707, 2130837746);
    b.put(2130837708, 2130837747);
    b.put(2130837709, 2130837748);
    b.put(2130837710, 2130837749);
    b.put(2130837711, 2130837750);
    b.put(2130837712, 2130837751);
    b.put(2130837713, 2130837752);
    b.put(2130837714, 2130837753);
    b.put(2130837715, 2130837754);
    b.put(2130837716, 2130837755);
    b.put(2130837717, 2130837756);
    b.put(2130837718, 2130837757);
    b.put(2130837719, 2130837758);
    b.put(2130837720, 2130837759);
    b.put(2130837721, 2130837760);
  }
  
  public DeeperDatabase(Context paramContext)
  {
    super(paramContext, "deeper_db.sqlite", null, 1);
  }
  
  public static int a(int paramInt)
  {
    return a.get(paramInt, 0);
  }
  
  private int a(int paramInt, NoteData paramNoteData)
  {
    long l = paramNoteData.b().getTimeInMillis();
    String str1 = paramNoteData.a();
    String str2 = paramNoteData.c();
    ContentValues localContentValues = new ContentValues();
    if (paramInt != -1) {
      localContentValues.put("note_id", Integer.valueOf(paramInt));
    }
    localContentValues.put("date", Long.valueOf(l));
    localContentValues.put("body", str1);
    localContentValues.put("title", str2);
    return (int)getWritableDatabase().replace("note", null, localContentValues);
  }
  
  private WeatherData a(int paramInt, boolean paramBoolean)
  {
    Cursor localCursor = getReadableDatabase().query("weather", null, "note_id=" + paramInt, null, null, null, null);
    int i;
    float f1;
    float f2;
    GregorianCalendar localGregorianCalendar;
    float f3;
    float f4;
    float f5;
    float f6;
    float f7;
    int j;
    float f8;
    if (localCursor.moveToFirst())
    {
      i = localCursor.getInt(localCursor.getColumnIndex("cloud_condition_type"));
      if (!paramBoolean) {
        i = a(i);
      }
      f1 = localCursor.getFloat(localCursor.getColumnIndex("current_temp_c"));
      f2 = localCursor.getFloat(localCursor.getColumnIndex("current_temp_f"));
      localGregorianCalendar = new GregorianCalendar();
      localGregorianCalendar.setTimeInMillis(localCursor.getLong(localCursor.getColumnIndex("date")));
      f3 = localCursor.getFloat(localCursor.getColumnIndex("high_temp_c"));
      f4 = localCursor.getFloat(localCursor.getColumnIndex("high_temp_f"));
      f5 = localCursor.getFloat(localCursor.getColumnIndex("humidity"));
      f6 = localCursor.getFloat(localCursor.getColumnIndex("low_temp_c"));
      f7 = localCursor.getFloat(localCursor.getColumnIndex("low_temp_f"));
      j = localCursor.getInt(localCursor.getColumnIndex("moon_phase_type"));
      if (!paramBoolean) {
        j = b(j);
      }
      localGregorianCalendar.setTimeInMillis(localCursor.getLong(localCursor.getColumnIndex("moon_rise")));
      localGregorianCalendar.setTimeInMillis(localCursor.getLong(localCursor.getColumnIndex("moon_set")));
      f8 = localCursor.getFloat(localCursor.getColumnIndex("pressure"));
      localGregorianCalendar.setTimeInMillis(localCursor.getLong(localCursor.getColumnIndex("sun_rise")));
      localGregorianCalendar.setTimeInMillis(localCursor.getLong(localCursor.getColumnIndex("sun_set")));
    }
    for (WeatherData localWeatherData = new WeatherData(i, f1, f2, localGregorianCalendar, f3, f4, f5, f6, f7, j, localGregorianCalendar, localGregorianCalendar, f8, localGregorianCalendar, localGregorianCalendar, localCursor.getInt(localCursor.getColumnIndex("wind_direction_type")), localCursor.getFloat(localCursor.getColumnIndex("wind_speed")));; localWeatherData = null)
    {
      localCursor.close();
      return localWeatherData;
    }
  }
  
  private void a(int paramInt, LocationData paramLocationData)
  {
    String str = paramLocationData.b();
    double d1 = paramLocationData.c();
    double d2 = paramLocationData.e();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("note_id", Integer.valueOf(paramInt));
    localContentValues.put("address", str);
    localContentValues.put("latitude", Double.valueOf(d1));
    localContentValues.put("longitude", Double.valueOf(d2));
    getWritableDatabase().replace("note_location", null, localContentValues);
  }
  
  private void a(int paramInt, WeatherData paramWeatherData, boolean paramBoolean)
  {
    int i = paramWeatherData.a();
    if (!paramBoolean) {
      i = f(i);
    }
    float f1 = paramWeatherData.b();
    float f2 = paramWeatherData.c();
    GregorianCalendar localGregorianCalendar = paramWeatherData.d();
    float f3 = paramWeatherData.e();
    float f4 = paramWeatherData.f();
    float f5 = paramWeatherData.g();
    float f6 = paramWeatherData.h();
    float f7 = paramWeatherData.i();
    int j = paramWeatherData.j();
    if (!paramBoolean) {
      j = g(j);
    }
    Calendar localCalendar1 = paramWeatherData.k();
    Calendar localCalendar2 = paramWeatherData.l();
    float f8 = paramWeatherData.m();
    Calendar localCalendar3 = paramWeatherData.n();
    Calendar localCalendar4 = paramWeatherData.o();
    int k = paramWeatherData.p();
    float f9 = paramWeatherData.q();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("note_id", Integer.valueOf(paramInt));
    if (localGregorianCalendar != null) {
      localContentValues.put("date", Long.valueOf(localGregorianCalendar.getTimeInMillis()));
    }
    localContentValues.put("cloud_condition_type", Integer.valueOf(i));
    localContentValues.put("current_temp_c", Float.valueOf(f1));
    localContentValues.put("current_temp_f", Float.valueOf(f2));
    localContentValues.put("high_temp_c", Float.valueOf(f3));
    localContentValues.put("high_temp_f", Float.valueOf(f4));
    localContentValues.put("humidity", Float.valueOf(f5));
    localContentValues.put("low_temp_c", Float.valueOf(f6));
    localContentValues.put("low_temp_f", Float.valueOf(f7));
    localContentValues.put("moon_phase_type", Integer.valueOf(j));
    if (paramWeatherData.k() == null)
    {
      localContentValues.put("moon_rise", Integer.valueOf(0));
      if (paramWeatherData.l() != null) {
        break label408;
      }
      localContentValues.put("moon_set", Integer.valueOf(0));
    }
    for (;;)
    {
      localContentValues.put("pressure", Float.valueOf(f8));
      localContentValues.put("sun_rise", Long.valueOf(localCalendar3.getTimeInMillis()));
      localContentValues.put("sun_set", Long.valueOf(localCalendar4.getTimeInMillis()));
      localContentValues.put("wind_direction_type", Integer.valueOf(k));
      localContentValues.put("wind_speed", Float.valueOf(f9));
      getWritableDatabase().replace("weather", null, localContentValues);
      return;
      localContentValues.put("moon_rise", Long.valueOf(localCalendar1.getTimeInMillis()));
      break;
      label408:
      localContentValues.put("moon_set", Long.valueOf(localCalendar2.getTimeInMillis()));
    }
  }
  
  private void a(int paramInt, List<PhotoData> paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      String str = ((PhotoData)paramList.get(i)).a();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("note_id", Integer.valueOf(paramInt));
      localContentValues.put("file_url", str);
      getWritableDatabase().replace("photo", null, localContentValues);
    }
  }
  
  private boolean a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt)
  {
    Location localLocation1 = new Location("A");
    Location localLocation2 = new Location("B");
    localLocation1.setLatitude(paramDouble1);
    localLocation1.setLongitude(paramDouble2);
    localLocation2.setLatitude(paramDouble3);
    localLocation2.setLongitude(paramDouble4);
    boolean bool1 = localLocation1.distanceTo(localLocation2) < paramInt;
    boolean bool2 = false;
    if (bool1) {
      bool2 = true;
    }
    return bool2;
  }
  
  public static int b(int paramInt)
  {
    return b.get(paramInt, 0);
  }
  
  private static int f(int paramInt)
  {
    int i = a.indexOfValue(paramInt);
    if (i >= 0) {
      return a.keyAt(i);
    }
    return 0;
  }
  
  private static int g(int paramInt)
  {
    int i = b.indexOfValue(paramInt);
    if (i >= 0) {
      return b.keyAt(i);
    }
    return 0;
  }
  
  private LocationData h(int paramInt)
  {
    Cursor localCursor = getReadableDatabase().query("note_location", new String[] { "address", "latitude", "longitude" }, "note_id=" + paramInt, null, null, null, null);
    if (localCursor.moveToFirst()) {}
    for (LocationData localLocationData = new LocationData(null, localCursor.getString(0), localCursor.getDouble(1), -1, localCursor.getDouble(2));; localLocationData = null)
    {
      localCursor.close();
      close();
      return localLocationData;
    }
  }
  
  private void i(int paramInt)
  {
    getWritableDatabase().delete("weather", "note_id=" + paramInt, null);
  }
  
  private void j(int paramInt)
  {
    getWritableDatabase().delete("photo", "note_id=" + paramInt, null);
  }
  
  private void k(int paramInt)
  {
    getWritableDatabase().delete("note_location", "note_id=" + paramInt, null);
  }
  
  public LocationData a(LocationData paramLocationData, int paramInt1, int paramInt2)
  {
    if (paramInt2 == -1) {
      paramInt2 = paramLocationData.d();
    }
    double d1 = paramLocationData.c();
    double d2 = paramLocationData.e();
    Cursor localCursor = getReadableDatabase().query("location", null, null, null, null, null, null);
    Object localObject1;
    int i;
    double d3;
    double d4;
    if (localCursor.moveToFirst())
    {
      localObject1 = null;
      if (localCursor.isAfterLast()) {
        break label172;
      }
      i = localCursor.getInt(4);
      if (paramInt2 != i) {
        break label182;
      }
      d3 = localCursor.getDouble(3);
      d4 = localCursor.getDouble(5);
      if (!a(d1, d2, d3, d4, paramInt1)) {
        break label182;
      }
    }
    label172:
    label182:
    for (Object localObject2 = new LocationData(localCursor.getInt(0), localCursor.getString(1), localCursor.getString(2), d3, i, d4);; localObject2 = localObject1)
    {
      localCursor.moveToNext();
      localObject1 = localObject2;
      break;
      localObject1 = null;
      localCursor.close();
      return localObject1;
    }
  }
  
  public NoteEntry a(GregorianCalendar paramGregorianCalendar)
  {
    long l = paramGregorianCalendar.getTimeInMillis();
    Cursor localCursor = getReadableDatabase().query("note", new String[] { "note_id", "title", "body" }, "date=" + l, null, null, null, null);
    boolean bool = localCursor.moveToFirst();
    NoteEntry localNoteEntry = null;
    if (bool)
    {
      int i = localCursor.getInt(0);
      localNoteEntry = new NoteEntry(new NoteData(paramGregorianCalendar, localCursor.getString(1), localCursor.getString(2)), h(i), c(i), a(i, false));
    }
    localCursor.close();
    return localNoteEntry;
  }
  
  public ArrayList<NoteEntry> a()
  {
    Cursor localCursor = getReadableDatabase().query("note", new String[] { "note_id", "title", "body", "date" }, null, null, null, null, null);
    ArrayList localArrayList = new ArrayList();
    if (localCursor.moveToFirst()) {
      do
      {
        int i = localCursor.getInt(0);
        String str1 = localCursor.getString(1);
        String str2 = localCursor.getString(2);
        GregorianCalendar localGregorianCalendar = new GregorianCalendar();
        localGregorianCalendar.setTimeInMillis(localCursor.getLong(3));
        localArrayList.add(new NoteEntry(new NoteData(localGregorianCalendar, str1, str2), h(i), c(i), a(i, true)));
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    return localArrayList;
  }
  
  public void a(LocationData paramLocationData)
  {
    String str1 = paramLocationData.a();
    String str2 = paramLocationData.b();
    int i = paramLocationData.d();
    double d1 = paramLocationData.c();
    double d2 = paramLocationData.e();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("title", str1);
    localContentValues.put("address", str2);
    localContentValues.put("location_type", Integer.valueOf(i));
    localContentValues.put("latitude", Double.valueOf(d1));
    localContentValues.put("longitude", Double.valueOf(d2));
    getWritableDatabase().replace("location", null, localContentValues);
  }
  
  public void a(LocationData paramLocationData, int paramInt)
  {
    String str1 = paramLocationData.a();
    String str2 = paramLocationData.b();
    int i = paramLocationData.d();
    ContentValues localContentValues = new ContentValues();
    if (paramInt != -1)
    {
      localContentValues.put("title", str1);
      localContentValues.put("address", str2);
      localContentValues.put("location_type", Integer.valueOf(i));
      getWritableDatabase().update("location", localContentValues, "location_id=" + paramInt, null);
    }
  }
  
  public void a(NoteEntry paramNoteEntry, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    if (!paramBoolean1)
    {
      Cursor localCursor = getReadableDatabase().query("note", new String[] { "note_id" }, "date=" + paramNoteEntry.a().b().getTimeInMillis(), null, null, null, null);
      if (localCursor.moveToFirst())
      {
        i = localCursor.getInt(0);
        localCursor.close();
      }
    }
    for (;;)
    {
      int j = a(i, paramNoteEntry.a());
      a(j, paramNoteEntry.b());
      a(j, paramNoteEntry.c());
      a(j, paramNoteEntry.d(), paramBoolean2);
      return;
      i = -1;
      break;
      i = -1;
    }
  }
  
  public void a(String paramString)
  {
    getWritableDatabase().delete("photo", "file_url='" + paramString + "'", null);
  }
  
  public NoteEntry b()
  {
    Cursor localCursor1 = getReadableDatabase().rawQuery("select max(date) from note", null);
    localCursor1.moveToFirst();
    long l1 = localCursor1.getLong(0);
    localCursor1.close();
    Cursor localCursor2 = getReadableDatabase().query("note", new String[] { "note_id", "title", "body", "date" }, "date=" + l1, null, null, null, null);
    boolean bool = localCursor2.moveToFirst();
    NoteEntry localNoteEntry = null;
    if (bool)
    {
      int i = localCursor2.getInt(0);
      String str1 = localCursor2.getString(1);
      String str2 = localCursor2.getString(2);
      long l2 = localCursor2.getLong(3);
      GregorianCalendar localGregorianCalendar = new GregorianCalendar();
      localGregorianCalendar.setTimeInMillis(l2);
      localNoteEntry = new NoteEntry(new NoteData(localGregorianCalendar, str1, str2), h(i), c(i), a(i, false));
    }
    localCursor2.close();
    return localNoteEntry;
  }
  
  public ArrayList<Integer> b(GregorianCalendar paramGregorianCalendar)
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = getReadableDatabase().query("note", new String[] { "date" }, null, null, null, null, null);
    if (localCursor.moveToFirst()) {
      while (!localCursor.isAfterLast())
      {
        long l = localCursor.getLong(0);
        GregorianCalendar localGregorianCalendar = new GregorianCalendar();
        localGregorianCalendar.setTimeInMillis(l);
        if ((localGregorianCalendar.get(1) == paramGregorianCalendar.get(1)) && (localGregorianCalendar.get(2) == paramGregorianCalendar.get(2))) {
          localArrayList.add(Integer.valueOf(localGregorianCalendar.get(5)));
        }
        localCursor.moveToNext();
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  public ArrayList<LocationData> c()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = getReadableDatabase().query("location", null, null, null, null, null, null);
    if (localCursor.moveToFirst()) {
      while (!localCursor.isAfterLast())
      {
        int i = localCursor.getInt(4);
        double d1 = localCursor.getDouble(3);
        double d2 = localCursor.getDouble(5);
        String str1 = localCursor.getString(1);
        String str2 = localCursor.getString(2);
        localArrayList.add(new LocationData(localCursor.getInt(0), str1, str2, d1, i, d2));
        localCursor.moveToNext();
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  public List<PhotoData> c(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = getReadableDatabase().query("photo", new String[] { "file_url" }, "note_id=" + paramInt, null, null, null, null);
    if (localCursor.moveToFirst()) {
      while (!localCursor.isAfterLast())
      {
        localArrayList.add(new PhotoData(localCursor.getString(localCursor.getColumnIndex("file_url"))));
        localCursor.moveToNext();
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  public void c(GregorianCalendar paramGregorianCalendar)
  {
    Cursor localCursor = getReadableDatabase().query("note", new String[] { "note_id", "date" }, null, null, null, null, null);
    if (localCursor.moveToFirst()) {
      while (!localCursor.isAfterLast())
      {
        int i = localCursor.getInt(0);
        if (localCursor.getLong(1) == paramGregorianCalendar.getTimeInMillis())
        {
          getWritableDatabase().delete("note", "note_id=" + i, null);
          k(i);
          i(i);
          j(i);
          localCursor.moveToLast();
        }
        localCursor.moveToNext();
      }
    }
    localCursor.close();
  }
  
  public ArrayList<LocationData> d(int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = getReadableDatabase().query("location", null, null, null, null, null, null);
    if (localCursor.moveToFirst()) {
      while (!localCursor.isAfterLast())
      {
        int i = localCursor.getInt(4);
        if (paramInt == i) {
          localArrayList.add(new LocationData(localCursor.getInt(0), localCursor.getString(1), localCursor.getString(2), localCursor.getDouble(3), i, localCursor.getDouble(5)));
        }
        localCursor.moveToNext();
      }
    }
    localCursor.close();
    return localArrayList;
  }
  
  public void e(int paramInt)
  {
    getWritableDatabase().delete("location", "location_id=" + paramInt, null);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase.execSQL("CREATE TABLE note (note_id INTEGER PRIMARY KEY AUTOINCREMENT, body TEXT, date LONG, title TEXT);");
    paramSQLiteDatabase.execSQL("CREATE TABLE photo (photo_id INTEGER PRIMARY KEY AUTOINCREMENT, note_id INTEGER , file_url TEXT);");
    paramSQLiteDatabase.execSQL("CREATE TABLE note_location (note_id INTEGER PRIMARY KEY, address TEXT, latitude DOUBLE, longitude DOUBLE);");
    paramSQLiteDatabase.execSQL("CREATE TABLE weather (note_id INTEGER PRIMARY KEY, cloud_condition_type INTEGER, current_temp_c FLOAT, current_temp_f FLOAT, date DATE, high_temp_c FLOAT, high_temp_f FLOAT, humidity FLOAT, low_temp_c FLOAT, low_temp_f FLOAT, moon_phase_type INTEGER, moon_rise LONG, moon_set LONG, pressure FLAOT, sun_rise LONG, sun_set LONG, wind_direction_type INTEGER, wind_speed FLOAT);");
    paramSQLiteDatabase.execSQL("CREATE TABLE location (location_id INTEGER PRIMARY KEY, title TEXT, address TEXT, latitude DOUBLE, location_type INTEGER, longitude DOUBLE);");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.database.DeeperDatabase
 * JD-Core Version:    0.7.0.1
 */