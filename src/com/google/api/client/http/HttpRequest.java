package com.google.api.client.http;

import com.google.api.client.util.ObjectParser;
import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;

public final class HttpRequest
{
  private HttpExecuteInterceptor a;
  private HttpHeaders b = new HttpHeaders();
  private HttpHeaders c = new HttpHeaders();
  private int d = 10;
  private int e = 16384;
  private boolean f = true;
  private boolean g = true;
  private HttpContent h;
  private final HttpTransport i;
  @Deprecated
  private HttpMethod j;
  private String k;
  private GenericUrl l;
  private int m = 20000;
  private int n = 20000;
  private HttpUnsuccessfulResponseHandler o;
  @Deprecated
  private final Map<String, HttpParser> p = new HashMap();
  private ObjectParser q;
  private boolean r;
  private BackOffPolicy s;
  private boolean t = true;
  private boolean u = true;
  private boolean v = false;
  private boolean w;
  
  HttpRequest(HttpTransport paramHttpTransport, String paramString)
  {
    this.i = paramHttpTransport;
    a(paramString);
  }
  
  private void a(long paramLong)
  {
    try
    {
      Thread.sleep(paramLong);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  @Deprecated
  public static String c(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    int i1;
    do
    {
      return paramString;
      i1 = paramString.indexOf(';');
    } while (i1 == -1);
    return paramString.substring(0, i1);
  }
  
  public HttpRequest a(BackOffPolicy paramBackOffPolicy)
  {
    this.s = paramBackOffPolicy;
    return this;
  }
  
  public HttpRequest a(GenericUrl paramGenericUrl)
  {
    this.l = ((GenericUrl)Preconditions.a(paramGenericUrl));
    return this;
  }
  
  public HttpRequest a(HttpContent paramHttpContent)
  {
    this.h = paramHttpContent;
    return this;
  }
  
  public HttpRequest a(HttpExecuteInterceptor paramHttpExecuteInterceptor)
  {
    this.a = paramHttpExecuteInterceptor;
    return this;
  }
  
  public HttpRequest a(HttpUnsuccessfulResponseHandler paramHttpUnsuccessfulResponseHandler)
  {
    this.o = paramHttpUnsuccessfulResponseHandler;
    return this;
  }
  
  public HttpRequest a(ObjectParser paramObjectParser)
  {
    this.q = paramObjectParser;
    return this;
  }
  
  public HttpRequest a(String paramString)
  {
    if ((paramString == null) || (HttpMediaType.e(paramString))) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool);
      this.k = paramString;
      this.j = null;
      if ("DELETE".equals(paramString)) {
        this.j = HttpMethod.a;
      }
      if ("GET".equals(paramString)) {
        this.j = HttpMethod.b;
      }
      if ("HEAD".equals(paramString)) {
        this.j = HttpMethod.c;
      }
      if ("PATCH".equals(paramString)) {
        this.j = HttpMethod.d;
      }
      if ("POST".equals(paramString)) {
        this.j = HttpMethod.f;
      }
      if ("PUT".equals(paramString)) {
        this.j = HttpMethod.e;
      }
      return this;
    }
  }
  
  public HttpRequest a(boolean paramBoolean)
  {
    this.r = paramBoolean;
    return this;
  }
  
  public HttpTransport a()
  {
    return this.i;
  }
  
  public boolean a(int paramInt, HttpHeaders paramHttpHeaders)
  {
    String str = paramHttpHeaders.d();
    if ((l()) && (HttpStatusCodes.b(paramInt)) && (str != null))
    {
      a(new GenericUrl(str));
      if (paramInt == 303) {
        a("GET");
      }
      return true;
    }
    return false;
  }
  
  @Deprecated
  public HttpMethod b()
  {
    return this.j;
  }
  
  @Deprecated
  public final HttpParser b(String paramString)
  {
    String str = c(paramString);
    return (HttpParser)this.p.get(str);
  }
  
  public HttpRequest b(boolean paramBoolean)
  {
    this.u = paramBoolean;
    return this;
  }
  
  public HttpRequest c(boolean paramBoolean)
  {
    this.v = paramBoolean;
    return this;
  }
  
  public String c()
  {
    return this.k;
  }
  
  public GenericUrl d()
  {
    return this.l;
  }
  
  public HttpContent e()
  {
    return this.h;
  }
  
  public int f()
  {
    return this.e;
  }
  
  public boolean g()
  {
    return this.f;
  }
  
  public HttpHeaders h()
  {
    return this.b;
  }
  
  public HttpHeaders i()
  {
    return this.c;
  }
  
  public HttpExecuteInterceptor j()
  {
    return this.a;
  }
  
  public final ObjectParser k()
  {
    return this.q;
  }
  
  public boolean l()
  {
    return this.t;
  }
  
  public boolean m()
  {
    return this.u;
  }
  
  /* Error */
  public HttpResponse n()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	com/google/api/client/http/HttpRequest:d	I
    //   4: iflt +876 -> 880
    //   7: iconst_1
    //   8: istore_1
    //   9: iload_1
    //   10: invokestatic 134	com/google/common/base/Preconditions:a	(Z)V
    //   13: aload_0
    //   14: getfield 56	com/google/api/client/http/HttpRequest:d	I
    //   17: istore_2
    //   18: aload_0
    //   19: getfield 104	com/google/api/client/http/HttpRequest:s	Lcom/google/api/client/http/BackOffPolicy;
    //   22: ifnull +12 -> 34
    //   25: aload_0
    //   26: getfield 104	com/google/api/client/http/HttpRequest:s	Lcom/google/api/client/http/BackOffPolicy;
    //   29: invokeinterface 213 1 0
    //   34: aconst_null
    //   35: astore_3
    //   36: aload_0
    //   37: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   40: invokestatic 110	com/google/common/base/Preconditions:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   43: pop
    //   44: aload_0
    //   45: getfield 114	com/google/api/client/http/HttpRequest:l	Lcom/google/api/client/http/GenericUrl;
    //   48: invokestatic 110	com/google/common/base/Preconditions:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   51: pop
    //   52: iload_2
    //   53: istore 6
    //   55: aload_3
    //   56: ifnull +7 -> 63
    //   59: aload_3
    //   60: invokevirtual 217	com/google/api/client/http/HttpResponse:h	()V
    //   63: aload_0
    //   64: getfield 120	com/google/api/client/http/HttpRequest:a	Lcom/google/api/client/http/HttpExecuteInterceptor;
    //   67: ifnull +13 -> 80
    //   70: aload_0
    //   71: getfield 120	com/google/api/client/http/HttpRequest:a	Lcom/google/api/client/http/HttpExecuteInterceptor;
    //   74: aload_0
    //   75: invokeinterface 222 2 0
    //   80: aload_0
    //   81: getfield 114	com/google/api/client/http/HttpRequest:l	Lcom/google/api/client/http/GenericUrl;
    //   84: invokevirtual 224	com/google/api/client/http/GenericUrl:c	()Ljava/lang/String;
    //   87: astore 7
    //   89: aload_0
    //   90: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   93: ldc 140
    //   95: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   98: ifeq +787 -> 885
    //   101: aload_0
    //   102: getfield 79	com/google/api/client/http/HttpRequest:i	Lcom/google/api/client/http/HttpTransport;
    //   105: aload 7
    //   107: invokevirtual 229	com/google/api/client/http/HttpTransport:b	(Ljava/lang/String;)Lcom/google/api/client/http/LowLevelHttpRequest;
    //   110: astore 8
    //   112: getstatic 232	com/google/api/client/http/HttpTransport:a	Ljava/util/logging/Logger;
    //   115: astore 9
    //   117: aload_0
    //   118: getfield 60	com/google/api/client/http/HttpRequest:f	Z
    //   121: ifeq +912 -> 1033
    //   124: aload 9
    //   126: getstatic 238	java/util/logging/Level:CONFIG	Ljava/util/logging/Level;
    //   129: invokevirtual 244	java/util/logging/Logger:isLoggable	(Ljava/util/logging/Level;)Z
    //   132: ifeq +901 -> 1033
    //   135: iconst_1
    //   136: istore 10
    //   138: iload 10
    //   140: ifeq +1191 -> 1331
    //   143: new 246	java/lang/StringBuilder
    //   146: dup
    //   147: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   150: astore 11
    //   152: aload 11
    //   154: ldc 249
    //   156: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: getstatic 257	com/google/api/client/util/StringUtils:a	Ljava/lang/String;
    //   162: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: pop
    //   166: aload 11
    //   168: aload_0
    //   169: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   172: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: bipush 32
    //   177: invokevirtual 260	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   180: aload 7
    //   182: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   185: getstatic 257	com/google/api/client/util/StringUtils:a	Ljava/lang/String;
    //   188: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   191: pop
    //   192: aload_0
    //   193: getfield 62	com/google/api/client/http/HttpRequest:g	Z
    //   196: ifeq +1125 -> 1321
    //   199: new 246	java/lang/StringBuilder
    //   202: dup
    //   203: ldc_w 262
    //   206: invokespecial 263	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   209: astore 14
    //   211: aload_0
    //   212: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   215: ldc 150
    //   217: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   220: ifne +19 -> 239
    //   223: aload 14
    //   225: ldc_w 265
    //   228: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: aload_0
    //   232: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   235: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: pop
    //   239: aload 14
    //   241: astore 15
    //   243: aload 11
    //   245: astore 16
    //   247: aload_0
    //   248: getfield 52	com/google/api/client/http/HttpRequest:b	Lcom/google/api/client/http/HttpHeaders;
    //   251: invokevirtual 267	com/google/api/client/http/HttpHeaders:f	()Ljava/lang/String;
    //   254: astore 17
    //   256: aload_0
    //   257: getfield 269	com/google/api/client/http/HttpRequest:w	Z
    //   260: ifne +18 -> 278
    //   263: aload 17
    //   265: ifnonnull +774 -> 1039
    //   268: aload_0
    //   269: getfield 52	com/google/api/client/http/HttpRequest:b	Lcom/google/api/client/http/HttpHeaders;
    //   272: ldc_w 271
    //   275: invokevirtual 273	com/google/api/client/http/HttpHeaders:d	(Ljava/lang/String;)V
    //   278: aload_0
    //   279: getfield 52	com/google/api/client/http/HttpRequest:b	Lcom/google/api/client/http/HttpHeaders;
    //   282: aload 16
    //   284: aload 15
    //   286: aload 9
    //   288: aload 8
    //   290: invokestatic 276	com/google/api/client/http/HttpHeaders:a	(Lcom/google/api/client/http/HttpHeaders;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;Ljava/util/logging/Logger;Lcom/google/api/client/http/LowLevelHttpRequest;)V
    //   293: aload_0
    //   294: getfield 269	com/google/api/client/http/HttpRequest:w	Z
    //   297: ifne +12 -> 309
    //   300: aload_0
    //   301: getfield 52	com/google/api/client/http/HttpRequest:b	Lcom/google/api/client/http/HttpHeaders;
    //   304: aload 17
    //   306: invokevirtual 273	com/google/api/client/http/HttpHeaders:d	(Ljava/lang/String;)V
    //   309: aload_0
    //   310: getfield 117	com/google/api/client/http/HttpRequest:h	Lcom/google/api/client/http/HttpContent;
    //   313: astore 18
    //   315: aload 18
    //   317: ifnull +328 -> 645
    //   320: aload 18
    //   322: invokeinterface 280 1 0
    //   327: astore 42
    //   329: aload 18
    //   331: invokeinterface 283 1 0
    //   336: lstore 43
    //   338: aload 18
    //   340: invokeinterface 285 1 0
    //   345: astore 45
    //   347: iload 10
    //   349: ifeq +965 -> 1314
    //   352: new 287	com/google/api/client/http/LogContent
    //   355: dup
    //   356: aload 18
    //   358: aload 45
    //   360: aload 42
    //   362: lload 43
    //   364: aload_0
    //   365: getfield 58	com/google/api/client/http/HttpRequest:e	I
    //   368: invokespecial 290	com/google/api/client/http/LogContent:<init>	(Lcom/google/api/client/http/HttpContent;Ljava/lang/String;Ljava/lang/String;JI)V
    //   371: astore 46
    //   373: aload 46
    //   375: invokeinterface 280 1 0
    //   380: astore 47
    //   382: aload_0
    //   383: getfield 171	com/google/api/client/http/HttpRequest:r	Z
    //   386: ifeq +921 -> 1307
    //   389: new 292	com/google/api/client/http/GZipContent
    //   392: dup
    //   393: aload 46
    //   395: aload 45
    //   397: invokespecial 295	com/google/api/client/http/GZipContent:<init>	(Lcom/google/api/client/http/HttpContent;Ljava/lang/String;)V
    //   400: astore 18
    //   402: aload 18
    //   404: invokeinterface 280 1 0
    //   409: pop
    //   410: aload 18
    //   412: invokeinterface 283 1 0
    //   417: lstore 43
    //   419: iload 10
    //   421: ifeq +203 -> 624
    //   424: aload 45
    //   426: ifnull +78 -> 504
    //   429: new 246	java/lang/StringBuilder
    //   432: dup
    //   433: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   436: ldc_w 297
    //   439: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: aload 45
    //   444: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   447: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   450: astore 54
    //   452: aload 16
    //   454: aload 54
    //   456: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: getstatic 257	com/google/api/client/util/StringUtils:a	Ljava/lang/String;
    //   462: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   465: pop
    //   466: aload 15
    //   468: ifnull +36 -> 504
    //   471: aload 15
    //   473: new 246	java/lang/StringBuilder
    //   476: dup
    //   477: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   480: ldc_w 302
    //   483: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: aload 54
    //   488: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   491: ldc_w 304
    //   494: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   500: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: pop
    //   504: aload 47
    //   506: ifnull +78 -> 584
    //   509: new 246	java/lang/StringBuilder
    //   512: dup
    //   513: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   516: ldc_w 306
    //   519: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   522: aload 47
    //   524: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   530: astore 51
    //   532: aload 16
    //   534: aload 51
    //   536: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: getstatic 257	com/google/api/client/util/StringUtils:a	Ljava/lang/String;
    //   542: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   545: pop
    //   546: aload 15
    //   548: ifnull +36 -> 584
    //   551: aload 15
    //   553: new 246	java/lang/StringBuilder
    //   556: dup
    //   557: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   560: ldc_w 302
    //   563: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   566: aload 51
    //   568: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   571: ldc_w 304
    //   574: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   580: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   583: pop
    //   584: lload 43
    //   586: lconst_0
    //   587: lcmp
    //   588: iflt +36 -> 624
    //   591: aload 16
    //   593: new 246	java/lang/StringBuilder
    //   596: dup
    //   597: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   600: ldc_w 308
    //   603: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   606: lload 43
    //   608: invokevirtual 311	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   611: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   614: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   617: getstatic 257	com/google/api/client/util/StringUtils:a	Ljava/lang/String;
    //   620: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   623: pop
    //   624: aload 15
    //   626: ifnull +12 -> 638
    //   629: aload 15
    //   631: ldc_w 313
    //   634: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   637: pop
    //   638: aload 8
    //   640: aload 18
    //   642: invokevirtual 318	com/google/api/client/http/LowLevelHttpRequest:a	(Lcom/google/api/client/http/HttpContent;)V
    //   645: iload 10
    //   647: ifeq +59 -> 706
    //   650: aload 9
    //   652: aload 16
    //   654: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   657: invokevirtual 321	java/util/logging/Logger:config	(Ljava/lang/String;)V
    //   660: aload 15
    //   662: ifnull +44 -> 706
    //   665: aload 15
    //   667: ldc_w 323
    //   670: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   673: pop
    //   674: aload 15
    //   676: aload 7
    //   678: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   681: pop
    //   682: aload 18
    //   684: ifnull +12 -> 696
    //   687: aload 15
    //   689: ldc_w 325
    //   692: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   695: pop
    //   696: aload 9
    //   698: aload 15
    //   700: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   703: invokevirtual 321	java/util/logging/Logger:config	(Ljava/lang/String;)V
    //   706: iload 6
    //   708: ifle +368 -> 1076
    //   711: aload 18
    //   713: ifnull +13 -> 726
    //   716: aload 18
    //   718: invokeinterface 327 1 0
    //   723: ifeq +353 -> 1076
    //   726: iconst_1
    //   727: istore 19
    //   729: aload 8
    //   731: aload_0
    //   732: getfield 64	com/google/api/client/http/HttpRequest:m	I
    //   735: aload_0
    //   736: getfield 66	com/google/api/client/http/HttpRequest:n	I
    //   739: invokevirtual 330	com/google/api/client/http/LowLevelHttpRequest:a	(II)V
    //   742: aload 8
    //   744: invokevirtual 333	com/google/api/client/http/LowLevelHttpRequest:a	()Lcom/google/api/client/http/LowLevelHttpResponse;
    //   747: astore 36
    //   749: new 215	com/google/api/client/http/HttpResponse
    //   752: dup
    //   753: aload_0
    //   754: aload 36
    //   756: invokespecial 336	com/google/api/client/http/HttpResponse:<init>	(Lcom/google/api/client/http/HttpRequest;Lcom/google/api/client/http/LowLevelHttpResponse;)V
    //   759: astore 37
    //   761: aload 37
    //   763: astore_3
    //   764: aconst_null
    //   765: astore 20
    //   767: aload_3
    //   768: ifnull +462 -> 1230
    //   771: aload_3
    //   772: invokevirtual 338	com/google/api/client/http/HttpResponse:c	()Z
    //   775: ifne +455 -> 1230
    //   778: aload_0
    //   779: getfield 123	com/google/api/client/http/HttpRequest:o	Lcom/google/api/client/http/HttpUnsuccessfulResponseHandler;
    //   782: astore 26
    //   784: iconst_0
    //   785: istore 27
    //   787: aload 26
    //   789: ifnull +18 -> 807
    //   792: aload_0
    //   793: getfield 123	com/google/api/client/http/HttpRequest:o	Lcom/google/api/client/http/HttpUnsuccessfulResponseHandler;
    //   796: aload_0
    //   797: aload_3
    //   798: iload 19
    //   800: invokeinterface 343 4 0
    //   805: istore 27
    //   807: iconst_0
    //   808: istore 28
    //   810: iconst_0
    //   811: istore 29
    //   813: iload 27
    //   815: ifne +525 -> 1340
    //   818: aload_0
    //   819: aload_3
    //   820: invokevirtual 345	com/google/api/client/http/HttpResponse:d	()I
    //   823: aload_3
    //   824: invokevirtual 347	com/google/api/client/http/HttpResponse:b	()Lcom/google/api/client/http/HttpHeaders;
    //   827: invokevirtual 349	com/google/api/client/http/HttpRequest:a	(ILcom/google/api/client/http/HttpHeaders;)Z
    //   830: ifeq +295 -> 1125
    //   833: iconst_1
    //   834: istore 28
    //   836: iconst_0
    //   837: istore 29
    //   839: goto +501 -> 1340
    //   842: iload 19
    //   844: iload 30
    //   846: iand
    //   847: istore 22
    //   849: iload 22
    //   851: ifeq +7 -> 858
    //   854: aload_3
    //   855: invokevirtual 217	com/google/api/client/http/HttpResponse:h	()V
    //   858: iload 6
    //   860: iconst_1
    //   861: isub
    //   862: istore 23
    //   864: aload_3
    //   865: ifnull +3 -> 868
    //   868: iload 22
    //   870: ifne +430 -> 1300
    //   873: aload_3
    //   874: ifnonnull +392 -> 1266
    //   877: aload 20
    //   879: athrow
    //   880: iconst_0
    //   881: istore_1
    //   882: goto -873 -> 9
    //   885: aload_0
    //   886: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   889: ldc 150
    //   891: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   894: ifeq +17 -> 911
    //   897: aload_0
    //   898: getfield 79	com/google/api/client/http/HttpRequest:i	Lcom/google/api/client/http/HttpTransport;
    //   901: aload 7
    //   903: invokevirtual 351	com/google/api/client/http/HttpTransport:c	(Ljava/lang/String;)Lcom/google/api/client/http/LowLevelHttpRequest;
    //   906: astore 8
    //   908: goto -796 -> 112
    //   911: aload_0
    //   912: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   915: ldc 154
    //   917: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   920: ifeq +17 -> 937
    //   923: aload_0
    //   924: getfield 79	com/google/api/client/http/HttpRequest:i	Lcom/google/api/client/http/HttpTransport;
    //   927: aload 7
    //   929: invokevirtual 353	com/google/api/client/http/HttpTransport:d	(Ljava/lang/String;)Lcom/google/api/client/http/LowLevelHttpRequest;
    //   932: astore 8
    //   934: goto -822 -> 112
    //   937: aload_0
    //   938: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   941: ldc 158
    //   943: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   946: ifeq +17 -> 963
    //   949: aload_0
    //   950: getfield 79	com/google/api/client/http/HttpRequest:i	Lcom/google/api/client/http/HttpTransport;
    //   953: aload 7
    //   955: invokevirtual 355	com/google/api/client/http/HttpTransport:e	(Ljava/lang/String;)Lcom/google/api/client/http/LowLevelHttpRequest;
    //   958: astore 8
    //   960: goto -848 -> 112
    //   963: aload_0
    //   964: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   967: ldc 162
    //   969: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   972: ifeq +17 -> 989
    //   975: aload_0
    //   976: getfield 79	com/google/api/client/http/HttpRequest:i	Lcom/google/api/client/http/HttpTransport;
    //   979: aload 7
    //   981: invokevirtual 357	com/google/api/client/http/HttpTransport:f	(Ljava/lang/String;)Lcom/google/api/client/http/LowLevelHttpRequest;
    //   984: astore 8
    //   986: goto -874 -> 112
    //   989: aload_0
    //   990: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   993: ldc 166
    //   995: invokevirtual 144	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   998: ifeq +17 -> 1015
    //   1001: aload_0
    //   1002: getfield 79	com/google/api/client/http/HttpRequest:i	Lcom/google/api/client/http/HttpTransport;
    //   1005: aload 7
    //   1007: invokevirtual 359	com/google/api/client/http/HttpTransport:g	(Ljava/lang/String;)Lcom/google/api/client/http/LowLevelHttpRequest;
    //   1010: astore 8
    //   1012: goto -900 -> 112
    //   1015: aload_0
    //   1016: getfield 79	com/google/api/client/http/HttpRequest:i	Lcom/google/api/client/http/HttpTransport;
    //   1019: aload_0
    //   1020: getfield 136	com/google/api/client/http/HttpRequest:k	Ljava/lang/String;
    //   1023: aload 7
    //   1025: invokevirtual 362	com/google/api/client/http/HttpTransport:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/google/api/client/http/LowLevelHttpRequest;
    //   1028: astore 8
    //   1030: goto -918 -> 112
    //   1033: iconst_0
    //   1034: istore 10
    //   1036: goto -898 -> 138
    //   1039: aload_0
    //   1040: getfield 52	com/google/api/client/http/HttpRequest:b	Lcom/google/api/client/http/HttpHeaders;
    //   1043: new 246	java/lang/StringBuilder
    //   1046: dup
    //   1047: invokespecial 247	java/lang/StringBuilder:<init>	()V
    //   1050: aload 17
    //   1052: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1055: ldc_w 364
    //   1058: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1061: ldc_w 271
    //   1064: invokevirtual 253	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1067: invokevirtual 300	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1070: invokevirtual 273	com/google/api/client/http/HttpHeaders:d	(Ljava/lang/String;)V
    //   1073: goto -795 -> 278
    //   1076: iconst_0
    //   1077: istore 19
    //   1079: goto -350 -> 729
    //   1082: astore 38
    //   1084: aload 36
    //   1086: invokevirtual 369	com/google/api/client/http/LowLevelHttpResponse:a	()Ljava/io/InputStream;
    //   1089: invokevirtual 374	java/io/InputStream:close	()V
    //   1092: aload 38
    //   1094: athrow
    //   1095: astore 20
    //   1097: aload_0
    //   1098: getfield 77	com/google/api/client/http/HttpRequest:v	Z
    //   1101: ifne +6 -> 1107
    //   1104: aload 20
    //   1106: athrow
    //   1107: aload 9
    //   1109: getstatic 377	java/util/logging/Level:WARNING	Ljava/util/logging/Level;
    //   1112: ldc_w 379
    //   1115: aload 20
    //   1117: invokevirtual 383	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1120: aconst_null
    //   1121: astore_3
    //   1122: goto -355 -> 767
    //   1125: iconst_0
    //   1126: istore 28
    //   1128: iconst_0
    //   1129: istore 29
    //   1131: iload 19
    //   1133: ifeq +207 -> 1340
    //   1136: aload_0
    //   1137: getfield 104	com/google/api/client/http/HttpRequest:s	Lcom/google/api/client/http/BackOffPolicy;
    //   1140: astore 31
    //   1142: iconst_0
    //   1143: istore 28
    //   1145: iconst_0
    //   1146: istore 29
    //   1148: aload 31
    //   1150: ifnull +190 -> 1340
    //   1153: aload_0
    //   1154: getfield 104	com/google/api/client/http/HttpRequest:s	Lcom/google/api/client/http/BackOffPolicy;
    //   1157: aload_3
    //   1158: invokevirtual 345	com/google/api/client/http/HttpResponse:d	()I
    //   1161: invokeinterface 385 2 0
    //   1166: istore 32
    //   1168: iconst_0
    //   1169: istore 28
    //   1171: iconst_0
    //   1172: istore 29
    //   1174: iload 32
    //   1176: ifeq +164 -> 1340
    //   1179: aload_0
    //   1180: getfield 104	com/google/api/client/http/HttpRequest:s	Lcom/google/api/client/http/BackOffPolicy;
    //   1183: invokeinterface 387 1 0
    //   1188: lstore 33
    //   1190: lload 33
    //   1192: ldc2_w 388
    //   1195: lcmp
    //   1196: istore 35
    //   1198: iconst_0
    //   1199: istore 28
    //   1201: iconst_0
    //   1202: istore 29
    //   1204: iload 35
    //   1206: ifeq +134 -> 1340
    //   1209: aload_0
    //   1210: lload 33
    //   1212: invokespecial 391	com/google/api/client/http/HttpRequest:a	(J)V
    //   1215: iconst_1
    //   1216: istore 29
    //   1218: iconst_0
    //   1219: istore 28
    //   1221: goto +119 -> 1340
    //   1224: iconst_0
    //   1225: istore 30
    //   1227: goto -385 -> 842
    //   1230: aload_3
    //   1231: ifnonnull +16 -> 1247
    //   1234: iconst_1
    //   1235: istore 21
    //   1237: iload 19
    //   1239: iload 21
    //   1241: iand
    //   1242: istore 22
    //   1244: goto -386 -> 858
    //   1247: iconst_0
    //   1248: istore 21
    //   1250: goto -13 -> 1237
    //   1253: astore 25
    //   1255: aload_3
    //   1256: ifnull +7 -> 1263
    //   1259: aload_3
    //   1260: invokevirtual 393	com/google/api/client/http/HttpResponse:i	()V
    //   1263: aload 25
    //   1265: athrow
    //   1266: aload_0
    //   1267: getfield 75	com/google/api/client/http/HttpRequest:u	Z
    //   1270: ifeq +28 -> 1298
    //   1273: aload_3
    //   1274: invokevirtual 338	com/google/api/client/http/HttpResponse:c	()Z
    //   1277: ifne +21 -> 1298
    //   1280: new 395	com/google/api/client/http/HttpResponseException
    //   1283: dup
    //   1284: aload_3
    //   1285: invokespecial 398	com/google/api/client/http/HttpResponseException:<init>	(Lcom/google/api/client/http/HttpResponse;)V
    //   1288: athrow
    //   1289: astore 24
    //   1291: aload_3
    //   1292: invokevirtual 393	com/google/api/client/http/HttpResponse:i	()V
    //   1295: aload 24
    //   1297: athrow
    //   1298: aload_3
    //   1299: areturn
    //   1300: iload 23
    //   1302: istore 6
    //   1304: goto -1249 -> 55
    //   1307: aload 46
    //   1309: astore 18
    //   1311: goto -892 -> 419
    //   1314: aload 18
    //   1316: astore 46
    //   1318: goto -945 -> 373
    //   1321: aload 11
    //   1323: astore 16
    //   1325: aconst_null
    //   1326: astore 15
    //   1328: goto -1081 -> 247
    //   1331: aconst_null
    //   1332: astore 15
    //   1334: aconst_null
    //   1335: astore 16
    //   1337: goto -1090 -> 247
    //   1340: iload 27
    //   1342: ifne +13 -> 1355
    //   1345: iload 28
    //   1347: ifne +8 -> 1355
    //   1350: iload 29
    //   1352: ifeq -128 -> 1224
    //   1355: iconst_1
    //   1356: istore 30
    //   1358: goto -516 -> 842
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1361	0	this	HttpRequest
    //   8	874	1	bool1	boolean
    //   17	36	2	i1	int
    //   35	1264	3	localObject1	Object
    //   53	1250	6	i2	int
    //   87	937	7	str1	String
    //   110	919	8	localLowLevelHttpRequest	LowLevelHttpRequest
    //   115	993	9	localLogger	java.util.logging.Logger
    //   136	899	10	i3	int
    //   150	1172	11	localStringBuilder1	java.lang.StringBuilder
    //   209	31	14	localStringBuilder2	java.lang.StringBuilder
    //   241	1092	15	localStringBuilder3	java.lang.StringBuilder
    //   245	1091	16	localStringBuilder4	java.lang.StringBuilder
    //   254	797	17	str2	String
    //   313	1002	18	localObject2	Object
    //   727	515	19	bool2	boolean
    //   765	113	20	localObject3	Object
    //   1095	21	20	localIOException	java.io.IOException
    //   1235	14	21	bool3	boolean
    //   847	396	22	i4	int
    //   862	439	23	i5	int
    //   1289	7	24	localObject4	Object
    //   1253	11	25	localObject5	Object
    //   782	6	26	localHttpUnsuccessfulResponseHandler	HttpUnsuccessfulResponseHandler
    //   785	556	27	bool4	boolean
    //   808	538	28	i6	int
    //   811	540	29	i7	int
    //   844	513	30	bool5	boolean
    //   1140	9	31	localBackOffPolicy	BackOffPolicy
    //   1166	9	32	bool6	boolean
    //   1188	23	33	l1	long
    //   1196	9	35	bool7	boolean
    //   747	338	36	localLowLevelHttpResponse	LowLevelHttpResponse
    //   759	3	37	localHttpResponse	HttpResponse
    //   1082	11	38	localObject6	Object
    //   327	34	42	str3	String
    //   336	271	43	l2	long
    //   345	98	45	str4	String
    //   371	946	46	localObject7	Object
    //   380	143	47	str5	String
    //   530	37	51	str6	String
    //   450	37	54	str7	String
    // Exception table:
    //   from	to	target	type
    //   749	761	1082	finally
    //   742	749	1095	java/io/IOException
    //   1084	1095	1095	java/io/IOException
    //   771	784	1253	finally
    //   792	807	1253	finally
    //   818	833	1253	finally
    //   854	858	1253	finally
    //   1136	1142	1253	finally
    //   1153	1168	1253	finally
    //   1179	1190	1253	finally
    //   1209	1215	1253	finally
    //   1280	1289	1289	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.HttpRequest
 * JD-Core Version:    0.7.0.1
 */