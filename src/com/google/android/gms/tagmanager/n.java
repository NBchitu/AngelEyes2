package com.google.android.gms.tagmanager;

import com.google.android.gms.common.api.Status;

class n
  implements ContainerHolder
{
  private Container a;
  private Container b;
  private Status c;
  private n.b d;
  private n.a e;
  private boolean f;
  private TagManager g;
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 22	com/google/android/gms/tagmanager/n:f	Z
    //   6: ifeq +11 -> 17
    //   9: ldc 24
    //   11: invokestatic 29	com/google/android/gms/tagmanager/bh:a	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield 22	com/google/android/gms/tagmanager/n:f	Z
    //   22: aload_0
    //   23: getfield 31	com/google/android/gms/tagmanager/n:g	Lcom/google/android/gms/tagmanager/TagManager;
    //   26: aload_0
    //   27: invokevirtual 36	com/google/android/gms/tagmanager/TagManager:a	(Lcom/google/android/gms/tagmanager/n;)Z
    //   30: pop
    //   31: aload_0
    //   32: getfield 38	com/google/android/gms/tagmanager/n:a	Lcom/google/android/gms/tagmanager/Container;
    //   35: invokevirtual 42	com/google/android/gms/tagmanager/Container:b	()V
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield 38	com/google/android/gms/tagmanager/n:a	Lcom/google/android/gms/tagmanager/Container;
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield 44	com/google/android/gms/tagmanager/n:b	Lcom/google/android/gms/tagmanager/Container;
    //   48: aload_0
    //   49: aconst_null
    //   50: putfield 46	com/google/android/gms/tagmanager/n:e	Lcom/google/android/gms/tagmanager/n$a;
    //   53: aload_0
    //   54: aconst_null
    //   55: putfield 48	com/google/android/gms/tagmanager/n:d	Lcom/google/android/gms/tagmanager/n$b;
    //   58: goto -44 -> 14
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	this	n
    //   61	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	61	finally
    //   17	58	61	finally
  }
  
  /* Error */
  public void a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 22	com/google/android/gms/tagmanager/n:f	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 38	com/google/android/gms/tagmanager/n:a	Lcom/google/android/gms/tagmanager/Container;
    //   18: aload_1
    //   19: invokevirtual 49	com/google/android/gms/tagmanager/Container:a	(Ljava/lang/String;)V
    //   22: goto -11 -> 11
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	this	n
    //   0	30	1	paramString	String
    //   25	4	2	localObject	Object
    //   6	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	25	finally
    //   14	22	25	finally
  }
  
  public Status b()
  {
    return this.c;
  }
  
  void b(String paramString)
  {
    if (this.f)
    {
      bh.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
      return;
    }
    this.e.a(paramString);
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 22	com/google/android/gms/tagmanager/n:f	Z
    //   6: ifeq +11 -> 17
    //   9: ldc 59
    //   11: invokestatic 29	com/google/android/gms/tagmanager/bh:a	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: monitorexit
    //   16: return
    //   17: aload_0
    //   18: getfield 46	com/google/android/gms/tagmanager/n:e	Lcom/google/android/gms/tagmanager/n$a;
    //   21: invokeinterface 61 1 0
    //   26: goto -12 -> 14
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	n
    //   29	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	14	29	finally
    //   17	26	29	finally
  }
  
  String d()
  {
    if (this.f)
    {
      bh.a("getContainerId called on a released ContainerHolder.");
      return "";
    }
    return this.a.a();
  }
  
  String e()
  {
    if (this.f)
    {
      bh.a("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
      return "";
    }
    return this.e.b();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.n
 * JD-Core Version:    0.7.0.1
 */