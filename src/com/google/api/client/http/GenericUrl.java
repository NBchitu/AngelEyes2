package com.google.api.client.http;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.escape.CharEscapers;
import com.google.api.client.util.escape.Escaper;
import com.google.api.client.util.escape.PercentEscaper;
import com.google.common.base.Preconditions;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class GenericUrl
  extends GenericData
{
  private static final Escaper a = new PercentEscaper("=&-_.!~*'()@:$,;/?:", false);
  private String b;
  private String c;
  private int d = -1;
  private List<String> e;
  private String f;
  
  public GenericUrl() {}
  
  public GenericUrl(String paramString)
  {
    try
    {
      URI localURI = new URI(paramString);
      this.b = localURI.getScheme().toLowerCase();
      this.c = localURI.getHost();
      this.d = localURI.getPort();
      this.e = b(localURI.getRawPath());
      this.f = localURI.getFragment();
      String str = localURI.getRawQuery();
      if (str != null) {
        UrlEncodedParser.a(str, this);
      }
      return;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      throw new IllegalArgumentException(localURISyntaxException);
    }
  }
  
  private void a(StringBuilder paramStringBuilder)
  {
    int i = this.e.size();
    for (int j = 0; j < i; j++)
    {
      String str = (String)this.e.get(j);
      if (j != 0) {
        paramStringBuilder.append('/');
      }
      if (str.length() != 0) {
        paramStringBuilder.append(CharEscapers.c(str));
      }
    }
  }
  
  static void a(Set<Map.Entry<String, Object>> paramSet, StringBuilder paramStringBuilder)
  {
    Iterator localIterator1 = paramSet.iterator();
    boolean bool1 = true;
    Object localObject;
    String str;
    boolean bool2;
    if (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      localObject = localEntry.getValue();
      if (localObject == null) {
        break label130;
      }
      str = CharEscapers.d((String)localEntry.getKey());
      if ((localObject instanceof Collection))
      {
        Iterator localIterator2 = ((Collection)localObject).iterator();
        while (localIterator2.hasNext()) {
          bool1 = a(bool1, paramStringBuilder, str, localIterator2.next());
        }
        bool2 = bool1;
      }
    }
    for (;;)
    {
      bool1 = bool2;
      break;
      bool2 = a(bool1, paramStringBuilder, str, localObject);
      continue;
      return;
      label130:
      bool2 = bool1;
    }
  }
  
  private static boolean a(boolean paramBoolean, StringBuilder paramStringBuilder, String paramString, Object paramObject)
  {
    if (paramBoolean)
    {
      paramBoolean = false;
      paramStringBuilder.append('?');
    }
    for (;;)
    {
      paramStringBuilder.append(paramString);
      String str = CharEscapers.d(paramObject.toString());
      if (str.length() != 0) {
        paramStringBuilder.append('=').append(str);
      }
      return paramBoolean;
      paramStringBuilder.append('&');
    }
  }
  
  public static List<String> b(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int i = 1;
    int j = 0;
    if (i != 0)
    {
      int k = paramString.indexOf('/', j);
      if (k != -1)
      {
        i = 1;
        label46:
        if (i == 0) {
          break label84;
        }
      }
      label84:
      for (String str = paramString.substring(j, k);; str = paramString.substring(j))
      {
        localArrayList.add(CharEscapers.b(str));
        j = k + 1;
        break;
        i = 0;
        break label46;
      }
    }
    return localArrayList;
  }
  
  public GenericUrl a()
  {
    GenericUrl localGenericUrl = (GenericUrl)super.clone();
    if (this.e != null) {
      localGenericUrl.e = new ArrayList(this.e);
    }
    return localGenericUrl;
  }
  
  public void a(String paramString)
  {
    this.e = b(paramString);
  }
  
  public String b()
  {
    return this.f;
  }
  
  public final String c()
  {
    return d() + e();
  }
  
  public final String d()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append((String)Preconditions.a(this.b));
    localStringBuilder.append("://");
    localStringBuilder.append((String)Preconditions.a(this.c));
    int i = this.d;
    if (i != -1) {
      localStringBuilder.append(':').append(i);
    }
    return localStringBuilder.toString();
  }
  
  public final String e()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.e != null) {
      a(localStringBuilder);
    }
    a(entrySet(), localStringBuilder);
    String str = this.f;
    if (str != null) {
      localStringBuilder.append('#').append(a.a(str));
    }
    return localStringBuilder.toString();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((!super.equals(paramObject)) || (!(paramObject instanceof GenericUrl))) {
      return false;
    }
    GenericUrl localGenericUrl = (GenericUrl)paramObject;
    return c().equals(localGenericUrl.toString());
  }
  
  public int hashCode()
  {
    return c().hashCode();
  }
  
  public String toString()
  {
    return c();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.GenericUrl
 * JD-Core Version:    0.7.0.1
 */