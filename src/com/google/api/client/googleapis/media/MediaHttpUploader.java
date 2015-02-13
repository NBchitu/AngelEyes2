package com.google.api.client.googleapis.media;

import com.google.api.client.googleapis.GoogleHeaders;
import com.google.api.client.googleapis.MethodOverride;
import com.google.api.client.http.AbstractInputStreamContent;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.InputStreamContent;
import com.google.common.base.Preconditions;
import com.google.common.io.LimitInputStream;
import java.io.InputStream;

public final class MediaHttpUploader
{
  private MediaHttpUploader.UploadState a = MediaHttpUploader.UploadState.a;
  private final AbstractInputStreamContent b;
  private final HttpRequestFactory c;
  private final HttpTransport d;
  private HttpContent e;
  private long f;
  @Deprecated
  private HttpMethod g = HttpMethod.f;
  private String h = "POST";
  private GoogleHeaders i = new GoogleHeaders();
  private HttpRequest j;
  private InputStream k;
  private boolean l = true;
  private boolean m;
  private MediaHttpUploaderProgressListener n;
  private long o;
  private int p = 10485760;
  
  public MediaHttpUploader(AbstractInputStreamContent paramAbstractInputStreamContent, HttpTransport paramHttpTransport, HttpRequestInitializer paramHttpRequestInitializer)
  {
    this.b = ((AbstractInputStreamContent)Preconditions.a(paramAbstractInputStreamContent));
    this.d = ((HttpTransport)Preconditions.a(paramHttpTransport));
    if (paramHttpRequestInitializer == null) {}
    for (HttpRequestFactory localHttpRequestFactory = paramHttpTransport.a();; localHttpRequestFactory = paramHttpTransport.a(paramHttpRequestInitializer))
    {
      this.c = localHttpRequestFactory;
      return;
    }
  }
  
  private void a(long paramLong)
  {
    int i1 = (int)Math.min(this.p, b() - paramLong);
    InputStreamContent localInputStreamContent = new InputStreamContent(this.b.e(), new LimitInputStream(this.k, i1));
    localInputStreamContent.c(false);
    localInputStreamContent.b(true);
    localInputStreamContent.a(i1);
    this.k.mark(i1);
    this.j.a(localInputStreamContent);
    this.j.h().c("bytes " + paramLong + "-" + (paramLong + i1 - 1L) + "/" + b());
  }
  
  private void a(MediaHttpUploader.UploadState paramUploadState)
  {
    this.a = paramUploadState;
    if (this.n != null) {
      this.n.a(this);
    }
  }
  
  private void a(HttpRequest paramHttpRequest)
  {
    new MethodOverride().a(paramHttpRequest);
  }
  
  private long b()
  {
    if (this.f == 0L)
    {
      this.f = this.b.b();
      if (this.f == -1L) {
        break label42;
      }
    }
    label42:
    for (boolean bool = true;; bool = false)
    {
      Preconditions.a(bool);
      return this.f;
    }
  }
  
  private long b(String paramString)
  {
    if (paramString == null) {
      return 0L;
    }
    return 1L + Long.parseLong(paramString.substring(1 + paramString.indexOf('-')));
  }
  
  private HttpResponse b(GenericUrl paramGenericUrl)
  {
    a(MediaHttpUploader.UploadState.b);
    paramGenericUrl.put("uploadType", "resumable");
    if (this.e == null) {}
    for (Object localObject1 = new EmptyContent();; localObject1 = this.e)
    {
      HttpRequest localHttpRequest = this.c.a(this.h, paramGenericUrl, (HttpContent)localObject1);
      a(localHttpRequest);
      this.i.a(this.b.e());
      this.i.a(Long.valueOf(b()));
      localHttpRequest.h().putAll(this.i);
      localHttpRequest.b(false);
      localHttpRequest.c(true);
      localHttpRequest.a(true);
      HttpResponse localHttpResponse = localHttpRequest.n();
      try
      {
        return localHttpResponse;
      }
      finally
      {
        localHttpResponse.i();
      }
    }
  }
  
  public MediaHttpUploader a(GoogleHeaders paramGoogleHeaders)
  {
    this.i = paramGoogleHeaders;
    return this;
  }
  
  public MediaHttpUploader a(HttpContent paramHttpContent)
  {
    this.e = paramHttpContent;
    return this;
  }
  
  public MediaHttpUploader a(String paramString)
  {
    boolean bool;
    if ((paramString.equals("POST")) || (paramString.equals("PUT")))
    {
      bool = true;
      Preconditions.a(bool);
      this.h = paramString;
      if (!paramString.equals("POST")) {
        break label55;
      }
    }
    label55:
    for (HttpMethod localHttpMethod = HttpMethod.f;; localHttpMethod = HttpMethod.e)
    {
      this.g = localHttpMethod;
      return this;
      bool = false;
      break;
    }
  }
  
  /* Error */
  public HttpResponse a(GenericUrl paramGenericUrl)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	com/google/api/client/googleapis/media/MediaHttpUploader:a	Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;
    //   4: getstatic 44	com/google/api/client/googleapis/media/MediaHttpUploader$UploadState:a	Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;
    //   7: if_acmpne +140 -> 147
    //   10: iconst_1
    //   11: istore_2
    //   12: iload_2
    //   13: invokestatic 181	com/google/common/base/Preconditions:a	(Z)V
    //   16: aload_0
    //   17: getfield 265	com/google/api/client/googleapis/media/MediaHttpUploader:m	Z
    //   20: ifeq +155 -> 175
    //   23: aload_0
    //   24: getstatic 267	com/google/api/client/googleapis/media/MediaHttpUploader$UploadState:d	Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;
    //   27: invokespecial 202	com/google/api/client/googleapis/media/MediaHttpUploader:a	(Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;)V
    //   30: aload_0
    //   31: getfield 74	com/google/api/client/googleapis/media/MediaHttpUploader:b	Lcom/google/api/client/http/AbstractInputStreamContent;
    //   34: astore 12
    //   36: aload_0
    //   37: getfield 214	com/google/api/client/googleapis/media/MediaHttpUploader:e	Lcom/google/api/client/http/HttpContent;
    //   40: ifnull +112 -> 152
    //   43: aload_0
    //   44: getfield 214	com/google/api/client/googleapis/media/MediaHttpUploader:e	Lcom/google/api/client/http/HttpContent;
    //   47: astore 19
    //   49: iconst_1
    //   50: anewarray 269	com/google/api/client/http/HttpContent
    //   53: astore 20
    //   55: aload 20
    //   57: iconst_0
    //   58: aload_0
    //   59: getfield 74	com/google/api/client/googleapis/media/MediaHttpUploader:b	Lcom/google/api/client/http/AbstractInputStreamContent;
    //   62: aastore
    //   63: new 271	com/google/api/client/http/MultipartRelatedContent
    //   66: dup
    //   67: aload 19
    //   69: aload 20
    //   71: invokespecial 274	com/google/api/client/http/MultipartRelatedContent:<init>	(Lcom/google/api/client/http/HttpContent;[Lcom/google/api/client/http/HttpContent;)V
    //   74: astore 12
    //   76: aload_1
    //   77: ldc 204
    //   79: ldc_w 276
    //   82: invokevirtual 212	com/google/api/client/http/GenericUrl:put	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   85: pop
    //   86: aload_0
    //   87: getfield 83	com/google/api/client/googleapis/media/MediaHttpUploader:c	Lcom/google/api/client/http/HttpRequestFactory;
    //   90: aload_0
    //   91: getfield 55	com/google/api/client/googleapis/media/MediaHttpUploader:h	Ljava/lang/String;
    //   94: aload_1
    //   95: aload 12
    //   97: invokevirtual 222	com/google/api/client/http/HttpRequestFactory:a	(Ljava/lang/String;Lcom/google/api/client/http/GenericUrl;Lcom/google/api/client/http/HttpContent;)Lcom/google/api/client/http/HttpRequest;
    //   100: astore 14
    //   102: aload 14
    //   104: iconst_0
    //   105: invokevirtual 239	com/google/api/client/http/HttpRequest:b	(Z)Lcom/google/api/client/http/HttpRequest;
    //   108: pop
    //   109: aload 14
    //   111: iconst_1
    //   112: invokevirtual 243	com/google/api/client/http/HttpRequest:a	(Z)Lcom/google/api/client/http/HttpRequest;
    //   115: pop
    //   116: aload_0
    //   117: aload 14
    //   119: invokespecial 223	com/google/api/client/googleapis/media/MediaHttpUploader:a	(Lcom/google/api/client/http/HttpRequest;)V
    //   122: aload 14
    //   124: invokevirtual 246	com/google/api/client/http/HttpRequest:n	()Lcom/google/api/client/http/HttpResponse;
    //   127: astore 17
    //   129: aload_0
    //   130: aload_0
    //   131: invokespecial 90	com/google/api/client/googleapis/media/MediaHttpUploader:b	()J
    //   134: putfield 278	com/google/api/client/googleapis/media/MediaHttpUploader:o	J
    //   137: aload_0
    //   138: getstatic 280	com/google/api/client/googleapis/media/MediaHttpUploader$UploadState:e	Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;
    //   141: invokespecial 202	com/google/api/client/googleapis/media/MediaHttpUploader:a	(Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;)V
    //   144: aload 17
    //   146: areturn
    //   147: iconst_0
    //   148: istore_2
    //   149: goto -137 -> 12
    //   152: aload_1
    //   153: ldc 204
    //   155: ldc_w 282
    //   158: invokevirtual 212	com/google/api/client/http/GenericUrl:put	(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    //   161: pop
    //   162: goto -76 -> 86
    //   165: astore 18
    //   167: aload 17
    //   169: invokevirtual 252	com/google/api/client/http/HttpResponse:i	()V
    //   172: aload 18
    //   174: athrow
    //   175: aload_0
    //   176: aload_1
    //   177: invokespecial 284	com/google/api/client/googleapis/media/MediaHttpUploader:b	(Lcom/google/api/client/http/GenericUrl;)Lcom/google/api/client/http/HttpResponse;
    //   180: astore_3
    //   181: new 208	com/google/api/client/http/GenericUrl
    //   184: dup
    //   185: aload_3
    //   186: invokevirtual 286	com/google/api/client/http/HttpResponse:b	()Lcom/google/api/client/http/HttpHeaders;
    //   189: invokevirtual 288	com/google/api/client/http/HttpHeaders:d	()Ljava/lang/String;
    //   192: invokespecial 290	com/google/api/client/http/GenericUrl:<init>	(Ljava/lang/String;)V
    //   195: astore 4
    //   197: aload_3
    //   198: invokevirtual 252	com/google/api/client/http/HttpResponse:i	()V
    //   201: aload_0
    //   202: aload_0
    //   203: getfield 74	com/google/api/client/googleapis/media/MediaHttpUploader:b	Lcom/google/api/client/http/AbstractInputStreamContent;
    //   206: invokevirtual 293	com/google/api/client/http/AbstractInputStreamContent:c	()Ljava/io/InputStream;
    //   209: putfield 105	com/google/api/client/googleapis/media/MediaHttpUploader:k	Ljava/io/InputStream;
    //   212: aload_0
    //   213: getfield 105	com/google/api/client/googleapis/media/MediaHttpUploader:k	Ljava/io/InputStream;
    //   216: invokevirtual 297	java/io/InputStream:markSupported	()Z
    //   219: ifne +18 -> 237
    //   222: aload_0
    //   223: new 299	java/io/BufferedInputStream
    //   226: dup
    //   227: aload_0
    //   228: getfield 105	com/google/api/client/googleapis/media/MediaHttpUploader:k	Ljava/io/InputStream;
    //   231: invokespecial 302	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   234: putfield 105	com/google/api/client/googleapis/media/MediaHttpUploader:k	Ljava/io/InputStream;
    //   237: aload_0
    //   238: aload_0
    //   239: getfield 83	com/google/api/client/googleapis/media/MediaHttpUploader:c	Lcom/google/api/client/http/HttpRequestFactory;
    //   242: aload 4
    //   244: aconst_null
    //   245: invokevirtual 305	com/google/api/client/http/HttpRequestFactory:b	(Lcom/google/api/client/http/GenericUrl;Lcom/google/api/client/http/HttpContent;)Lcom/google/api/client/http/HttpRequest;
    //   248: putfield 127	com/google/api/client/googleapis/media/MediaHttpUploader:j	Lcom/google/api/client/http/HttpRequest;
    //   251: new 170	com/google/api/client/googleapis/MethodOverride
    //   254: dup
    //   255: invokespecial 171	com/google/api/client/googleapis/MethodOverride:<init>	()V
    //   258: aload_0
    //   259: getfield 127	com/google/api/client/googleapis/media/MediaHttpUploader:j	Lcom/google/api/client/http/HttpRequest;
    //   262: invokevirtual 173	com/google/api/client/googleapis/MethodOverride:a	(Lcom/google/api/client/http/HttpRequest;)V
    //   265: aload_0
    //   266: aload_0
    //   267: getfield 278	com/google/api/client/googleapis/media/MediaHttpUploader:o	J
    //   270: invokespecial 307	com/google/api/client/googleapis/media/MediaHttpUploader:a	(J)V
    //   273: aload_0
    //   274: getfield 62	com/google/api/client/googleapis/media/MediaHttpUploader:l	Z
    //   277: ifeq +19 -> 296
    //   280: aload_0
    //   281: getfield 127	com/google/api/client/googleapis/media/MediaHttpUploader:j	Lcom/google/api/client/http/HttpRequest;
    //   284: new 309	com/google/api/client/googleapis/media/MediaUploadExponentialBackOffPolicy
    //   287: dup
    //   288: aload_0
    //   289: invokespecial 311	com/google/api/client/googleapis/media/MediaUploadExponentialBackOffPolicy:<init>	(Lcom/google/api/client/googleapis/media/MediaHttpUploader;)V
    //   292: invokevirtual 314	com/google/api/client/http/HttpRequest:a	(Lcom/google/api/client/http/BackOffPolicy;)Lcom/google/api/client/http/HttpRequest;
    //   295: pop
    //   296: aload_0
    //   297: getfield 127	com/google/api/client/googleapis/media/MediaHttpUploader:j	Lcom/google/api/client/http/HttpRequest;
    //   300: iconst_0
    //   301: invokevirtual 239	com/google/api/client/http/HttpRequest:b	(Z)Lcom/google/api/client/http/HttpRequest;
    //   304: pop
    //   305: aload_0
    //   306: getfield 127	com/google/api/client/googleapis/media/MediaHttpUploader:j	Lcom/google/api/client/http/HttpRequest;
    //   309: iconst_1
    //   310: invokevirtual 241	com/google/api/client/http/HttpRequest:c	(Z)Lcom/google/api/client/http/HttpRequest;
    //   313: pop
    //   314: aload_0
    //   315: getfield 127	com/google/api/client/googleapis/media/MediaHttpUploader:j	Lcom/google/api/client/http/HttpRequest;
    //   318: invokevirtual 246	com/google/api/client/http/HttpRequest:n	()Lcom/google/api/client/http/HttpResponse;
    //   321: astore 7
    //   323: aload 7
    //   325: invokevirtual 316	com/google/api/client/http/HttpResponse:c	()Z
    //   328: ifeq +37 -> 365
    //   331: aload_0
    //   332: aload_0
    //   333: getfield 175	com/google/api/client/googleapis/media/MediaHttpUploader:f	J
    //   336: putfield 278	com/google/api/client/googleapis/media/MediaHttpUploader:o	J
    //   339: aload_0
    //   340: getfield 105	com/google/api/client/googleapis/media/MediaHttpUploader:k	Ljava/io/InputStream;
    //   343: invokevirtual 319	java/io/InputStream:close	()V
    //   346: aload_0
    //   347: getstatic 280	com/google/api/client/googleapis/media/MediaHttpUploader$UploadState:e	Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;
    //   350: invokespecial 202	com/google/api/client/googleapis/media/MediaHttpUploader:a	(Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;)V
    //   353: aload 7
    //   355: areturn
    //   356: astore 11
    //   358: aload_3
    //   359: invokevirtual 252	com/google/api/client/http/HttpResponse:i	()V
    //   362: aload 11
    //   364: athrow
    //   365: aload 7
    //   367: invokevirtual 322	com/google/api/client/http/HttpResponse:d	()I
    //   370: sipush 308
    //   373: if_icmpeq +6 -> 379
    //   376: aload 7
    //   378: areturn
    //   379: aload 7
    //   381: invokevirtual 286	com/google/api/client/http/HttpResponse:b	()Lcom/google/api/client/http/HttpHeaders;
    //   384: invokevirtual 288	com/google/api/client/http/HttpHeaders:d	()Ljava/lang/String;
    //   387: astore 9
    //   389: aload 9
    //   391: ifnull +14 -> 405
    //   394: new 208	com/google/api/client/http/GenericUrl
    //   397: dup
    //   398: aload 9
    //   400: invokespecial 290	com/google/api/client/http/GenericUrl:<init>	(Ljava/lang/String;)V
    //   403: astore 4
    //   405: aload_0
    //   406: aload_0
    //   407: aload 7
    //   409: invokevirtual 286	com/google/api/client/http/HttpResponse:b	()Lcom/google/api/client/http/HttpHeaders;
    //   412: invokevirtual 323	com/google/api/client/http/HttpHeaders:e	()Ljava/lang/String;
    //   415: invokespecial 325	com/google/api/client/googleapis/media/MediaHttpUploader:b	(Ljava/lang/String;)J
    //   418: putfield 278	com/google/api/client/googleapis/media/MediaHttpUploader:o	J
    //   421: aload_0
    //   422: getstatic 267	com/google/api/client/googleapis/media/MediaHttpUploader$UploadState:d	Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;
    //   425: invokespecial 202	com/google/api/client/googleapis/media/MediaHttpUploader:a	(Lcom/google/api/client/googleapis/media/MediaHttpUploader$UploadState;)V
    //   428: aload 7
    //   430: invokevirtual 252	com/google/api/client/http/HttpResponse:i	()V
    //   433: goto -196 -> 237
    //   436: astore 8
    //   438: aload 7
    //   440: invokevirtual 252	com/google/api/client/http/HttpResponse:i	()V
    //   443: aload 8
    //   445: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	446	0	this	MediaHttpUploader
    //   0	446	1	paramGenericUrl	GenericUrl
    //   11	138	2	bool	boolean
    //   180	179	3	localHttpResponse1	HttpResponse
    //   195	209	4	localGenericUrl	GenericUrl
    //   321	118	7	localHttpResponse2	HttpResponse
    //   436	8	8	localObject1	Object
    //   387	12	9	str	String
    //   356	7	11	localObject2	Object
    //   34	62	12	localObject3	Object
    //   100	23	14	localHttpRequest	HttpRequest
    //   127	41	17	localHttpResponse3	HttpResponse
    //   165	8	18	localObject4	Object
    //   47	21	19	localHttpContent	HttpContent
    //   53	17	20	arrayOfHttpContent	HttpContent[]
    // Exception table:
    //   from	to	target	type
    //   129	144	165	finally
    //   181	197	356	finally
    //   323	353	436	finally
    //   365	376	436	finally
    //   379	389	436	finally
    //   394	405	436	finally
    //   405	428	436	finally
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: getfield 127	com/google/api/client/googleapis/media/MediaHttpUploader:j	Lcom/google/api/client/http/HttpRequest;
    //   6: ldc_w 327
    //   9: invokestatic 330	com/google/common/base/Preconditions:a	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   12: pop
    //   13: aload_0
    //   14: getfield 83	com/google/api/client/googleapis/media/MediaHttpUploader:c	Lcom/google/api/client/http/HttpRequestFactory;
    //   17: aload_0
    //   18: getfield 127	com/google/api/client/googleapis/media/MediaHttpUploader:j	Lcom/google/api/client/http/HttpRequest;
    //   21: invokevirtual 333	com/google/api/client/http/HttpRequest:d	()Lcom/google/api/client/http/GenericUrl;
    //   24: aconst_null
    //   25: invokevirtual 305	com/google/api/client/http/HttpRequestFactory:b	(Lcom/google/api/client/http/GenericUrl;Lcom/google/api/client/http/HttpContent;)Lcom/google/api/client/http/HttpRequest;
    //   28: astore_3
    //   29: new 170	com/google/api/client/googleapis/MethodOverride
    //   32: dup
    //   33: invokespecial 171	com/google/api/client/googleapis/MethodOverride:<init>	()V
    //   36: aload_3
    //   37: invokevirtual 173	com/google/api/client/googleapis/MethodOverride:a	(Lcom/google/api/client/http/HttpRequest;)V
    //   40: aload_3
    //   41: invokevirtual 135	com/google/api/client/http/HttpRequest:h	()Lcom/google/api/client/http/HttpHeaders;
    //   44: new 137	java/lang/StringBuilder
    //   47: dup
    //   48: invokespecial 138	java/lang/StringBuilder:<init>	()V
    //   51: ldc_w 335
    //   54: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: aload_0
    //   58: invokespecial 90	com/google/api/client/googleapis/media/MediaHttpUploader:b	()J
    //   61: invokevirtual 147	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   64: invokevirtual 154	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   67: invokevirtual 159	com/google/api/client/http/HttpHeaders:c	(Ljava/lang/String;)V
    //   70: aload_3
    //   71: iconst_0
    //   72: invokevirtual 239	com/google/api/client/http/HttpRequest:b	(Z)Lcom/google/api/client/http/HttpRequest;
    //   75: pop
    //   76: aload_3
    //   77: iload_1
    //   78: invokevirtual 241	com/google/api/client/http/HttpRequest:c	(Z)Lcom/google/api/client/http/HttpRequest;
    //   81: pop
    //   82: aload_3
    //   83: invokevirtual 246	com/google/api/client/http/HttpRequest:n	()Lcom/google/api/client/http/HttpResponse;
    //   86: astore 6
    //   88: aload_0
    //   89: aload 6
    //   91: invokevirtual 286	com/google/api/client/http/HttpResponse:b	()Lcom/google/api/client/http/HttpHeaders;
    //   94: invokevirtual 323	com/google/api/client/http/HttpHeaders:e	()Ljava/lang/String;
    //   97: invokespecial 325	com/google/api/client/googleapis/media/MediaHttpUploader:b	(Ljava/lang/String;)J
    //   100: lstore 8
    //   102: aload 6
    //   104: invokevirtual 286	com/google/api/client/http/HttpResponse:b	()Lcom/google/api/client/http/HttpHeaders;
    //   107: invokevirtual 288	com/google/api/client/http/HttpHeaders:d	()Ljava/lang/String;
    //   110: astore 10
    //   112: aload 10
    //   114: ifnull +20 -> 134
    //   117: aload_0
    //   118: getfield 127	com/google/api/client/googleapis/media/MediaHttpUploader:j	Lcom/google/api/client/http/HttpRequest;
    //   121: new 208	com/google/api/client/http/GenericUrl
    //   124: dup
    //   125: aload 10
    //   127: invokespecial 290	com/google/api/client/http/GenericUrl:<init>	(Ljava/lang/String;)V
    //   130: invokevirtual 338	com/google/api/client/http/HttpRequest:a	(Lcom/google/api/client/http/GenericUrl;)Lcom/google/api/client/http/HttpRequest;
    //   133: pop
    //   134: aload_0
    //   135: getfield 105	com/google/api/client/googleapis/media/MediaHttpUploader:k	Ljava/io/InputStream;
    //   138: invokevirtual 341	java/io/InputStream:reset	()V
    //   141: aload_0
    //   142: getfield 278	com/google/api/client/googleapis/media/MediaHttpUploader:o	J
    //   145: lload 8
    //   147: lsub
    //   148: lstore 12
    //   150: lload 12
    //   152: aload_0
    //   153: getfield 105	com/google/api/client/googleapis/media/MediaHttpUploader:k	Ljava/io/InputStream;
    //   156: lload 12
    //   158: invokevirtual 345	java/io/InputStream:skip	(J)J
    //   161: lcmp
    //   162: ifne +19 -> 181
    //   165: iload_1
    //   166: invokestatic 347	com/google/common/base/Preconditions:b	(Z)V
    //   169: aload_0
    //   170: lload 8
    //   172: invokespecial 307	com/google/api/client/googleapis/media/MediaHttpUploader:a	(J)V
    //   175: aload 6
    //   177: invokevirtual 252	com/google/api/client/http/HttpResponse:i	()V
    //   180: return
    //   181: iconst_0
    //   182: istore_1
    //   183: goto -18 -> 165
    //   186: astore 7
    //   188: aload 6
    //   190: invokevirtual 252	com/google/api/client/http/HttpResponse:i	()V
    //   193: aload 7
    //   195: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	196	0	this	MediaHttpUploader
    //   1	182	1	bool	boolean
    //   28	55	3	localHttpRequest	HttpRequest
    //   86	103	6	localHttpResponse	HttpResponse
    //   186	8	7	localObject	Object
    //   100	71	8	l1	long
    //   110	16	10	str	String
    //   148	9	12	l2	long
    // Exception table:
    //   from	to	target	type
    //   88	112	186	finally
    //   117	134	186	finally
    //   134	165	186	finally
    //   165	175	186	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.media.MediaHttpUploader
 * JD-Core Version:    0.7.0.1
 */