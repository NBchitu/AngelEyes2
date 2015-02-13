package com.google.api.client.http.javanet;

import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.LowLevelHttpResponse;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class NetHttpResponse
  extends LowLevelHttpResponse
{
  private final HttpURLConnection a;
  private final int b;
  private final String c;
  private final ArrayList<String> d = new ArrayList();
  private final ArrayList<String> e = new ArrayList();
  
  NetHttpResponse(HttpURLConnection paramHttpURLConnection)
  {
    this.a = paramHttpURLConnection;
    int i = paramHttpURLConnection.getResponseCode();
    if (i == -1) {
      i = 0;
    }
    this.b = i;
    this.c = paramHttpURLConnection.getResponseMessage();
    ArrayList localArrayList1 = this.d;
    ArrayList localArrayList2 = this.e;
    Iterator localIterator1 = paramHttpURLConnection.getHeaderFields().entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      String str1 = (String)localEntry.getKey();
      if (str1 != null)
      {
        Iterator localIterator2 = ((List)localEntry.getValue()).iterator();
        while (localIterator2.hasNext())
        {
          String str2 = (String)localIterator2.next();
          if (str2 != null)
          {
            localArrayList1.add(str1);
            localArrayList2.add(str2);
          }
        }
      }
    }
  }
  
  public InputStream a()
  {
    HttpURLConnection localHttpURLConnection = this.a;
    if (HttpStatusCodes.a(this.b)) {
      return localHttpURLConnection.getInputStream();
    }
    return localHttpURLConnection.getErrorStream();
  }
  
  public String a(int paramInt)
  {
    return (String)this.d.get(paramInt);
  }
  
  public String b()
  {
    return this.a.getContentEncoding();
  }
  
  public String b(int paramInt)
  {
    return (String)this.e.get(paramInt);
  }
  
  public String c()
  {
    return this.a.getHeaderField("Content-Type");
  }
  
  public String d()
  {
    String str = this.a.getHeaderField(0);
    if ((str != null) && (str.startsWith("HTTP/1."))) {
      return str;
    }
    return null;
  }
  
  public int e()
  {
    return this.b;
  }
  
  public String f()
  {
    return this.c;
  }
  
  public int g()
  {
    return this.d.size();
  }
  
  public void h()
  {
    this.a.disconnect();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.javanet.NetHttpResponse
 * JD-Core Version:    0.7.0.1
 */