package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;

public class oh
  implements SafeParcelable
{
  public static final oi CREATOR = new oi();
  public static final oh a = new oh("com.google.android.gms", Locale.ENGLISH, null);
  public final int b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  
  public oh(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramString3;
    this.f = paramString4;
  }
  
  public oh(String paramString1, Locale paramLocale, String paramString2)
  {
    this(1, paramString1, paramLocale.toString(), paramString2, null);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    oh localoh;
    do
    {
      return true;
      if ((paramObject == null) || (!(paramObject instanceof oh))) {
        return false;
      }
      localoh = (oh)paramObject;
    } while ((this.d.equals(localoh.d)) && (this.c.equals(localoh.c)) && (jv.a(this.e, localoh.e)) && (jv.a(this.f, localoh.f)));
    return false;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.c;
    arrayOfObject[1] = this.d;
    arrayOfObject[2] = this.e;
    return jv.a(arrayOfObject);
  }
  
  public String toString()
  {
    return jv.a(this).a("clientPackageName", this.c).a("locale", this.d).a("accountName", this.e).a("gCoreClientName", this.f).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oi.a(this, paramParcel, paramInt);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oh
 * JD-Core Version:    0.7.0.1
 */