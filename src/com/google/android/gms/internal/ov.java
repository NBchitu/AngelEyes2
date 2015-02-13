package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ov
  implements SafeParcelable
{
  public static final ow CREATOR = new ow();
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  public final String e;
  public final String f;
  public final boolean g;
  public final String h;
  
  public ov(int paramInt1, String paramString1, int paramInt2, int paramInt3, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this.a = paramInt1;
    this.b = paramString1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramString2;
    this.f = paramString3;
    this.g = paramBoolean;
    this.h = paramString4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ov localov;
    do
    {
      return true;
      if (!(paramObject instanceof ov)) {
        break;
      }
      localov = (ov)paramObject;
    } while ((this.b.equals(localov.b)) && (this.c == localov.c) && (this.d == localov.d) && (jv.a(this.h, localov.h)) && (jv.a(this.e, localov.e)) && (jv.a(this.f, localov.f)) && (this.g == localov.g));
    return false;
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this.b;
    arrayOfObject[1] = Integer.valueOf(this.c);
    arrayOfObject[2] = Integer.valueOf(this.d);
    arrayOfObject[3] = this.e;
    arrayOfObject[4] = this.f;
    arrayOfObject[5] = Boolean.valueOf(this.g);
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PlayLoggerContext[");
    localStringBuilder.append("package=").append(this.b).append(',');
    localStringBuilder.append("versionCode=").append(this.a).append(',');
    localStringBuilder.append("logSource=").append(this.d).append(',');
    localStringBuilder.append("logSourceName=").append(this.h).append(',');
    localStringBuilder.append("uploadAccount=").append(this.e).append(',');
    localStringBuilder.append("loggingId=").append(this.f).append(',');
    localStringBuilder.append("logAndroidId=").append(this.g);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ow.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ov
 * JD-Core Version:    0.7.0.1
 */