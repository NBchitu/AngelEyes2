package com.google.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.analytics.containertag.proto.Serving.Resource;

class ResourceLoader
  implements Runnable
{
  private final Context a;
  private final NetworkClientFactory b;
  private final String c;
  private final String d;
  private LoadCallback<Serving.Resource> e;
  private volatile CtfeHost f;
  private volatile String g;
  private volatile String h;
  
  public ResourceLoader(Context paramContext, String paramString, CtfeHost paramCtfeHost)
  {
    this(paramContext, paramString, new NetworkClientFactory(), paramCtfeHost);
  }
  
  ResourceLoader(Context paramContext, String paramString, NetworkClientFactory paramNetworkClientFactory, CtfeHost paramCtfeHost)
  {
    this.a = paramContext;
    this.b = paramNetworkClientFactory;
    this.c = paramString;
    this.f = paramCtfeHost;
    this.d = ("/r?id=" + paramString);
    this.g = this.d;
    this.h = null;
  }
  
  private boolean b()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.a.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
    {
      Log.e("...no network connectivity");
      return false;
    }
    return true;
  }
  
  /* Error */
  private void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 91	com/google/tagmanager/ResourceLoader:b	()Z
    //   4: ifne +16 -> 20
    //   7: aload_0
    //   8: getfield 93	com/google/tagmanager/ResourceLoader:e	Lcom/google/tagmanager/LoadCallback;
    //   11: getstatic 98	com/google/tagmanager/LoadCallback$Failure:a	Lcom/google/tagmanager/LoadCallback$Failure;
    //   14: invokeinterface 103 2 0
    //   19: return
    //   20: ldc 105
    //   22: invokestatic 85	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   25: aload_0
    //   26: invokevirtual 107	com/google/tagmanager/ResourceLoader:a	()Ljava/lang/String;
    //   29: astore_1
    //   30: aload_0
    //   31: getfield 35	com/google/tagmanager/ResourceLoader:b	Lcom/google/tagmanager/NetworkClientFactory;
    //   34: invokevirtual 110	com/google/tagmanager/NetworkClientFactory:a	()Lcom/google/tagmanager/NetworkClient;
    //   37: astore_2
    //   38: aload_2
    //   39: aload_1
    //   40: invokeinterface 115 2 0
    //   45: astore 6
    //   47: aload 6
    //   49: invokestatic 120	com/google/tagmanager/ProtoExtensionRegistry:a	()Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;
    //   52: invokestatic 125	com/google/analytics/containertag/proto/Serving$OptionalResource:a	(Ljava/io/InputStream;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;)Lcom/google/analytics/containertag/proto/Serving$OptionalResource;
    //   55: astore 8
    //   57: new 41	java/lang/StringBuilder
    //   60: dup
    //   61: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   64: ldc 127
    //   66: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload 8
    //   71: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: invokestatic 85	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   80: aload 8
    //   82: invokevirtual 132	com/google/analytics/containertag/proto/Serving$OptionalResource:d	()Z
    //   85: ifne +28 -> 113
    //   88: new 41	java/lang/StringBuilder
    //   91: dup
    //   92: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   95: ldc 134
    //   97: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: aload_0
    //   101: getfield 37	com/google/tagmanager/ResourceLoader:c	Ljava/lang/String;
    //   104: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   110: invokestatic 85	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   113: aload_0
    //   114: getfield 93	com/google/tagmanager/ResourceLoader:e	Lcom/google/tagmanager/LoadCallback;
    //   117: astore 9
    //   119: aload 8
    //   121: invokevirtual 132	com/google/analytics/containertag/proto/Serving$OptionalResource:d	()Z
    //   124: ifeq +149 -> 273
    //   127: aload 8
    //   129: invokevirtual 137	com/google/analytics/containertag/proto/Serving$OptionalResource:e	()Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   132: astore 10
    //   134: aload 9
    //   136: aload 10
    //   138: invokeinterface 140 2 0
    //   143: aload_2
    //   144: invokeinterface 142 1 0
    //   149: ldc 144
    //   151: invokestatic 85	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   154: return
    //   155: astore 5
    //   157: new 41	java/lang/StringBuilder
    //   160: dup
    //   161: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   164: ldc 146
    //   166: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: aload_1
    //   170: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: ldc 148
    //   175: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: aload_0
    //   179: getfield 37	com/google/tagmanager/ResourceLoader:c	Ljava/lang/String;
    //   182: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: ldc 150
    //   187: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: invokestatic 152	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   196: aload_0
    //   197: getfield 93	com/google/tagmanager/ResourceLoader:e	Lcom/google/tagmanager/LoadCallback;
    //   200: getstatic 154	com/google/tagmanager/LoadCallback$Failure:c	Lcom/google/tagmanager/LoadCallback$Failure;
    //   203: invokeinterface 103 2 0
    //   208: aload_2
    //   209: invokeinterface 142 1 0
    //   214: return
    //   215: astore 4
    //   217: new 41	java/lang/StringBuilder
    //   220: dup
    //   221: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   224: ldc 156
    //   226: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: aload_1
    //   230: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: ldc 158
    //   235: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: aload 4
    //   240: invokevirtual 161	java/io/IOException:getMessage	()Ljava/lang/String;
    //   243: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: aload 4
    //   251: invokestatic 164	com/google/tagmanager/Log:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   254: aload_0
    //   255: getfield 93	com/google/tagmanager/ResourceLoader:e	Lcom/google/tagmanager/LoadCallback;
    //   258: getstatic 166	com/google/tagmanager/LoadCallback$Failure:b	Lcom/google/tagmanager/LoadCallback$Failure;
    //   261: invokeinterface 103 2 0
    //   266: aload_2
    //   267: invokeinterface 142 1 0
    //   272: return
    //   273: aconst_null
    //   274: astore 10
    //   276: goto -142 -> 134
    //   279: astore 7
    //   281: new 41	java/lang/StringBuilder
    //   284: dup
    //   285: invokespecial 42	java/lang/StringBuilder:<init>	()V
    //   288: ldc 168
    //   290: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: aload_1
    //   294: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: ldc 158
    //   299: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: aload 7
    //   304: invokevirtual 161	java/io/IOException:getMessage	()Ljava/lang/String;
    //   307: invokevirtual 48	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   313: aload 7
    //   315: invokestatic 164	com/google/tagmanager/Log:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   318: aload_0
    //   319: getfield 93	com/google/tagmanager/ResourceLoader:e	Lcom/google/tagmanager/LoadCallback;
    //   322: getstatic 154	com/google/tagmanager/LoadCallback$Failure:c	Lcom/google/tagmanager/LoadCallback$Failure;
    //   325: invokeinterface 103 2 0
    //   330: aload_2
    //   331: invokeinterface 142 1 0
    //   336: return
    //   337: astore_3
    //   338: aload_2
    //   339: invokeinterface 142 1 0
    //   344: aload_3
    //   345: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	346	0	this	ResourceLoader
    //   29	265	1	str	String
    //   37	302	2	localNetworkClient	NetworkClient
    //   337	8	3	localObject	Object
    //   215	35	4	localIOException1	java.io.IOException
    //   155	1	5	localFileNotFoundException	java.io.FileNotFoundException
    //   45	3	6	localInputStream	java.io.InputStream
    //   279	35	7	localIOException2	java.io.IOException
    //   55	73	8	localOptionalResource	com.google.analytics.containertag.proto.Serving.OptionalResource
    //   117	18	9	localLoadCallback	LoadCallback
    //   132	143	10	localResource	Serving.Resource
    // Exception table:
    //   from	to	target	type
    //   38	47	155	java/io/FileNotFoundException
    //   38	47	215	java/io/IOException
    //   47	113	279	java/io/IOException
    //   113	134	279	java/io/IOException
    //   134	143	279	java/io/IOException
    //   38	47	337	finally
    //   47	113	337	finally
    //   113	134	337	finally
    //   134	143	337	finally
    //   157	208	337	finally
    //   217	266	337	finally
    //   281	330	337	finally
  }
  
  String a()
  {
    String str = this.f.a() + this.g + "&v=a50788154";
    if ((this.h != null) && (!this.h.trim().equals(""))) {
      str = str + "&pv=" + this.h;
    }
    if (PreviewManager.a().b().equals(PreviewManager.PreviewMode.c)) {
      str = str + "&gtm_debug=x";
    }
    return str;
  }
  
  void a(LoadCallback<Serving.Resource> paramLoadCallback)
  {
    this.e = paramLoadCallback;
  }
  
  void a(String paramString)
  {
    if (paramString == null)
    {
      this.g = this.d;
      return;
    }
    Log.d("Setting CTFE URL path: " + paramString);
    this.g = paramString;
  }
  
  void b(String paramString)
  {
    Log.d("Setting previous container version: " + paramString);
    this.h = paramString;
  }
  
  public void run()
  {
    if (this.e == null) {
      throw new IllegalStateException("callback must be set before execute");
    }
    this.e.a();
    c();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceLoader
 * JD-Core Version:    0.7.0.1
 */