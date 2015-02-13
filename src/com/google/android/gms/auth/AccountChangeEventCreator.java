package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class AccountChangeEventCreator
  implements Parcelable.Creator<AccountChangeEvent>
{
  static void a(AccountChangeEvent paramAccountChangeEvent, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramAccountChangeEvent.a);
    b.a(paramParcel, 2, paramAccountChangeEvent.b);
    b.a(paramParcel, 3, paramAccountChangeEvent.c, false);
    b.a(paramParcel, 4, paramAccountChangeEvent.d);
    b.a(paramParcel, 5, paramAccountChangeEvent.e);
    b.a(paramParcel, 6, paramAccountChangeEvent.f, false);
    b.a(paramParcel, i);
  }
  
  public AccountChangeEvent a(Parcel paramParcel)
  {
    String str1 = null;
    int i = 0;
    int j = a.b(paramParcel);
    long l = 0L;
    int k = 0;
    String str2 = null;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.a(paramParcel);
      switch (a.a(n))
      {
      default: 
        a.b(paramParcel, n);
        break;
      case 1: 
        m = a.f(paramParcel, n);
        break;
      case 2: 
        l = a.h(paramParcel, n);
        break;
      case 3: 
        str2 = a.m(paramParcel, n);
        break;
      case 4: 
        k = a.f(paramParcel, n);
        break;
      case 5: 
        i = a.f(paramParcel, n);
        break;
      case 6: 
        str1 = a.m(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new AccountChangeEvent(m, l, str2, k, i, str1);
  }
  
  public AccountChangeEvent[] a(int paramInt)
  {
    return new AccountChangeEvent[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.AccountChangeEventCreator
 * JD-Core Version:    0.7.0.1
 */