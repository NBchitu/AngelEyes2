package com.google.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

class PersistentHitStore$UrlDatabaseHelper
  extends SQLiteOpenHelper
{
  private boolean b;
  private long c = 0L;
  
  PersistentHitStore$UrlDatabaseHelper(PersistentHitStore paramPersistentHitStore, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  private void a(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = paramSQLiteDatabase.rawQuery("SELECT * FROM gtm_hits WHERE 0", null);
    HashSet localHashSet = new HashSet();
    try
    {
      String[] arrayOfString = localCursor.getColumnNames();
      for (int i = 0; i < arrayOfString.length; i++) {
        localHashSet.add(arrayOfString[i]);
      }
      localCursor.close();
      if ((!localHashSet.remove("hit_id")) || (!localHashSet.remove("hit_url")) || (!localHashSet.remove("hit_time")) || (!localHashSet.remove("hit_first_send_time"))) {
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
    //   3: ldc 75
    //   5: iconst_1
    //   6: anewarray 77	java/lang/String
    //   9: dup
    //   10: iconst_0
    //   11: ldc 79
    //   13: aastore
    //   14: ldc 81
    //   16: iconst_1
    //   17: anewarray 77	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: aload_1
    //   23: aastore
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 85	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore 8
    //   32: aload 8
    //   34: invokeinterface 88 1 0
    //   39: istore 10
    //   41: aload 8
    //   43: ifnull +10 -> 53
    //   46: aload 8
    //   48: invokeinterface 48 1 0
    //   53: iload 10
    //   55: ireturn
    //   56: astore 5
    //   58: aconst_null
    //   59: astore 6
    //   61: new 90	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   68: ldc 93
    //   70: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: aload_1
    //   74: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 101	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokestatic 105	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   83: aload 6
    //   85: ifnull +10 -> 95
    //   88: aload 6
    //   90: invokeinterface 48 1 0
    //   95: iconst_0
    //   96: ireturn
    //   97: astore 4
    //   99: aload_3
    //   100: ifnull +9 -> 109
    //   103: aload_3
    //   104: invokeinterface 48 1 0
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
    //   0	141	0	this	UrlDatabaseHelper
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
    if ((this.b) && (3600000L + this.c > PersistentHitStore.a(this.a).a())) {
      throw new SQLiteException("Database creation failed");
    }
    this.b = true;
    this.c = PersistentHitStore.a(this.a).a();
    try
    {
      SQLiteDatabase localSQLiteDatabase2 = super.getWritableDatabase();
      localSQLiteDatabase1 = localSQLiteDatabase2;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        PersistentHitStore.c(this.a).getDatabasePath(PersistentHitStore.b(this.a)).delete();
        SQLiteDatabase localSQLiteDatabase1 = null;
      }
    }
    if (localSQLiteDatabase1 == null) {
      localSQLiteDatabase1 = super.getWritableDatabase();
    }
    this.b = false;
    return localSQLiteDatabase1;
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    FutureApis.a(paramSQLiteDatabase.getPath());
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
      if (!a("gtm_hits", paramSQLiteDatabase))
      {
        paramSQLiteDatabase.execSQL(PersistentHitStore.e());
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
 * Qualified Name:     com.google.tagmanager.PersistentHitStore.UrlDatabaseHelper
 * JD-Core Version:    0.7.0.1
 */