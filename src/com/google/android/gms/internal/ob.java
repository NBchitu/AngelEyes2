package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class ob
  implements Parcelable.Creator<oa>
{
  static void a(oa paramoa, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramoa.bx, false);
    b.a(paramParcel, 1000, paramoa.bw);
    b.a(paramParcel, i);
  }
  
  public oa a(Parcel paramParcel)
  {
    int i = a.b(paramParcel);
    int j = 0;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str = a.m(paramParcel, k);
        break;
      case 1000: 
        j = a.f(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new oa(j, str);
  }
  
  public oa[] a(int paramInt)
  {
    return new oa[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ob
 * JD-Core Version:    0.7.0.1
 */