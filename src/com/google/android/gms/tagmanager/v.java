package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

class v
  implements DataLayer.c
{
  private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] { "datalayer", "ID", "key", "value", "expires" });
  private final Executor b;
  private final Context c;
  private v.a d;
  private ld e;
  private int f;
  
  public v(Context paramContext)
  {
    this(paramContext, lf.b(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
  }
  
  v(Context paramContext, ld paramld, String paramString, int paramInt, Executor paramExecutor)
  {
    this.c = paramContext;
    this.e = paramld;
    this.f = paramInt;
    this.b = paramExecutor;
    this.d = new v.a(this, this.c, paramString);
  }
  
  private SQLiteDatabase a(String paramString)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.d.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      bh.b(paramString);
    }
    return null;
  }
  
  /* Error */
  private Object a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 94	java/io/ByteArrayInputStream
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 97	java/io/ByteArrayInputStream:<init>	([B)V
    //   8: astore_2
    //   9: new 99	java/io/ObjectInputStream
    //   12: dup
    //   13: aload_2
    //   14: invokespecial 102	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   17: astore_3
    //   18: aload_3
    //   19: invokevirtual 106	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   22: astore 10
    //   24: aload_3
    //   25: ifnull +7 -> 32
    //   28: aload_3
    //   29: invokevirtual 109	java/io/ObjectInputStream:close	()V
    //   32: aload_2
    //   33: invokevirtual 110	java/io/ByteArrayInputStream:close	()V
    //   36: aload 10
    //   38: areturn
    //   39: astore 14
    //   41: aconst_null
    //   42: astore_3
    //   43: aload_3
    //   44: ifnull +7 -> 51
    //   47: aload_3
    //   48: invokevirtual 109	java/io/ObjectInputStream:close	()V
    //   51: aload_2
    //   52: invokevirtual 110	java/io/ByteArrayInputStream:close	()V
    //   55: aconst_null
    //   56: areturn
    //   57: astore 5
    //   59: aconst_null
    //   60: areturn
    //   61: astore 13
    //   63: aconst_null
    //   64: astore_3
    //   65: aload_3
    //   66: ifnull +7 -> 73
    //   69: aload_3
    //   70: invokevirtual 109	java/io/ObjectInputStream:close	()V
    //   73: aload_2
    //   74: invokevirtual 110	java/io/ByteArrayInputStream:close	()V
    //   77: aconst_null
    //   78: areturn
    //   79: astore 7
    //   81: aconst_null
    //   82: areturn
    //   83: astore 12
    //   85: aconst_null
    //   86: astore_3
    //   87: aload 12
    //   89: astore 8
    //   91: aload_3
    //   92: ifnull +7 -> 99
    //   95: aload_3
    //   96: invokevirtual 109	java/io/ObjectInputStream:close	()V
    //   99: aload_2
    //   100: invokevirtual 110	java/io/ByteArrayInputStream:close	()V
    //   103: aload 8
    //   105: athrow
    //   106: astore 9
    //   108: goto -5 -> 103
    //   111: astore 8
    //   113: goto -22 -> 91
    //   116: astore 6
    //   118: goto -53 -> 65
    //   121: astore 4
    //   123: goto -80 -> 43
    //   126: astore 11
    //   128: aload 10
    //   130: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	131	0	this	v
    //   0	131	1	paramArrayOfByte	byte[]
    //   8	92	2	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   17	79	3	localObjectInputStream	java.io.ObjectInputStream
    //   121	1	4	localIOException1	java.io.IOException
    //   57	1	5	localIOException2	java.io.IOException
    //   116	1	6	localClassNotFoundException1	java.lang.ClassNotFoundException
    //   79	1	7	localIOException3	java.io.IOException
    //   89	15	8	localObject1	Object
    //   111	1	8	localObject2	Object
    //   106	1	9	localIOException4	java.io.IOException
    //   22	107	10	localObject3	Object
    //   126	1	11	localIOException5	java.io.IOException
    //   83	5	12	localObject4	Object
    //   61	1	13	localClassNotFoundException2	java.lang.ClassNotFoundException
    //   39	1	14	localIOException6	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   9	18	39	java/io/IOException
    //   47	51	57	java/io/IOException
    //   51	55	57	java/io/IOException
    //   9	18	61	java/lang/ClassNotFoundException
    //   69	73	79	java/io/IOException
    //   73	77	79	java/io/IOException
    //   9	18	83	finally
    //   95	99	106	java/io/IOException
    //   99	103	106	java/io/IOException
    //   18	24	111	finally
    //   18	24	116	java/lang/ClassNotFoundException
    //   18	24	121	java/io/IOException
    //   28	32	126	java/io/IOException
    //   32	36	126	java/io/IOException
  }
  
  private List<DataLayer.a> a(List<v.b> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      v.b localb = (v.b)localIterator.next();
      localArrayList.add(new DataLayer.a(localb.a, a(localb.b)));
    }
    return localArrayList;
  }
  
  private void a(int paramInt)
  {
    int i = paramInt + (d() - this.f);
    if (i > 0)
    {
      List localList = b(i);
      bh.c("DataLayer store full, deleting " + localList.size() + " entries to make room.");
      a((String[])localList.toArray(new String[0]));
    }
  }
  
  private void a(long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for deleteOlderThan.");
    if (localSQLiteDatabase == null) {
      return;
    }
    try
    {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = Long.toString(paramLong);
      int i = localSQLiteDatabase.delete("datalayer", "expires <= ?", arrayOfString);
      bh.d("Deleted " + i + " expired items");
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      bh.b("Error deleting old entries.");
    }
  }
  
  private void a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {}
    SQLiteDatabase localSQLiteDatabase;
    do
    {
      return;
      localSQLiteDatabase = a("Error opening database for deleteEntries.");
    } while (localSQLiteDatabase == null);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = "ID";
    arrayOfObject[1] = TextUtils.join(",", Collections.nCopies(paramArrayOfString.length, "?"));
    String str = String.format("%s in (%s)", arrayOfObject);
    try
    {
      localSQLiteDatabase.delete("datalayer", str, paramArrayOfString);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      bh.b("Error deleting entries " + Arrays.toString(paramArrayOfString));
    }
  }
  
  /* Error */
  private byte[] a(Object paramObject)
  {
    // Byte code:
    //   0: new 249	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 250	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_2
    //   8: new 252	java/io/ObjectOutputStream
    //   11: dup
    //   12: aload_2
    //   13: invokespecial 255	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   16: astore_3
    //   17: aload_3
    //   18: aload_1
    //   19: invokevirtual 259	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   22: aload_2
    //   23: invokevirtual 263	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   26: astore 8
    //   28: aload_3
    //   29: ifnull +7 -> 36
    //   32: aload_3
    //   33: invokevirtual 264	java/io/ObjectOutputStream:close	()V
    //   36: aload_2
    //   37: invokevirtual 265	java/io/ByteArrayOutputStream:close	()V
    //   40: aload 8
    //   42: areturn
    //   43: astore 11
    //   45: aconst_null
    //   46: astore_3
    //   47: aload_3
    //   48: ifnull +7 -> 55
    //   51: aload_3
    //   52: invokevirtual 264	java/io/ObjectOutputStream:close	()V
    //   55: aload_2
    //   56: invokevirtual 265	java/io/ByteArrayOutputStream:close	()V
    //   59: aconst_null
    //   60: areturn
    //   61: astore 5
    //   63: aconst_null
    //   64: areturn
    //   65: astore 10
    //   67: aconst_null
    //   68: astore_3
    //   69: aload 10
    //   71: astore 6
    //   73: aload_3
    //   74: ifnull +7 -> 81
    //   77: aload_3
    //   78: invokevirtual 264	java/io/ObjectOutputStream:close	()V
    //   81: aload_2
    //   82: invokevirtual 265	java/io/ByteArrayOutputStream:close	()V
    //   85: aload 6
    //   87: athrow
    //   88: astore 7
    //   90: goto -5 -> 85
    //   93: astore 6
    //   95: goto -22 -> 73
    //   98: astore 4
    //   100: goto -53 -> 47
    //   103: astore 9
    //   105: aload 8
    //   107: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	v
    //   0	108	1	paramObject	Object
    //   7	75	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   16	62	3	localObjectOutputStream	java.io.ObjectOutputStream
    //   98	1	4	localIOException1	java.io.IOException
    //   61	1	5	localIOException2	java.io.IOException
    //   71	15	6	localObject1	Object
    //   93	1	6	localObject2	Object
    //   88	1	7	localIOException3	java.io.IOException
    //   26	80	8	arrayOfByte	byte[]
    //   103	1	9	localIOException4	java.io.IOException
    //   65	5	10	localObject3	Object
    //   43	1	11	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   8	17	43	java/io/IOException
    //   51	55	61	java/io/IOException
    //   55	59	61	java/io/IOException
    //   8	17	65	finally
    //   77	81	88	java/io/IOException
    //   81	85	88	java/io/IOException
    //   17	28	93	finally
    //   17	28	98	java/io/IOException
    //   32	36	103	java/io/IOException
    //   36	40	103	java/io/IOException
  }
  
  private List<DataLayer.a> b()
  {
    try
    {
      a(this.e.a());
      List localList = a(c());
      return localList;
    }
    finally
    {
      e();
    }
  }
  
  /* Error */
  private List<String> b(int paramInt)
  {
    // Byte code:
    //   0: new 118	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 119	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: iload_1
    //   9: ifgt +11 -> 20
    //   12: ldc_w 281
    //   15: invokestatic 87	com/google/android/gms/tagmanager/bh:b	(Ljava/lang/String;)V
    //   18: aload_2
    //   19: areturn
    //   20: aload_0
    //   21: ldc_w 283
    //   24: invokespecial 194	com/google/android/gms/tagmanager/v:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore_3
    //   28: aload_3
    //   29: ifnonnull +5 -> 34
    //   32: aload_2
    //   33: areturn
    //   34: aload_3
    //   35: ldc 24
    //   37: iconst_1
    //   38: anewarray 34	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: ldc 26
    //   45: aastore
    //   46: aconst_null
    //   47: aconst_null
    //   48: aconst_null
    //   49: aconst_null
    //   50: ldc_w 285
    //   53: iconst_1
    //   54: anewarray 4	java/lang/Object
    //   57: dup
    //   58: iconst_0
    //   59: ldc 26
    //   61: aastore
    //   62: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   65: iload_1
    //   66: invokestatic 290	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   69: invokevirtual 294	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   72: astore 7
    //   74: aload 7
    //   76: astore 5
    //   78: aload 5
    //   80: invokeinterface 299 1 0
    //   85: ifeq +35 -> 120
    //   88: aload_2
    //   89: aload 5
    //   91: iconst_0
    //   92: invokeinterface 303 2 0
    //   97: invokestatic 306	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   100: invokeinterface 151 2 0
    //   105: pop
    //   106: aload 5
    //   108: invokeinterface 309 1 0
    //   113: istore 9
    //   115: iload 9
    //   117: ifne -29 -> 88
    //   120: aload 5
    //   122: ifnull +10 -> 132
    //   125: aload 5
    //   127: invokeinterface 310 1 0
    //   132: aload_2
    //   133: areturn
    //   134: astore 6
    //   136: aconst_null
    //   137: astore 5
    //   139: new 160	java/lang/StringBuilder
    //   142: dup
    //   143: invokespecial 161	java/lang/StringBuilder:<init>	()V
    //   146: ldc_w 312
    //   149: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload 6
    //   154: invokevirtual 315	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   157: invokevirtual 167	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 178	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 87	com/google/android/gms/tagmanager/bh:b	(Ljava/lang/String;)V
    //   166: aload 5
    //   168: ifnull -36 -> 132
    //   171: aload 5
    //   173: invokeinterface 310 1 0
    //   178: goto -46 -> 132
    //   181: astore 4
    //   183: aconst_null
    //   184: astore 5
    //   186: aload 5
    //   188: ifnull +10 -> 198
    //   191: aload 5
    //   193: invokeinterface 310 1 0
    //   198: aload 4
    //   200: athrow
    //   201: astore 4
    //   203: goto -17 -> 186
    //   206: astore 6
    //   208: goto -69 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	this	v
    //   0	211	1	paramInt	int
    //   7	126	2	localArrayList	ArrayList
    //   27	8	3	localSQLiteDatabase	SQLiteDatabase
    //   181	18	4	localObject1	Object
    //   201	1	4	localObject2	Object
    //   76	116	5	localCursor1	Cursor
    //   134	19	6	localSQLiteException1	SQLiteException
    //   206	1	6	localSQLiteException2	SQLiteException
    //   72	3	7	localCursor2	Cursor
    //   113	3	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   34	74	134	android/database/sqlite/SQLiteException
    //   34	74	181	finally
    //   78	88	201	finally
    //   88	115	201	finally
    //   139	166	201	finally
    //   78	88	206	android/database/sqlite/SQLiteException
    //   88	115	206	android/database/sqlite/SQLiteException
  }
  
  private List<v.b> b(List<DataLayer.a> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      DataLayer.a locala = (DataLayer.a)localIterator.next();
      localArrayList.add(new v.b(locala.a, a(locala.b)));
    }
    return localArrayList;
  }
  
  /* Error */
  private void b(List<v.b> paramList, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 64	com/google/android/gms/tagmanager/v:e	Lcom/google/android/gms/internal/ld;
    //   6: invokeinterface 271 1 0
    //   11: lstore 6
    //   13: aload_0
    //   14: lload 6
    //   16: invokespecial 273	com/google/android/gms/tagmanager/v:a	(J)V
    //   19: aload_0
    //   20: aload_1
    //   21: invokeinterface 170 1 0
    //   26: invokespecial 326	com/google/android/gms/tagmanager/v:a	(I)V
    //   29: aload_0
    //   30: aload_1
    //   31: lload 6
    //   33: lload_2
    //   34: ladd
    //   35: invokespecial 328	com/google/android/gms/tagmanager/v:c	(Ljava/util/List;J)V
    //   38: aload_0
    //   39: invokespecial 279	com/google/android/gms/tagmanager/v:e	()V
    //   42: aload_0
    //   43: monitorexit
    //   44: return
    //   45: astore 4
    //   47: aload_0
    //   48: invokespecial 279	com/google/android/gms/tagmanager/v:e	()V
    //   51: aload 4
    //   53: athrow
    //   54: astore 5
    //   56: aload_0
    //   57: monitorexit
    //   58: aload 5
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	v
    //   0	61	1	paramList	List<v.b>
    //   0	61	2	paramLong	long
    //   45	7	4	localObject1	Object
    //   54	5	5	localObject2	Object
    //   11	21	6	l	long
    // Exception table:
    //   from	to	target	type
    //   2	38	45	finally
    //   38	42	54	finally
    //   47	54	54	finally
  }
  
  private List<v.b> c()
  {
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for loadSerialized.");
    localArrayList = new ArrayList();
    if (localSQLiteDatabase == null) {
      return localArrayList;
    }
    Cursor localCursor = localSQLiteDatabase.query("datalayer", new String[] { "key", "value" }, null, null, null, null, "ID", null);
    try
    {
      if (localCursor.moveToNext()) {
        localArrayList.add(new v.b(localCursor.getString(0), localCursor.getBlob(1)));
      }
      return localArrayList;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  private void c(List<v.b> paramList, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for writeEntryToDatabase.");
    if (localSQLiteDatabase == null) {}
    for (;;)
    {
      return;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        v.b localb = (v.b)localIterator.next();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("expires", Long.valueOf(paramLong));
        localContentValues.put("key", localb.a);
        localContentValues.put("value", localb.b);
        localSQLiteDatabase.insert("datalayer", null, localContentValues);
      }
    }
  }
  
  private int d()
  {
    Cursor localCursor = null;
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for getNumStoredEntries.");
    int i = 0;
    if (localSQLiteDatabase == null) {}
    for (;;)
    {
      return i;
      try
      {
        localCursor = localSQLiteDatabase.rawQuery("SELECT COUNT(*) from datalayer", null);
        boolean bool = localCursor.moveToFirst();
        i = 0;
        if (bool)
        {
          long l = localCursor.getLong(0);
          i = (int)l;
        }
        return i;
      }
      catch (SQLiteException localSQLiteException)
      {
        bh.b("Error getting numStoredEntries");
        i = 0;
        return 0;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
    }
  }
  
  private void e()
  {
    try
    {
      this.d.close();
      return;
    }
    catch (SQLiteException localSQLiteException) {}
  }
  
  public void a(DataLayer.c.a parama)
  {
    this.b.execute(new v.2(this, parama));
  }
  
  public void a(List<DataLayer.a> paramList, long paramLong)
  {
    List localList = b(paramList);
    this.b.execute(new v.1(this, localList, paramLong));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.v
 * JD-Core Version:    0.7.0.1
 */