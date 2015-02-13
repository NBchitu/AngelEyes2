package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.internal.je;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

final class ImageManager$c
  implements Runnable
{
  private final Uri b;
  private final ParcelFileDescriptor c;
  
  public ImageManager$c(ImageManager paramImageManager, Uri paramUri, ParcelFileDescriptor paramParcelFileDescriptor)
  {
    this.b = paramUri;
    this.c = paramParcelFileDescriptor;
  }
  
  public void run()
  {
    je.b("LoadBitmapFromDiskRunnable can't be executed in the main thread");
    ParcelFileDescriptor localParcelFileDescriptor = this.c;
    Object localObject = null;
    boolean bool = false;
    if (localParcelFileDescriptor != null) {}
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeFileDescriptor(this.c.getFileDescriptor());
      localObject = localBitmap;
      CountDownLatch localCountDownLatch;
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      try
      {
        for (;;)
        {
          this.c.close();
          localCountDownLatch = new CountDownLatch(1);
          ImageManager.g(this.a).post(new ImageManager.f(this.a, this.b, localObject, bool, localCountDownLatch));
          try
          {
            localCountDownLatch.await();
            return;
          }
          catch (InterruptedException localInterruptedException)
          {
            Log.w("ImageManager", "Latch interrupted while posting " + this.b);
          }
          localOutOfMemoryError = localOutOfMemoryError;
          Log.e("ImageManager", "OOM while loading bitmap for uri: " + this.b, localOutOfMemoryError);
          bool = true;
          localObject = null;
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Log.e("ImageManager", "closed failed", localIOException);
        }
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.c
 * JD-Core Version:    0.7.0.1
 */