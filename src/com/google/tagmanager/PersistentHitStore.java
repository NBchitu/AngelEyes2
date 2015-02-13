package com.google.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import org.apache.http.impl.client.DefaultHttpClient;

class PersistentHitStore
  implements HitStore
{
  private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[] { "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time" });
  private final PersistentHitStore.UrlDatabaseHelper b;
  private volatile Dispatcher c;
  private final HitStoreStateListener d;
  private final Context e;
  private final String f;
  private long g;
  private Clock h;
  
  PersistentHitStore(HitStoreStateListener paramHitStoreStateListener, Context paramContext)
  {
    this(paramHitStoreStateListener, paramContext, "gtm_urls.db");
  }
  
  PersistentHitStore(HitStoreStateListener paramHitStoreStateListener, Context paramContext, String paramString)
  {
    this.e = paramContext.getApplicationContext();
    this.f = paramString;
    this.d = paramHitStoreStateListener;
    this.h = new PersistentHitStore.1(this);
    this.b = new PersistentHitStore.UrlDatabaseHelper(this, this.e, this.f);
    this.c = new SimpleNetworkDispatcher(new DefaultHttpClient(), this.e, new PersistentHitStore.StoreDispatchListener(this));
    this.g = 0L;
  }
  
  private SQLiteDatabase a(String paramString)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      Log.b(paramString);
    }
    return null;
  }
  
  private void a(long paramLong)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = String.valueOf(paramLong);
    a(arrayOfString);
  }
  
  private void a(long paramLong1, long paramLong2)
  {
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for getNumStoredHits.");
    if (localSQLiteDatabase == null) {
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("hit_first_send_time", Long.valueOf(paramLong2));
    try
    {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = String.valueOf(paramLong1);
      localSQLiteDatabase.update("gtm_hits", localContentValues, "hit_id=?", arrayOfString);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      Log.b("Error setting HIT_FIRST_DISPATCH_TIME for hitId: " + paramLong1);
      a(paramLong1);
    }
  }
  
  private void b(long paramLong, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for putHit");
    if (localSQLiteDatabase == null) {
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("hit_time", Long.valueOf(paramLong));
    localContentValues.put("hit_url", paramString);
    localContentValues.put("hit_first_send_time", Integer.valueOf(0));
    try
    {
      localSQLiteDatabase.insert("gtm_hits", null, localContentValues);
      this.d.a(false);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      Log.b("Error storing hit");
    }
  }
  
  private void f()
  {
    int i = 1 + (-2000 + c());
    if (i > 0)
    {
      List localList = a(i);
      Log.e("Store full, deleting " + localList.size() + " hits to make room.");
      a((String[])localList.toArray(new String[0]));
    }
  }
  
  /* Error */
  List<String> a(int paramInt)
  {
    // Byte code:
    //   0: new 216	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 217	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: iload_1
    //   9: ifgt +10 -> 19
    //   12: ldc 219
    //   14: invokestatic 105	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   17: aload_2
    //   18: areturn
    //   19: aload_0
    //   20: ldc 221
    //   22: invokespecial 119	com/google/tagmanager/PersistentHitStore:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   25: astore_3
    //   26: aload_3
    //   27: ifnonnull +5 -> 32
    //   30: aload_2
    //   31: areturn
    //   32: aload_3
    //   33: ldc 27
    //   35: iconst_1
    //   36: anewarray 37	java/lang/String
    //   39: dup
    //   40: iconst_0
    //   41: ldc 29
    //   43: aastore
    //   44: aconst_null
    //   45: aconst_null
    //   46: aconst_null
    //   47: aconst_null
    //   48: ldc 223
    //   50: iconst_1
    //   51: anewarray 4	java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: ldc 29
    //   58: aastore
    //   59: invokestatic 41	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   62: iload_1
    //   63: invokestatic 226	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   66: invokevirtual 230	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   69: astore 7
    //   71: aload 7
    //   73: astore 5
    //   75: aload 5
    //   77: invokeinterface 236 1 0
    //   82: ifeq +35 -> 117
    //   85: aload_2
    //   86: aload 5
    //   88: iconst_0
    //   89: invokeinterface 240 2 0
    //   94: invokestatic 111	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   97: invokeinterface 244 2 0
    //   102: pop
    //   103: aload 5
    //   105: invokeinterface 247 1 0
    //   110: istore 9
    //   112: iload 9
    //   114: ifne -29 -> 85
    //   117: aload 5
    //   119: ifnull +10 -> 129
    //   122: aload 5
    //   124: invokeinterface 250 1 0
    //   129: aload_2
    //   130: areturn
    //   131: astore 6
    //   133: aconst_null
    //   134: astore 5
    //   136: new 141	java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   143: ldc 252
    //   145: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload 6
    //   150: invokevirtual 255	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   153: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   159: invokestatic 105	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   162: aload 5
    //   164: ifnull -35 -> 129
    //   167: aload 5
    //   169: invokeinterface 250 1 0
    //   174: goto -45 -> 129
    //   177: astore 4
    //   179: aconst_null
    //   180: astore 5
    //   182: aload 5
    //   184: ifnull +10 -> 194
    //   187: aload 5
    //   189: invokeinterface 250 1 0
    //   194: aload 4
    //   196: athrow
    //   197: astore 4
    //   199: goto -17 -> 182
    //   202: astore 6
    //   204: goto -68 -> 136
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	this	PersistentHitStore
    //   0	207	1	paramInt	int
    //   7	123	2	localArrayList	java.util.ArrayList
    //   25	8	3	localSQLiteDatabase	SQLiteDatabase
    //   177	18	4	localObject1	Object
    //   197	1	4	localObject2	Object
    //   73	115	5	localCursor1	Cursor
    //   131	18	6	localSQLiteException1	SQLiteException
    //   202	1	6	localSQLiteException2	SQLiteException
    //   69	3	7	localCursor2	Cursor
    //   110	3	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   32	71	131	android/database/sqlite/SQLiteException
    //   32	71	177	finally
    //   75	85	197	finally
    //   85	112	197	finally
    //   136	162	197	finally
    //   75	85	202	android/database/sqlite/SQLiteException
    //   85	112	202	android/database/sqlite/SQLiteException
  }
  
  public void a()
  {
    Log.e("GTM Dispatch running...");
    if (!this.c.a()) {}
    do
    {
      return;
      List localList = b(40);
      if (localList.isEmpty())
      {
        Log.e("...nothing to dispatch");
        this.d.a(true);
        return;
      }
      this.c.a(localList);
    } while (d() <= 0);
    ServiceManagerImpl.b().d();
  }
  
  public void a(long paramLong, String paramString)
  {
    b();
    f();
    b(paramLong, paramString);
  }
  
  void a(String[] paramArrayOfString)
  {
    boolean bool = true;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {}
    SQLiteDatabase localSQLiteDatabase;
    do
    {
      return;
      localSQLiteDatabase = a("Error opening database for deleteHits.");
    } while (localSQLiteDatabase == null);
    Object[] arrayOfObject = new Object[bool];
    arrayOfObject[0] = TextUtils.join(",", Collections.nCopies(paramArrayOfString.length, "?"));
    String str = String.format("HIT_ID in (%s)", arrayOfObject);
    for (;;)
    {
      try
      {
        localSQLiteDatabase.delete("gtm_hits", str, paramArrayOfString);
        HitStoreStateListener localHitStoreStateListener = this.d;
        if (c() == 0)
        {
          localHitStoreStateListener.a(bool);
          return;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        Log.b("Error deleting hits");
        return;
      }
      bool = false;
    }
  }
  
  int b()
  {
    boolean bool = true;
    long l1 = this.h.a();
    if (l1 <= 86400000L + this.g) {}
    SQLiteDatabase localSQLiteDatabase;
    do
    {
      return 0;
      this.g = l1;
      localSQLiteDatabase = a("Error opening database for deleteStaleHits.");
    } while (localSQLiteDatabase == null);
    long l2 = this.h.a() - 2592000000L;
    String[] arrayOfString = new String[bool];
    arrayOfString[0] = Long.toString(l2);
    int i = localSQLiteDatabase.delete("gtm_hits", "HIT_TIME < ?", arrayOfString);
    HitStoreStateListener localHitStoreStateListener = this.d;
    if (c() == 0) {}
    for (;;)
    {
      localHitStoreStateListener.a(bool);
      return i;
      bool = false;
    }
  }
  
  /* Error */
  public List<Hit> b(int paramInt)
  {
    // Byte code:
    //   0: new 216	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 217	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: aload_0
    //   9: ldc_w 329
    //   12: invokespecial 119	com/google/tagmanager/PersistentHitStore:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   15: astore_3
    //   16: aload_3
    //   17: ifnonnull +9 -> 26
    //   20: aload_2
    //   21: astore 9
    //   23: aload 9
    //   25: areturn
    //   26: aconst_null
    //   27: astore 4
    //   29: aload_3
    //   30: ldc 27
    //   32: iconst_3
    //   33: anewarray 37	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: ldc 29
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: ldc 31
    //   45: aastore
    //   46: dup
    //   47: iconst_2
    //   48: ldc 35
    //   50: aastore
    //   51: aconst_null
    //   52: aconst_null
    //   53: aconst_null
    //   54: aconst_null
    //   55: ldc 223
    //   57: iconst_1
    //   58: anewarray 4	java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: ldc 29
    //   65: aastore
    //   66: invokestatic 41	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   69: iload_1
    //   70: invokestatic 226	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   73: invokevirtual 230	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   76: astore 10
    //   78: aload 10
    //   80: astore 11
    //   82: new 216	java/util/ArrayList
    //   85: dup
    //   86: invokespecial 217	java/util/ArrayList:<init>	()V
    //   89: astore 12
    //   91: aload 11
    //   93: invokeinterface 236 1 0
    //   98: ifeq +56 -> 154
    //   101: aload 12
    //   103: new 331	com/google/tagmanager/Hit
    //   106: dup
    //   107: aload 11
    //   109: iconst_0
    //   110: invokeinterface 240 2 0
    //   115: aload 11
    //   117: iconst_1
    //   118: invokeinterface 240 2 0
    //   123: aload 11
    //   125: iconst_2
    //   126: invokeinterface 240 2 0
    //   131: invokespecial 334	com/google/tagmanager/Hit:<init>	(JJJ)V
    //   134: invokeinterface 244 2 0
    //   139: pop
    //   140: aload 11
    //   142: invokeinterface 247 1 0
    //   147: istore 15
    //   149: iload 15
    //   151: ifne -50 -> 101
    //   154: aload 11
    //   156: ifnull +10 -> 166
    //   159: aload 11
    //   161: invokeinterface 250 1 0
    //   166: aload_3
    //   167: ldc 27
    //   169: iconst_2
    //   170: anewarray 37	java/lang/String
    //   173: dup
    //   174: iconst_0
    //   175: ldc 29
    //   177: aastore
    //   178: dup
    //   179: iconst_1
    //   180: ldc 33
    //   182: aastore
    //   183: aconst_null
    //   184: aconst_null
    //   185: aconst_null
    //   186: aconst_null
    //   187: ldc 223
    //   189: iconst_1
    //   190: anewarray 4	java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: ldc 29
    //   197: aastore
    //   198: invokestatic 41	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   201: iload_1
    //   202: invokestatic 226	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   205: invokevirtual 230	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   208: astore 24
    //   210: aload 24
    //   212: invokeinterface 236 1 0
    //   217: ifeq +63 -> 280
    //   220: iconst_0
    //   221: istore 25
    //   223: aload 24
    //   225: checkcast 336	android/database/sqlite/SQLiteCursor
    //   228: invokevirtual 340	android/database/sqlite/SQLiteCursor:getWindow	()Landroid/database/CursorWindow;
    //   231: invokevirtual 345	android/database/CursorWindow:getNumRows	()I
    //   234: ifle +131 -> 365
    //   237: aload 12
    //   239: iload 25
    //   241: invokeinterface 349 2 0
    //   246: checkcast 331	com/google/tagmanager/Hit
    //   249: aload 24
    //   251: iconst_1
    //   252: invokeinterface 352 2 0
    //   257: invokevirtual 354	com/google/tagmanager/Hit:a	(Ljava/lang/String;)V
    //   260: iload 25
    //   262: iconst_1
    //   263: iadd
    //   264: istore 27
    //   266: aload 24
    //   268: invokeinterface 247 1 0
    //   273: istore 28
    //   275: iload 28
    //   277: ifne +339 -> 616
    //   280: aload 24
    //   282: ifnull +10 -> 292
    //   285: aload 24
    //   287: invokeinterface 250 1 0
    //   292: aload 12
    //   294: areturn
    //   295: astore 6
    //   297: aload 6
    //   299: astore 7
    //   301: aconst_null
    //   302: astore 8
    //   304: aload_2
    //   305: astore 9
    //   307: new 141	java/lang/StringBuilder
    //   310: dup
    //   311: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   314: ldc 252
    //   316: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: aload 7
    //   321: invokevirtual 255	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   324: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   327: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   330: invokestatic 105	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   333: aload 8
    //   335: ifnull -312 -> 23
    //   338: aload 8
    //   340: invokeinterface 250 1 0
    //   345: aload 9
    //   347: areturn
    //   348: astore 5
    //   350: aload 4
    //   352: ifnull +10 -> 362
    //   355: aload 4
    //   357: invokeinterface 250 1 0
    //   362: aload 5
    //   364: athrow
    //   365: iconst_1
    //   366: anewarray 4	java/lang/Object
    //   369: astore 26
    //   371: aload 26
    //   373: iconst_0
    //   374: aload 12
    //   376: iload 25
    //   378: invokeinterface 349 2 0
    //   383: checkcast 331	com/google/tagmanager/Hit
    //   386: invokevirtual 355	com/google/tagmanager/Hit:a	()J
    //   389: invokestatic 127	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   392: aastore
    //   393: ldc_w 357
    //   396: aload 26
    //   398: invokestatic 41	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   401: invokestatic 105	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   404: goto -144 -> 260
    //   407: astore 16
    //   409: aload 24
    //   411: astore 11
    //   413: new 141	java/lang/StringBuilder
    //   416: dup
    //   417: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   420: ldc_w 359
    //   423: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: aload 16
    //   428: invokevirtual 255	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   431: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   434: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   437: invokestatic 105	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   440: new 216	java/util/ArrayList
    //   443: dup
    //   444: invokespecial 217	java/util/ArrayList:<init>	()V
    //   447: astore 18
    //   449: iconst_0
    //   450: istore 19
    //   452: aload 12
    //   454: invokeinterface 363 1 0
    //   459: astore 20
    //   461: aload 20
    //   463: invokeinterface 368 1 0
    //   468: ifeq +35 -> 503
    //   471: aload 20
    //   473: invokeinterface 372 1 0
    //   478: checkcast 331	com/google/tagmanager/Hit
    //   481: astore 21
    //   483: aload 21
    //   485: invokevirtual 374	com/google/tagmanager/Hit:c	()Ljava/lang/String;
    //   488: invokestatic 377	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   491: istore 22
    //   493: iload 22
    //   495: ifeq +26 -> 521
    //   498: iload 19
    //   500: ifeq +18 -> 518
    //   503: aload 11
    //   505: ifnull +10 -> 515
    //   508: aload 11
    //   510: invokeinterface 250 1 0
    //   515: aload 18
    //   517: areturn
    //   518: iconst_1
    //   519: istore 19
    //   521: aload 18
    //   523: aload 21
    //   525: invokeinterface 244 2 0
    //   530: pop
    //   531: goto -70 -> 461
    //   534: astore 17
    //   536: aload 11
    //   538: ifnull +10 -> 548
    //   541: aload 11
    //   543: invokeinterface 250 1 0
    //   548: aload 17
    //   550: athrow
    //   551: astore 17
    //   553: aload 24
    //   555: astore 11
    //   557: goto -21 -> 536
    //   560: astore 16
    //   562: goto -149 -> 413
    //   565: astore 5
    //   567: aload 11
    //   569: astore 4
    //   571: goto -221 -> 350
    //   574: astore 5
    //   576: aload 8
    //   578: astore 4
    //   580: goto -230 -> 350
    //   583: astore 29
    //   585: aload 29
    //   587: astore 7
    //   589: aload 11
    //   591: astore 8
    //   593: aload_2
    //   594: astore 9
    //   596: goto -289 -> 307
    //   599: astore 13
    //   601: aload 13
    //   603: astore 7
    //   605: aload 11
    //   607: astore 8
    //   609: aload 12
    //   611: astore 9
    //   613: goto -306 -> 307
    //   616: iload 27
    //   618: istore 25
    //   620: goto -397 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	623	0	this	PersistentHitStore
    //   0	623	1	paramInt	int
    //   7	587	2	localArrayList1	java.util.ArrayList
    //   15	152	3	localSQLiteDatabase	SQLiteDatabase
    //   27	552	4	localObject1	Object
    //   348	15	5	localObject2	Object
    //   565	1	5	localObject3	Object
    //   574	1	5	localObject4	Object
    //   295	3	6	localSQLiteException1	SQLiteException
    //   299	305	7	localObject5	Object
    //   302	306	8	localObject6	Object
    //   21	591	9	localObject7	Object
    //   76	3	10	localCursor1	Cursor
    //   80	526	11	localObject8	Object
    //   89	521	12	localArrayList2	java.util.ArrayList
    //   599	3	13	localSQLiteException2	SQLiteException
    //   147	3	15	bool1	boolean
    //   407	20	16	localSQLiteException3	SQLiteException
    //   560	1	16	localSQLiteException4	SQLiteException
    //   534	15	17	localObject9	Object
    //   551	1	17	localObject10	Object
    //   447	75	18	localArrayList3	java.util.ArrayList
    //   450	70	19	i	int
    //   459	13	20	localIterator	java.util.Iterator
    //   481	43	21	localHit	Hit
    //   491	3	22	bool2	boolean
    //   208	346	24	localCursor2	Cursor
    //   221	398	25	j	int
    //   369	28	26	arrayOfObject	Object[]
    //   264	353	27	k	int
    //   273	3	28	bool3	boolean
    //   583	3	29	localSQLiteException5	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   29	78	295	android/database/sqlite/SQLiteException
    //   29	78	348	finally
    //   210	220	407	android/database/sqlite/SQLiteException
    //   223	260	407	android/database/sqlite/SQLiteException
    //   266	275	407	android/database/sqlite/SQLiteException
    //   365	404	407	android/database/sqlite/SQLiteException
    //   166	210	534	finally
    //   413	449	534	finally
    //   452	461	534	finally
    //   461	493	534	finally
    //   521	531	534	finally
    //   210	220	551	finally
    //   223	260	551	finally
    //   266	275	551	finally
    //   365	404	551	finally
    //   166	210	560	android/database/sqlite/SQLiteException
    //   82	91	565	finally
    //   91	101	565	finally
    //   101	149	565	finally
    //   307	333	574	finally
    //   82	91	583	android/database/sqlite/SQLiteException
    //   91	101	599	android/database/sqlite/SQLiteException
    //   101	149	599	android/database/sqlite/SQLiteException
  }
  
  int c()
  {
    Cursor localCursor = null;
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for getNumStoredHits.");
    int i = 0;
    if (localSQLiteDatabase == null) {}
    for (;;)
    {
      return i;
      try
      {
        localCursor = localSQLiteDatabase.rawQuery("SELECT COUNT(*) from gtm_hits", null);
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
        Log.b("Error getting numStoredHits");
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
  
  /* Error */
  int d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: ldc 117
    //   5: invokespecial 119	com/google/tagmanager/PersistentHitStore:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +5 -> 15
    //   13: iconst_0
    //   14: ireturn
    //   15: aload_2
    //   16: ldc 27
    //   18: iconst_2
    //   19: anewarray 37	java/lang/String
    //   22: dup
    //   23: iconst_0
    //   24: ldc 29
    //   26: aastore
    //   27: dup
    //   28: iconst_1
    //   29: ldc 35
    //   31: aastore
    //   32: ldc_w 387
    //   35: aconst_null
    //   36: aconst_null
    //   37: aconst_null
    //   38: aconst_null
    //   39: invokevirtual 390	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   42: astore 8
    //   44: aload 8
    //   46: invokeinterface 393 1 0
    //   51: istore 10
    //   53: iload 10
    //   55: istore 7
    //   57: aload 8
    //   59: ifnull +10 -> 69
    //   62: aload 8
    //   64: invokeinterface 250 1 0
    //   69: iload 7
    //   71: ireturn
    //   72: astore 4
    //   74: aconst_null
    //   75: astore 5
    //   77: ldc_w 395
    //   80: invokestatic 105	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   83: aload 5
    //   85: ifnull +56 -> 141
    //   88: aload 5
    //   90: invokeinterface 250 1 0
    //   95: iconst_0
    //   96: istore 7
    //   98: goto -29 -> 69
    //   101: astore_3
    //   102: aload_1
    //   103: ifnull +9 -> 112
    //   106: aload_1
    //   107: invokeinterface 250 1 0
    //   112: aload_3
    //   113: athrow
    //   114: astore_3
    //   115: aload 8
    //   117: astore_1
    //   118: goto -16 -> 102
    //   121: astore 6
    //   123: aload 5
    //   125: astore_1
    //   126: aload 6
    //   128: astore_3
    //   129: goto -27 -> 102
    //   132: astore 9
    //   134: aload 8
    //   136: astore 5
    //   138: goto -61 -> 77
    //   141: iconst_0
    //   142: istore 7
    //   144: goto -75 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	PersistentHitStore
    //   1	125	1	localObject1	Object
    //   8	8	2	localSQLiteDatabase	SQLiteDatabase
    //   101	12	3	localObject2	Object
    //   114	1	3	localObject3	Object
    //   128	1	3	localObject4	Object
    //   72	1	4	localSQLiteException1	SQLiteException
    //   75	62	5	localCursor1	Cursor
    //   121	6	6	localObject5	Object
    //   55	88	7	i	int
    //   42	93	8	localCursor2	Cursor
    //   132	1	9	localSQLiteException2	SQLiteException
    //   51	3	10	j	int
    // Exception table:
    //   from	to	target	type
    //   15	44	72	android/database/sqlite/SQLiteException
    //   15	44	101	finally
    //   44	53	114	finally
    //   77	83	121	finally
    //   44	53	132	android/database/sqlite/SQLiteException
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.PersistentHitStore
 * JD-Core Version:    0.7.0.1
 */