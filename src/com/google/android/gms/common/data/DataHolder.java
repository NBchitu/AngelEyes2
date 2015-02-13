package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class DataHolder
  implements SafeParcelable
{
  public static final f CREATOR = new f();
  private static final DataHolder.a l = new DataHolder.1(new String[0], null);
  Bundle a;
  int[] b;
  int c;
  boolean d = false;
  private final int e;
  private final String[] f;
  private final CursorWindow[] g;
  private final int h;
  private final Bundle i;
  private Object j;
  private boolean k = true;
  
  DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.e = paramInt1;
    this.f = paramArrayOfString;
    this.g = paramArrayOfCursorWindow;
    this.h = paramInt2;
    this.i = paramBundle;
  }
  
  public void a()
  {
    int m = 0;
    this.a = new Bundle();
    for (int n = 0; n < this.f.length; n++) {
      this.a.putInt(this.f[n], n);
    }
    this.b = new int[this.g.length];
    int i1 = 0;
    while (m < this.g.length)
    {
      this.b[m] = i1;
      int i2 = i1 - this.g[m].getStartPosition();
      i1 += this.g[m].getNumRows() - i2;
      m++;
    }
    this.c = i1;
  }
  
  int b()
  {
    return this.e;
  }
  
  String[] c()
  {
    return this.f;
  }
  
  CursorWindow[] d()
  {
    return this.g;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int e()
  {
    return this.h;
  }
  
  public Bundle f()
  {
    return this.i;
  }
  
  /* Error */
  protected void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 52	com/google/android/gms/common/data/DataHolder:k	Z
    //   4: ifeq +82 -> 86
    //   7: aload_0
    //   8: getfield 58	com/google/android/gms/common/data/DataHolder:g	[Landroid/database/CursorWindow;
    //   11: arraylength
    //   12: ifle +74 -> 86
    //   15: aload_0
    //   16: invokevirtual 92	com/google/android/gms/common/data/DataHolder:g	()Z
    //   19: ifne +67 -> 86
    //   22: aload_0
    //   23: getfield 94	com/google/android/gms/common/data/DataHolder:j	Ljava/lang/Object;
    //   26: ifnonnull +65 -> 91
    //   29: new 96	java/lang/StringBuilder
    //   32: dup
    //   33: invokespecial 97	java/lang/StringBuilder:<init>	()V
    //   36: ldc 99
    //   38: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_0
    //   42: invokevirtual 107	java/lang/Object:toString	()Ljava/lang/String;
    //   45: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: astore_3
    //   52: ldc 110
    //   54: new 96	java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial 97	java/lang/StringBuilder:<init>	()V
    //   61: ldc 112
    //   63: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: aload_3
    //   67: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc 114
    //   72: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 108	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokestatic 119	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   81: pop
    //   82: aload_0
    //   83: invokevirtual 121	com/google/android/gms/common/data/DataHolder:h	()V
    //   86: aload_0
    //   87: invokespecial 123	java/lang/Object:finalize	()V
    //   90: return
    //   91: aload_0
    //   92: getfield 94	com/google/android/gms/common/data/DataHolder:j	Ljava/lang/Object;
    //   95: invokevirtual 107	java/lang/Object:toString	()Ljava/lang/String;
    //   98: astore_2
    //   99: aload_2
    //   100: astore_3
    //   101: goto -49 -> 52
    //   104: astore_1
    //   105: aload_0
    //   106: invokespecial 123	java/lang/Object:finalize	()V
    //   109: aload_1
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	DataHolder
    //   104	6	1	localObject1	Object
    //   98	2	2	str	String
    //   51	50	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	52	104	finally
    //   52	86	104	finally
    //   91	99	104	finally
  }
  
  public boolean g()
  {
    try
    {
      boolean bool = this.d;
      return bool;
    }
    finally {}
  }
  
  public void h()
  {
    try
    {
      if (!this.d)
      {
        this.d = true;
        for (int m = 0; m < this.g.length; m++) {
          this.g[m].close();
        }
      }
      return;
    }
    finally {}
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder
 * JD-Core Version:    0.7.0.1
 */