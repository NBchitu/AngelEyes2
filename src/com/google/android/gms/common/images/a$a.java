package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.jv;

final class a$a
{
  public final Uri a;
  
  public a$a(Uri paramUri)
  {
    this.a = paramUri;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    return jv.a(((a)paramObject).a, this.a);
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return jv.a(arrayOfObject);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a.a
 * JD-Core Version:    0.7.0.1
 */