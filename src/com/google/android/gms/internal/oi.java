package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class oi
  implements Parcelable.Creator<oh>
{
  static void a(oh paramoh, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramoh.c, false);
    b.a(paramParcel, 1000, paramoh.b);
    b.a(paramParcel, 2, paramoh.d, false);
    b.a(paramParcel, 3, paramoh.e, false);
    b.a(paramParcel, 4, paramoh.f, false);
    b.a(paramParcel, i);
  }
  
  public oh a(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.b(paramParcel);
    int j = 0;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.a(paramParcel);
      switch (a.a(k))
      {
      default: 
        a.b(paramParcel, k);
        break;
      case 1: 
        str4 = a.m(paramParcel, k);
        break;
      case 1000: 
        j = a.f(paramParcel, k);
        break;
      case 2: 
        str3 = a.m(paramParcel, k);
        break;
      case 3: 
        str2 = a.m(paramParcel, k);
        break;
      case 4: 
        str1 = a.m(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i) {
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    }
    return new oh(j, str4, str3, str2, str1);
  }
  
  public oh[] a(int paramInt)
  {
    return new oh[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oi
 * JD-Core Version:    0.7.0.1
 */