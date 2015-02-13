package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Credential
  implements HttpExecuteInterceptor, HttpRequestInitializer, HttpUnsuccessfulResponseHandler
{
  static final Logger a = Logger.getLogger(Credential.class.getName());
  private final Lock b = new ReentrantLock();
  private final Credential.AccessMethod c;
  private final Clock d;
  private String e;
  private Long f;
  private String g;
  private final HttpTransport h;
  private final HttpExecuteInterceptor i;
  private final JsonFactory j;
  private final String k;
  private final List<CredentialRefreshListener> l;
  private final HttpRequestInitializer m;
  
  protected Credential(Credential.AccessMethod paramAccessMethod, HttpTransport paramHttpTransport, JsonFactory paramJsonFactory, String paramString, HttpExecuteInterceptor paramHttpExecuteInterceptor, HttpRequestInitializer paramHttpRequestInitializer, List<CredentialRefreshListener> paramList)
  {
    this(paramAccessMethod, paramHttpTransport, paramJsonFactory, paramString, paramHttpExecuteInterceptor, paramHttpRequestInitializer, paramList, Clock.a);
  }
  
  protected Credential(Credential.AccessMethod paramAccessMethod, HttpTransport paramHttpTransport, JsonFactory paramJsonFactory, String paramString, HttpExecuteInterceptor paramHttpExecuteInterceptor, HttpRequestInitializer paramHttpRequestInitializer, List<CredentialRefreshListener> paramList, Clock paramClock)
  {
    this.c = ((Credential.AccessMethod)Preconditions.a(paramAccessMethod));
    this.h = paramHttpTransport;
    this.j = paramJsonFactory;
    this.k = paramString;
    this.i = paramHttpExecuteInterceptor;
    this.m = paramHttpRequestInitializer;
    if (paramList == null) {}
    for (List localList = Collections.emptyList();; localList = Collections.unmodifiableList(paramList))
    {
      this.l = localList;
      this.d = ((Clock)Preconditions.a(paramClock));
      return;
    }
  }
  
  public Credential a(TokenResponse paramTokenResponse)
  {
    a(paramTokenResponse.a());
    if (paramTokenResponse.c() != null) {
      b(paramTokenResponse.c());
    }
    b(paramTokenResponse.b());
    return this;
  }
  
  public Credential a(Long paramLong)
  {
    this.b.lock();
    try
    {
      this.f = paramLong;
      return this;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public Credential a(String paramString)
  {
    this.b.lock();
    try
    {
      this.e = paramString;
      return this;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public final Clock a()
  {
    return this.d;
  }
  
  public void a(HttpRequest paramHttpRequest)
  {
    this.b.lock();
    try
    {
      Long localLong = e();
      if ((this.e == null) || ((localLong != null) && (localLong.longValue() <= 60L)))
      {
        g();
        String str = this.e;
        if (str == null) {
          return;
        }
      }
      this.c.a(paramHttpRequest, this.e);
      return;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public boolean a(HttpRequest paramHttpRequest, HttpResponse paramHttpResponse, boolean paramBoolean)
  {
    if (paramHttpResponse.d() == 401) {}
    for (;;)
    {
      try
      {
        this.b.lock();
        try
        {
          if (Objects.a(this.e, this.c.a(paramHttpRequest)))
          {
            boolean bool2 = g();
            if (!bool2) {
              break label96;
            }
          }
          bool1 = true;
          return bool1;
        }
        finally
        {
          this.b.unlock();
        }
        return false;
      }
      catch (IOException localIOException)
      {
        a.log(Level.SEVERE, "unable to refresh token", localIOException);
      }
      label96:
      boolean bool1 = false;
    }
  }
  
  public Credential b(Long paramLong)
  {
    if (paramLong == null) {}
    for (Long localLong = null;; localLong = Long.valueOf(this.d.a() + 1000L * paramLong.longValue())) {
      return a(localLong);
    }
  }
  
  /* Error */
  public Credential b(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 67	com/google/api/client/auth/oauth2/Credential:b	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 123 1 0
    //   9: aload_1
    //   10: ifnull +39 -> 49
    //   13: aload_0
    //   14: getfield 80	com/google/api/client/auth/oauth2/Credential:j	Lcom/google/api/client/json/JsonFactory;
    //   17: ifnull +48 -> 65
    //   20: aload_0
    //   21: getfield 78	com/google/api/client/auth/oauth2/Credential:h	Lcom/google/api/client/http/HttpTransport;
    //   24: ifnull +41 -> 65
    //   27: aload_0
    //   28: getfield 84	com/google/api/client/auth/oauth2/Credential:i	Lcom/google/api/client/http/HttpExecuteInterceptor;
    //   31: ifnull +34 -> 65
    //   34: aload_0
    //   35: getfield 82	com/google/api/client/auth/oauth2/Credential:k	Ljava/lang/String;
    //   38: ifnull +27 -> 65
    //   41: iconst_1
    //   42: istore_3
    //   43: iload_3
    //   44: ldc 188
    //   46: invokestatic 191	com/google/common/base/Preconditions:a	(ZLjava/lang/Object;)V
    //   49: aload_0
    //   50: aload_1
    //   51: putfield 193	com/google/api/client/auth/oauth2/Credential:g	Ljava/lang/String;
    //   54: aload_0
    //   55: getfield 67	com/google/api/client/auth/oauth2/Credential:b	Ljava/util/concurrent/locks/Lock;
    //   58: invokeinterface 128 1 0
    //   63: aload_0
    //   64: areturn
    //   65: iconst_0
    //   66: istore_3
    //   67: goto -24 -> 43
    //   70: astore_2
    //   71: aload_0
    //   72: getfield 67	com/google/api/client/auth/oauth2/Credential:b	Ljava/util/concurrent/locks/Lock;
    //   75: invokeinterface 128 1 0
    //   80: aload_2
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	Credential
    //   0	82	1	paramString	String
    //   70	11	2	localObject	Object
    //   42	25	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   13	41	70	finally
    //   43	49	70	finally
    //   49	54	70	finally
  }
  
  public final HttpTransport b()
  {
    return this.h;
  }
  
  public void b(HttpRequest paramHttpRequest)
  {
    paramHttpRequest.a(this);
    paramHttpRequest.a(this);
  }
  
  public final JsonFactory c()
  {
    return this.j;
  }
  
  public final String d()
  {
    return this.k;
  }
  
  public final Long e()
  {
    this.b.lock();
    try
    {
      Long localLong1 = this.f;
      if (localLong1 == null) {
        return null;
      }
      Long localLong2 = Long.valueOf((this.f.longValue() - this.d.a()) / 1000L);
      return localLong2;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public final HttpExecuteInterceptor f()
  {
    return this.i;
  }
  
  public final boolean g()
  {
    boolean bool = true;
    this.b.lock();
    for (;;)
    {
      try
      {
        TokenResponse localTokenResponse = h();
        if (localTokenResponse == null) {
          break label193;
        }
        a(localTokenResponse);
        Iterator localIterator2 = this.l.iterator();
        if (localIterator2.hasNext())
        {
          ((CredentialRefreshListener)localIterator2.next()).a(this, localTokenResponse);
          continue;
        }
      }
      catch (TokenResponseException localTokenResponseException)
      {
        if ((400 > localTokenResponseException.b()) || (localTokenResponseException.b() >= 500)) {
          break label182;
        }
        if ((localTokenResponseException.a() != null) && (bool))
        {
          a(null);
          b(null);
        }
        Iterator localIterator1 = this.l.iterator();
        if (!localIterator1.hasNext()) {
          break;
        }
        ((CredentialRefreshListener)localIterator1.next()).a(this, localTokenResponseException.a());
        continue;
      }
      finally
      {
        this.b.unlock();
      }
      return bool;
      label182:
      bool = false;
    }
    if (bool) {
      throw localTokenResponseException;
    }
    label193:
    this.b.unlock();
    return false;
  }
  
  protected TokenResponse h()
  {
    if (this.g == null) {
      return null;
    }
    return new RefreshTokenRequest(this.h, this.j, new GenericUrl(this.k), this.g).a(this.i).a(this.m).b();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.auth.oauth2.Credential
 * JD-Core Version:    0.7.0.1
 */