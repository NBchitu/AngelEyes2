package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;

public class AccountChangeEvent
  implements SafeParcelable
{
  public static final AccountChangeEventCreator CREATOR = new AccountChangeEventCreator();
  final int a;
  final long b;
  final String c;
  final int d;
  final int e;
  final String f;
  
  AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2)
  {
    this.a = paramInt1;
    this.b = paramLong;
    this.c = ((String)jx.a(paramString1));
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    AccountChangeEvent localAccountChangeEvent;
    do
    {
      return true;
      if (!(paramObject instanceof AccountChangeEvent)) {
        break;
      }
      localAccountChangeEvent = (AccountChangeEvent)paramObject;
    } while ((this.a == localAccountChangeEvent.a) && (this.b == localAccountChangeEvent.b) && (jv.a(this.c, localAccountChangeEvent.c)) && (this.d == localAccountChangeEvent.d) && (this.e == localAccountChangeEvent.e) && (jv.a(this.f, localAccountChangeEvent.f)));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Long.valueOf(this.b);
    arrayOfObject[2] = this.c;
    arrayOfObject[3] = Integer.valueOf(this.d);
    arrayOfObject[4] = Integer.valueOf(this.e);
    arrayOfObject[5] = this.f;
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    String str = "UNKNOWN";
    switch (this.d)
    {
    }
    for (;;)
    {
      return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.e + "}";
      str = "ADDED";
      continue;
      str = "REMOVED";
      continue;
      str = "RENAMED_TO";
      continue;
      str = "RENAMED_FROM";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AccountChangeEventCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.AccountChangeEvent
 * JD-Core Version:    0.7.0.1
 */