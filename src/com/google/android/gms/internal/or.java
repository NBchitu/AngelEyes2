package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;
import java.util.Set;

public class or
  implements SafeParcelable
{
  public static final ot CREATOR = new ot();
  public final int a;
  public final long b;
  public final String c;
  public final byte[] d;
  public final Bundle e;
  
  or(int paramInt, long paramLong, String paramString, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    this.a = paramInt;
    this.b = paramLong;
    this.c = paramString;
    this.d = paramArrayOfByte;
    this.e = paramBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("tag=").append(this.c).append(",");
    localStringBuilder.append("eventTime=").append(this.b).append(",");
    if ((this.e != null) && (!this.e.isEmpty()))
    {
      localStringBuilder.append("keyValues=");
      Iterator localIterator = this.e.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuilder.append("(").append(str).append(",");
        localStringBuilder.append(this.e.getString(str)).append(")");
        localStringBuilder.append(" ");
      }
    }
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ot.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.or
 * JD-Core Version:    0.7.0.1
 */