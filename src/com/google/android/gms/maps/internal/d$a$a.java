package com.google.android.gms.maps.internal;

import android.os.IBinder;

class d$a$a
  implements d
{
  private IBinder a;
  
  d$a$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public com.google.android.gms.dynamic.d a(com.google.android.gms.maps.model.internal.l paraml)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +55 -> 70
    //   18: aload_1
    //   19: invokeinterface 34 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/internal/d$a$a:a	Landroid/os/IBinder;
    //   36: iconst_1
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 43 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 46	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 49	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   54: invokestatic 54	com/google/android/gms/dynamic/d$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //   57: astore 7
    //   59: aload_3
    //   60: invokevirtual 57	android/os/Parcel:recycle	()V
    //   63: aload_2
    //   64: invokevirtual 57	android/os/Parcel:recycle	()V
    //   67: aload 7
    //   69: areturn
    //   70: aconst_null
    //   71: astore 5
    //   73: goto -47 -> 26
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 57	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 57	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	a
    //   0	89	1	paraml	com.google.android.gms.maps.model.internal.l
    //   3	80	2	localParcel1	android.os.Parcel
    //   7	72	3	localParcel2	android.os.Parcel
    //   76	11	4	localObject	Object
    //   24	48	5	localIBinder	IBinder
    //   57	11	7	locald	com.google.android.gms.dynamic.d
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	26	76	finally
    //   26	59	76	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public com.google.android.gms.dynamic.d b(com.google.android.gms.maps.model.internal.l paraml)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +55 -> 70
    //   18: aload_1
    //   19: invokeinterface 34 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 37	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/internal/d$a$a:a	Landroid/os/IBinder;
    //   36: iconst_2
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 43 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 46	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 49	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   54: invokestatic 54	com/google/android/gms/dynamic/d$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //   57: astore 7
    //   59: aload_3
    //   60: invokevirtual 57	android/os/Parcel:recycle	()V
    //   63: aload_2
    //   64: invokevirtual 57	android/os/Parcel:recycle	()V
    //   67: aload 7
    //   69: areturn
    //   70: aconst_null
    //   71: astore 5
    //   73: goto -47 -> 26
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 57	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 57	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	a
    //   0	89	1	paraml	com.google.android.gms.maps.model.internal.l
    //   3	80	2	localParcel1	android.os.Parcel
    //   7	72	3	localParcel2	android.os.Parcel
    //   76	11	4	localObject	Object
    //   24	48	5	localIBinder	IBinder
    //   57	11	7	locald	com.google.android.gms.dynamic.d
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	26	76	finally
    //   26	59	76	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.d.a.a
 * JD-Core Version:    0.7.0.1
 */