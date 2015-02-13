package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ns
  implements SafeParcelable
{
  public static final nt CREATOR = new nt();
  private final int a;
  private final int b;
  private final int c;
  private final nu d;
  
  ns(int paramInt1, int paramInt2, int paramInt3, nu paramnu)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramnu;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public nu d()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ns localns;
    do
    {
      return true;
      if (!(paramObject instanceof ns)) {
        return false;
      }
      localns = (ns)paramObject;
    } while ((this.b == localns.b) && (this.c == localns.c) && (this.d.equals(localns.d)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.b);
    arrayOfObject[1] = Integer.valueOf(this.c);
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("transitionTypes", Integer.valueOf(this.b)).a("loiteringTimeMillis", Integer.valueOf(this.c)).a("placeFilter", this.d).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    nt.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ns
 * JD-Core Version:    0.7.0.1
 */