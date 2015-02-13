package com.google.api.client.json;

import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Types;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedLong;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public abstract class JsonParser
{
  private final Object a(Field paramField, Type paramType, ArrayList<Type> paramArrayList, Object paramObject, CustomizeJsonParser paramCustomizeJsonParser)
  {
    boolean bool1 = true;
    Type localType1 = Data.a(paramArrayList, paramType);
    if ((localType1 instanceof Class)) {}
    JsonToken localJsonToken;
    String str2;
    for (Class localClass = (Class)localType1;; localClass = null)
    {
      if ((localType1 instanceof ParameterizedType)) {
        localClass = Types.a((ParameterizedType)localType1);
      }
      localJsonToken = d();
      String str1 = e();
      StringBuilder localStringBuilder = new StringBuilder();
      if ((str1 != null) || (paramField != null))
      {
        localStringBuilder.append(" [");
        if (str1 != null) {
          localStringBuilder.append("key ").append(str1);
        }
        if (paramField != null)
        {
          if (str1 != null) {
            localStringBuilder.append(", ");
          }
          localStringBuilder.append("field ").append(paramField);
        }
        localStringBuilder.append("]");
      }
      str2 = localStringBuilder.toString();
      switch (JsonParser.1.a[localJsonToken.ordinal()])
      {
      default: 
        throw new IllegalArgumentException("unexpected JSON node type: " + localJsonToken + str2);
      }
    }
    boolean bool8 = Types.a(localType1);
    boolean bool9;
    if ((localType1 == null) || (bool8) || ((localClass != null) && (Types.a(localClass, Collection.class))))
    {
      bool9 = bool1;
      Object[] arrayOfObject6 = new Object[2];
      arrayOfObject6[0] = localType1;
      arrayOfObject6[bool1] = str2;
      Preconditions.a(bool9, "expected collection or array type but got %s%s", arrayOfObject6);
      if ((paramCustomizeJsonParser == null) || (paramField == null)) {
        break label1244;
      }
    }
    label440:
    label1228:
    label1238:
    label1244:
    for (Collection localCollection = paramCustomizeJsonParser.a(paramObject, paramField);; localCollection = null)
    {
      if (localCollection == null) {
        localCollection = Data.b(localType1);
      }
      Type localType3;
      if (bool8) {
        localType3 = Types.b(localType1);
      }
      for (;;)
      {
        Type localType4 = Data.a(paramArrayList, localType3);
        a(paramField, localCollection, localType4, paramArrayList, paramCustomizeJsonParser);
        if (!bool8) {
          break label440;
        }
        localObject2 = Types.a(localCollection, Types.a(paramArrayList, localType4));
        return localObject2;
        bool9 = false;
        break;
        localType3 = null;
        if (localClass != null)
        {
          boolean bool10 = Iterable.class.isAssignableFrom(localClass);
          localType3 = null;
          if (bool10) {
            localType3 = Types.c(localType1);
          }
        }
      }
      return localCollection;
      boolean bool6;
      if (!Types.a(localType1))
      {
        bool6 = bool1;
        Object[] arrayOfObject5 = new Object[2];
        arrayOfObject5[0] = localType1;
        arrayOfObject5[bool1] = str2;
        Preconditions.a(bool6, "expected object or map type but got %s%s", arrayOfObject5);
        if ((localClass == null) || (paramCustomizeJsonParser == null)) {
          break label1238;
        }
      }
      for (Object localObject2 = paramCustomizeJsonParser.a(paramObject, localClass);; localObject2 = null)
      {
        if ((localClass != null) && (Types.a(localClass, Map.class))) {
          if (localObject2 == null) {
            if ((!bool1) && (localClass != null)) {
              break label633;
            }
          }
        }
        int i;
        label633:
        for (localObject2 = Data.b(localClass);; localObject2 = Types.a(localClass))
        {
          i = paramArrayList.size();
          if (localType1 != null) {
            paramArrayList.add(localType1);
          }
          if ((!bool1) || (GenericData.class.isAssignableFrom(localClass))) {
            break label643;
          }
          boolean bool7 = Map.class.isAssignableFrom(localClass);
          Type localType2 = null;
          if (bool7) {
            localType2 = Types.d(localType1);
          }
          if (localType2 == null) {
            break label643;
          }
          a(paramField, (Map)localObject2, localType2, paramArrayList, paramCustomizeJsonParser);
          return localObject2;
          bool6 = false;
          break;
          bool1 = false;
          break label519;
        }
        a(paramArrayList, localObject2, paramCustomizeJsonParser);
        if (localType1 == null) {
          break;
        }
        paramArrayList.remove(i);
        return localObject2;
        boolean bool5;
        if ((localType1 == null) || (localClass == Boolean.TYPE) || ((localClass != null) && (localClass.isAssignableFrom(Boolean.class))))
        {
          bool5 = bool1;
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = localType1;
          arrayOfObject4[bool1] = str2;
          Preconditions.a(bool5, "expected type Boolean or boolean but got %s%s", arrayOfObject4);
          if (localJsonToken != JsonToken.i) {
            break label749;
          }
        }
        label749:
        for (Boolean localBoolean = Boolean.TRUE;; localBoolean = Boolean.FALSE)
        {
          return localBoolean;
          bool5 = false;
          break;
        }
        if ((paramField == null) || (paramField.getAnnotation(JsonString.class) == null)) {}
        for (boolean bool4 = bool1;; bool4 = false)
        {
          Object[] arrayOfObject3 = new Object[bool1];
          arrayOfObject3[0] = str2;
          Preconditions.a(bool4, "number type formatted as a JSON number cannot use @JsonString annotation%s", arrayOfObject3);
          if ((localClass != null) && (!localClass.isAssignableFrom(BigDecimal.class))) {
            break;
          }
          return q();
        }
        if (localClass == BigInteger.class) {
          return n();
        }
        if (localClass == UnsignedInteger.class) {
          return o();
        }
        if (localClass == UnsignedLong.class) {
          return p();
        }
        if ((localClass == Double.class) || (localClass == Double.TYPE)) {
          return Double.valueOf(m());
        }
        if ((localClass == Long.class) || (localClass == Long.TYPE)) {
          return Long.valueOf(l());
        }
        if ((localClass == Float.class) || (localClass == Float.TYPE)) {
          return Float.valueOf(k());
        }
        if ((localClass == Integer.class) || (localClass == Integer.TYPE)) {
          return Integer.valueOf(j());
        }
        if ((localClass == Short.class) || (localClass == Short.TYPE)) {
          return Short.valueOf(i());
        }
        if ((localClass == Byte.class) || (localClass == Byte.TYPE)) {
          return Byte.valueOf(h());
        }
        throw new IllegalArgumentException("expected numeric type but got " + localType1 + str2);
        if ((localClass == null) || (!Number.class.isAssignableFrom(localClass)) || ((paramField != null) && (paramField.getAnnotation(JsonString.class) != null))) {}
        for (boolean bool3 = bool1;; bool3 = false)
        {
          Object[] arrayOfObject2 = new Object[bool1];
          arrayOfObject2[0] = str2;
          Preconditions.a(bool3, "number field formatted as a JSON string must use the @JsonString annotation%s", arrayOfObject2);
          try
          {
            Object localObject1 = Data.a(localType1, g());
            return localObject1;
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            throw new IllegalArgumentException(str2, localIllegalArgumentException);
          }
        }
        if ((localClass == null) || (!localClass.isPrimitive())) {}
        for (boolean bool2 = bool1;; bool2 = false)
        {
          Object[] arrayOfObject1 = new Object[bool1];
          arrayOfObject1[0] = str2;
          Preconditions.a(bool2, "primitive number field but found a JSON null%s", arrayOfObject1);
          if ((localClass == null) || ((0x600 & localClass.getModifiers()) == 0)) {
            break label1228;
          }
          if (!Types.a(localClass, Collection.class)) {
            break;
          }
          return Data.a(Data.b(localType1).getClass());
        }
        if (Types.a(localClass, Map.class)) {
          return Data.a(Data.b(localClass).getClass());
        }
        return Data.a(Types.a(paramArrayList, localType1));
      }
    }
  }
  
  private <T> void a(Field paramField, Collection<T> paramCollection, Type paramType, ArrayList<Type> paramArrayList, CustomizeJsonParser paramCustomizeJsonParser)
  {
    for (JsonToken localJsonToken = s(); localJsonToken != JsonToken.b; localJsonToken = c()) {
      paramCollection.add(a(paramField, paramType, paramArrayList, paramCollection, paramCustomizeJsonParser));
    }
  }
  
  private void a(Field paramField, Map<String, Object> paramMap, Type paramType, ArrayList<Type> paramArrayList, CustomizeJsonParser paramCustomizeJsonParser)
  {
    for (JsonToken localJsonToken = s();; localJsonToken = c())
    {
      String str;
      if (localJsonToken == JsonToken.e)
      {
        str = g();
        c();
        if ((paramCustomizeJsonParser == null) || (!paramCustomizeJsonParser.a(paramMap, str))) {}
      }
      else
      {
        return;
      }
      paramMap.put(str, a(paramField, paramType, paramArrayList, paramMap, paramCustomizeJsonParser));
    }
  }
  
  private void a(ArrayList<Type> paramArrayList, Object paramObject, CustomizeJsonParser paramCustomizeJsonParser)
  {
    if ((paramObject instanceof GenericJson)) {
      ((GenericJson)paramObject).setFactory(a());
    }
    JsonToken localJsonToken = s();
    Class localClass = paramObject.getClass();
    ClassInfo localClassInfo = ClassInfo.a(localClass);
    boolean bool = GenericData.class.isAssignableFrom(localClass);
    label78:
    FieldInfo localFieldInfo;
    if ((!bool) && (Map.class.isAssignableFrom(localClass)))
    {
      a(null, (Map)paramObject, Types.d(localClass), paramArrayList, paramCustomizeJsonParser);
      return;
      Field localField = localFieldInfo.a();
      int i = paramArrayList.size();
      paramArrayList.add(localField.getGenericType());
      Object localObject = a(localField, localFieldInfo.d(), paramArrayList, paramObject, paramCustomizeJsonParser);
      paramArrayList.remove(i);
      localFieldInfo.a(paramObject, localObject);
    }
    for (;;)
    {
      localJsonToken = c();
      if (localJsonToken != JsonToken.e) {
        break;
      }
      String str = g();
      c();
      if ((paramCustomizeJsonParser != null) && (paramCustomizeJsonParser.a(paramObject, str))) {
        break;
      }
      localFieldInfo = localClassInfo.a(str);
      if (localFieldInfo != null)
      {
        if ((!localFieldInfo.e()) || (localFieldInfo.f())) {
          break label78;
        }
        throw new IllegalArgumentException("final array/object fields are not supported");
      }
      if (bool)
      {
        ((GenericData)paramObject).set(str, a(null, null, paramArrayList, paramObject, paramCustomizeJsonParser));
      }
      else
      {
        if (paramCustomizeJsonParser != null) {
          paramCustomizeJsonParser.b(paramObject, str);
        }
        f();
      }
    }
  }
  
  private JsonToken r()
  {
    JsonToken localJsonToken1 = d();
    if (localJsonToken1 == null) {}
    for (JsonToken localJsonToken2 = c();; localJsonToken2 = localJsonToken1)
    {
      if (localJsonToken2 != null) {}
      for (boolean bool = true;; bool = false)
      {
        Preconditions.a(bool, "no JSON input found");
        return localJsonToken2;
      }
    }
  }
  
  private JsonToken s()
  {
    JsonToken localJsonToken1 = r();
    switch (JsonParser.1.a[localJsonToken1.ordinal()])
    {
    default: 
      return localJsonToken1;
    case 1: 
      JsonToken localJsonToken2 = c();
      if ((localJsonToken2 == JsonToken.e) || (localJsonToken2 == JsonToken.d)) {}
      for (boolean bool = true;; bool = false)
      {
        Preconditions.a(bool, localJsonToken2);
        return localJsonToken2;
      }
    }
    return c();
  }
  
  public abstract JsonFactory a();
  
  public final <T> T a(Class<T> paramClass, CustomizeJsonParser paramCustomizeJsonParser)
  {
    try
    {
      Object localObject2 = b(paramClass, paramCustomizeJsonParser);
      return localObject2;
    }
    finally
    {
      b();
    }
  }
  
  public Object a(Type paramType, boolean paramBoolean, CustomizeJsonParser paramCustomizeJsonParser)
  {
    try
    {
      r();
      Object localObject2 = a(null, paramType, new ArrayList(), null, paramCustomizeJsonParser);
      return localObject2;
    }
    finally
    {
      if (paramBoolean) {
        b();
      }
    }
  }
  
  public final String a(Set<String> paramSet)
  {
    for (JsonToken localJsonToken = s(); localJsonToken == JsonToken.e; localJsonToken = c())
    {
      String str = g();
      c();
      if (paramSet.contains(str)) {
        return str;
      }
      f();
    }
    return null;
  }
  
  public final void a(String paramString)
  {
    a(Collections.singleton(paramString));
  }
  
  public final <T> T b(Class<T> paramClass, CustomizeJsonParser paramCustomizeJsonParser)
  {
    r();
    return a(paramClass, false, paramCustomizeJsonParser);
  }
  
  public abstract void b();
  
  public abstract JsonToken c();
  
  public abstract JsonToken d();
  
  public abstract String e();
  
  public abstract JsonParser f();
  
  public abstract String g();
  
  public abstract byte h();
  
  public abstract short i();
  
  public abstract int j();
  
  public abstract float k();
  
  public abstract long l();
  
  public abstract double m();
  
  public abstract BigInteger n();
  
  public abstract UnsignedInteger o();
  
  public abstract UnsignedLong p();
  
  public abstract BigDecimal q();
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.json.JsonParser
 * JD-Core Version:    0.7.0.1
 */