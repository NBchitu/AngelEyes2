package com.google.api.client.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

public class FieldInfo
{
  private static final Map<Field, FieldInfo> a = new WeakHashMap();
  private final boolean b;
  private final Field c;
  private final String d;
  
  FieldInfo(Field paramField, String paramString)
  {
    this.c = paramField;
    if (paramString == null) {}
    for (String str = null;; str = paramString.intern())
    {
      this.d = str;
      this.b = Data.a(c());
      return;
    }
  }
  
  /* Error */
  public static FieldInfo a(Enum<?> paramEnum)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aload_0
    //   3: invokevirtual 50	java/lang/Object:getClass	()Ljava/lang/Class;
    //   6: aload_0
    //   7: invokevirtual 55	java/lang/Enum:name	()Ljava/lang/String;
    //   10: invokevirtual 61	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   13: invokestatic 64	com/google/api/client/util/FieldInfo:a	(Ljava/lang/reflect/Field;)Lcom/google/api/client/util/FieldInfo;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull +19 -> 37
    //   21: iload_1
    //   22: ldc 66
    //   24: iconst_1
    //   25: anewarray 4	java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: invokestatic 71	com/google/common/base/Preconditions:a	(ZLjava/lang/String;[Ljava/lang/Object;)V
    //   35: aload_3
    //   36: areturn
    //   37: iconst_0
    //   38: istore_1
    //   39: goto -18 -> 21
    //   42: astore_2
    //   43: new 73	java/lang/RuntimeException
    //   46: dup
    //   47: aload_2
    //   48: invokespecial 76	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	paramEnum	Enum<?>
    //   1	38	1	bool	boolean
    //   42	6	2	localNoSuchFieldException	java.lang.NoSuchFieldException
    //   16	20	3	localFieldInfo	FieldInfo
    // Exception table:
    //   from	to	target	type
    //   2	17	42	java/lang/NoSuchFieldException
    //   21	35	42	java/lang/NoSuchFieldException
  }
  
  public static FieldInfo a(Field paramField)
  {
    if (paramField == null) {
      return null;
    }
    for (;;)
    {
      FieldInfo localFieldInfo1;
      String str1;
      String str2;
      FieldInfo localFieldInfo2;
      synchronized (a)
      {
        localFieldInfo1 = (FieldInfo)a.get(paramField);
        boolean bool = paramField.isEnumConstant();
        if ((localFieldInfo1 != null) || ((!bool) && (Modifier.isStatic(paramField.getModifiers())))) {
          break label200;
        }
        if (!bool) {
          break label156;
        }
        Value localValue = (Value)paramField.getAnnotation(Value.class);
        if (localValue != null)
        {
          str1 = localValue.a();
          if (!"##default".equals(str1)) {
            break label193;
          }
          str2 = paramField.getName();
          FieldInfo localFieldInfo3 = new FieldInfo(paramField, str2);
          a.put(paramField, localFieldInfo3);
          localFieldInfo2 = localFieldInfo3;
          return localFieldInfo2;
        }
      }
      if ((NullValue)paramField.getAnnotation(NullValue.class) != null)
      {
        str1 = null;
      }
      else
      {
        return null;
        label156:
        Key localKey = (Key)paramField.getAnnotation(Key.class);
        if (localKey == null) {
          return null;
        }
        str1 = localKey.a();
        paramField.setAccessible(true);
        continue;
        label193:
        str2 = str1;
        continue;
        label200:
        localFieldInfo2 = localFieldInfo1;
      }
    }
  }
  
  public static Object a(Field paramField, Object paramObject)
  {
    try
    {
      Object localObject = paramField.get(paramObject);
      return localObject;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException(localIllegalAccessException);
    }
  }
  
  public static void a(Field paramField, Object paramObject1, Object paramObject2)
  {
    if (Modifier.isFinal(paramField.getModifiers()))
    {
      Object localObject = a(paramField, paramObject1);
      if (paramObject2 == null)
      {
        if (localObject == null) {}
      }
      else {
        while (!paramObject2.equals(localObject)) {
          throw new IllegalArgumentException("expected final value <" + localObject + "> but was <" + paramObject2 + "> on " + paramField.getName() + " field in " + paramObject1.getClass().getName());
        }
      }
      return;
    }
    try
    {
      paramField.set(paramObject1, paramObject2);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      throw new IllegalArgumentException(localSecurityException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException(localIllegalAccessException);
    }
  }
  
  public Object a(Object paramObject)
  {
    return a(this.c, paramObject);
  }
  
  public Field a()
  {
    return this.c;
  }
  
  public void a(Object paramObject1, Object paramObject2)
  {
    a(this.c, paramObject1, paramObject2);
  }
  
  public String b()
  {
    return this.d;
  }
  
  public Class<?> c()
  {
    return this.c.getType();
  }
  
  public Type d()
  {
    return this.c.getGenericType();
  }
  
  public boolean e()
  {
    return Modifier.isFinal(this.c.getModifiers());
  }
  
  public boolean f()
  {
    return this.b;
  }
  
  public <T extends Enum<T>> T g()
  {
    return Enum.valueOf(this.c.getDeclaringClass(), this.c.getName());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.api.client.util.FieldInfo
 * JD-Core Version:    0.7.0.1
 */