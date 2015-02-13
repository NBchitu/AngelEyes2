package com.google.android.gms.maps.internal;

import android.os.IBinder;

class e$a$a
  implements e
{
  private IBinder a;
  
  e$a$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public android.graphics.Bitmap a(com.google.android.gms.maps.model.internal.l paraml, int paramInt1, int paramInt2)
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
    //   18: ifnull +94 -> 112
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
    //   49: getfield 15	com/google/android/gms/maps/internal/e$a$a:a	Landroid/os/IBinder;
    //   52: iconst_1
    //   53: aload 4
    //   55: aload 5
    //   57: iconst_0
    //   58: invokeinterface 47 5 0
    //   63: pop
    //   64: aload 5
    //   66: invokevirtual 50	android/os/Parcel:readException	()V
    //   69: aload 5
    //   71: invokevirtual 54	android/os/Parcel:readInt	()I
    //   74: istore 9
    //   76: aconst_null
    //   77: astore 10
    //   79: iload 9
    //   81: ifeq +18 -> 99
    //   84: getstatic 60	android/graphics/Bitmap:CREATOR	Landroid/os/Parcelable$Creator;
    //   87: aload 5
    //   89: invokeinterface 66 2 0
    //   94: checkcast 56	android/graphics/Bitmap
    //   97: astore 10
    //   99: aload 5
    //   101: invokevirtual 69	android/os/Parcel:recycle	()V
    //   104: aload 4
    //   106: invokevirtual 69	android/os/Parcel:recycle	()V
    //   109: aload 10
    //   111: areturn
    //   112: aconst_null
    //   113: astore 7
    //   115: goto -86 -> 29
    //   118: astore 6
    //   120: aload 5
    //   122: invokevirtual 69	android/os/Parcel:recycle	()V
    //   125: aload 4
    //   127: invokevirtual 69	android/os/Parcel:recycle	()V
    //   130: aload 6
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	a
    //   0	133	1	paraml	com.google.android.gms.maps.model.internal.l
    //   0	133	2	paramInt1	int
    //   0	133	3	paramInt2	int
    //   3	123	4	localParcel1	android.os.Parcel
    //   8	113	5	localParcel2	android.os.Parcel
    //   118	13	6	localObject	Object
    //   27	87	7	localIBinder	IBinder
    //   74	6	9	i	int
    //   77	33	10	localBitmap	android.graphics.Bitmap
    // Exception table:
    //   from	to	target	type
    //   10	17	118	finally
    //   21	29	118	finally
    //   29	76	118	finally
    //   84	99	118	finally
  }
  
  public IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.e.a.a
 * JD-Core Version:    0.7.0.1
 */