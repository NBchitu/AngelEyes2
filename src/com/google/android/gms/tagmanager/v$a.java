package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

class v$a
  extends SQLiteOpenHelper
{
  v$a(v paramv, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  private void a(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
    HashSet localHashSet = new HashSet();
    try
    {
      String[] arrayOfString = localCursor.getColumnNames();
      for (int i = 0; i < arrayOfString.length; i++) {
        localHashSet.add(arrayOfString[i]);
      }
      localCursor.close();
      if ((!localHashSet.remove("key")) || (!localHashSet.remove("value")) || (!localHashSet.remove("ID")) || (!localHashSet.remove("expires"))) {
        throw new SQLiteException("Database column missing");
      }
    }
    finally
    {
      localCursor.close();
    }
    if (!localHashSet.isEmpty()) {
      throw new SQLiteException("Database has extra columns");
    }
  }
  
  /* Error */
  private boolean a(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_2
    //   3: ldc 69
    //   5: iconst_1
    //   6: anewarray 71	java/lang/String
    //   9: dup
    //   10: iconst_0
    //   11: ldc 73
    //   13: aastore
    //   14: ldc 75
    //   16: iconst_1
    //   17: anewarray 71	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: aload_1
    //   23: aastore
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 79	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore 8
    //   32: aload 8
    //   34: invokeinterface 82 1 0
    //   39: istore 10
    //   41: aload 8
    //   43: ifnull +10 -> 53
    //   46: aload 8
    //   48: invokeinterface 42 1 0
    //   53: iload 10
    //   55: ireturn
    //   56: astore 5
    //   58: aconst_null
    //   59: astore 6
    //   61: new 84	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 85	java/lang/StringBuilder:<init>	()V
    //   68: ldc 87
    //   70: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: aload_1
    //   74: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokestatic 100	com/google/android/gms/tagmanager/bh:b	(Ljava/lang/String;)V
    //   83: aload 6
    //   85: ifnull +10 -> 95
    //   88: aload 6
    //   90: invokeinterface 42 1 0
    //   95: iconst_0
    //   96: ireturn
    //   97: astore 4
    //   99: aload_3
    //   100: ifnull +9 -> 109
    //   103: aload_3
    //   104: invokeinterface 42 1 0
    //   109: aload 4
    //   111: athrow
    //   112: astore 4
    //   114: aload 8
    //   116: astore_3
    //   117: goto -18 -> 99
    //   120: astore 7
    //   122: aload 6
    //   124: astore_3
    //   125: aload 7
    //   127: astore 4
    //   129: goto -30 -> 99
    //   132: astore 9
    //   134: aload 8
    //   136: astore 6
    //   138: goto -77 -> 61
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	a
    //   0	141	1	paramString	String
    //   0	141	2	paramSQLiteDatabase	SQLiteDatabase
    //   1	124	3	localObject1	Object
    //   97	13	4	localObject2	Object
    //   112	1	4	localObject3	Object
    //   127	1	4	localObject4	Object
    //   56	1	5	localSQLiteException1	SQLiteException
    //   59	78	6	localCursor1	Cursor
    //   120	6	7	localObject5	Object
    //   30	105	8	localCursor2	Cursor
    //   132	1	9	localSQLiteException2	SQLiteException
    //   39	15	10	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	32	56	android/database/sqlite/SQLiteException
    //   2	32	97	finally
    //   32	41	112	finally
    //   61	83	120	finally
    //   32	41	132	android/database/sqlite/SQLiteException
  }
  
  public SQLiteDatabase getWritableDatabase()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = super.getWritableDatabase();
      localSQLiteDatabase1 = localSQLiteDatabase2;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        v.b(this.a).getDatabasePath("google_tagmanager.db").delete();
        SQLiteDatabase localSQLiteDatabase1 = null;
      }
    }
    if (localSQLiteDatabase1 == null) {
      localSQLiteDatabase1 = super.getWritableDatabase();
    }
    return localSQLiteDatabase1;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    ak.a(paramSQLiteDatabase.getPath());
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor;
    if (Build.VERSION.SDK_INT < 15) {
      localCursor = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    }
    try
    {
      localCursor.moveToFirst();
      localCursor.close();
      if (!a("datalayer", paramSQLiteDatabase))
      {
        paramSQLiteDatabase.execSQL(v.a());
        return;
      }
    }
    finally
    {
      localCursor.close();
    }
    a(paramSQLiteDatabase);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.v.a
 * JD-Core Version:    0.7.0.1
 */