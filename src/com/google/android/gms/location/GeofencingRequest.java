package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nn;
import java.util.List;

public class GeofencingRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<GeofencingRequest> CREATOR = new a();
  private final int a;
  private final List<nn> b;
  private final int c;
  
  GeofencingRequest(int paramInt1, List<nn> paramList, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramList;
    this.c = paramInt2;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public List<nn> b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.GeofencingRequest
 * JD-Core Version:    0.7.0.1
 */