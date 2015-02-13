package com.telesoftas.utilities;

import android.graphics.Bitmap;
import android.widget.ImageView;

class ImageManager$BitmapDisplayer
  implements Runnable
{
  Bitmap a;
  ImageView b;
  int c;
  
  public ImageManager$BitmapDisplayer(ImageManager paramImageManager, Bitmap paramBitmap, ImageView paramImageView, int paramInt)
  {
    this.a = paramBitmap;
    this.b = paramImageView;
    this.c = paramInt;
  }
  
  public void run()
  {
    if (this.a != null) {
      this.b.setImageBitmap(this.a);
    }
    while (this.c == -1) {
      return;
    }
    this.b.setImageResource(this.c);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ImageManager.BitmapDisplayer
 * JD-Core Version:    0.7.0.1
 */