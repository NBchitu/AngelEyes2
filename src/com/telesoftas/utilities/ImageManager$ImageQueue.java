package com.telesoftas.utilities;

import android.widget.ImageView;
import java.util.Stack;

class ImageManager$ImageQueue
{
  private Stack<ImageManager.ImageRef> b = new Stack();
  
  private ImageManager$ImageQueue(ImageManager paramImageManager) {}
  
  public void a(ImageView paramImageView)
  {
    int i = 0;
    while (i < this.b.size()) {
      if (((ImageManager.ImageRef)this.b.get(i)).b == paramImageView) {
        this.b.remove(i);
      } else {
        i++;
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ImageManager.ImageQueue
 * JD-Core Version:    0.7.0.1
 */