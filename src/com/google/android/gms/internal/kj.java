package com.google.android.gms.internal;

import java.util.LinkedHashMap;

public class kj<K, V>
{
  private final LinkedHashMap<K, V> a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  
  private int c(K paramK, V paramV)
  {
    int i = a(paramK, paramV);
    if (i < 0) {
      throw new IllegalStateException("Negative size: " + paramK + "=" + paramV);
    }
    return i;
  }
  
  protected int a(K paramK, V paramV)
  {
    return 1;
  }
  
  public final V a(K paramK)
  {
    if (paramK == null) {
      throw new NullPointerException("key == null");
    }
    Object localObject3;
    try
    {
      Object localObject2 = this.a.get(paramK);
      if (localObject2 != null)
      {
        this.g = (1 + this.g);
        return localObject2;
      }
      this.h = (1 + this.h);
      localObject3 = b(paramK);
      if (localObject3 == null) {
        return null;
      }
    }
    finally {}
    try
    {
      this.e = (1 + this.e);
      Object localObject5 = this.a.put(paramK, localObject3);
      if (localObject5 != null) {
        this.a.put(paramK, localObject5);
      }
      for (;;)
      {
        if (localObject5 == null) {
          break;
        }
        a(false, paramK, localObject3, localObject5);
        return localObject5;
        this.b += c(paramK, localObject3);
      }
      a(this.c);
    }
    finally {}
    return localObject3;
  }
  
  public final void a()
  {
    a(-1);
  }
  
  /* Error */
  public void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 75	com/google/android/gms/internal/kj:b	I
    //   6: iflt +20 -> 26
    //   9: aload_0
    //   10: getfield 53	com/google/android/gms/internal/kj:a	Ljava/util/LinkedHashMap;
    //   13: invokevirtual 86	java/util/LinkedHashMap:isEmpty	()Z
    //   16: ifeq +48 -> 64
    //   19: aload_0
    //   20: getfield 75	com/google/android/gms/internal/kj:b	I
    //   23: ifeq +41 -> 64
    //   26: new 21	java/lang/IllegalStateException
    //   29: dup
    //   30: new 23	java/lang/StringBuilder
    //   33: dup
    //   34: invokespecial 27	java/lang/StringBuilder:<init>	()V
    //   37: aload_0
    //   38: invokevirtual 90	java/lang/Object:getClass	()Ljava/lang/Class;
    //   41: invokevirtual 95	java/lang/Class:getName	()Ljava/lang/String;
    //   44: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 97
    //   49: invokevirtual 33	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 42	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokespecial 45	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   58: athrow
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    //   64: aload_0
    //   65: getfield 75	com/google/android/gms/internal/kj:b	I
    //   68: iload_1
    //   69: if_icmple +13 -> 82
    //   72: aload_0
    //   73: getfield 53	com/google/android/gms/internal/kj:a	Ljava/util/LinkedHashMap;
    //   76: invokevirtual 86	java/util/LinkedHashMap:isEmpty	()Z
    //   79: ifeq +6 -> 85
    //   82: aload_0
    //   83: monitorexit
    //   84: return
    //   85: aload_0
    //   86: getfield 53	com/google/android/gms/internal/kj:a	Ljava/util/LinkedHashMap;
    //   89: invokevirtual 101	java/util/LinkedHashMap:entrySet	()Ljava/util/Set;
    //   92: invokeinterface 107 1 0
    //   97: invokeinterface 113 1 0
    //   102: checkcast 115	java/util/Map$Entry
    //   105: astore_3
    //   106: aload_3
    //   107: invokeinterface 118 1 0
    //   112: astore 4
    //   114: aload_3
    //   115: invokeinterface 121 1 0
    //   120: astore 5
    //   122: aload_0
    //   123: getfield 53	com/google/android/gms/internal/kj:a	Ljava/util/LinkedHashMap;
    //   126: aload 4
    //   128: invokevirtual 124	java/util/LinkedHashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: aload_0
    //   134: getfield 75	com/google/android/gms/internal/kj:b	I
    //   137: aload_0
    //   138: aload 4
    //   140: aload 5
    //   142: invokespecial 77	com/google/android/gms/internal/kj:c	(Ljava/lang/Object;Ljava/lang/Object;)I
    //   145: isub
    //   146: putfield 75	com/google/android/gms/internal/kj:b	I
    //   149: aload_0
    //   150: iconst_1
    //   151: aload_0
    //   152: getfield 126	com/google/android/gms/internal/kj:f	I
    //   155: iadd
    //   156: putfield 126	com/google/android/gms/internal/kj:f	I
    //   159: aload_0
    //   160: monitorexit
    //   161: aload_0
    //   162: iconst_1
    //   163: aload 4
    //   165: aload 5
    //   167: aconst_null
    //   168: invokevirtual 73	com/google/android/gms/internal/kj:a	(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   171: goto -171 -> 0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	this	kj
    //   0	174	1	paramInt	int
    //   59	4	2	localObject1	Object
    //   105	10	3	localEntry	java.util.Map.Entry
    //   112	52	4	localObject2	Object
    //   120	46	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   2	26	59	finally
    //   26	59	59	finally
    //   60	62	59	finally
    //   64	82	59	finally
    //   82	84	59	finally
    //   85	161	59	finally
  }
  
  protected void a(boolean paramBoolean, K paramK, V paramV1, V paramV2) {}
  
  protected V b(K paramK)
  {
    return null;
  }
  
  public final V b(K paramK, V paramV)
  {
    if ((paramK == null) || (paramV == null)) {
      throw new NullPointerException("key == null || value == null");
    }
    try
    {
      this.d = (1 + this.d);
      this.b += c(paramK, paramV);
      Object localObject2 = this.a.put(paramK, paramV);
      if (localObject2 != null) {
        this.b -= c(paramK, localObject2);
      }
      if (localObject2 != null) {
        a(false, paramK, localObject2, paramV);
      }
      a(this.c);
      return localObject2;
    }
    finally {}
  }
  
  public final String toString()
  {
    try
    {
      int i = this.g + this.h;
      int j = 0;
      if (i != 0) {
        j = 100 * this.g / i;
      }
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(this.c);
      arrayOfObject[1] = Integer.valueOf(this.g);
      arrayOfObject[2] = Integer.valueOf(this.h);
      arrayOfObject[3] = Integer.valueOf(j);
      String str = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", arrayOfObject);
      return str;
    }
    finally {}
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kj
 * JD-Core Version:    0.7.0.1
 */