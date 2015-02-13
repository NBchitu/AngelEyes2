package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.concurrent.TimeUnit;

public final class ny
  implements SafeParcelable
{
  public static final nz CREATOR = new nz();
  public static final long a = TimeUnit.HOURS.toMillis(1L);
  final int b;
  private final nu c;
  private final long d;
  private final int e;
  
  public ny(int paramInt1, nu paramnu, long paramLong, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramnu;
    this.d = paramLong;
    this.e = paramInt2;
  }
  
  public nu a()
  {
    return this.c;
  }
  
  public long b()
  {
    return this.d;
  }
  
  public int c()
  {
    return this.e;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ny localny;
    do
    {
      return true;
      if (!(paramObject instanceof ny)) {
        return false;
      }
      localny = (ny)paramObject;
    } while ((jv.a(this.c, localny.c)) && (this.d == localny.d) && (this.e == localny.e));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.c;
    arrayOfObject[1] = Long.valueOf(this.d);
    arrayOfObject[2] = Integer.valueOf(this.e);
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("filter", this.c).a("interval", Long.valueOf(this.d)).a("priority", Integer.valueOf(this.e)).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    nz.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ny
 * JD-Core Version:    0.7.0.1
 */