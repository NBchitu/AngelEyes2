package com.fridaylab.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class DeferredLoader
{
  private final Resources a;
  private final int b;
  private Bitmap c;
  
  public DeferredLoader(Resources paramResources, int paramInt)
  {
    this.a = paramResources;
    this.b = paramInt;
  }
  
  public final Bitmap a()
  {
    if (this.c == null) {
      this.c = BitmapFactory.decodeResource(this.a, this.b);
    }
    return this.c;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.util.DeferredLoader
 * JD-Core Version:    0.7.0.1
 */