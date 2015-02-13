package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.jv;
import java.lang.ref.WeakReference;

public final class a$c
  extends a
{
  private WeakReference<ImageManager.OnImageLoadedListener> e;
  
  protected void a(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (!paramBoolean2)
    {
      ImageManager.OnImageLoadedListener localOnImageLoadedListener = (ImageManager.OnImageLoadedListener)this.e.get();
      if (localOnImageLoadedListener != null) {
        localOnImageLoadedListener.a(this.a.a, paramDrawable, paramBoolean3);
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof c)) {
      return false;
    }
    if (this == paramObject) {
      return true;
    }
    c localc = (c)paramObject;
    ImageManager.OnImageLoadedListener localOnImageLoadedListener1 = (ImageManager.OnImageLoadedListener)this.e.get();
    ImageManager.OnImageLoadedListener localOnImageLoadedListener2 = (ImageManager.OnImageLoadedListener)localc.e.get();
    if ((localOnImageLoadedListener2 != null) && (localOnImageLoadedListener1 != null) && (jv.a(localOnImageLoadedListener2, localOnImageLoadedListener1)) && (jv.a(localc.a, this.a))) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return jv.a(arrayOfObject);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.a.c
 * JD-Core Version:    0.7.0.1
 */