package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.ArrayList;

public class jw
  implements Parcelable.Creator<jg.a>
{
  static void a(jg.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, parama.a(), false);
    b.a(paramParcel, 1000, parama.e());
    b.a(paramParcel, 2, parama.d(), false);
    b.a(paramParcel, 3, parama.b());
    b.a(paramParcel, 4, parama.c(), false);
    b.a(paramParcel, i);
  }
  
  public jg.a a(Parcel paramParcel)
  {
    int i = 0;
    String str1 = null;
    int j = a.b(paramParcel);
    ArrayList localArrayList = null;
    String str2 = null;
    int k = 0;
    while (paramParcel.dataPosition() < j)
    {
      int m = a.a(paramParcel);
      switch (a.a(m))
      {
      default: 
        a.b(paramParcel, m);
        break;
      case 1: 
        str2 = a.m(paramParcel, m);
        break;
      case 1000: 
        k = a.f(paramParcel, m);
        break;
      case 2: 
        localArrayList = a.y(paramParcel, m);
        break;
      case 3: 
        i = a.f(paramParcel, m);
        break;
      case 4: 
        str1 = a.m(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new jg.a(k, str2, localArrayList, i, str1);
  }
  
  public jg.a[] a(int paramInt)
  {
    return new jg.a[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jw
 * JD-Core Version:    0.7.0.1
 */