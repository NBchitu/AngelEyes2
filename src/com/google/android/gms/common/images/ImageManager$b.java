package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.kj;

final class ImageManager$b
  extends kj<a.a, Bitmap>
{
  protected int a(a.a parama, Bitmap paramBitmap)
  {
    return paramBitmap.getHeight() * paramBitmap.getRowBytes();
  }
  
  protected void a(boolean paramBoolean, a.a parama, Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    super.a(paramBoolean, parama, paramBitmap1, paramBitmap2);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.b
 * JD-Core Version:    0.7.0.1
 */