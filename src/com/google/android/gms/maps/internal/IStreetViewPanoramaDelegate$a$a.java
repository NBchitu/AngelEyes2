package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;

class IStreetViewPanoramaDelegate$a$a
  implements IStreetViewPanoramaDelegate
{
  private IBinder a;
  
  IStreetViewPanoramaDelegate$a$a(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  /* Error */
  public com.google.android.gms.dynamic.d a(com.google.android.gms.maps.model.StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
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
    //   15: ifnull +53 -> 68
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 38	com/google/android/gms/maps/model/StreetViewPanoramaOrientation:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   33: bipush 19
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 44 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 47	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 51	android/os/Parcel:readStrongBinder	()Landroid/os/IBinder;
    //   52: invokestatic 56	com/google/android/gms/dynamic/d$a:a	(Landroid/os/IBinder;)Lcom/google/android/gms/dynamic/d;
    //   55: astore 6
    //   57: aload_3
    //   58: invokevirtual 59	android/os/Parcel:recycle	()V
    //   61: aload_2
    //   62: invokevirtual 59	android/os/Parcel:recycle	()V
    //   65: aload 6
    //   67: areturn
    //   68: aload_2
    //   69: iconst_0
    //   70: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   73: goto -44 -> 29
    //   76: astore 4
    //   78: aload_3
    //   79: invokevirtual 59	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 59	android/os/Parcel:recycle	()V
    //   86: aload 4
    //   88: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	a
    //   0	89	1	paramStreetViewPanoramaOrientation	com.google.android.gms.maps.model.StreetViewPanoramaOrientation
    //   3	80	2	localParcel1	Parcel
    //   7	72	3	localParcel2	Parcel
    //   76	11	4	localObject	Object
    //   55	11	6	locald	com.google.android.gms.dynamic.d
    // Exception table:
    //   from	to	target	type
    //   8	14	76	finally
    //   18	29	76	finally
    //   29	57	76	finally
    //   68	73	76	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.StreetViewPanoramaOrientation a(com.google.android.gms.dynamic.d paramd)
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
    //   15: ifnull +74 -> 89
    //   18: aload_1
    //   19: invokeinterface 65 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 68	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   36: bipush 18
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 44 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 47	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 72	android/os/Parcel:readInt	()I
    //   55: istore 7
    //   57: aconst_null
    //   58: astore 8
    //   60: iload 7
    //   62: ifeq +16 -> 78
    //   65: getstatic 76	com/google/android/gms/maps/model/StreetViewPanoramaOrientation:CREATOR	Lcom/google/android/gms/maps/model/t;
    //   68: aload_3
    //   69: invokevirtual 81	com/google/android/gms/maps/model/t:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;
    //   72: astore 9
    //   74: aload 9
    //   76: astore 8
    //   78: aload_3
    //   79: invokevirtual 59	android/os/Parcel:recycle	()V
    //   82: aload_2
    //   83: invokevirtual 59	android/os/Parcel:recycle	()V
    //   86: aload 8
    //   88: areturn
    //   89: aconst_null
    //   90: astore 5
    //   92: goto -66 -> 26
    //   95: astore 4
    //   97: aload_3
    //   98: invokevirtual 59	android/os/Parcel:recycle	()V
    //   101: aload_2
    //   102: invokevirtual 59	android/os/Parcel:recycle	()V
    //   105: aload 4
    //   107: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	this	a
    //   0	108	1	paramd	com.google.android.gms.dynamic.d
    //   3	99	2	localParcel1	Parcel
    //   7	91	3	localParcel2	Parcel
    //   95	11	4	localObject1	Object
    //   24	67	5	localIBinder	IBinder
    //   55	6	7	i	int
    //   58	29	8	localObject2	Object
    //   72	3	9	localStreetViewPanoramaOrientation	com.google.android.gms.maps.model.StreetViewPanoramaOrientation
    // Exception table:
    //   from	to	target	type
    //   8	14	95	finally
    //   18	26	95	finally
    //   26	57	95	finally
    //   65	74	95	finally
  }
  
  /* Error */
  public void a(r paramr)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 85 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 68	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   36: bipush 16
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 44 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 47	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 59	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 59	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 59	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 59	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	a
    //   0	79	1	paramr	r
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(s params)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 89 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 68	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   36: bipush 15
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 44 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 47	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 59	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 59	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 59	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 59	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	a
    //   0	79	1	params	s
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(t paramt)
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
    //   15: ifnull +45 -> 60
    //   18: aload_1
    //   19: invokeinterface 93 1 0
    //   24: astore 5
    //   26: aload_2
    //   27: aload 5
    //   29: invokevirtual 68	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload_0
    //   33: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   36: bipush 17
    //   38: aload_2
    //   39: aload_3
    //   40: iconst_0
    //   41: invokeinterface 44 5 0
    //   46: pop
    //   47: aload_3
    //   48: invokevirtual 47	android/os/Parcel:readException	()V
    //   51: aload_3
    //   52: invokevirtual 59	android/os/Parcel:recycle	()V
    //   55: aload_2
    //   56: invokevirtual 59	android/os/Parcel:recycle	()V
    //   59: return
    //   60: aconst_null
    //   61: astore 5
    //   63: goto -37 -> 26
    //   66: astore 4
    //   68: aload_3
    //   69: invokevirtual 59	android/os/Parcel:recycle	()V
    //   72: aload_2
    //   73: invokevirtual 59	android/os/Parcel:recycle	()V
    //   76: aload 4
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	a
    //   0	79	1	paramt	t
    //   3	70	2	localParcel1	Parcel
    //   7	62	3	localParcel2	Parcel
    //   66	11	4	localObject	Object
    //   24	38	5	localIBinder	IBinder
    // Exception table:
    //   from	to	target	type
    //   8	14	66	finally
    //   18	26	66	finally
    //   26	51	66	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.maps.model.LatLng paramLatLng)
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
    //   15: ifnull +42 -> 57
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 97	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   33: bipush 12
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 44 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 47	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 59	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 59	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore 4
    //   67: aload_3
    //   68: invokevirtual 59	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 59	android/os/Parcel:recycle	()V
    //   75: aload 4
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	a
    //   0	78	1	paramLatLng	com.google.android.gms.maps.model.LatLng
    //   3	69	2	localParcel1	Parcel
    //   7	61	3	localParcel2	Parcel
    //   65	11	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	29	65	finally
    //   29	48	65	finally
    //   57	62	65	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.maps.model.LatLng paramLatLng, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +50 -> 66
    //   19: aload_3
    //   20: iconst_1
    //   21: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   24: aload_1
    //   25: aload_3
    //   26: iconst_0
    //   27: invokevirtual 97	com/google/android/gms/maps/model/LatLng:writeToParcel	(Landroid/os/Parcel;I)V
    //   30: aload_3
    //   31: iload_2
    //   32: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   35: aload_0
    //   36: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   39: bipush 13
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 44 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 47	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 59	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 59	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   71: goto -41 -> 30
    //   74: astore 5
    //   76: aload 4
    //   78: invokevirtual 59	android/os/Parcel:recycle	()V
    //   81: aload_3
    //   82: invokevirtual 59	android/os/Parcel:recycle	()V
    //   85: aload 5
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	a
    //   0	88	1	paramLatLng	com.google.android.gms.maps.model.LatLng
    //   0	88	2	paramInt	int
    //   3	79	3	localParcel1	Parcel
    //   7	70	4	localParcel2	Parcel
    //   74	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	15	74	finally
    //   19	30	74	finally
    //   30	56	74	finally
    //   66	71	74	finally
  }
  
  /* Error */
  public void a(com.google.android.gms.maps.model.StreetViewPanoramaCamera paramStreetViewPanoramaCamera, long paramLong)
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
    //   18: ifnull +55 -> 73
    //   21: aload 4
    //   23: iconst_1
    //   24: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   27: aload_1
    //   28: aload 4
    //   30: iconst_0
    //   31: invokevirtual 102	com/google/android/gms/maps/model/StreetViewPanoramaCamera:writeToParcel	(Landroid/os/Parcel;I)V
    //   34: aload 4
    //   36: lload_2
    //   37: invokevirtual 106	android/os/Parcel:writeLong	(J)V
    //   40: aload_0
    //   41: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   44: bipush 9
    //   46: aload 4
    //   48: aload 5
    //   50: iconst_0
    //   51: invokeinterface 44 5 0
    //   56: pop
    //   57: aload 5
    //   59: invokevirtual 47	android/os/Parcel:readException	()V
    //   62: aload 5
    //   64: invokevirtual 59	android/os/Parcel:recycle	()V
    //   67: aload 4
    //   69: invokevirtual 59	android/os/Parcel:recycle	()V
    //   72: return
    //   73: aload 4
    //   75: iconst_0
    //   76: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   79: goto -45 -> 34
    //   82: astore 6
    //   84: aload 5
    //   86: invokevirtual 59	android/os/Parcel:recycle	()V
    //   89: aload 4
    //   91: invokevirtual 59	android/os/Parcel:recycle	()V
    //   94: aload 6
    //   96: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	a
    //   0	97	1	paramStreetViewPanoramaCamera	com.google.android.gms.maps.model.StreetViewPanoramaCamera
    //   0	97	2	paramLong	long
    //   3	87	4	localParcel1	Parcel
    //   8	77	5	localParcel2	Parcel
    //   82	13	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   10	17	82	finally
    //   21	34	82	finally
    //   34	62	82	finally
    //   73	79	82	finally
  }
  
  public void a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      localParcel1.writeString(paramString);
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
  public void a(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   5: astore_3
    //   6: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 4
    //   11: aload_3
    //   12: ldc 24
    //   14: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: iload_1
    //   18: ifeq +38 -> 56
    //   21: aload_3
    //   22: iload_2
    //   23: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   26: aload_0
    //   27: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   30: iconst_1
    //   31: aload_3
    //   32: aload 4
    //   34: iconst_0
    //   35: invokeinterface 44 5 0
    //   40: pop
    //   41: aload 4
    //   43: invokevirtual 47	android/os/Parcel:readException	()V
    //   46: aload 4
    //   48: invokevirtual 59	android/os/Parcel:recycle	()V
    //   51: aload_3
    //   52: invokevirtual 59	android/os/Parcel:recycle	()V
    //   55: return
    //   56: iconst_0
    //   57: istore_2
    //   58: goto -37 -> 21
    //   61: astore 5
    //   63: aload 4
    //   65: invokevirtual 59	android/os/Parcel:recycle	()V
    //   68: aload_3
    //   69: invokevirtual 59	android/os/Parcel:recycle	()V
    //   72: aload 5
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	a
    //   0	75	1	paramBoolean	boolean
    //   1	57	2	i	int
    //   5	64	3	localParcel1	Parcel
    //   9	55	4	localParcel2	Parcel
    //   61	12	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   11	17	61	finally
    //   21	46	61	finally
  }
  
  public boolean a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      this.a.transact(5, localParcel1, localParcel2, 0);
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
  
  public IBinder asBinder()
  {
    return this.a;
  }
  
  public void b(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(2, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean b()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      this.a.transact(6, localParcel1, localParcel2, 0);
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
  
  public void c(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      this.a.transact(7, localParcel1, localParcel2, 0);
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
  
  public void d(boolean paramBoolean)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      int i = 0;
      if (paramBoolean) {
        i = 1;
      }
      localParcel1.writeInt(i);
      this.a.transact(4, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
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
      localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
      this.a.transact(8, localParcel1, localParcel2, 0);
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
  
  /* Error */
  public com.google.android.gms.maps.model.StreetViewPanoramaCamera e()
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_1
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   18: bipush 10
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 44 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 47	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 72	android/os/Parcel:readInt	()I
    //   37: ifeq +27 -> 64
    //   40: getstatic 119	com/google/android/gms/maps/model/StreetViewPanoramaCamera:CREATOR	Lcom/google/android/gms/maps/model/q;
    //   43: aload_2
    //   44: invokevirtual 124	com/google/android/gms/maps/model/q:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;
    //   47: astore 6
    //   49: aload 6
    //   51: astore 5
    //   53: aload_2
    //   54: invokevirtual 59	android/os/Parcel:recycle	()V
    //   57: aload_1
    //   58: invokevirtual 59	android/os/Parcel:recycle	()V
    //   61: aload 5
    //   63: areturn
    //   64: aconst_null
    //   65: astore 5
    //   67: goto -14 -> 53
    //   70: astore_3
    //   71: aload_2
    //   72: invokevirtual 59	android/os/Parcel:recycle	()V
    //   75: aload_1
    //   76: invokevirtual 59	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	a
    //   3	73	1	localParcel1	Parcel
    //   7	65	2	localParcel2	Parcel
    //   70	10	3	localObject	Object
    //   51	15	5	localStreetViewPanoramaCamera1	com.google.android.gms.maps.model.StreetViewPanoramaCamera
    //   47	3	6	localStreetViewPanoramaCamera2	com.google.android.gms.maps.model.StreetViewPanoramaCamera
    // Exception table:
    //   from	to	target	type
    //   8	49	70	finally
  }
  
  /* Error */
  public com.google.android.gms.maps.model.StreetViewPanoramaLocation f()
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_1
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_1
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	com/google/android/gms/maps/internal/IStreetViewPanoramaDelegate$a$a:a	Landroid/os/IBinder;
    //   18: bipush 14
    //   20: aload_1
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 44 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 47	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 72	android/os/Parcel:readInt	()I
    //   37: ifeq +27 -> 64
    //   40: getstatic 131	com/google/android/gms/maps/model/StreetViewPanoramaLocation:CREATOR	Lcom/google/android/gms/maps/model/s;
    //   43: aload_2
    //   44: invokevirtual 136	com/google/android/gms/maps/model/s:a	(Landroid/os/Parcel;)Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;
    //   47: astore 6
    //   49: aload 6
    //   51: astore 5
    //   53: aload_2
    //   54: invokevirtual 59	android/os/Parcel:recycle	()V
    //   57: aload_1
    //   58: invokevirtual 59	android/os/Parcel:recycle	()V
    //   61: aload 5
    //   63: areturn
    //   64: aconst_null
    //   65: astore 5
    //   67: goto -14 -> 53
    //   70: astore_3
    //   71: aload_2
    //   72: invokevirtual 59	android/os/Parcel:recycle	()V
    //   75: aload_1
    //   76: invokevirtual 59	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	a
    //   3	73	1	localParcel1	Parcel
    //   7	65	2	localParcel2	Parcel
    //   70	10	3	localObject	Object
    //   51	15	5	localStreetViewPanoramaLocation1	com.google.android.gms.maps.model.StreetViewPanoramaLocation
    //   47	3	6	localStreetViewPanoramaLocation2	com.google.android.gms.maps.model.StreetViewPanoramaLocation
    // Exception table:
    //   from	to	target	type
    //   8	49	70	finally
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate.a.a
 * JD-Core Version:    0.7.0.1
 */