package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class nd
  implements SafeParcelable
{
  public static final ne CREATOR = new ne();
  public final int a;
  public final String b;
  private final int c;
  
  nd(int paramInt1, int paramInt2, String paramString)
  {
    this.c = paramInt1;
    this.a = paramInt2;
    this.b = paramString;
  }
  
  int a()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof nd)) {}
    nd localnd;
    do
    {
      return false;
      localnd = (nd)paramObject;
    } while ((localnd.a != this.a) || (!jv.a(localnd.b, this.b)));
    return true;
  }
  
  public int hashCode()
  {
    return this.a;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = this.b;
    return String.format("%d:%s", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ne.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.nd
 * JD-Core Version:    0.7.0.1
 */