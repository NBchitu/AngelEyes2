package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public class nl
  implements SafeParcelable
{
  public static final nm CREATOR = new nm();
  static final List<nd> a = ;
  LocationRequest b;
  boolean c;
  boolean d;
  boolean e;
  List<nd> f;
  final String g;
  private final int h;
  
  nl(int paramInt, LocationRequest paramLocationRequest, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, List<nd> paramList, String paramString)
  {
    this.h = paramInt;
    this.b = paramLocationRequest;
    this.c = paramBoolean1;
    this.d = paramBoolean2;
    this.e = paramBoolean3;
    this.f = paramList;
    this.g = paramString;
  }
  
  int a()
  {
    return this.h;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof nl)) {}
    nl localnl;
    do
    {
      return false;
      localnl = (nl)paramObject;
    } while ((!jv.a(this.b, localnl.b)) || (this.c != localnl.c) || (this.d != localnl.d) || (this.e != localnl.e) || (!jv.a(this.f, localnl.f)));
    return true;
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.b.toString());
    localStringBuilder.append(" requestNlpDebugInfo=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(" restorePendingIntentListeners=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(" triggerUpdate=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(" clients=");
    localStringBuilder.append(this.f);
    if (this.g != null)
    {
      localStringBuilder.append(" tag=");
      localStringBuilder.append(this.g);
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    nm.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nl
 * JD-Core Version:    0.7.0.1
 */