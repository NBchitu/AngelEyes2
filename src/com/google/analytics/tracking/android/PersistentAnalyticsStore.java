package com.google.analytics.tracking.android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.impl.client.DefaultHttpClient;

class PersistentAnalyticsStore
  implements AnalyticsStore
{
  private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] { "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id" });
  private final PersistentAnalyticsStore.AnalyticsDatabaseHelper b;
  private volatile Dispatcher c;
  private final AnalyticsStoreStateListener d;
  private final Context e;
  private final String f;
  private long g;
  private Clock h;
  
  PersistentAnalyticsStore(AnalyticsStoreStateListener paramAnalyticsStoreStateListener, Context paramContext)
  {
    this(paramAnalyticsStoreStateListener, paramContext, "google_analytics_v2.db");
  }
  
  PersistentAnalyticsStore(AnalyticsStoreStateListener paramAnalyticsStoreStateListener, Context paramContext, String paramString)
  {
    this.e = paramContext.getApplicationContext();
    this.f = paramString;
    this.d = paramAnalyticsStoreStateListener;
    this.h = new PersistentAnalyticsStore.1(this);
    this.b = new PersistentAnalyticsStore.AnalyticsDatabaseHelper(this, this.e, this.f);
    this.c = new SimpleNetworkDispatcher(new DefaultHttpClient(), this.e);
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
      Log.d(paramString);
    }
    return null;
  }
  
  static String a(Map<String, String> paramMap)
  {
    ArrayList localArrayList = new ArrayList(paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localArrayList.add(HitBuilder.a((String)localEntry.getKey()) + "=" + HitBuilder.a((String)localEntry.getValue()));
    }
    return TextUtils.join("&", localArrayList);
  }
  
  private void a(Map<String, String> paramMap, long paramLong, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for putHit");
    if (localSQLiteDatabase == null) {
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("hit_string", a(paramMap));
    localContentValues.put("hit_time", Long.valueOf(paramLong));
    if (paramMap.containsKey("AppUID")) {}
    for (;;)
    {
      try
      {
        long l2 = Long.parseLong((String)paramMap.get("AppUID"));
        l1 = l2;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        l1 = 0L;
        continue;
        localContentValues.put("hit_url", paramString);
        try
        {
          localSQLiteDatabase.insert("hits2", null, localContentValues);
          this.d.a(false);
          return;
        }
        catch (SQLiteException localSQLiteException)
        {
          Log.d("Error storing hit");
          return;
        }
      }
      localContentValues.put("hit_app_id", Long.valueOf(l1));
      if (paramString == null) {
        paramString = "http://www.google-analytics.com/collect";
      }
      if (paramString.length() == 0)
      {
        Log.d("Empty path: not sending hit");
        return;
      }
      long l1 = 0L;
    }
  }
  
  private void a(Map<String, String> paramMap, Collection<Command> paramCollection)
  {
    String str = "&_v".substring(1);
    if (paramCollection != null)
    {
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        Command localCommand = (Command)localIterator.next();
        if ("appendVersion".equals(localCommand.a())) {
          paramMap.put(str, localCommand.b());
        }
      }
    }
  }
  
  private void f()
  {
    int i = 1 + (-2000 + d());
    if (i > 0)
    {
      List localList = a(i);
      Log.c("Store full, deleting " + localList.size() + " hits to make room.");
      a((String[])localList.toArray(new String[0]));
    }
  }
  
  /* Error */
  List<String> a(int paramInt)
  {
    // Byte code:
    //   0: new 108	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 286	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: iload_1
    //   9: ifgt +11 -> 20
    //   12: ldc_w 288
    //   15: invokestatic 104	com/google/analytics/tracking/android/Log:d	(Ljava/lang/String;)V
    //   18: aload_2
    //   19: areturn
    //   20: aload_0
    //   21: ldc_w 290
    //   24: invokespecial 184	com/google/analytics/tracking/android/PersistentAnalyticsStore:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore_3
    //   28: aload_3
    //   29: ifnonnull +5 -> 34
    //   32: aload_2
    //   33: areturn
    //   34: aload_3
    //   35: ldc 27
    //   37: iconst_1
    //   38: anewarray 39	java/lang/String
    //   41: dup
    //   42: iconst_0
    //   43: ldc 29
    //   45: aastore
    //   46: aconst_null
    //   47: aconst_null
    //   48: aconst_null
    //   49: aconst_null
    //   50: ldc_w 292
    //   53: iconst_1
    //   54: anewarray 4	java/lang/Object
    //   57: dup
    //   58: iconst_0
    //   59: ldc 29
    //   61: aastore
    //   62: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   65: iload_1
    //   66: invokestatic 296	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   69: invokevirtual 300	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   72: astore 7
    //   74: aload 7
    //   76: astore 5
    //   78: aload 5
    //   80: invokeinterface 305 1 0
    //   85: ifeq +35 -> 120
    //   88: aload_2
    //   89: aload 5
    //   91: iconst_0
    //   92: invokeinterface 309 2 0
    //   97: invokestatic 312	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   100: invokeinterface 169 2 0
    //   105: pop
    //   106: aload 5
    //   108: invokeinterface 315 1 0
    //   113: istore 9
    //   115: iload 9
    //   117: ifne -29 -> 88
    //   120: aload 5
    //   122: ifnull +10 -> 132
    //   125: aload 5
    //   127: invokeinterface 318 1 0
    //   132: aload_2
    //   133: areturn
    //   134: astore 6
    //   136: aconst_null
    //   137: astore 5
    //   139: new 141	java/lang/StringBuilder
    //   142: dup
    //   143: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   146: ldc_w 320
    //   149: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: aload 6
    //   154: invokevirtual 323	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   157: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 104	com/google/analytics/tracking/android/Log:d	(Ljava/lang/String;)V
    //   166: aload 5
    //   168: ifnull -36 -> 132
    //   171: aload 5
    //   173: invokeinterface 318 1 0
    //   178: goto -46 -> 132
    //   181: astore 4
    //   183: aconst_null
    //   184: astore 5
    //   186: aload 5
    //   188: ifnull +10 -> 198
    //   191: aload 5
    //   193: invokeinterface 318 1 0
    //   198: aload 4
    //   200: athrow
    //   201: astore 4
    //   203: goto -17 -> 186
    //   206: astore 6
    //   208: goto -69 -> 139
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	211	0	this	PersistentAnalyticsStore
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
  
  public void a()
  {
    Log.c("Dispatch running...");
    if (!this.c.a()) {}
    List localList;
    int i;
    do
    {
      return;
      localList = b(40);
      if (localList.isEmpty())
      {
        Log.c("...nothing to dispatch");
        this.d.a(true);
        return;
      }
      i = this.c.a(localList);
      Log.c("sent " + i + " of " + localList.size() + " hits");
      a(localList.subList(0, Math.min(i, localList.size())));
    } while ((i != localList.size()) || (d() <= 0));
    GAServiceManager.a().c();
  }
  
  public void a(long paramLong)
  {
    boolean bool = true;
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for clearHits");
    AnalyticsStoreStateListener localAnalyticsStoreStateListener;
    if (localSQLiteDatabase != null)
    {
      if (paramLong != 0L) {
        break label54;
      }
      localSQLiteDatabase.delete("hits2", null, null);
      localAnalyticsStoreStateListener = this.d;
      if (d() != 0) {
        break label87;
      }
    }
    for (;;)
    {
      localAnalyticsStoreStateListener.a(bool);
      return;
      label54:
      String[] arrayOfString = new String[bool];
      arrayOfString[0] = Long.valueOf(paramLong).toString();
      localSQLiteDatabase.delete("hits2", "hit_app_id = ?", arrayOfString);
      break;
      label87:
      bool = false;
    }
  }
  
  @Deprecated
  void a(Collection<Hit> paramCollection)
  {
    if ((paramCollection == null) || (paramCollection.isEmpty()))
    {
      Log.d("Empty/Null collection passed to deleteHits.");
      return;
    }
    String[] arrayOfString = new String[paramCollection.size()];
    Iterator localIterator = paramCollection.iterator();
    int j;
    for (int i = 0; localIterator.hasNext(); i = j)
    {
      Hit localHit = (Hit)localIterator.next();
      j = i + 1;
      arrayOfString[i] = String.valueOf(localHit.b());
    }
    a(arrayOfString);
  }
  
  public void a(Map<String, String> paramMap, long paramLong, String paramString, Collection<Command> paramCollection)
  {
    c();
    f();
    a(paramMap, paramCollection);
    a(paramMap, paramLong, paramString);
  }
  
  void a(String[] paramArrayOfString)
  {
    boolean bool = true;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      Log.d("Empty hitIds passed to deleteHits.");
    }
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
        localSQLiteDatabase.delete("hits2", str, paramArrayOfString);
        AnalyticsStoreStateListener localAnalyticsStoreStateListener = this.d;
        if (d() == 0)
        {
          localAnalyticsStoreStateListener.a(bool);
          return;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        Log.d("Error deleting hits " + paramArrayOfString);
        return;
      }
      bool = false;
    }
  }
  
  public Dispatcher b()
  {
    return this.c;
  }
  
  /* Error */
  public List<Hit> b(int paramInt)
  {
    // Byte code:
    //   0: new 108	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 286	java/util/ArrayList:<init>	()V
    //   7: astore_2
    //   8: aload_0
    //   9: ldc_w 418
    //   12: invokespecial 184	com/google/analytics/tracking/android/PersistentAnalyticsStore:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
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
    //   32: iconst_2
    //   33: anewarray 39	java/lang/String
    //   36: dup
    //   37: iconst_0
    //   38: ldc 29
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: ldc 31
    //   45: aastore
    //   46: aconst_null
    //   47: aconst_null
    //   48: aconst_null
    //   49: aconst_null
    //   50: ldc_w 292
    //   53: iconst_1
    //   54: anewarray 4	java/lang/Object
    //   57: dup
    //   58: iconst_0
    //   59: ldc 29
    //   61: aastore
    //   62: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   65: iload_1
    //   66: invokestatic 296	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   69: invokevirtual 300	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   72: astore 10
    //   74: aload 10
    //   76: astore 11
    //   78: new 108	java/util/ArrayList
    //   81: dup
    //   82: invokespecial 286	java/util/ArrayList:<init>	()V
    //   85: astore 12
    //   87: aload 11
    //   89: invokeinterface 305 1 0
    //   94: ifeq +49 -> 143
    //   97: aload 12
    //   99: new 382	com/google/analytics/tracking/android/Hit
    //   102: dup
    //   103: aconst_null
    //   104: aload 11
    //   106: iconst_0
    //   107: invokeinterface 309 2 0
    //   112: aload 11
    //   114: iconst_1
    //   115: invokeinterface 309 2 0
    //   120: invokespecial 421	com/google/analytics/tracking/android/Hit:<init>	(Ljava/lang/String;JJ)V
    //   123: invokeinterface 169 2 0
    //   128: pop
    //   129: aload 11
    //   131: invokeinterface 315 1 0
    //   136: istore 15
    //   138: iload 15
    //   140: ifne -43 -> 97
    //   143: aload 11
    //   145: ifnull +10 -> 155
    //   148: aload 11
    //   150: invokeinterface 318 1 0
    //   155: aload_3
    //   156: ldc 27
    //   158: iconst_3
    //   159: anewarray 39	java/lang/String
    //   162: dup
    //   163: iconst_0
    //   164: ldc 29
    //   166: aastore
    //   167: dup
    //   168: iconst_1
    //   169: ldc 35
    //   171: aastore
    //   172: dup
    //   173: iconst_2
    //   174: ldc 33
    //   176: aastore
    //   177: aconst_null
    //   178: aconst_null
    //   179: aconst_null
    //   180: aconst_null
    //   181: ldc_w 292
    //   184: iconst_1
    //   185: anewarray 4	java/lang/Object
    //   188: dup
    //   189: iconst_0
    //   190: ldc 29
    //   192: aastore
    //   193: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   196: iload_1
    //   197: invokestatic 296	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   200: invokevirtual 300	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   203: astore 24
    //   205: aload 24
    //   207: invokeinterface 305 1 0
    //   212: ifeq +86 -> 298
    //   215: iconst_0
    //   216: istore 25
    //   218: aload 24
    //   220: checkcast 423	android/database/sqlite/SQLiteCursor
    //   223: invokevirtual 427	android/database/sqlite/SQLiteCursor:getWindow	()Landroid/database/CursorWindow;
    //   226: invokevirtual 432	android/database/CursorWindow:getNumRows	()I
    //   229: ifle +155 -> 384
    //   232: aload 12
    //   234: iload 25
    //   236: invokeinterface 435 2 0
    //   241: checkcast 382	com/google/analytics/tracking/android/Hit
    //   244: aload 24
    //   246: iconst_1
    //   247: invokeinterface 438 2 0
    //   252: invokevirtual 440	com/google/analytics/tracking/android/Hit:a	(Ljava/lang/String;)V
    //   255: aload 12
    //   257: iload 25
    //   259: invokeinterface 435 2 0
    //   264: checkcast 382	com/google/analytics/tracking/android/Hit
    //   267: aload 24
    //   269: iconst_2
    //   270: invokeinterface 438 2 0
    //   275: invokevirtual 442	com/google/analytics/tracking/android/Hit:b	(Ljava/lang/String;)V
    //   278: iload 25
    //   280: iconst_1
    //   281: iadd
    //   282: istore 27
    //   284: aload 24
    //   286: invokeinterface 315 1 0
    //   291: istore 28
    //   293: iload 28
    //   295: ifne +340 -> 635
    //   298: aload 24
    //   300: ifnull +10 -> 310
    //   303: aload 24
    //   305: invokeinterface 318 1 0
    //   310: aload 12
    //   312: areturn
    //   313: astore 6
    //   315: aload 6
    //   317: astore 7
    //   319: aconst_null
    //   320: astore 8
    //   322: aload_2
    //   323: astore 9
    //   325: new 141	java/lang/StringBuilder
    //   328: dup
    //   329: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   332: ldc_w 320
    //   335: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: aload 7
    //   340: invokevirtual 323	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   343: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   349: invokestatic 104	com/google/analytics/tracking/android/Log:d	(Ljava/lang/String;)V
    //   352: aload 8
    //   354: ifnull -331 -> 23
    //   357: aload 8
    //   359: invokeinterface 318 1 0
    //   364: aload 9
    //   366: areturn
    //   367: astore 5
    //   369: aload 4
    //   371: ifnull +10 -> 381
    //   374: aload 4
    //   376: invokeinterface 318 1 0
    //   381: aload 5
    //   383: athrow
    //   384: iconst_1
    //   385: anewarray 4	java/lang/Object
    //   388: astore 26
    //   390: aload 26
    //   392: iconst_0
    //   393: aload 12
    //   395: iload 25
    //   397: invokeinterface 435 2 0
    //   402: checkcast 382	com/google/analytics/tracking/android/Hit
    //   405: invokevirtual 385	com/google/analytics/tracking/android/Hit:b	()J
    //   408: invokestatic 199	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   411: aastore
    //   412: ldc_w 444
    //   415: aload 26
    //   417: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   420: invokestatic 104	com/google/analytics/tracking/android/Log:d	(Ljava/lang/String;)V
    //   423: goto -145 -> 278
    //   426: astore 16
    //   428: aload 24
    //   430: astore 11
    //   432: new 141	java/lang/StringBuilder
    //   435: dup
    //   436: invokespecial 142	java/lang/StringBuilder:<init>	()V
    //   439: ldc_w 446
    //   442: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   445: aload 16
    //   447: invokevirtual 323	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   450: invokevirtual 154	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   456: invokestatic 104	com/google/analytics/tracking/android/Log:d	(Ljava/lang/String;)V
    //   459: new 108	java/util/ArrayList
    //   462: dup
    //   463: invokespecial 286	java/util/ArrayList:<init>	()V
    //   466: astore 18
    //   468: iconst_0
    //   469: istore 19
    //   471: aload 12
    //   473: invokeinterface 447 1 0
    //   478: astore 20
    //   480: aload 20
    //   482: invokeinterface 133 1 0
    //   487: ifeq +35 -> 522
    //   490: aload 20
    //   492: invokeinterface 137 1 0
    //   497: checkcast 382	com/google/analytics/tracking/android/Hit
    //   500: astore 21
    //   502: aload 21
    //   504: invokevirtual 448	com/google/analytics/tracking/android/Hit:a	()Ljava/lang/String;
    //   507: invokestatic 451	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   510: istore 22
    //   512: iload 22
    //   514: ifeq +26 -> 540
    //   517: iload 19
    //   519: ifeq +18 -> 537
    //   522: aload 11
    //   524: ifnull +10 -> 534
    //   527: aload 11
    //   529: invokeinterface 318 1 0
    //   534: aload 18
    //   536: areturn
    //   537: iconst_1
    //   538: istore 19
    //   540: aload 18
    //   542: aload 21
    //   544: invokeinterface 169 2 0
    //   549: pop
    //   550: goto -70 -> 480
    //   553: astore 17
    //   555: aload 11
    //   557: ifnull +10 -> 567
    //   560: aload 11
    //   562: invokeinterface 318 1 0
    //   567: aload 17
    //   569: athrow
    //   570: astore 17
    //   572: aload 24
    //   574: astore 11
    //   576: goto -21 -> 555
    //   579: astore 16
    //   581: goto -149 -> 432
    //   584: astore 5
    //   586: aload 11
    //   588: astore 4
    //   590: goto -221 -> 369
    //   593: astore 5
    //   595: aload 8
    //   597: astore 4
    //   599: goto -230 -> 369
    //   602: astore 29
    //   604: aload 29
    //   606: astore 7
    //   608: aload 11
    //   610: astore 8
    //   612: aload_2
    //   613: astore 9
    //   615: goto -290 -> 325
    //   618: astore 13
    //   620: aload 13
    //   622: astore 7
    //   624: aload 11
    //   626: astore 8
    //   628: aload 12
    //   630: astore 9
    //   632: goto -307 -> 325
    //   635: iload 27
    //   637: istore 25
    //   639: goto -421 -> 218
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	642	0	this	PersistentAnalyticsStore
    //   0	642	1	paramInt	int
    //   7	606	2	localArrayList1	ArrayList
    //   15	141	3	localSQLiteDatabase	SQLiteDatabase
    //   27	571	4	localObject1	Object
    //   367	15	5	localObject2	Object
    //   584	1	5	localObject3	Object
    //   593	1	5	localObject4	Object
    //   313	3	6	localSQLiteException1	SQLiteException
    //   317	306	7	localObject5	Object
    //   320	307	8	localObject6	Object
    //   21	610	9	localObject7	Object
    //   72	3	10	localCursor1	Cursor
    //   76	549	11	localObject8	Object
    //   85	544	12	localArrayList2	ArrayList
    //   618	3	13	localSQLiteException2	SQLiteException
    //   136	3	15	bool1	boolean
    //   426	20	16	localSQLiteException3	SQLiteException
    //   579	1	16	localSQLiteException4	SQLiteException
    //   553	15	17	localObject9	Object
    //   570	1	17	localObject10	Object
    //   466	75	18	localArrayList3	ArrayList
    //   469	70	19	i	int
    //   478	13	20	localIterator	Iterator
    //   500	43	21	localHit	Hit
    //   510	3	22	bool2	boolean
    //   203	370	24	localCursor2	Cursor
    //   216	422	25	j	int
    //   388	28	26	arrayOfObject	Object[]
    //   282	354	27	k	int
    //   291	3	28	bool3	boolean
    //   602	3	29	localSQLiteException5	SQLiteException
    // Exception table:
    //   from	to	target	type
    //   29	74	313	android/database/sqlite/SQLiteException
    //   29	74	367	finally
    //   205	215	426	android/database/sqlite/SQLiteException
    //   218	278	426	android/database/sqlite/SQLiteException
    //   284	293	426	android/database/sqlite/SQLiteException
    //   384	423	426	android/database/sqlite/SQLiteException
    //   155	205	553	finally
    //   432	468	553	finally
    //   471	480	553	finally
    //   480	512	553	finally
    //   540	550	553	finally
    //   205	215	570	finally
    //   218	278	570	finally
    //   284	293	570	finally
    //   384	423	570	finally
    //   155	205	579	android/database/sqlite/SQLiteException
    //   78	87	584	finally
    //   87	97	584	finally
    //   97	138	584	finally
    //   325	352	593	finally
    //   78	87	602	android/database/sqlite/SQLiteException
    //   87	97	618	android/database/sqlite/SQLiteException
    //   97	138	618	android/database/sqlite/SQLiteException
  }
  
  int c()
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
    int i = localSQLiteDatabase.delete("hits2", "HIT_TIME < ?", arrayOfString);
    AnalyticsStoreStateListener localAnalyticsStoreStateListener = this.d;
    if (d() == 0) {}
    for (;;)
    {
      localAnalyticsStoreStateListener.a(bool);
      return i;
      bool = false;
    }
  }
  
  int d()
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
        localCursor = localSQLiteDatabase.rawQuery("SELECT COUNT(*) from hits2", null);
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
        Log.d("Error getting numStoredHits");
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
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.analytics.tracking.android.PersistentAnalyticsStore
 * JD-Core Version:    0.7.0.1
 */