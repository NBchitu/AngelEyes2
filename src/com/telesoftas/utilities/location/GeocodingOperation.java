package com.telesoftas.utilities.location;

import android.content.Context;
import android.location.Location;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

public class GeocodingOperation
  extends AsyncTask<String, Void, String>
{
  private List<Location> a = new ArrayList();
  private Context b;
  private String c;
  private GeocodingOperation.GeocodingListener d;
  
  public GeocodingOperation(Context paramContext, String paramString)
  {
    this.b = paramContext;
    this.c = paramString;
  }
  
  /* Error */
  protected String a(String... paramVarArgs)
  {
    // Byte code:
    //   0: ldc 35
    //   2: astore_2
    //   3: aload_0
    //   4: getfield 28	com/telesoftas/utilities/location/GeocodingOperation:c	Ljava/lang/String;
    //   7: ifnull +220 -> 227
    //   10: aload_0
    //   11: getfield 28	com/telesoftas/utilities/location/GeocodingOperation:c	Ljava/lang/String;
    //   14: ldc 35
    //   16: invokevirtual 41	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   19: ifeq +5 -> 24
    //   22: aload_2
    //   23: areturn
    //   24: new 43	com/telesoftas/utilities/location/GeocoderCostum
    //   27: dup
    //   28: aload_0
    //   29: getfield 26	com/telesoftas/utilities/location/GeocodingOperation:b	Landroid/content/Context;
    //   32: invokespecial 46	com/telesoftas/utilities/location/GeocoderCostum:<init>	(Landroid/content/Context;)V
    //   35: astore 4
    //   37: iconst_0
    //   38: istore 5
    //   40: iload 5
    //   42: iconst_2
    //   43: if_icmpge +178 -> 221
    //   46: aload 4
    //   48: aload_0
    //   49: getfield 28	com/telesoftas/utilities/location/GeocodingOperation:c	Ljava/lang/String;
    //   52: bipush 20
    //   54: invokevirtual 49	com/telesoftas/utilities/location/GeocoderCostum:a	(Ljava/lang/String;I)Ljava/util/List;
    //   57: astore 13
    //   59: aload 13
    //   61: astore 6
    //   63: aload 6
    //   65: ifnull +162 -> 227
    //   68: aload 6
    //   70: invokeinterface 55 1 0
    //   75: ifeq +152 -> 227
    //   78: iconst_0
    //   79: istore 7
    //   81: iload 7
    //   83: aload 6
    //   85: invokeinterface 55 1 0
    //   90: if_icmpge +93 -> 183
    //   93: aload 6
    //   95: iload 7
    //   97: invokeinterface 59 2 0
    //   102: checkcast 61	android/location/Address
    //   105: astore 9
    //   107: new 63	android/location/Location
    //   110: dup
    //   111: ldc 65
    //   113: invokespecial 68	android/location/Location:<init>	(Ljava/lang/String;)V
    //   116: astore 10
    //   118: aload 10
    //   120: aload 9
    //   122: invokevirtual 72	android/location/Address:getLatitude	()D
    //   125: invokevirtual 76	android/location/Location:setLatitude	(D)V
    //   128: aload 10
    //   130: aload 9
    //   132: invokevirtual 79	android/location/Address:getLongitude	()D
    //   135: invokevirtual 82	android/location/Location:setLongitude	(D)V
    //   138: aload 10
    //   140: aload 9
    //   142: invokevirtual 86	android/location/Address:getFeatureName	()Ljava/lang/String;
    //   145: invokevirtual 89	android/location/Location:setProvider	(Ljava/lang/String;)V
    //   148: aload_0
    //   149: getfield 24	com/telesoftas/utilities/location/GeocodingOperation:a	Ljava/util/List;
    //   152: aload 10
    //   154: invokeinterface 92 2 0
    //   159: pop
    //   160: iinc 7 1
    //   163: ldc 35
    //   165: astore_2
    //   166: goto -85 -> 81
    //   169: astore 12
    //   171: ldc2_w 93
    //   174: invokestatic 100	java/lang/Thread:sleep	(J)V
    //   177: iinc 5 1
    //   180: goto -140 -> 40
    //   183: aload_0
    //   184: getfield 24	com/telesoftas/utilities/location/GeocodingOperation:a	Ljava/util/List;
    //   187: invokeinterface 55 1 0
    //   192: iconst_1
    //   193: if_icmpge +34 -> 227
    //   196: aload_0
    //   197: aconst_null
    //   198: putfield 24	com/telesoftas/utilities/location/GeocodingOperation:a	Ljava/util/List;
    //   201: aload_2
    //   202: areturn
    //   203: astore_3
    //   204: aload_3
    //   205: invokestatic 105	com/crashlytics/android/Crashlytics:a	(Ljava/lang/Throwable;)V
    //   208: aload_2
    //   209: areturn
    //   210: astore 8
    //   212: ldc 35
    //   214: astore_2
    //   215: aload 8
    //   217: astore_3
    //   218: goto -14 -> 204
    //   221: aconst_null
    //   222: astore 6
    //   224: goto -161 -> 63
    //   227: aload_2
    //   228: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	GeocodingOperation
    //   0	229	1	paramVarArgs	String[]
    //   2	226	2	str	String
    //   203	2	3	localException1	java.lang.Exception
    //   217	1	3	localObject	java.lang.Object
    //   35	12	4	localGeocoderCostum	GeocoderCostum
    //   38	140	5	i	int
    //   61	162	6	localList1	List
    //   79	82	7	j	int
    //   210	6	8	localException2	java.lang.Exception
    //   105	36	9	localAddress	android.location.Address
    //   116	37	10	localLocation	Location
    //   169	1	12	localIOException	java.io.IOException
    //   57	3	13	localList2	List
    // Exception table:
    //   from	to	target	type
    //   46	59	169	java/io/IOException
    //   3	22	203	java/lang/Exception
    //   24	37	203	java/lang/Exception
    //   46	59	203	java/lang/Exception
    //   68	78	203	java/lang/Exception
    //   81	93	203	java/lang/Exception
    //   171	177	203	java/lang/Exception
    //   183	201	203	java/lang/Exception
    //   93	160	210	java/lang/Exception
  }
  
  public void a()
  {
    this.d = null;
  }
  
  public void a(GeocodingOperation.GeocodingListener paramGeocodingListener)
  {
    this.d = paramGeocodingListener;
  }
  
  protected void a(String paramString)
  {
    super.onPostExecute(paramString);
    if ((this.a == null) || (this.d != null)) {
      this.d.a(this.a);
    }
  }
  
  protected void a(Void... paramVarArgs)
  {
    super.onProgressUpdate(paramVarArgs);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.location.GeocodingOperation
 * JD-Core Version:    0.7.0.1
 */