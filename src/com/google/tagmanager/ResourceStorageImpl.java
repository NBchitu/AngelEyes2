package com.google.tagmanager;

import android.content.Context;
import com.google.tagmanager.proto.Resource.ResourceWithMetadata;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ResourceStorageImpl
  implements Container.ResourceStorage
{
  private final Context a;
  private final String b;
  private final ExecutorService c;
  private LoadCallback<Resource.ResourceWithMetadata> d;
  
  ResourceStorageImpl(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = Executors.newSingleThreadExecutor();
  }
  
  private String a(InputStream paramInputStream)
  {
    StringWriter localStringWriter = new StringWriter();
    char[] arrayOfChar = new char[1024];
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream, "UTF-8"));
    for (;;)
    {
      int i = localBufferedReader.read(arrayOfChar);
      if (i == -1) {
        break;
      }
      localStringWriter.write(arrayOfChar, 0, i);
    }
    return localStringWriter.toString();
  }
  
  /* Error */
  public com.google.analytics.containertag.proto.Serving.Resource a(String paramString)
  {
    // Byte code:
    //   0: new 69	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 70	java/lang/StringBuilder:<init>	()V
    //   7: ldc 72
    //   9: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   12: aload_1
    //   13: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   19: invokestatic 83	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   22: aload_0
    //   23: getfield 22	com/google/tagmanager/ResourceStorageImpl:a	Landroid/content/Context;
    //   26: invokevirtual 89	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   29: astore_2
    //   30: aload_2
    //   31: ifnonnull +10 -> 41
    //   34: ldc 91
    //   36: invokestatic 93	com/google/tagmanager/Log:a	(Ljava/lang/String;)V
    //   39: aconst_null
    //   40: areturn
    //   41: aload_2
    //   42: aload_1
    //   43: invokevirtual 99	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   46: astore 4
    //   48: aload 4
    //   50: invokestatic 104	com/google/tagmanager/ProtoExtensionRegistry:a	()Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;
    //   53: invokestatic 109	com/google/analytics/containertag/proto/Serving$Resource:a	(Ljava/io/InputStream;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;)Lcom/google/analytics/containertag/proto/Serving$Resource;
    //   56: astore 9
    //   58: new 69	java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial 70	java/lang/StringBuilder:<init>	()V
    //   65: ldc 111
    //   67: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: aload 9
    //   72: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokestatic 83	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   81: aload 4
    //   83: invokevirtual 119	java/io/InputStream:close	()V
    //   86: aload 9
    //   88: areturn
    //   89: astore_3
    //   90: new 69	java/lang/StringBuilder
    //   93: dup
    //   94: invokespecial 70	java/lang/StringBuilder:<init>	()V
    //   97: ldc 121
    //   99: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: aload_1
    //   103: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: ldc 123
    //   108: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   117: aconst_null
    //   118: areturn
    //   119: astore 7
    //   121: new 69	java/lang/StringBuilder
    //   124: dup
    //   125: invokespecial 70	java/lang/StringBuilder:<init>	()V
    //   128: ldc 127
    //   130: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: aload_1
    //   134: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   140: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   143: aload 4
    //   145: invokevirtual 119	java/io/InputStream:close	()V
    //   148: aconst_null
    //   149: areturn
    //   150: astore 8
    //   152: aconst_null
    //   153: areturn
    //   154: astore 5
    //   156: aload 4
    //   158: invokevirtual 119	java/io/InputStream:close	()V
    //   161: aload 5
    //   163: athrow
    //   164: astore 10
    //   166: goto -80 -> 86
    //   169: astore 6
    //   171: goto -10 -> 161
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	this	ResourceStorageImpl
    //   0	174	1	paramString	String
    //   29	13	2	localAssetManager	android.content.res.AssetManager
    //   89	1	3	localIOException1	java.io.IOException
    //   46	111	4	localInputStream	InputStream
    //   154	8	5	localObject	Object
    //   169	1	6	localIOException2	java.io.IOException
    //   119	1	7	localIOException3	java.io.IOException
    //   150	1	8	localIOException4	java.io.IOException
    //   56	31	9	localResource	com.google.analytics.containertag.proto.Serving.Resource
    //   164	1	10	localIOException5	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   41	48	89	java/io/IOException
    //   48	81	119	java/io/IOException
    //   143	148	150	java/io/IOException
    //   48	81	154	finally
    //   121	143	154	finally
    //   81	86	164	java/io/IOException
    //   156	161	169	java/io/IOException
  }
  
  public void a()
  {
    this.c.execute(new ResourceStorageImpl.1(this));
  }
  
  public void a(LoadCallback<Resource.ResourceWithMetadata> paramLoadCallback)
  {
    this.d = paramLoadCallback;
  }
  
  public void a(Resource.ResourceWithMetadata paramResourceWithMetadata)
  {
    this.c.execute(new ResourceStorageImpl.2(this, paramResourceWithMetadata));
  }
  
  /* Error */
  public ResourceUtil.ExpandedResource b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 69	java/lang/StringBuilder
    //   5: dup
    //   6: invokespecial 70	java/lang/StringBuilder:<init>	()V
    //   9: ldc 152
    //   11: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: aload_1
    //   15: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   21: invokestatic 83	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   24: aload_0
    //   25: getfield 22	com/google/tagmanager/ResourceStorageImpl:a	Landroid/content/Context;
    //   28: invokevirtual 89	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   31: astore_3
    //   32: aload_3
    //   33: ifnonnull +10 -> 43
    //   36: ldc 154
    //   38: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   41: aload_2
    //   42: areturn
    //   43: aload_3
    //   44: aload_1
    //   45: invokevirtual 99	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   48: astore 13
    //   50: aload 13
    //   52: astore 5
    //   54: aload_0
    //   55: aload 5
    //   57: invokespecial 156	com/google/tagmanager/ResourceStorageImpl:a	(Ljava/io/InputStream;)Ljava/lang/String;
    //   60: invokestatic 160	com/google/tagmanager/JsonUtils:a	(Ljava/lang/String;)Lcom/google/tagmanager/ResourceUtil$ExpandedResource;
    //   63: astore 16
    //   65: aload 16
    //   67: astore_2
    //   68: aload 5
    //   70: ifnull -29 -> 41
    //   73: aload 5
    //   75: invokevirtual 119	java/io/InputStream:close	()V
    //   78: aload_2
    //   79: areturn
    //   80: astore 17
    //   82: aload_2
    //   83: areturn
    //   84: astore 11
    //   86: aconst_null
    //   87: astore 5
    //   89: new 69	java/lang/StringBuilder
    //   92: dup
    //   93: invokespecial 70	java/lang/StringBuilder:<init>	()V
    //   96: ldc 121
    //   98: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: aload_1
    //   102: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: ldc 162
    //   107: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   116: aconst_null
    //   117: astore_2
    //   118: aload 5
    //   120: ifnull -79 -> 41
    //   123: aload 5
    //   125: invokevirtual 119	java/io/InputStream:close	()V
    //   128: aconst_null
    //   129: areturn
    //   130: astore 12
    //   132: aconst_null
    //   133: areturn
    //   134: astore 8
    //   136: aconst_null
    //   137: astore 9
    //   139: new 69	java/lang/StringBuilder
    //   142: dup
    //   143: invokespecial 70	java/lang/StringBuilder:<init>	()V
    //   146: ldc 164
    //   148: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload_1
    //   152: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc 166
    //   157: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: aload 8
    //   162: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   165: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   171: aconst_null
    //   172: astore_2
    //   173: aload 9
    //   175: ifnull -134 -> 41
    //   178: aload 9
    //   180: invokevirtual 119	java/io/InputStream:close	()V
    //   183: aconst_null
    //   184: areturn
    //   185: astore 10
    //   187: aconst_null
    //   188: areturn
    //   189: astore 4
    //   191: aconst_null
    //   192: astore 5
    //   194: aload 4
    //   196: astore 6
    //   198: aload 5
    //   200: ifnull +8 -> 208
    //   203: aload 5
    //   205: invokevirtual 119	java/io/InputStream:close	()V
    //   208: aload 6
    //   210: athrow
    //   211: astore 7
    //   213: goto -5 -> 208
    //   216: astore 6
    //   218: goto -20 -> 198
    //   221: astore 6
    //   223: aload 9
    //   225: astore 5
    //   227: goto -29 -> 198
    //   230: astore 15
    //   232: aload 5
    //   234: astore 9
    //   236: aload 15
    //   238: astore 8
    //   240: goto -101 -> 139
    //   243: astore 14
    //   245: goto -156 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	248	0	this	ResourceStorageImpl
    //   0	248	1	paramString	String
    //   1	172	2	localObject1	Object
    //   31	13	3	localAssetManager	android.content.res.AssetManager
    //   189	6	4	localObject2	Object
    //   52	181	5	localObject3	Object
    //   196	13	6	localObject4	Object
    //   216	1	6	localObject5	Object
    //   221	1	6	localObject6	Object
    //   211	1	7	localIOException1	java.io.IOException
    //   134	27	8	localJSONException1	org.json.JSONException
    //   238	1	8	localObject7	Object
    //   137	98	9	localObject8	Object
    //   185	1	10	localIOException2	java.io.IOException
    //   84	1	11	localIOException3	java.io.IOException
    //   130	1	12	localIOException4	java.io.IOException
    //   48	3	13	localInputStream	InputStream
    //   243	1	14	localIOException5	java.io.IOException
    //   230	7	15	localJSONException2	org.json.JSONException
    //   63	3	16	localExpandedResource	ResourceUtil.ExpandedResource
    //   80	1	17	localIOException6	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   73	78	80	java/io/IOException
    //   43	50	84	java/io/IOException
    //   123	128	130	java/io/IOException
    //   43	50	134	org/json/JSONException
    //   178	183	185	java/io/IOException
    //   43	50	189	finally
    //   203	208	211	java/io/IOException
    //   54	65	216	finally
    //   89	116	216	finally
    //   139	171	221	finally
    //   54	65	230	org/json/JSONException
    //   54	65	243	java/io/IOException
  }
  
  /* Error */
  void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 141	com/google/tagmanager/ResourceStorageImpl:d	Lcom/google/tagmanager/LoadCallback;
    //   4: ifnonnull +13 -> 17
    //   7: new 170	java/lang/IllegalStateException
    //   10: dup
    //   11: ldc 172
    //   13: invokespecial 174	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: aload_0
    //   18: getfield 141	com/google/tagmanager/ResourceStorageImpl:d	Lcom/google/tagmanager/LoadCallback;
    //   21: invokeinterface 178 1 0
    //   26: ldc 180
    //   28: invokestatic 83	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   31: invokestatic 185	com/google/tagmanager/PreviewManager:a	()Lcom/google/tagmanager/PreviewManager;
    //   34: invokevirtual 188	com/google/tagmanager/PreviewManager:b	()Lcom/google/tagmanager/PreviewManager$PreviewMode;
    //   37: getstatic 193	com/google/tagmanager/PreviewManager$PreviewMode:b	Lcom/google/tagmanager/PreviewManager$PreviewMode;
    //   40: if_acmpeq +15 -> 55
    //   43: invokestatic 185	com/google/tagmanager/PreviewManager:a	()Lcom/google/tagmanager/PreviewManager;
    //   46: invokevirtual 188	com/google/tagmanager/PreviewManager:b	()Lcom/google/tagmanager/PreviewManager$PreviewMode;
    //   49: getstatic 195	com/google/tagmanager/PreviewManager$PreviewMode:c	Lcom/google/tagmanager/PreviewManager$PreviewMode;
    //   52: if_acmpne +32 -> 84
    //   55: aload_0
    //   56: getfield 24	com/google/tagmanager/ResourceStorageImpl:b	Ljava/lang/String;
    //   59: invokestatic 185	com/google/tagmanager/PreviewManager:a	()Lcom/google/tagmanager/PreviewManager;
    //   62: invokevirtual 197	com/google/tagmanager/PreviewManager:d	()Ljava/lang/String;
    //   65: invokevirtual 203	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   68: ifeq +16 -> 84
    //   71: aload_0
    //   72: getfield 141	com/google/tagmanager/ResourceStorageImpl:d	Lcom/google/tagmanager/LoadCallback;
    //   75: getstatic 208	com/google/tagmanager/LoadCallback$Failure:a	Lcom/google/tagmanager/LoadCallback$Failure;
    //   78: invokeinterface 211 2 0
    //   83: return
    //   84: new 213	java/io/FileInputStream
    //   87: dup
    //   88: aload_0
    //   89: invokevirtual 216	com/google/tagmanager/ResourceStorageImpl:c	()Ljava/io/File;
    //   92: invokespecial 219	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   95: astore_1
    //   96: aload_0
    //   97: getfield 141	com/google/tagmanager/ResourceStorageImpl:d	Lcom/google/tagmanager/LoadCallback;
    //   100: aload_1
    //   101: invokestatic 104	com/google/tagmanager/ProtoExtensionRegistry:a	()Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;
    //   104: invokestatic 224	com/google/tagmanager/proto/Resource$ResourceWithMetadata:a	(Ljava/io/InputStream;Lcom/google/tagmanager/protobuf/ExtensionRegistryLite;)Lcom/google/tagmanager/proto/Resource$ResourceWithMetadata;
    //   107: invokeinterface 227 2 0
    //   112: aload_1
    //   113: invokevirtual 228	java/io/FileInputStream:close	()V
    //   116: ldc 230
    //   118: invokestatic 83	com/google/tagmanager/Log:e	(Ljava/lang/String;)V
    //   121: return
    //   122: astore 7
    //   124: ldc 232
    //   126: invokestatic 234	com/google/tagmanager/Log:d	(Ljava/lang/String;)V
    //   129: aload_0
    //   130: getfield 141	com/google/tagmanager/ResourceStorageImpl:d	Lcom/google/tagmanager/LoadCallback;
    //   133: getstatic 208	com/google/tagmanager/LoadCallback$Failure:a	Lcom/google/tagmanager/LoadCallback$Failure;
    //   136: invokeinterface 211 2 0
    //   141: return
    //   142: astore 6
    //   144: ldc 236
    //   146: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   149: goto -33 -> 116
    //   152: astore 4
    //   154: ldc 238
    //   156: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   159: aload_0
    //   160: getfield 141	com/google/tagmanager/ResourceStorageImpl:d	Lcom/google/tagmanager/LoadCallback;
    //   163: getstatic 240	com/google/tagmanager/LoadCallback$Failure:b	Lcom/google/tagmanager/LoadCallback$Failure;
    //   166: invokeinterface 211 2 0
    //   171: aload_1
    //   172: invokevirtual 228	java/io/FileInputStream:close	()V
    //   175: goto -59 -> 116
    //   178: astore 5
    //   180: ldc 236
    //   182: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   185: goto -69 -> 116
    //   188: astore_2
    //   189: aload_1
    //   190: invokevirtual 228	java/io/FileInputStream:close	()V
    //   193: aload_2
    //   194: athrow
    //   195: astore_3
    //   196: ldc 236
    //   198: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   201: goto -8 -> 193
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	this	ResourceStorageImpl
    //   95	95	1	localFileInputStream	java.io.FileInputStream
    //   188	6	2	localObject	Object
    //   195	1	3	localIOException1	java.io.IOException
    //   152	1	4	localIOException2	java.io.IOException
    //   178	1	5	localIOException3	java.io.IOException
    //   142	1	6	localIOException4	java.io.IOException
    //   122	1	7	localFileNotFoundException	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   84	96	122	java/io/FileNotFoundException
    //   112	116	142	java/io/IOException
    //   96	112	152	java/io/IOException
    //   171	175	178	java/io/IOException
    //   96	112	188	finally
    //   154	171	188	finally
    //   189	193	195	java/io/IOException
  }
  
  /* Error */
  boolean b(Resource.ResourceWithMetadata paramResourceWithMetadata)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 216	com/google/tagmanager/ResourceStorageImpl:c	()Ljava/io/File;
    //   4: astore_2
    //   5: new 243	java/io/FileOutputStream
    //   8: dup
    //   9: aload_2
    //   10: invokespecial 244	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   13: astore_3
    //   14: aload_1
    //   15: aload_3
    //   16: invokevirtual 247	com/google/tagmanager/proto/Resource$ResourceWithMetadata:a	(Ljava/io/OutputStream;)V
    //   19: aload_3
    //   20: invokevirtual 248	java/io/FileOutputStream:close	()V
    //   23: iconst_1
    //   24: ireturn
    //   25: astore 10
    //   27: ldc 250
    //   29: invokestatic 93	com/google/tagmanager/Log:a	(Ljava/lang/String;)V
    //   32: iconst_0
    //   33: ireturn
    //   34: astore 9
    //   36: ldc 252
    //   38: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   41: iconst_1
    //   42: ireturn
    //   43: astore 6
    //   45: ldc 254
    //   47: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   50: aload_2
    //   51: invokevirtual 260	java/io/File:delete	()Z
    //   54: pop
    //   55: aload_3
    //   56: invokevirtual 248	java/io/FileOutputStream:close	()V
    //   59: iconst_0
    //   60: ireturn
    //   61: astore 8
    //   63: ldc 252
    //   65: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   68: iconst_0
    //   69: ireturn
    //   70: astore 4
    //   72: aload_3
    //   73: invokevirtual 248	java/io/FileOutputStream:close	()V
    //   76: aload 4
    //   78: athrow
    //   79: astore 5
    //   81: ldc 252
    //   83: invokestatic 125	com/google/tagmanager/Log:b	(Ljava/lang/String;)V
    //   86: goto -10 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	ResourceStorageImpl
    //   0	89	1	paramResourceWithMetadata	Resource.ResourceWithMetadata
    //   4	47	2	localFile	File
    //   13	60	3	localFileOutputStream	java.io.FileOutputStream
    //   70	7	4	localObject	Object
    //   79	1	5	localIOException1	java.io.IOException
    //   43	1	6	localIOException2	java.io.IOException
    //   61	1	8	localIOException3	java.io.IOException
    //   34	1	9	localIOException4	java.io.IOException
    //   25	1	10	localFileNotFoundException	java.io.FileNotFoundException
    // Exception table:
    //   from	to	target	type
    //   5	14	25	java/io/FileNotFoundException
    //   19	23	34	java/io/IOException
    //   14	19	43	java/io/IOException
    //   55	59	61	java/io/IOException
    //   14	19	70	finally
    //   45	55	70	finally
    //   72	76	79	java/io/IOException
  }
  
  File c()
  {
    String str = "resource_" + this.b;
    return new File(this.a.getDir("google_tagmanager", 0), str);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.tagmanager.ResourceStorageImpl
 * JD-Core Version:    0.7.0.1
 */