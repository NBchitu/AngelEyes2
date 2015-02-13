package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ja;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.jc.a;
import com.google.android.gms.internal.je;

public abstract class a
{
  final a.a a;
  protected int b;
  protected ImageManager.OnImageLoadedListener c;
  protected int d;
  
  private Drawable a(Context paramContext, jc paramjc, int paramInt)
  {
    Resources localResources = paramContext.getResources();
    if (this.d > 0)
    {
      jc.a locala = new jc.a(paramInt, this.d);
      Drawable localDrawable = (Drawable)paramjc.a(locala);
      if (localDrawable == null)
      {
        localDrawable = localResources.getDrawable(paramInt);
        if ((0x1 & this.d) != 0) {
          localDrawable = a(localResources, localDrawable);
        }
        paramjc.b(locala, localDrawable);
      }
      return localDrawable;
    }
    return localResources.getDrawable(paramInt);
  }
  
  protected Drawable a(Resources paramResources, Drawable paramDrawable)
  {
    return ja.a(paramResources, paramDrawable);
  }
  
  void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    je.a(paramBitmap);
    if ((0x1 & this.d) != 0) {
      paramBitmap = ja.a(paramBitmap);
    }
    BitmapDrawable localBitmapDrawable = new BitmapDrawable(paramContext.getResources(), paramBitmap);
    if (this.c != null) {
      this.c.a(this.a.a, localBitmapDrawable, true);
    }
    a(localBitmapDrawable, paramBoolean, false, true);
  }
  
  void a(Context paramContext, jc paramjc, boolean paramBoolean)
  {
    int i = this.b;
    Drawable localDrawable = null;
    if (i != 0) {
      localDrawable = a(paramContext, paramjc, this.b);
    }
    if (this.c != null) {
      this.c.a(this.a.a, localDrawable, false);
    }
    a(localDrawable, paramBoolean, false, false);
  }
  
  protected abstract void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a
 * JD-Core Version:    0.7.0.1
 */