package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class nw
  implements SafeParcelable
{
  public static final nx CREATOR = new nx();
  final int a;
  private final String b;
  private final String c;
  private final String d;
  
  nw(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof nw)) {}
    nw localnw;
    do
    {
      return false;
      localnw = (nw)paramObject;
    } while ((!jv.a(this.b, localnw.b)) || (!jv.a(this.c, localnw.c)) || (!jv.a(this.d, localnw.d)));
    return true;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = this.c;
    arrayOfObject[2] = this.d;
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("mPlaceId", this.b).a("mTag", this.c).a("mSource", this.d).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    nx.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nw
 * JD-Core Version:    0.7.0.1
 */