package com.google.api.client.googleapis.json;

import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;

public class GoogleJsonResponseException
  extends HttpResponseException
{
  private final transient GoogleJsonError a;
  
  private GoogleJsonResponseException(HttpResponse paramHttpResponse, GoogleJsonError paramGoogleJsonError, String paramString)
  {
    super(paramHttpResponse, paramString);
    this.a = paramGoogleJsonError;
  }
  
  /* Error */
  public static GoogleJsonResponseException a(com.google.api.client.json.JsonFactory paramJsonFactory, HttpResponse paramHttpResponse)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 21	com/google/common/base/Preconditions:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_1
    //   6: invokevirtual 27	com/google/api/client/http/HttpResponse:c	()Z
    //   9: ifne +276 -> 285
    //   12: getstatic 32	com/google/api/client/json/Json:a	Ljava/lang/String;
    //   15: aload_1
    //   16: invokevirtual 35	com/google/api/client/http/HttpResponse:a	()Ljava/lang/String;
    //   19: invokestatic 41	com/google/api/client/http/HttpMediaType:b	(Ljava/lang/String;Ljava/lang/String;)Z
    //   22: ifeq +263 -> 285
    //   25: aload_1
    //   26: invokevirtual 45	com/google/api/client/http/HttpResponse:g	()Ljava/io/InputStream;
    //   29: astore 10
    //   31: aload 10
    //   33: ifnull +252 -> 285
    //   36: aload_0
    //   37: aload_1
    //   38: invokevirtual 45	com/google/api/client/http/HttpResponse:g	()Ljava/io/InputStream;
    //   41: invokevirtual 50	com/google/api/client/json/JsonFactory:a	(Ljava/io/InputStream;)Lcom/google/api/client/json/JsonParser;
    //   44: astore 19
    //   46: aload 19
    //   48: astore 12
    //   50: aload 12
    //   52: invokevirtual 56	com/google/api/client/json/JsonParser:d	()Lcom/google/api/client/json/JsonToken;
    //   55: astore 21
    //   57: aload 21
    //   59: ifnonnull +10 -> 69
    //   62: aload 12
    //   64: invokevirtual 58	com/google/api/client/json/JsonParser:c	()Lcom/google/api/client/json/JsonToken;
    //   67: astore 21
    //   69: aload 21
    //   71: ifnull +303 -> 374
    //   74: aload 12
    //   76: ldc 60
    //   78: invokevirtual 63	com/google/api/client/json/JsonParser:a	(Ljava/lang/String;)V
    //   81: aload 12
    //   83: invokevirtual 56	com/google/api/client/json/JsonParser:d	()Lcom/google/api/client/json/JsonToken;
    //   86: getstatic 68	com/google/api/client/json/JsonToken:d	Lcom/google/api/client/json/JsonToken;
    //   89: if_acmpeq +285 -> 374
    //   92: aload 12
    //   94: ldc 70
    //   96: aconst_null
    //   97: invokevirtual 73	com/google/api/client/json/JsonParser:a	(Ljava/lang/Class;Lcom/google/api/client/json/CustomizeJsonParser;)Ljava/lang/Object;
    //   100: checkcast 70	com/google/api/client/googleapis/json/GoogleJsonError
    //   103: astore 17
    //   105: aload 17
    //   107: invokevirtual 76	com/google/api/client/googleapis/json/GoogleJsonError:toPrettyString	()Ljava/lang/String;
    //   110: astore 22
    //   112: aload 17
    //   114: astore 6
    //   116: aload 22
    //   118: astore 5
    //   120: aload 12
    //   122: ifnonnull +51 -> 173
    //   125: aload_1
    //   126: invokevirtual 80	com/google/api/client/http/HttpResponse:h	()V
    //   129: aload_1
    //   130: invokestatic 83	com/google/api/client/http/HttpResponseException:a	(Lcom/google/api/client/http/HttpResponse;)Ljava/lang/StringBuilder;
    //   133: astore 7
    //   135: aload 5
    //   137: invokestatic 88	com/google/common/base/Strings:a	(Ljava/lang/String;)Z
    //   140: ifne +17 -> 157
    //   143: aload 7
    //   145: getstatic 91	com/google/api/client/util/StringUtils:a	Ljava/lang/String;
    //   148: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   151: aload 5
    //   153: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: new 2	com/google/api/client/googleapis/json/GoogleJsonResponseException
    //   160: dup
    //   161: aload_1
    //   162: aload 6
    //   164: aload 7
    //   166: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokespecial 102	com/google/api/client/googleapis/json/GoogleJsonResponseException:<init>	(Lcom/google/api/client/http/HttpResponse;Lcom/google/api/client/googleapis/json/GoogleJsonError;Ljava/lang/String;)V
    //   172: areturn
    //   173: aload 6
    //   175: ifnonnull -46 -> 129
    //   178: aload 12
    //   180: invokevirtual 104	com/google/api/client/json/JsonParser:b	()V
    //   183: goto -54 -> 129
    //   186: astore 4
    //   188: aload 4
    //   190: invokevirtual 107	java/io/IOException:printStackTrace	()V
    //   193: goto -64 -> 129
    //   196: astore 15
    //   198: aload 15
    //   200: astore 16
    //   202: aconst_null
    //   203: astore 12
    //   205: aconst_null
    //   206: astore 17
    //   208: aload 16
    //   210: invokevirtual 107	java/io/IOException:printStackTrace	()V
    //   213: aload 12
    //   215: ifnonnull +17 -> 232
    //   218: aload_1
    //   219: invokevirtual 80	com/google/api/client/http/HttpResponse:h	()V
    //   222: aload 17
    //   224: astore 6
    //   226: aconst_null
    //   227: astore 5
    //   229: goto -100 -> 129
    //   232: aload 17
    //   234: ifnonnull +130 -> 364
    //   237: aload 12
    //   239: invokevirtual 104	com/google/api/client/json/JsonParser:b	()V
    //   242: aload 17
    //   244: astore 6
    //   246: aconst_null
    //   247: astore 5
    //   249: goto -120 -> 129
    //   252: astore 11
    //   254: aconst_null
    //   255: astore 12
    //   257: aconst_null
    //   258: astore 13
    //   260: aload 12
    //   262: ifnonnull +10 -> 272
    //   265: aload_1
    //   266: invokevirtual 80	com/google/api/client/http/HttpResponse:h	()V
    //   269: aload 11
    //   271: athrow
    //   272: aload 13
    //   274: ifnonnull -5 -> 269
    //   277: aload 12
    //   279: invokevirtual 104	com/google/api/client/json/JsonParser:b	()V
    //   282: goto -13 -> 269
    //   285: aload_1
    //   286: invokevirtual 110	com/google/api/client/http/HttpResponse:k	()Ljava/lang/String;
    //   289: astore 9
    //   291: aload 9
    //   293: astore 5
    //   295: aconst_null
    //   296: astore 6
    //   298: goto -169 -> 129
    //   301: astore_3
    //   302: aload_3
    //   303: astore 4
    //   305: aconst_null
    //   306: astore 5
    //   308: aconst_null
    //   309: astore 6
    //   311: goto -123 -> 188
    //   314: astore 4
    //   316: aload 17
    //   318: astore 6
    //   320: aconst_null
    //   321: astore 5
    //   323: goto -135 -> 188
    //   326: astore 11
    //   328: aconst_null
    //   329: astore 13
    //   331: goto -71 -> 260
    //   334: astore 18
    //   336: aload 17
    //   338: astore 13
    //   340: aload 18
    //   342: astore 11
    //   344: goto -84 -> 260
    //   347: astore 20
    //   349: aload 20
    //   351: astore 16
    //   353: aconst_null
    //   354: astore 17
    //   356: goto -148 -> 208
    //   359: astore 16
    //   361: goto -153 -> 208
    //   364: aload 17
    //   366: astore 6
    //   368: aconst_null
    //   369: astore 5
    //   371: goto -242 -> 129
    //   374: aconst_null
    //   375: astore 5
    //   377: aconst_null
    //   378: astore 6
    //   380: goto -260 -> 120
    //   383: astore 14
    //   385: aload 13
    //   387: astore 6
    //   389: aload 14
    //   391: astore 4
    //   393: aconst_null
    //   394: astore 5
    //   396: goto -208 -> 188
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	399	0	paramJsonFactory	com.google.api.client.json.JsonFactory
    //   0	399	1	paramHttpResponse	HttpResponse
    //   301	2	3	localIOException1	java.io.IOException
    //   186	3	4	localIOException2	java.io.IOException
    //   303	1	4	localObject1	java.lang.Object
    //   314	1	4	localIOException3	java.io.IOException
    //   391	1	4	localObject2	java.lang.Object
    //   118	277	5	localObject3	java.lang.Object
    //   114	274	6	localObject4	java.lang.Object
    //   133	32	7	localStringBuilder	java.lang.StringBuilder
    //   289	3	9	str1	String
    //   29	3	10	localInputStream	java.io.InputStream
    //   252	18	11	localObject5	java.lang.Object
    //   326	1	11	localObject6	java.lang.Object
    //   342	1	11	localObject7	java.lang.Object
    //   48	230	12	localJsonParser1	com.google.api.client.json.JsonParser
    //   258	128	13	localGoogleJsonError1	GoogleJsonError
    //   383	7	14	localIOException4	java.io.IOException
    //   196	3	15	localIOException5	java.io.IOException
    //   200	152	16	localObject8	java.lang.Object
    //   359	1	16	localIOException6	java.io.IOException
    //   103	262	17	localGoogleJsonError2	GoogleJsonError
    //   334	7	18	localObject9	java.lang.Object
    //   44	3	19	localJsonParser2	com.google.api.client.json.JsonParser
    //   347	3	20	localIOException7	java.io.IOException
    //   55	15	21	localJsonToken	com.google.api.client.json.JsonToken
    //   110	7	22	str2	String
    // Exception table:
    //   from	to	target	type
    //   125	129	186	java/io/IOException
    //   178	183	186	java/io/IOException
    //   36	46	196	java/io/IOException
    //   36	46	252	finally
    //   5	31	301	java/io/IOException
    //   285	291	301	java/io/IOException
    //   218	222	314	java/io/IOException
    //   237	242	314	java/io/IOException
    //   50	57	326	finally
    //   62	69	326	finally
    //   74	105	326	finally
    //   105	112	334	finally
    //   208	213	334	finally
    //   50	57	347	java/io/IOException
    //   62	69	347	java/io/IOException
    //   74	105	347	java/io/IOException
    //   105	112	359	java/io/IOException
    //   265	269	383	java/io/IOException
    //   269	272	383	java/io/IOException
    //   277	282	383	java/io/IOException
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.json.GoogleJsonResponseException
 * JD-Core Version:    0.7.0.1
 */