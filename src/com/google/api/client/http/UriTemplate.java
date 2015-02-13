package com.google.api.client.http;

import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UriTemplate
{
  static final Map<Character, UriTemplate.CompositeOutput> a = new HashMap();
  
  static
  {
    UriTemplate.CompositeOutput.values();
  }
  
  static UriTemplate.CompositeOutput a(String paramString)
  {
    UriTemplate.CompositeOutput localCompositeOutput = (UriTemplate.CompositeOutput)a.get(Character.valueOf(paramString.charAt(0)));
    if (localCompositeOutput == null) {
      localCompositeOutput = UriTemplate.CompositeOutput.h;
    }
    return localCompositeOutput;
  }
  
  public static String a(String paramString, Object paramObject, boolean paramBoolean)
  {
    Map localMap = a(paramObject);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    int j = paramString.length();
    int n;
    boolean bool;
    UriTemplate.CompositeOutput localCompositeOutput;
    String str2;
    Object localObject;
    for (;;)
    {
      int k;
      if (i < j)
      {
        k = paramString.indexOf('{', i);
        if (k == -1)
        {
          if ((i == 0) && (!paramBoolean)) {
            return paramString;
          }
          localStringBuilder.append(paramString.substring(i));
        }
      }
      else
      {
        if (paramBoolean) {
          GenericUrl.a(localMap.entrySet(), localStringBuilder);
        }
        return localStringBuilder.toString();
      }
      localStringBuilder.append(paramString.substring(i, k));
      int m = paramString.indexOf('}', k + 2);
      String str1 = paramString.substring(k + 1, m);
      n = m + 1;
      bool = str1.endsWith("*");
      localCompositeOutput = a(str1);
      int i1 = localCompositeOutput.d();
      int i2 = str1.length();
      if (bool) {
        i2--;
      }
      str2 = str1.substring(i1, i2);
      localObject = localMap.remove(str2);
      if (localObject != null) {
        break;
      }
      i = n;
    }
    if ((localObject instanceof Iterator)) {
      localObject = a(str2, (Iterator)localObject, bool, localCompositeOutput);
    }
    for (;;)
    {
      localStringBuilder.append(localObject);
      i = n;
      break;
      if (((localObject instanceof Iterable)) || (localObject.getClass().isArray()))
      {
        localObject = a(str2, Types.a(localObject).iterator(), bool, localCompositeOutput);
      }
      else if (localObject.getClass().isEnum())
      {
        String str3 = FieldInfo.a((Enum)localObject).b();
        if (str3 != null) {
          localObject = CharEscapers.c(str3);
        }
      }
      else if (!Data.d(localObject))
      {
        localObject = a(str2, a(localObject), bool, localCompositeOutput);
      }
      else
      {
        localObject = CharEscapers.c(localObject.toString());
      }
    }
  }
  
  public static String a(String paramString1, String paramString2, Object paramObject, boolean paramBoolean)
  {
    GenericUrl localGenericUrl;
    if (paramString2.startsWith("/"))
    {
      localGenericUrl = new GenericUrl(paramString1);
      localGenericUrl.a(null);
    }
    for (paramString2 = localGenericUrl.c() + paramString2;; paramString2 = paramString1 + paramString2) {
      do
      {
        return a(paramString2, paramObject, paramBoolean);
      } while ((paramString2.startsWith("http://")) || (paramString2.startsWith("https://")));
    }
  }
  
  private static String a(String paramString, Iterator<?> paramIterator, boolean paramBoolean, UriTemplate.CompositeOutput paramCompositeOutput)
  {
    if (!paramIterator.hasNext()) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramCompositeOutput.a());
    String str;
    if (paramBoolean) {
      str = paramCompositeOutput.b();
    }
    while (paramIterator.hasNext())
    {
      localStringBuilder.append(paramCompositeOutput.a(paramIterator.next().toString()));
      if (paramIterator.hasNext())
      {
        localStringBuilder.append(str);
        continue;
        str = ",";
        if (paramCompositeOutput.c())
        {
          localStringBuilder.append(CharEscapers.c(paramString));
          localStringBuilder.append("=");
        }
      }
    }
    return localStringBuilder.toString();
  }
  
  private static String a(String paramString, Map<String, Object> paramMap, boolean paramBoolean, UriTemplate.CompositeOutput paramCompositeOutput)
  {
    if (paramMap.isEmpty()) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramCompositeOutput.a());
    String str5;
    String str1;
    if (paramBoolean)
    {
      str5 = paramCompositeOutput.b();
      str1 = "=";
    }
    for (String str2 = str5;; str2 = ",")
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str3 = paramCompositeOutput.a((String)localEntry.getKey());
        String str4 = paramCompositeOutput.a(localEntry.getValue().toString());
        localStringBuilder.append(str3);
        localStringBuilder.append(str1);
        localStringBuilder.append(str4);
        if (localIterator.hasNext()) {
          localStringBuilder.append(str2);
        }
      }
      if (paramCompositeOutput.c())
      {
        localStringBuilder.append(CharEscapers.c(paramString));
        localStringBuilder.append("=");
      }
      str1 = ",";
    }
    return localStringBuilder.toString();
  }
  
  private static Map<String, Object> a(Object paramObject)
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    Iterator localIterator = Data.b(paramObject).entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject = localEntry.getValue();
      if ((localObject != null) && (!Data.a(localObject))) {
        localLinkedHashMap.put(localEntry.getKey(), localObject);
      }
    }
    return localLinkedHashMap;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.UriTemplate
 * JD-Core Version:    0.7.0.1
 */