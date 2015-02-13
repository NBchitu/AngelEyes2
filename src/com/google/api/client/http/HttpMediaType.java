package com.google.api.client.http;

import com.google.common.base.Preconditions;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HttpMediaType
{
  private static final Pattern a = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
  private static final Pattern b = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
  private static final Pattern c = Pattern.compile("\\s*(" + "[^\\s/=;\"]+" + ")/(" + "[^\\s/=;\"]+" + ")" + "\\s*(" + ";.*" + ")?", 32);
  private static final Pattern d;
  private String e = "application";
  private String f = "octet-stream";
  private final SortedMap<String, String> g = new TreeMap();
  private String h;
  
  static
  {
    String str = "\"([^\"]*)\"" + "|" + "[^\\s;\"]*";
    d = Pattern.compile("\\s*;\\s*(" + "[^\\s/=;\"]+" + ")" + "=(" + str + ")");
  }
  
  public HttpMediaType(String paramString)
  {
    f(paramString);
  }
  
  public static boolean b(String paramString1, String paramString2)
  {
    return ((paramString1 == null) && (paramString2 == null)) || ((paramString1 != null) && (paramString2 != null) && (new HttpMediaType(paramString1).a(new HttpMediaType(paramString2))));
  }
  
  static boolean e(String paramString)
  {
    return b.matcher(paramString).matches();
  }
  
  private HttpMediaType f(String paramString)
  {
    Matcher localMatcher1 = c.matcher(paramString);
    Preconditions.a(localMatcher1.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
    a(localMatcher1.group(1));
    b(localMatcher1.group(2));
    String str1 = localMatcher1.group(3);
    if (str1 != null)
    {
      Matcher localMatcher2 = d.matcher(str1);
      while (localMatcher2.find())
      {
        String str2 = localMatcher2.group(1);
        String str3 = localMatcher2.group(3);
        if (str3 == null) {
          str3 = localMatcher2.group(2);
        }
        a(str2, str3);
      }
    }
    return this;
  }
  
  private static String g(String paramString)
  {
    String str = paramString.replace("\\", "\\\\").replace("\"", "\\\"");
    return "\"" + str + "\"";
  }
  
  public HttpMediaType a(String paramString)
  {
    Preconditions.a(a.matcher(paramString).matches(), "Type contains reserved characters");
    this.e = paramString;
    this.h = null;
    return this;
  }
  
  public HttpMediaType a(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      d(paramString1);
      return this;
    }
    Preconditions.a(b.matcher(paramString1).matches(), "Name contains reserved characters");
    this.h = null;
    this.g.put(paramString1.toLowerCase(), paramString2);
    return this;
  }
  
  public HttpMediaType a(Charset paramCharset)
  {
    if (paramCharset == null) {}
    for (String str = null;; str = paramCharset.name())
    {
      a("charset", str);
      return this;
    }
  }
  
  public String a()
  {
    return this.e;
  }
  
  public boolean a(HttpMediaType paramHttpMediaType)
  {
    return (paramHttpMediaType != null) && (a().equalsIgnoreCase(paramHttpMediaType.a())) && (b().equalsIgnoreCase(paramHttpMediaType.b()));
  }
  
  public HttpMediaType b(String paramString)
  {
    Preconditions.a(a.matcher(paramString).matches(), "Subtype contains reserved characters");
    this.f = paramString;
    this.h = null;
    return this;
  }
  
  public String b()
  {
    return this.f;
  }
  
  public String c()
  {
    if (this.h != null) {
      return this.h;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.e);
    localStringBuilder.append('/');
    localStringBuilder.append(this.f);
    if (this.g != null)
    {
      Iterator localIterator = this.g.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getValue();
        localStringBuilder.append("; ");
        localStringBuilder.append((String)localEntry.getKey());
        localStringBuilder.append("=");
        if (!e(str)) {
          str = g(str);
        }
        localStringBuilder.append(str);
      }
    }
    this.h = localStringBuilder.toString();
    return this.h;
  }
  
  public String c(String paramString)
  {
    return (String)this.g.get(paramString.toLowerCase());
  }
  
  public HttpMediaType d(String paramString)
  {
    this.h = null;
    this.g.remove(paramString.toLowerCase());
    return this;
  }
  
  public Charset d()
  {
    String str = c("charset");
    if (str == null) {
      return null;
    }
    return Charset.forName(str);
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof HttpMediaType)) {}
    HttpMediaType localHttpMediaType;
    do
    {
      return false;
      localHttpMediaType = (HttpMediaType)paramObject;
    } while ((!a(localHttpMediaType)) || (!this.g.equals(localHttpMediaType.g)));
    return true;
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
 * Qualified Name:     com.google.api.client.http.HttpMediaType
 * JD-Core Version:    0.7.0.1
 */