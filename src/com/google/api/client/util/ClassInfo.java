package com.google.api.client.util;

import com.google.common.base.Preconditions;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;

public final class ClassInfo
{
  private static final Map<Class<?>, ClassInfo> b = new WeakHashMap();
  private static final Map<Class<?>, ClassInfo> c = new WeakHashMap();
  final List<String> a;
  private final Class<?> d;
  private final boolean e;
  private final IdentityHashMap<String, FieldInfo> f = new IdentityHashMap();
  
  private ClassInfo(Class<?> paramClass, boolean paramBoolean)
  {
    this.d = paramClass;
    this.e = paramBoolean;
    if ((!paramBoolean) || (!paramClass.isEnum())) {}
    TreeSet localTreeSet;
    Field localField1;
    FieldInfo localFieldInfo1;
    for (boolean bool1 = true;; bool1 = false)
    {
      Preconditions.a(bool1, "cannot ignore case on an enum: " + paramClass);
      localTreeSet = new TreeSet(new ClassInfo.1(this));
      Field[] arrayOfField = paramClass.getDeclaredFields();
      int i = arrayOfField.length;
      for (int j = 0;; j++)
      {
        if (j >= i) {
          break label273;
        }
        localField1 = arrayOfField[j];
        localFieldInfo1 = FieldInfo.a(localField1);
        if (localFieldInfo1 != null) {
          break;
        }
      }
    }
    String str2 = localFieldInfo1.b();
    if (paramBoolean) {}
    for (String str3 = str2.toLowerCase().intern();; str3 = str2)
    {
      FieldInfo localFieldInfo2 = (FieldInfo)this.f.get(str3);
      boolean bool2;
      label172:
      Object[] arrayOfObject;
      String str4;
      if (localFieldInfo2 == null)
      {
        bool2 = true;
        arrayOfObject = new Object[4];
        if (!paramBoolean) {
          break label256;
        }
        str4 = "case-insensitive ";
        label186:
        arrayOfObject[0] = str4;
        arrayOfObject[1] = str3;
        arrayOfObject[2] = localField1;
        if (localFieldInfo2 != null) {
          break label263;
        }
      }
      label256:
      label263:
      for (Field localField2 = null;; localField2 = localFieldInfo2.a())
      {
        arrayOfObject[3] = localField2;
        Preconditions.a(bool2, "two fields have the same %sname <%s>: %s and %s", arrayOfObject);
        this.f.put(str3, localFieldInfo1);
        localTreeSet.add(str3);
        break;
        bool2 = false;
        break label172;
        str4 = "";
        break label186;
      }
      label273:
      Class localClass = paramClass.getSuperclass();
      if (localClass != null)
      {
        ClassInfo localClassInfo = a(localClass, paramBoolean);
        localTreeSet.addAll(localClassInfo.a);
        Iterator localIterator = localClassInfo.f.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          String str1 = (String)localEntry.getKey();
          if (!this.f.containsKey(str1)) {
            this.f.put(str1, localEntry.getValue());
          }
        }
      }
      if (localTreeSet.isEmpty()) {}
      for (List localList = Collections.emptyList();; localList = Collections.unmodifiableList(new ArrayList(localTreeSet)))
      {
        this.a = localList;
        return;
      }
    }
  }
  
  public static ClassInfo a(Class<?> paramClass)
  {
    return a(paramClass, false);
  }
  
  public static ClassInfo a(Class<?> paramClass, boolean paramBoolean)
  {
    if (paramClass == null) {
      return null;
    }
    if (paramBoolean) {}
    for (;;)
    {
      synchronized (c)
      {
        ClassInfo localClassInfo = (ClassInfo)???.get(paramClass);
        if (localClassInfo == null)
        {
          localClassInfo = new ClassInfo(paramClass, paramBoolean);
          ???.put(paramClass, localClassInfo);
        }
        return localClassInfo;
      }
      ??? = b;
    }
  }
  
  public FieldInfo a(String paramString)
  {
    if (paramString != null)
    {
      if (this.e) {
        paramString = paramString.toLowerCase();
      }
      paramString = paramString.intern();
    }
    return (FieldInfo)this.f.get(paramString);
  }
  
  public final boolean a()
  {
    return this.e;
  }
  
  public Field b(String paramString)
  {
    FieldInfo localFieldInfo = a(paramString);
    if (localFieldInfo == null) {
      return null;
    }
    return localFieldInfo.a();
  }
  
  public boolean b()
  {
    return this.d.isEnum();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.ClassInfo
 * JD-Core Version:    0.7.0.1
 */