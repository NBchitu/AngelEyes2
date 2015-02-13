package com.google.api.client.util;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedInteger;
import com.google.common.primitives.UnsignedLong;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class Data
{
  public static final Boolean a = new Boolean(true);
  public static final String b = new String();
  public static final Character c = new Character('\000');
  public static final Byte d = new Byte((byte)0);
  public static final Short e = new Short((short)0);
  public static final Integer f = new Integer(0);
  public static final Float g = new Float(0.0F);
  public static final Long h = new Long(0L);
  public static final Double i = new Double(0.0D);
  public static final BigInteger j = new BigInteger("0");
  public static final UnsignedInteger k = UnsignedInteger.a(0);
  public static final UnsignedLong l = UnsignedLong.a(0L);
  public static final BigDecimal m = new BigDecimal("0");
  public static final DateTime n = new DateTime(0L);
  private static final ConcurrentHashMap<Class<?>, Object> o = new ConcurrentHashMap();
  
  static
  {
    o.put(Boolean.class, a);
    o.put(String.class, b);
    o.put(Character.class, c);
    o.put(Byte.class, d);
    o.put(Short.class, e);
    o.put(Integer.class, f);
    o.put(Float.class, g);
    o.put(Long.class, h);
    o.put(Double.class, i);
    o.put(BigInteger.class, j);
    o.put(UnsignedInteger.class, k);
    o.put(UnsignedLong.class, l);
    o.put(BigDecimal.class, m);
    o.put(DateTime.class, n);
  }
  
  public static <T> T a(Class<?> paramClass)
  {
    int i1 = 0;
    Object localObject1 = o.get(paramClass);
    if (localObject1 == null) {
      synchronized (o)
      {
        Object localObject3 = o.get(paramClass);
        Object localObject4;
        if (localObject3 == null)
        {
          if (!paramClass.isArray()) {
            break label87;
          }
          localObject4 = paramClass;
          do
          {
            localObject4 = ((Class)localObject4).getComponentType();
            i1++;
          } while (((Class)localObject4).isArray());
        }
        label87:
        FieldInfo localFieldInfo;
        for (localObject3 = Array.newInstance((Class)localObject4, new int[i1]);; localObject3 = localFieldInfo.g())
        {
          o.put(paramClass, localObject3);
          return localObject3;
          if (!paramClass.isEnum()) {
            break;
          }
          localFieldInfo = ClassInfo.a(paramClass).a(null);
          Preconditions.a(localFieldInfo, "enum missing constant with @NullValue annotation: %s", new Object[] { paramClass });
        }
        localObject3 = Types.a(paramClass);
      }
    }
    return localObject1;
  }
  
  public static Object a(Type paramType, String paramString)
  {
    Class localClass;
    if ((paramType instanceof Class)) {
      localClass = (Class)paramType;
    }
    while ((paramType == null) || (localClass != null)) {
      if ((paramString == null) || (localClass == null) || (localClass.isAssignableFrom(String.class)))
      {
        return paramString;
        localClass = null;
      }
      else
      {
        if ((localClass == Character.class) || (localClass == Character.TYPE))
        {
          if (paramString.length() != 1) {
            throw new IllegalArgumentException("expected type Character/char but got " + localClass);
          }
          return Character.valueOf(paramString.charAt(0));
        }
        if ((localClass == Boolean.class) || (localClass == Boolean.TYPE)) {
          return Boolean.valueOf(paramString);
        }
        if ((localClass == Byte.class) || (localClass == Byte.TYPE)) {
          return Byte.valueOf(paramString);
        }
        if ((localClass == Short.class) || (localClass == Short.TYPE)) {
          return Short.valueOf(paramString);
        }
        if ((localClass == Integer.class) || (localClass == Integer.TYPE)) {
          return Integer.valueOf(paramString);
        }
        if ((localClass == Long.class) || (localClass == Long.TYPE)) {
          return Long.valueOf(paramString);
        }
        if ((localClass == Float.class) || (localClass == Float.TYPE)) {
          return Float.valueOf(paramString);
        }
        if ((localClass == Double.class) || (localClass == Double.TYPE)) {
          return Double.valueOf(paramString);
        }
        if (localClass == DateTime.class) {
          return DateTime.a(paramString);
        }
        if (localClass == BigInteger.class) {
          return new BigInteger(paramString);
        }
        if (localClass == UnsignedInteger.class) {
          return UnsignedInteger.a(paramString);
        }
        if (localClass == UnsignedLong.class) {
          return UnsignedLong.a(paramString);
        }
        if (localClass == BigDecimal.class) {
          return new BigDecimal(paramString);
        }
        if (localClass.isEnum()) {
          return ClassInfo.a(localClass).a(paramString).g();
        }
      }
    }
    throw new IllegalArgumentException("expected primitive class, but got: " + paramType);
  }
  
  public static Type a(List<Type> paramList, Type paramType)
  {
    Object localObject1;
    if ((paramType instanceof WildcardType)) {
      localObject1 = Types.a((WildcardType)paramType);
    }
    for (;;)
    {
      Object localObject2;
      if ((localObject1 instanceof TypeVariable))
      {
        localObject2 = Types.a(paramList, (TypeVariable)localObject1);
        if (localObject2 == null) {
          break label64;
        }
      }
      for (;;)
      {
        if ((localObject2 instanceof TypeVariable))
        {
          localObject1 = ((TypeVariable)localObject2).getBounds()[0];
          break;
          return localObject1;
        }
        localObject1 = localObject2;
        break;
        label64:
        localObject2 = localObject1;
      }
      localObject1 = paramType;
    }
  }
  
  public static void a(Object paramObject1, Object paramObject2)
  {
    boolean bool1 = true;
    int i1 = 0;
    Class localClass = paramObject1.getClass();
    boolean bool2;
    boolean bool3;
    if (!a(localClass))
    {
      bool2 = bool1;
      Preconditions.a(bool2);
      if (localClass != paramObject2.getClass()) {
        break label123;
      }
      bool3 = bool1;
      label38:
      Preconditions.a(bool3);
      if (!localClass.isArray()) {
        break label134;
      }
      if (Array.getLength(paramObject1) != Array.getLength(paramObject2)) {
        break label129;
      }
    }
    for (;;)
    {
      Preconditions.a(bool1);
      Iterator localIterator4 = Types.a(paramObject1).iterator();
      while (localIterator4.hasNext())
      {
        Object localObject2 = localIterator4.next();
        int i3 = i1 + 1;
        Array.set(paramObject2, i1, c(localObject2));
        i1 = i3;
      }
      bool2 = false;
      break;
      label123:
      bool3 = false;
      break label38;
      label129:
      bool1 = false;
    }
    label134:
    if (Collection.class.isAssignableFrom(localClass))
    {
      Collection localCollection1 = (Collection)paramObject1;
      if (ArrayList.class.isAssignableFrom(localClass)) {
        ((ArrayList)paramObject2).ensureCapacity(localCollection1.size());
      }
      Collection localCollection2 = (Collection)paramObject2;
      Iterator localIterator3 = localCollection1.iterator();
      while (localIterator3.hasNext()) {
        localCollection2.add(c(localIterator3.next()));
      }
    }
    boolean bool4 = GenericData.class.isAssignableFrom(localClass);
    if ((bool4) || (!Map.class.isAssignableFrom(localClass)))
    {
      if (bool4) {}
      for (ClassInfo localClassInfo = ((GenericData)paramObject1).classInfo;; localClassInfo = ClassInfo.a(localClass))
      {
        Iterator localIterator1 = localClassInfo.a.iterator();
        while (localIterator1.hasNext())
        {
          FieldInfo localFieldInfo = localClassInfo.a((String)localIterator1.next());
          if ((!localFieldInfo.e()) && ((!bool4) || (!localFieldInfo.f())))
          {
            Object localObject1 = localFieldInfo.a(paramObject1);
            if (localObject1 != null) {
              localFieldInfo.a(paramObject2, c(localObject1));
            }
          }
        }
      }
    }
    if (ArrayMap.class.isAssignableFrom(localClass))
    {
      ArrayMap localArrayMap1 = (ArrayMap)paramObject2;
      ArrayMap localArrayMap2 = (ArrayMap)paramObject1;
      int i2 = localArrayMap2.size();
      while (i1 < i2)
      {
        localArrayMap1.a(i1, c(localArrayMap2.b(i1)));
        i1++;
      }
    }
    Map localMap = (Map)paramObject2;
    Iterator localIterator2 = ((Map)paramObject1).entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      localMap.put(localEntry.getKey(), c(localEntry.getValue()));
    }
  }
  
  public static boolean a(Object paramObject)
  {
    return (paramObject != null) && (paramObject == o.get(paramObject.getClass()));
  }
  
  public static boolean a(Type paramType)
  {
    if ((paramType instanceof WildcardType)) {}
    for (Type localType = Types.a((WildcardType)paramType);; localType = paramType)
    {
      if (!(localType instanceof Class)) {
        return false;
      }
      Class localClass = (Class)localType;
      if ((localClass.isPrimitive()) || (localClass == Character.class) || (localClass == String.class) || (localClass == Integer.class) || (localClass == Long.class) || (localClass == Short.class) || (localClass == Byte.class) || (localClass == Float.class) || (localClass == Double.class) || (localClass == BigInteger.class) || (localClass == UnsignedInteger.class) || (localClass == UnsignedLong.class) || (localClass == BigDecimal.class) || (localClass == DateTime.class) || (localClass == Boolean.class)) {}
      for (boolean bool = true;; bool = false) {
        return bool;
      }
    }
  }
  
  public static Collection<Object> b(Type paramType)
  {
    if ((paramType instanceof WildcardType)) {}
    for (Type localType1 = Types.a((WildcardType)paramType);; localType1 = paramType)
    {
      if ((localType1 instanceof ParameterizedType)) {}
      for (Type localType2 = ((ParameterizedType)localType1).getRawType();; localType2 = localType1)
      {
        if ((localType2 instanceof Class)) {}
        for (Class localClass = (Class)localType2; (localType2 == null) || ((localType2 instanceof GenericArrayType)) || ((localClass != null) && ((localClass.isArray()) || (localClass.isAssignableFrom(ArrayList.class)))); localClass = null) {
          return new ArrayList();
        }
        if (localClass.isAssignableFrom(HashSet.class)) {
          return new HashSet();
        }
        if (localClass.isAssignableFrom(TreeSet.class)) {
          return new TreeSet();
        }
        return (Collection)Types.a(localClass);
      }
    }
  }
  
  public static Map<String, Object> b(Class<?> paramClass)
  {
    if ((paramClass == null) || (paramClass.isAssignableFrom(ArrayMap.class))) {
      return ArrayMap.a();
    }
    if (paramClass.isAssignableFrom(TreeMap.class)) {
      return new TreeMap();
    }
    return (Map)Types.a(paramClass);
  }
  
  public static Map<String, Object> b(Object paramObject)
  {
    if ((paramObject == null) || (a(paramObject))) {
      return Collections.emptyMap();
    }
    if ((paramObject instanceof Map)) {
      return (Map)paramObject;
    }
    return new DataMap(paramObject, false);
  }
  
  public static <T> T c(T paramT)
  {
    if ((paramT == null) || (a(paramT.getClass()))) {
      return paramT;
    }
    if ((paramT instanceof GenericData)) {
      return ((GenericData)paramT).clone();
    }
    Class localClass = paramT.getClass();
    Object localObject;
    if (localClass.isArray()) {
      localObject = Array.newInstance(localClass.getComponentType(), Array.getLength(paramT));
    }
    for (;;)
    {
      a(paramT, localObject);
      return localObject;
      if ((paramT instanceof ArrayMap)) {
        localObject = ((ArrayMap)paramT).b();
      } else {
        localObject = Types.a(localClass);
      }
    }
  }
  
  public static boolean d(Object paramObject)
  {
    return (paramObject == null) || (a(paramObject.getClass()));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.Data
 * JD-Core Version:    0.7.0.1
 */