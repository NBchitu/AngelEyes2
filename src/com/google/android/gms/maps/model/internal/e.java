package com.google.android.gms.maps.model.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class e
  implements SafeParcelable
{
  public static final f CREATOR = new f();
  private final int a;
  private a b;
  
  public e()
  {
    this.a = 1;
  }
  
  e(int paramInt, a parama)
  {
    this.a = paramInt;
    this.b = parama;
  }
  
  int a()
  {
    return this.a;
  }
  
  public a b()
  {
    return this.b;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.e
 * JD-Core Version:    0.7.0.1
 */