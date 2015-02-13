package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import com.google.common.base.Preconditions;
import com.google.common.io.CharStreams;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class UrlEncodedParser
  implements ObjectParser
{
  private static Object a(Type paramType, List<Type> paramList, String paramString)
  {
    return Data.a(Data.a(paramList, paramType), paramString);
  }
  
  public static void a(String paramString, Object paramObject)
  {
    if (paramString == null) {
      return;
    }
    Class localClass1 = paramObject.getClass();
    ClassInfo localClassInfo = ClassInfo.a(localClass1);
    List localList = Arrays.asList(new Type[] { localClass1 });
    GenericData localGenericData;
    Map localMap;
    label58:
    ArrayValueMap localArrayValueMap;
    int i;
    int j;
    int k;
    label85:
    int m;
    if (GenericData.class.isAssignableFrom(localClass1))
    {
      localGenericData = (GenericData)paramObject;
      if (!Map.class.isAssignableFrom(localClass1)) {
        break label258;
      }
      localMap = (Map)paramObject;
      localArrayValueMap = new ArrayValueMap(paramObject);
      i = paramString.length();
      j = paramString.indexOf('=');
      k = 0;
      if (k >= i) {
        break label458;
      }
      m = paramString.indexOf('&', k);
      if (m != -1) {
        break label464;
      }
    }
    label170:
    label443:
    label458:
    label464:
    for (int n = i;; n = m)
    {
      String str1;
      String str2;
      String str3;
      FieldInfo localFieldInfo;
      if ((j != -1) && (j < n))
      {
        String str4 = paramString.substring(k, j);
        String str5 = CharEscapers.b(paramString.substring(j + 1, n));
        j = paramString.indexOf('=', n + 1);
        str1 = str4;
        str2 = str5;
        str3 = CharEscapers.b(str1);
        localFieldInfo = localClassInfo.a(str3);
        if (localFieldInfo == null) {
          break label385;
        }
        localType1 = Data.a(localList, localFieldInfo.d());
        if (!Types.a(localType1)) {
          break label281;
        }
        localClass2 = Types.a(localList, Types.b(localType1));
        localArrayValueMap.a(localFieldInfo.a(), localClass2, a(localClass2, localList, str2));
      }
      while (localMap == null) {
        for (;;)
        {
          Type localType1;
          Class localClass2;
          k = n + 1;
          break label85;
          localGenericData = null;
          break;
          localMap = null;
          break label58;
          str1 = paramString.substring(k, n);
          str2 = "";
          break label170;
          if (Types.a(Types.a(localList, localType1), Iterable.class))
          {
            Collection localCollection = (Collection)localFieldInfo.a(paramObject);
            if (localCollection == null)
            {
              localCollection = Data.b(localType1);
              localFieldInfo.a(paramObject, localCollection);
            }
            if (localType1 == Object.class) {}
            for (Type localType2 = null;; localType2 = Types.c(localType1))
            {
              localCollection.add(a(localType2, localList, str2));
              break;
            }
          }
          localFieldInfo.a(paramObject, a(localType1, localList, str2));
        }
      }
      ArrayList localArrayList = (ArrayList)localMap.get(str3);
      if (localArrayList == null)
      {
        localArrayList = new ArrayList();
        if (localGenericData == null) {
          break label443;
        }
        localGenericData.set(str3, localArrayList);
      }
      for (;;)
      {
        localArrayList.add(str2);
        break;
        localMap.put(str3, localArrayList);
      }
      localArrayValueMap.a();
      return;
    }
  }
  
  public <T> T a(InputStream paramInputStream, Charset paramCharset, Class<T> paramClass)
  {
    return a(new InputStreamReader(paramInputStream, paramCharset), paramClass);
  }
  
  public <T> T a(Reader paramReader, Class<T> paramClass)
  {
    return a(paramReader, paramClass);
  }
  
  public Object a(Reader paramReader, Type paramType)
  {
    Preconditions.a(paramType instanceof Class, "dataType has to be of type Class<?>");
    Object localObject = Types.a((Class)paramType);
    a(CharStreams.a(paramReader), localObject);
    return localObject;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.http.UrlEncodedParser
 * JD-Core Version:    0.7.0.1
 */