package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

class j$a$a
  implements j
{
  private IBinder a;
  
  j$a$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public int a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public boolean a(j paramj)
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
    //   15: ifnull +63 -> 78
    //   18: aload_1
    //   19: invokeinterface 48 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 51	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/model/internal/j$a$a:a	Landroid/os/IBinder;
    //   36: iconst_5
    //   37: aload_2
    //   38: aload_3
    //   39: iconst_0
    //   40: invokeinterface 34 5 0
    //   45: pop
    //   46: aload_3
    //   47: invokevirtual 37	android/os/Parcel:readException	()V
    //   50: aload_3
    //   51: invokevirtual 40	android/os/Parcel:readInt	()I
    //   54: istore 7
    //   56: iconst_0
    //   57: istore 8
    //   59: iload 7
    //   61: ifeq +6 -> 67
    //   64: iconst_1
    //   65: istore 8
    //   67: aload_3
    //   68: invokevirtual 43	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 43	android/os/Parcel:recycle	()V
    //   75: iload 8
    //   77: ireturn
    //   78: aconst_null
    //   79: astore 5
    //   81: goto -55 -> 26
    //   84: astore 4
    //   86: aload_3
    //   87: invokevirtual 43	android/os/Parcel:recycle	()V
    //   90: aload_2
    //   91: invokevirtual 43	android/os/Parcel:recycle	()V
    //   94: aload 4
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	a
    //   0	97	1	paramj	j
    //   3	88	2	localParcel1	Parcel
    //   7	80	3	localParcel2	Parcel
    //   84	11	4	localObject	Object
    //   24	56	5	localIBinder	IBinder
    //   54	6	7	i	int
    //   57	19	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   8	14	84	finally
    //   18	26	84	finally
    //   26	56	84	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public int b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public List<IBinder> c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      ArrayList localArrayList = localParcel2.createBinderArrayList();
      return localArrayList;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      boolean bool = false;
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
      this.a.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.j.a.a
 * JD-Core Version:    0.7.0.1
 */