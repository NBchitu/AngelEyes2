package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class AccountChangeEventsRequestCreator
  implements Parcelable.Creator<AccountChangeEventsRequest>
{
  static void a(AccountChangeEventsRequest paramAccountChangeEventsRequest, Parcel paramParcel, int paramInt)
  {
    int i = b.a(paramParcel);
    b.a(paramParcel, 1, paramAccountChangeEventsRequest.a);
    b.a(paramParcel, 2, paramAccountChangeEventsRequest.b);
    b.a(paramParcel, 3, paramAccountChangeEventsRequest.c, false);
    b.a(paramParcel, i);
  }
  
  public AccountChangeEventsRequest a(Parcel paramParcel)
  {
    int i = 0;
    int j = a.b(paramParcel);
    String str = null;
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
        k = a.f(paramParcel, m);
        break;
      case 2: 
        i = a.f(paramParcel, m);
        break;
      case 3: 
        str = a.m(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    }
    return new AccountChangeEventsRequest(k, i, str);
  }
  
  public AccountChangeEventsRequest[] a(int paramInt)
  {
    return new AccountChangeEventsRequest[paramInt];
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.AccountChangeEventsRequestCreator
 * JD-Core Version:    0.7.0.1
 */