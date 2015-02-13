package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.Parcel;

class h$a$a
  implements h
{
  private IBinder a;
  
  h$a$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public void a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void a(double paramDouble)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      localParcel1.writeDouble(paramDouble);
      this.a.transact(5, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void a(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      localParcel1.writeFloat(paramFloat);
      this.a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      localParcel1.writeInt(paramInt);
      this.a.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public void a(com.google.android.gms.maps.model.LatLng paramLatLng)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 23
    //   11: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +41 -> 56
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 51	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 58	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/model/internal/h$a$a:a	Landroid/os/IBinder;
    //   33: iconst_3
    //   34: aload_2
    //   35: aload_3
    //   36: iconst_0
    //   37: invokeinterface 33 5 0
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual 36	android/os/Parcel:readException	()V
    //   47: aload_3
    //   48: invokevirtual 39	android/os/Parcel:recycle	()V
    //   51: aload_2
    //   52: invokevirtual 39	android/os/Parcel:recycle	()V
    //   55: return
    //   56: aload_2
    //   57: iconst_0
    //   58: invokevirtual 51	android/os/Parcel:writeInt	(I)V
    //   61: goto -32 -> 29
    //   64: astore 4
    //   66: aload_3
    //   67: invokevirtual 39	android/os/Parcel:recycle	()V
    //   70: aload_2
    //   71: invokevirtual 39	android/os/Parcel:recycle	()V
    //   74: aload 4
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	a
    //   0	77	1	paramLatLng	com.google.android.gms.maps.model.LatLng
    //   3	68	2	localParcel1	Parcel
    //   7	60	3	localParcel2	Parcel
    //   64	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	64	finally
    //   18	29	64	finally
    //   29	47	64	finally
    //   56	61	64	finally
  }
  
  public void a(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(15, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public boolean a(h paramh)
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 23
    //   11: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +64 -> 79
    //   18: aload_1
    //   19: invokeinterface 64 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 67	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/model/internal/h$a$a:a	Landroid/os/IBinder;
    //   36: bipush 17
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 33 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 36	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 71	android/os/Parcel:readInt	()I
    //   55: istore 7
    //   57: iconst_0
    //   58: istore 8
    //   60: iload 7
    //   62: ifeq +6 -> 68
    //   65: iconst_1
    //   66: istore 8
    //   68: aload_3
    //   69: invokevirtual 39	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 39	android/os/Parcel:recycle	()V
    //   76: iload 8
    //   78: ireturn
    //   79: aconst_null
    //   80: astore 5
    //   82: goto -56 -> 26
    //   85: astore 4
    //   87: aload_3
    //   88: invokevirtual 39	android/os/Parcel:recycle	()V
    //   91: aload_2
    //   92: invokevirtual 39	android/os/Parcel:recycle	()V
    //   95: aload 4
    //   97: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	this	a
    //   0	98	1	paramh	h
    //   3	89	2	localParcel1	Parcel
    //   7	81	3	localParcel2	Parcel
    //   85	11	4	localObject	Object
    //   24	57	5	localIBinder	IBinder
    //   55	6	7	i	int
    //   58	19	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   8	14	85	finally
    //   18	26	85	finally
    //   26	57	85	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public String b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void b(float paramFloat)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      localParcel1.writeFloat(paramFloat);
      this.a.transact(13, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public void b(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      localParcel1.writeInt(paramInt);
      this.a.transact(11, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public com.google.android.gms.maps.model.LatLng c()
  {
    // Byte code:
    //   0: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 21	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_1
    //   9: ldc 23
    //   11: invokevirtual 27	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/maps/model/internal/h$a$a:a	Landroid/os/IBinder;
    //   18: iconst_4
    //   19: aload_1
    //   20: aload_2
    //   21: iconst_0
    //   22: invokeinterface 33 5 0
    //   27: pop
    //   28: aload_2
    //   29: invokevirtual 36	android/os/Parcel:readException	()V
    //   32: aload_2
    //   33: invokevirtual 71	android/os/Parcel:readInt	()I
    //   36: ifeq +27 -> 63
    //   39: getstatic 82	com/google/android/gms/maps/model/LatLng:CREATOR	Lcom/google/android/gms/maps/model/i;
    //   42: aload_2
    //   43: invokevirtual 87	com/google/android/gms/maps/model/i:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/LatLng;
    //   46: astore 6
    //   48: aload 6
    //   50: astore 5
    //   52: aload_2
    //   53: invokevirtual 39	android/os/Parcel:recycle	()V
    //   56: aload_1
    //   57: invokevirtual 39	android/os/Parcel:recycle	()V
    //   60: aload 5
    //   62: areturn
    //   63: aconst_null
    //   64: astore 5
    //   66: goto -14 -> 52
    //   69: astore_3
    //   70: aload_2
    //   71: invokevirtual 39	android/os/Parcel:recycle	()V
    //   74: aload_1
    //   75: invokevirtual 39	android/os/Parcel:recycle	()V
    //   78: aload_3
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	a
    //   3	72	1	localParcel1	Parcel
    //   7	64	2	localParcel2	Parcel
    //   69	10	3	localObject	Object
    //   50	15	5	localLatLng1	com.google.android.gms.maps.model.LatLng
    //   46	3	6	localLatLng2	com.google.android.gms.maps.model.LatLng
    // Exception table:
    //   from	to	target	type
    //   8	48	69	finally
  }
  
  public double d()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      this.a.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      double d = localParcel2.readDouble();
      return d;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public float e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      this.a.transact(8, localParcel1, localParcel2, 0);
      localParcel2.readException();
      float f = localParcel2.readFloat();
      return f;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public int f()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      this.a.transact(10, localParcel1, localParcel2, 0);
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
  
  public int g()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      this.a.transact(12, localParcel1, localParcel2, 0);
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
  
  public float h()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      this.a.transact(14, localParcel1, localParcel2, 0);
      localParcel2.readException();
      float f = localParcel2.readFloat();
      return f;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      this.a.transact(16, localParcel1, localParcel2, 0);
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
  
  public int j()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
      this.a.transact(18, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.maps.model.internal.h.a.a
 * JD-Core Version:    0.7.0.1
 */