package com.google.android.gms.internal;

import android.os.IBinder;

class ju$a$a
  implements ju
{
  private IBinder a;
  
  ju$a$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public com.google.android.gms.dynamic.d a(com.google.android.gms.dynamic.d paramd, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore 5
    //   10: aload 4
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: ifnull +74 -> 92
    //   21: aload_1
    //   22: invokeinterface 34 1 0
    //   27: astore 7
    //   29: aload 4
    //   31: aload 7
    //   33: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   36: aload 4
    //   38: iload_2
    //   39: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   42: aload 4
    //   44: iload_3
    //   45: invokevirtual 41	android/os/Parcel:writeInt	(I)V
    //   48: aload_0
    //   49: getfield 15	com/google/android/gms/internal/ju$a$a:a	Landroid/os/IBinder;
    //   52: iconst_1
    //   53: aload 4
    //   55: aload 5
    //   57: iconst_0
    //   58: invokeinterface 47 5 0
    //   63: pop
    //   64: aload 5
    //   66: invokevirtual 50	android/os/Parcel:readException	()V
    //   69: aload 5
    //   71: invokevirtual 53	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   74: invokestatic 58	com/google/android/gms/dynamic/d$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //   77: astore 9
    //   79: aload 5
    //   81: invokevirtual 61	android/os/Parcel:recycle	()V
    //   84: aload 4
    //   86: invokevirtual 61	android/os/Parcel:recycle	()V
    //   89: aload 9
    //   91: areturn
    //   92: aconst_null
    //   93: astore 7
    //   95: goto -66 -> 29
    //   98: astore 6
    //   100: aload 5
    //   102: invokevirtual 61	android/os/Parcel:recycle	()V
    //   105: aload 4
    //   107: invokevirtual 61	android/os/Parcel:recycle	()V
    //   110: aload 6
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	a
    //   0	113	1	paramd	com.google.android.gms.dynamic.d
    //   0	113	2	paramInt1	int
    //   0	113	3	paramInt2	int
    //   3	103	4	localParcel1	android.os.Parcel
    //   8	93	5	localParcel2	android.os.Parcel
    //   98	13	6	localObject	Object
    //   27	67	7	localIBinder	IBinder
    //   77	13	9	locald	com.google.android.gms.dynamic.d
    // Exception table:
    //   from	to	target	type
    //   10	17	98	finally
    //   21	29	98	finally
    //   29	79	98	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ju.a.a
 * JD-Core Version:    0.7.0.1
 */