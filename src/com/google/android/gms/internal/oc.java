package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public class oc
  implements SafeParcelable
{
  public static final Parcelable.Creator<oc> CREATOR = new od();
  final int a;
  private final String b;
  private final LatLng c;
  private final String d;
  private final List<oa> e;
  private final String f;
  private final String g;
  
  oc(int paramInt, String paramString1, LatLng paramLatLng, String paramString2, List<oa> paramList, String paramString3, String paramString4)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramLatLng;
    this.d = paramString2;
    this.e = new ArrayList(paramList);
    this.f = paramString3;
    this.g = paramString4;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public LatLng b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public List<oa> d()
  {
    return this.e;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public String f()
  {
    return this.g;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    od.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oc
 * JD-Core Version:    0.7.0.1
 */