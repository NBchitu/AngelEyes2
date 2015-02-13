package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;

public final class Status
  implements Result, SafeParcelable
{
  public static final StatusCreator CREATOR = new StatusCreator();
  public static final Status a = new Status(0);
  public static final Status b = new Status(14);
  public static final Status c = new Status(8);
  public static final Status d = new Status(15);
  public static final Status e = new Status(16);
  private final int f;
  private final int g;
  private final String h;
  private final PendingIntent i;
  
  public Status(int paramInt)
  {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramString;
    this.i = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString)
  {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  private String g()
  {
    if (this.h != null) {
      return this.h;
    }
    return CommonStatusCodes.a(this.g);
  }
  
  PendingIntent a()
  {
    return this.i;
  }
  
  public Status b()
  {
    return this;
  }
  
  public String c()
  {
    return this.h;
  }
  
  int d()
  {
    return this.f;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean e()
  {
    return this.g <= 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Status)) {}
    Status localStatus;
    do
    {
      return false;
      localStatus = (Status)paramObject;
    } while ((this.f != localStatus.f) || (this.g != localStatus.g) || (!jv.a(this.h, localStatus.h)) || (!jv.a(this.i, localStatus.i)));
    return true;
  }
  
  public int f()
  {
    return this.g;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.f);
    arrayOfObject[1] = Integer.valueOf(this.g);
    arrayOfObject[2] = this.h;
    arrayOfObject[3] = this.i;
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("statusCode", g()).a("resolution", this.i).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    StatusCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Status
 * JD-Core Version:    0.7.0.1
 */