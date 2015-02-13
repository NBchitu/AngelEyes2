package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayMap<K, V>
  extends AbstractMap<K, V>
  implements Cloneable
{
  int a;
  private Object[] b;
  
  public static <K, V> ArrayMap<K, V> a()
  {
    return new ArrayMap();
  }
  
  private int b(Object paramObject)
  {
    int i = this.a << 1;
    Object[] arrayOfObject = this.b;
    for (int j = 0; j < i; j += 2)
    {
      Object localObject = arrayOfObject[j];
      if (paramObject == null)
      {
        if (localObject != null) {}
      }
      else {
        while (paramObject.equals(localObject)) {
          return j;
        }
      }
    }
    return -2;
  }
  
  private void b(int paramInt, K paramK, V paramV)
  {
    Object[] arrayOfObject = this.b;
    arrayOfObject[paramInt] = paramK;
    arrayOfObject[(paramInt + 1)] = paramV;
  }
  
  private void e(int paramInt)
  {
    if (paramInt == 0) {
      this.b = null;
    }
    int i;
    Object[] arrayOfObject1;
    Object[] arrayOfObject2;
    do
    {
      do
      {
        return;
        i = this.a;
        arrayOfObject1 = this.b;
      } while ((i != 0) && (paramInt == arrayOfObject1.length));
      arrayOfObject2 = new Object[paramInt];
      this.b = arrayOfObject2;
    } while (i == 0);
    System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, i << 1);
  }
  
  private V f(int paramInt)
  {
    if (paramInt < 0) {
      return null;
    }
    return this.b[paramInt];
  }
  
  private V g(int paramInt)
  {
    int i = this.a << 1;
    if ((paramInt < 0) || (paramInt >= i)) {
      return null;
    }
    Object localObject = f(paramInt + 1);
    Object[] arrayOfObject = this.b;
    int j = -2 + (i - paramInt);
    if (j != 0) {
      System.arraycopy(arrayOfObject, paramInt + 2, arrayOfObject, paramInt, j);
    }
    this.a = (-1 + this.a);
    b(i - 2, null, null);
    return localObject;
  }
  
  public final int a(K paramK)
  {
    return b(paramK) >> 1;
  }
  
  public final K a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.a)) {
      return null;
    }
    return this.b[(paramInt << 1)];
  }
  
  public final V a(int paramInt, V paramV)
  {
    int i = this.a;
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new IndexOutOfBoundsException();
    }
    int j = 1 + (paramInt << 1);
    Object localObject = f(j);
    this.b[j] = paramV;
    return localObject;
  }
  
  public final V a(int paramInt, K paramK, V paramV)
  {
    if (paramInt < 0) {
      throw new IndexOutOfBoundsException();
    }
    int i = paramInt + 1;
    d(i);
    int j = paramInt << 1;
    Object localObject = f(j + 1);
    b(j, paramK, paramV);
    if (i > this.a) {
      this.a = i;
    }
    return localObject;
  }
  
  public ArrayMap<K, V> b()
  {
    try
    {
      ArrayMap localArrayMap = (ArrayMap)super.clone();
      Object[] arrayOfObject1 = this.b;
      if (arrayOfObject1 != null)
      {
        int i = arrayOfObject1.length;
        Object[] arrayOfObject2 = new Object[i];
        localArrayMap.b = arrayOfObject2;
        System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, i);
      }
      return localArrayMap;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
  
  public final V b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.a)) {
      return null;
    }
    return f(1 + (paramInt << 1));
  }
  
  public final V c(int paramInt)
  {
    return g(paramInt << 1);
  }
  
  public void clear()
  {
    this.a = 0;
    this.b = null;
  }
  
  public final boolean containsKey(Object paramObject)
  {
    return -2 != b(paramObject);
  }
  
  public final boolean containsValue(Object paramObject)
  {
    int i = this.a << 1;
    Object[] arrayOfObject = this.b;
    for (int j = 1; j < i; j += 2)
    {
      Object localObject = arrayOfObject[j];
      if (paramObject == null)
      {
        if (localObject != null) {}
      }
      else {
        while (paramObject.equals(localObject)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final void d(int paramInt)
  {
    Object[] arrayOfObject = this.b;
    int i = paramInt << 1;
    int j;
    int k;
    if (arrayOfObject == null)
    {
      j = 0;
      if (i > j)
      {
        k = 1 + 3 * (j / 2);
        if (k % 2 == 1) {
          k++;
        }
        if (k >= i) {
          break label62;
        }
      }
    }
    for (;;)
    {
      e(i);
      return;
      j = arrayOfObject.length;
      break;
      label62:
      i = k;
    }
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    return new ArrayMap.EntrySet(this);
  }
  
  public final V get(Object paramObject)
  {
    return f(1 + b(paramObject));
  }
  
  public final V put(K paramK, V paramV)
  {
    int i = a(paramK);
    if (i == -1) {
      i = this.a;
    }
    return a(i, paramK, paramV);
  }
  
  public final V remove(Object paramObject)
  {
    return g(b(paramObject));
  }
  
  public final int size()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.ArrayMap
 * JD-Core Version:    0.7.0.1
 */