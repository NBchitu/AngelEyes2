package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

public class DetectedActivity
  implements SafeParcelable
{
  public static final DetectedActivityCreator CREATOR = new DetectedActivityCreator();
  public static final Comparator<DetectedActivity> a = new DetectedActivity.1();
  int b;
  int c;
  private final int d;
  
  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  private int a(int paramInt)
  {
    if (paramInt > 9) {
      paramInt = 4;
    }
    return paramInt;
  }
  
  public int a()
  {
    return a(this.b);
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "DetectedActivity [type=" + a() + ", confidence=" + this.c + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    DetectedActivityCreator.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.DetectedActivity
 * JD-Core Version:    0.7.0.1
 */