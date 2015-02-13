package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.GenericData.Flags;
import com.google.api.client.util.Key;
import com.google.api.client.util.StringUtils;
import com.google.api.client.util.Types;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HttpHeaders
  extends GenericData
{
  @Key(a="Accept")
  private String accept;
  @Key(a="Accept-Encoding")
  private String acceptEncoding = "gzip";
  @Key(a="WWW-Authenticate")
  private String authenticate;
  @Key(a="Authorization")
  private String authorization;
  @Key(a="Cache-Control")
  private String cacheControl;
  @Key(a="Content-Encoding")
  private String contentEncoding;
  @Key(a="Content-Length")
  private Long contentLength;
  @Key(a="Content-MD5")
  private String contentMD5;
  @Key(a="Content-Range")
  private String contentRange;
  @Key(a="Content-Type")
  private String contentType;
  @Key(a="Cookie")
  private String cookie;
  @Key(a="Date")
  private String date;
  @Key(a="ETag")
  private String etag;
  @Key(a="Expires")
  private String expires;
  @Key(a="If-Match")
  private String ifMatch;
  @Key(a="If-Modified-Since")
  private String ifModifiedSince;
  @Key(a="If-None-Match")
  private String ifNoneMatch;
  @Key(a="If-Unmodified-Since")
  private String ifUnmodifiedSince;
  @Key(a="Last-Modified")
  private String lastModified;
  @Key(a="Location")
  private String location;
  @Key(a="MIME-Version")
  private String mimeVersion;
  @Key(a="Range")
  private String range;
  @Key(a="Retry-After")
  private String retryAfter;
  @Key(a="User-Agent")
  private String userAgent;
  
  public HttpHeaders()
  {
    super(EnumSet.of(GenericData.Flags.a));
  }
  
  private static Object a(Type paramType, List<Type> paramList, String paramString)
  {
    return Data.a(Data.a(paramList, paramType), paramString);
  }
  
  static void a(HttpHeaders paramHttpHeaders, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2, Logger paramLogger, LowLevelHttpRequest paramLowLevelHttpRequest)
  {
    a(paramHttpHeaders, paramStringBuilder1, paramStringBuilder2, paramLogger, paramLowLevelHttpRequest, null);
  }
  
  static void a(HttpHeaders paramHttpHeaders, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2, Logger paramLogger, LowLevelHttpRequest paramLowLevelHttpRequest, Writer paramWriter)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = paramHttpHeaders.entrySet().iterator();
    String str1;
    Object localObject;
    FieldInfo localFieldInfo;
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      str1 = (String)localEntry.getKey();
      Preconditions.a(localHashSet.add(str1), "multiple headers of the same name (headers are case insensitive): %s", new Object[] { str1 });
      localObject = localEntry.getValue();
      if (localObject != null)
      {
        localFieldInfo = paramHttpHeaders.getClassInfo().a(str1);
        if (localFieldInfo == null) {
          break label207;
        }
      }
    }
    label207:
    for (String str2 = localFieldInfo.b();; str2 = str1)
    {
      Class localClass = localObject.getClass();
      if (((localObject instanceof Iterable)) || (localClass.isArray()))
      {
        Iterator localIterator2 = Types.a(localObject).iterator();
        while (localIterator2.hasNext()) {
          a(paramLogger, paramStringBuilder1, paramStringBuilder2, paramLowLevelHttpRequest, str2, localIterator2.next(), paramWriter);
        }
        break;
      }
      a(paramLogger, paramStringBuilder1, paramStringBuilder2, paramLowLevelHttpRequest, str2, localObject, paramWriter);
      break;
      if (paramWriter != null) {
        paramWriter.flush();
      }
      return;
    }
  }
  
  private static void a(Logger paramLogger, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2, LowLevelHttpRequest paramLowLevelHttpRequest, String paramString, Object paramObject, Writer paramWriter)
  {
    if ((paramObject == null) || (Data.a(paramObject))) {
      return;
    }
    String str1;
    if ((paramObject instanceof Enum))
    {
      str1 = FieldInfo.a((Enum)paramObject).b();
      label35:
      if (((!"Authorization".equalsIgnoreCase(paramString)) && (!"Cookie".equalsIgnoreCase(paramString))) || ((paramLogger != null) && (paramLogger.isLoggable(Level.ALL)))) {
        break label191;
      }
    }
    label191:
    for (String str2 = "<Not Logged>";; str2 = str1)
    {
      if (paramStringBuilder1 != null)
      {
        paramStringBuilder1.append(paramString).append(": ");
        paramStringBuilder1.append(str2);
        paramStringBuilder1.append(StringUtils.a);
      }
      if (paramStringBuilder2 != null) {
        paramStringBuilder2.append(" -H '").append(paramString).append(": ").append(str2).append("'");
      }
      if (paramLowLevelHttpRequest != null) {
        paramLowLevelHttpRequest.a(paramString, str1);
      }
      if (paramWriter == null) {
        break;
      }
      paramWriter.write(paramString);
      paramWriter.write(": ");
      paramWriter.write(str1);
      paramWriter.write("\r\n");
      return;
      str1 = paramObject.toString();
      break label35;
    }
  }
  
  public HttpHeaders a()
  {
    return (HttpHeaders)super.clone();
  }
  
  public final void a(HttpHeaders paramHttpHeaders)
  {
    try
    {
      HttpHeaders.ParseHeaderState localParseHeaderState = new HttpHeaders.ParseHeaderState(this, null);
      a(paramHttpHeaders, null, null, null, new HttpHeaders.HeaderParsingFakeLevelHttpRequest(this, localParseHeaderState));
      localParseHeaderState.a();
      return;
    }
    catch (IOException localIOException)
    {
      throw Throwables.b(localIOException);
    }
  }
  
  public final void a(LowLevelHttpResponse paramLowLevelHttpResponse, StringBuilder paramStringBuilder)
  {
    HttpHeaders.ParseHeaderState localParseHeaderState = new HttpHeaders.ParseHeaderState(this, paramStringBuilder);
    int i = paramLowLevelHttpResponse.g();
    for (int j = 0; j < i; j++) {
      a(paramLowLevelHttpResponse.a(j), paramLowLevelHttpResponse.b(j), localParseHeaderState);
    }
    localParseHeaderState.a();
  }
  
  void a(String paramString1, String paramString2, HttpHeaders.ParseHeaderState paramParseHeaderState)
  {
    List localList = paramParseHeaderState.d;
    ClassInfo localClassInfo = paramParseHeaderState.c;
    ArrayValueMap localArrayValueMap = paramParseHeaderState.a;
    StringBuilder localStringBuilder = paramParseHeaderState.b;
    if (localStringBuilder != null) {
      localStringBuilder.append(paramString1 + ": " + paramString2).append(StringUtils.a);
    }
    FieldInfo localFieldInfo = localClassInfo.a(paramString1);
    if (localFieldInfo != null)
    {
      Type localType1 = Data.a(localList, localFieldInfo.d());
      if (Types.a(localType1))
      {
        Class localClass = Types.a(localList, Types.b(localType1));
        localArrayValueMap.a(localFieldInfo.a(), localClass, a(localClass, localList, paramString2));
        return;
      }
      if (Types.a(Types.a(localList, localType1), Iterable.class))
      {
        Collection localCollection = (Collection)localFieldInfo.a(this);
        if (localCollection == null)
        {
          localCollection = Data.b(localType1);
          localFieldInfo.a(this, localCollection);
        }
        if (localType1 == Object.class) {}
        for (Type localType2 = null;; localType2 = Types.c(localType1))
        {
          localCollection.add(a(localType2, localList, paramString2));
          return;
        }
      }
      localFieldInfo.a(this, a(localType1, localList, paramString2));
      return;
    }
    ArrayList localArrayList = (ArrayList)get(paramString1);
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      set(paramString1, localArrayList);
    }
    localArrayList.add(paramString2);
  }
  
  public final String b()
  {
    return this.authorization;
  }
  
  public final void b(String paramString)
  {
    this.authorization = paramString;
  }
  
  public final String c()
  {
    return this.contentType;
  }
  
  public final void c(String paramString)
  {
    this.contentRange = paramString;
  }
  
  public final String d()
  {
    return this.location;
  }
  
  public final void d(String paramString)
  {
    this.userAgent = paramString;
  }
  
  public final String e()
  {
    return this.range;
  }
  
  public final String f()
  {
    return this.userAgent;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.HttpHeaders
 * JD-Core Version:    0.7.0.1
 */