package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class kv$b
  implements SafeParcelable
{
  public static final ku CREATOR = new ku();
  final int a;
  final String b;
  final kr.a<?, ?> c;
  
  kv$b(int paramInt, String paramString, kr.a<?, ?> parama)
  {
    this.a = paramInt;
    this.b = paramString;
    this.c = parama;
  }
  
  kv$b(String paramString, kr.a<?, ?> parama)
  {
    this.a = 1;
    this.b = paramString;
    this.c = parama;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ku.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kv.b
 * JD-Core Version:    0.7.0.1
 */