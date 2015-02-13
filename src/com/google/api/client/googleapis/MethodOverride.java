package com.google.api.client.googleapis;

import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.common.base.Preconditions;
import java.util.EnumSet;

public final class MethodOverride
  implements HttpExecuteInterceptor, HttpRequestInitializer
{
  private final EnumSet<HttpMethod> a;
  private final boolean b;
  
  public MethodOverride()
  {
    this(false);
  }
  
  MethodOverride(boolean paramBoolean)
  {
    this(paramBoolean, EnumSet.noneOf(HttpMethod.class));
  }
  
  MethodOverride(boolean paramBoolean, EnumSet<HttpMethod> paramEnumSet)
  {
    this.b = paramBoolean;
    this.a = paramEnumSet.clone();
  }
  
  private boolean c(HttpRequest paramHttpRequest)
  {
    boolean bool1 = true;
    String str = paramHttpRequest.c();
    boolean bool2 = paramHttpRequest.a().a(str);
    if ((str.equals("GET")) || (str.equals("POST")))
    {
      Preconditions.a(bool2);
      bool1 = false;
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return bool1;
          } while ((this.b) || (this.a.contains(paramHttpRequest.b())));
          if (!str.equals("PATCH")) {
            break;
          }
        } while (!paramHttpRequest.a().d());
        return false;
        if (!str.equals("HEAD")) {
          break;
        }
      } while (!paramHttpRequest.a().c());
      return false;
    } while (!bool2);
    return false;
  }
  
  public void a(HttpRequest paramHttpRequest)
  {
    if (c(paramHttpRequest))
    {
      String str = paramHttpRequest.c();
      paramHttpRequest.a("POST");
      paramHttpRequest.h().set("X-HTTP-Method-Override", str);
      if (paramHttpRequest.e() == null) {
        paramHttpRequest.a(new EmptyContent());
      }
    }
  }
  
  public void b(HttpRequest paramHttpRequest)
  {
    paramHttpRequest.a(this);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.googleapis.MethodOverride
 * JD-Core Version:    0.7.0.1
 */