package com.google.api.client.util;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Types
{
  public static Class<?> a(ParameterizedType paramParameterizedType)
  {
    return (Class)paramParameterizedType.getRawType();
  }
  
  public static Class<?> a(List<Type> paramList, Type paramType)
  {
    if ((paramType instanceof TypeVariable)) {}
    for (Type localType = a(paramList, (TypeVariable)paramType);; localType = paramType)
    {
      if ((localType instanceof GenericArrayType)) {
        return Array.newInstance(a(paramList, b(localType)), 0).getClass();
      }
      if ((localType instanceof Class)) {
        return (Class)localType;
      }
      if ((localType instanceof ParameterizedType)) {
        return a((ParameterizedType)localType);
      }
      if (localType == null) {}
      for (boolean bool = true;; bool = false)
      {
        Preconditions.a(bool, "wildcard type is not supported: %s", new Object[] { localType });
        return Object.class;
      }
    }
  }
  
  private static IllegalArgumentException a(Exception paramException, Class<?> paramClass)
  {
    StringBuilder localStringBuilder = new StringBuilder("unable to create new instance of class ").append(paramClass.getName());
    ArrayList localArrayList = new ArrayList();
    int i;
    label48:
    String str;
    if (paramClass.isArray())
    {
      localArrayList.add("because it is an array");
      Iterator localIterator = localArrayList.iterator();
      i = 0;
      if (!localIterator.hasNext()) {
        break label241;
      }
      str = (String)localIterator.next();
      if (i == 0) {
        break label235;
      }
      localStringBuilder.append(" and");
    }
    for (;;)
    {
      for (;;)
      {
        localStringBuilder.append(" ").append(str);
        break label48;
        if (paramClass.isPrimitive())
        {
          localArrayList.add("because it is primitive");
          break;
        }
        if (paramClass == Void.class)
        {
          localArrayList.add("because it is void");
          break;
        }
        if (Modifier.isInterface(paramClass.getModifiers())) {
          localArrayList.add("because it is an interface");
        }
        for (;;)
        {
          if ((paramClass.getEnclosingClass() != null) && (!Modifier.isStatic(paramClass.getModifiers()))) {
            localArrayList.add("because it is not static");
          }
          if (Modifier.isPublic(paramClass.getModifiers())) {
            break label211;
          }
          localArrayList.add("possibly because it is not public");
          break;
          if (Modifier.isAbstract(paramClass.getModifiers())) {
            localArrayList.add("because it is abstract");
          }
        }
        try
        {
          label211:
          paramClass.getConstructor(new Class[0]);
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          localArrayList.add("because it has no accessible default constructor");
        }
      }
      break;
      label235:
      i = 1;
    }
    label241:
    return new IllegalArgumentException(localStringBuilder.toString(), paramException);
  }
  
  public static <T> Iterable<T> a(Object paramObject)
  {
    if ((paramObject instanceof Iterable)) {
      return (Iterable)paramObject;
    }
    Class localClass = paramObject.getClass();
    Preconditions.a(localClass.isArray(), "not an array or Iterable: %s", new Object[] { localClass });
    if (!localClass.getComponentType().isPrimitive()) {
      return Arrays.asList((Object[])paramObject);
    }
    return new Types.1(paramObject);
  }
  
  public static <T> T a(Class<T> paramClass)
  {
    try
    {
      Object localObject = paramClass.newInstance();
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw a(localIllegalAccessException, paramClass);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw a(localInstantiationException, paramClass);
    }
  }
  
  public static Object a(Collection<?> paramCollection, Class<?> paramClass)
  {
    if (paramClass.isPrimitive())
    {
      Object localObject1 = Array.newInstance(paramClass, paramCollection.size());
      int i = 0;
      Iterator localIterator = paramCollection.iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = localIterator.next();
        int j = i + 1;
        Array.set(localObject1, i, localObject2);
        i = j;
      }
      return localObject1;
    }
    return paramCollection.toArray((Object[])Array.newInstance(paramClass, paramCollection.size()));
  }
  
  public static ParameterizedType a(Type paramType, Class<?> paramClass)
  {
    Object localObject1;
    if (((paramType instanceof Class)) || ((paramType instanceof ParameterizedType)))
    {
      localObject1 = paramType;
      if ((localObject1 != null) && (localObject1 != Object.class)) {
        if (!(localObject1 instanceof Class)) {}
      }
    }
    Class localClass1;
    for (Object localObject2 = (Class)localObject1;; localObject2 = localClass1)
    {
      localObject1 = ((Class)localObject2).getGenericSuperclass();
      break;
      ParameterizedType localParameterizedType = (ParameterizedType)localObject1;
      localClass1 = a(localParameterizedType);
      if (localClass1 == paramClass) {
        return localParameterizedType;
      }
      if (paramClass.isInterface())
      {
        Type[] arrayOfType = localClass1.getGenericInterfaces();
        int i = arrayOfType.length;
        int j = 0;
        for (;;)
        {
          if (j < i)
          {
            Type localType = arrayOfType[j];
            if ((localType instanceof Class)) {}
            for (Class localClass2 = (Class)localType;; localClass2 = a((ParameterizedType)localType))
            {
              if (!paramClass.isAssignableFrom(localClass2)) {
                break label146;
              }
              localObject1 = localType;
              break;
            }
            label146:
            j++;
            continue;
            return null;
          }
        }
      }
    }
  }
  
  private static Type a(Type paramType, Class<?> paramClass, int paramInt)
  {
    Object localObject = a(paramType, paramClass).getActualTypeArguments()[paramInt];
    if ((localObject instanceof TypeVariable))
    {
      Type localType = a(Arrays.asList(new Type[] { paramType }), (TypeVariable)localObject);
      if (localType != null) {
        localObject = localType;
      }
    }
    return localObject;
  }
  
  public static Type a(WildcardType paramWildcardType)
  {
    Type[] arrayOfType = paramWildcardType.getLowerBounds();
    if (arrayOfType.length != 0) {
      return arrayOfType[0];
    }
    return paramWildcardType.getUpperBounds()[0];
  }
  
  public static Type a(List<Type> paramList, TypeVariable<?> paramTypeVariable)
  {
    GenericDeclaration localGenericDeclaration = paramTypeVariable.getGenericDeclaration();
    if ((localGenericDeclaration instanceof Class))
    {
      Class localClass = (Class)localGenericDeclaration;
      int i = paramList.size();
      for (ParameterizedType localParameterizedType = null; localParameterizedType == null; localParameterizedType = a((Type)paramList.get(i), localClass))
      {
        i--;
        if (i < 0) {
          break;
        }
      }
      if (localParameterizedType != null)
      {
        TypeVariable[] arrayOfTypeVariable = localGenericDeclaration.getTypeParameters();
        for (int j = 0;; j++) {
          if ((j >= arrayOfTypeVariable.length) || (arrayOfTypeVariable[j].equals(paramTypeVariable)))
          {
            Object localObject = localParameterizedType.getActualTypeArguments()[j];
            if ((localObject instanceof TypeVariable))
            {
              Type localType = a(paramList, (TypeVariable)localObject);
              if (localType != null) {
                localObject = localType;
              }
            }
            return localObject;
          }
        }
      }
    }
    return null;
  }
  
  public static boolean a(Class<?> paramClass1, Class<?> paramClass2)
  {
    return (paramClass1.isAssignableFrom(paramClass2)) || (paramClass2.isAssignableFrom(paramClass1));
  }
  
  public static boolean a(Type paramType)
  {
    return ((paramType instanceof GenericArrayType)) || (((paramType instanceof Class)) && (((Class)paramType).isArray()));
  }
  
  public static Type b(Type paramType)
  {
    if ((paramType instanceof GenericArrayType)) {
      return ((GenericArrayType)paramType).getGenericComponentType();
    }
    return ((Class)paramType).getComponentType();
  }
  
  public static Type c(Type paramType)
  {
    return a(paramType, Iterable.class, 0);
  }
  
  public static Type d(Type paramType)
  {
    return a(paramType, Map.class, 1);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.Types
 * JD-Core Version:    0.7.0.1
 */