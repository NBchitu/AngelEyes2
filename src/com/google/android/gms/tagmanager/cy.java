package com.google.android.gms.tagmanager;

class cy
  extends cx
{
  private static final Object a = new Object();
  private static cy k;
  private at b;
  private volatile ar c;
  private int d = 1800000;
  private boolean e = true;
  private boolean f = false;
  private boolean g = true;
  private boolean h = true;
  private au i = new cy.1(this);
  private boolean j = false;
  
  public static cy b()
  {
    if (k == null) {
      k = new cy();
    }
    return k;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 39	com/google/android/gms/tagmanager/cy:f	Z
    //   6: ifne +16 -> 22
    //   9: ldc 61
    //   11: invokestatic 66	com/google/android/gms/tagmanager/bh:d	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 37	com/google/android/gms/tagmanager/cy:e	Z
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield 68	com/google/android/gms/tagmanager/cy:c	Lcom/google/android/gms/tagmanager/ar;
    //   26: new 70	com/google/android/gms/tagmanager/cy$3
    //   29: dup
    //   30: aload_0
    //   31: invokespecial 71	com/google/android/gms/tagmanager/cy$3:<init>	(Lcom/google/android/gms/tagmanager/cy;)V
    //   34: invokeinterface 76 2 0
    //   39: goto -20 -> 19
    //   42: astore_1
    //   43: aload_0
    //   44: monitorexit
    //   45: aload_1
    //   46: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	this	cy
    //   42	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	42	finally
    //   22	39	42	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.cy
 * JD-Core Version:    0.7.0.1
 */