package com.google.common.base;

import javax.annotation.Nullable;

public final class Preconditions
{
  public static int a(int paramInt1, int paramInt2)
  {
    return a(paramInt1, paramInt2, "index");
  }
  
  public static int a(int paramInt1, int paramInt2, @Nullable String paramString)
  {
    if ((paramInt1 < 0) || (paramInt1 >= paramInt2)) {
      throw new IndexOutOfBoundsException(c(paramInt1, paramInt2, paramString));
    }
    return paramInt1;
  }
  
  public static <T> T a(T paramT)
  {
    if (paramT == null) {
      throw new NullPointerException();
    }
    return paramT;
  }
  
  public static <T> T a(T paramT, @Nullable Object paramObject)
  {
    if (paramT == null) {
      throw new NullPointerException(String.valueOf(paramObject));
    }
    return paramT;
  }
  
  public static <T> T a(T paramT, @Nullable String paramString, @Nullable Object... paramVarArgs)
  {
    if (paramT == null) {
      throw new NullPointerException(a(paramString, paramVarArgs));
    }
    return paramT;
  }
  
  static String a(String paramString, @Nullable Object... paramVarArgs)
  {
    int i = 0;
    String str = String.valueOf(paramString);
    StringBuilder localStringBuilder = new StringBuilder(str.length() + 16 * paramVarArgs.length);
    int j = 0;
    for (;;)
    {
      int i1;
      if (i < paramVarArgs.length)
      {
        i1 = str.indexOf("%s", j);
        if (i1 != -1) {}
      }
      else
      {
        localStringBuilder.append(str.substring(j));
        if (i >= paramVarArgs.length) {
          break label181;
        }
        localStringBuilder.append(" [");
        int k = i + 1;
        localStringBuilder.append(paramVarArgs[i]);
        int n;
        for (int m = k; m < paramVarArgs.length; m = n)
        {
          localStringBuilder.append(", ");
          n = m + 1;
          localStringBuilder.append(paramVarArgs[m]);
        }
      }
      localStringBuilder.append(str.substring(j, i1));
      int i2 = i + 1;
      localStringBuilder.append(paramVarArgs[i]);
      j = i1 + 2;
      i = i2;
    }
    localStringBuilder.append(']');
    label181:
    return localStringBuilder.toString();
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 0) || (paramInt2 < paramInt1) || (paramInt2 > paramInt3)) {
      throw new IndexOutOfBoundsException(b(paramInt1, paramInt2, paramInt3));
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException();
    }
  }
  
  public static void a(boolean paramBoolean, @Nullable Object paramObject)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException(String.valueOf(paramObject));
    }
  }
  
  public static void a(boolean paramBoolean, @Nullable String paramString, @Nullable Object... paramVarArgs)
  {
    if (!paramBoolean) {
      throw new IllegalArgumentException(a(paramString, paramVarArgs));
    }
  }
  
  public static int b(int paramInt1, int paramInt2)
  {
    return b(paramInt1, paramInt2, "index");
  }
  
  public static int b(int paramInt1, int paramInt2, @Nullable String paramString)
  {
    if ((paramInt1 < 0) || (paramInt1 > paramInt2)) {
      throw new IndexOutOfBoundsException(d(paramInt1, paramInt2, paramString));
    }
    return paramInt1;
  }
  
  private static String b(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 0) || (paramInt1 > paramInt3)) {
      return d(paramInt1, paramInt3, "start index");
    }
    if ((paramInt2 < 0) || (paramInt2 > paramInt3)) {
      return d(paramInt2, paramInt3, "end index");
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    return a("end index (%s) must not be less than start index (%s)", arrayOfObject);
  }
  
  public static void b(boolean paramBoolean)
  {
    if (!paramBoolean) {
      throw new IllegalStateException();
    }
  }
  
  public static void b(boolean paramBoolean, @Nullable String paramString, @Nullable Object... paramVarArgs)
  {
    if (!paramBoolean) {
      throw new IllegalStateException(a(paramString, paramVarArgs));
    }
  }
  
  private static String c(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = paramString;
      arrayOfObject2[1] = Integer.valueOf(paramInt1);
      return a("%s (%s) must not be negative", arrayOfObject2);
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("negative size: " + paramInt2);
    }
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = Integer.valueOf(paramInt1);
    arrayOfObject1[2] = Integer.valueOf(paramInt2);
    return a("%s (%s) must be less than size (%s)", arrayOfObject1);
  }
  
  private static String d(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = paramString;
      arrayOfObject2[1] = Integer.valueOf(paramInt1);
      return a("%s (%s) must not be negative", arrayOfObject2);
    }
    if (paramInt2 < 0) {
      throw new IllegalArgumentException("negative size: " + paramInt2);
    }
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = paramString;
    arrayOfObject1[1] = Integer.valueOf(paramInt1);
    arrayOfObject1[2] = Integer.valueOf(paramInt2);
    return a("%s (%s) must not be greater than size (%s)", arrayOfObject1);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.common.base.Preconditions
 * JD-Core Version:    0.7.0.1
 */