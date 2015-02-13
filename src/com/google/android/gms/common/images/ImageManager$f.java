package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.je;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class ImageManager$f
  implements Runnable
{
  private final Uri b;
  private final Bitmap c;
  private final CountDownLatch d;
  private boolean e;
  
  public ImageManager$f(ImageManager paramImageManager, Uri paramUri, Bitmap paramBitmap, boolean paramBoolean, CountDownLatch paramCountDownLatch)
  {
    this.b = paramUri;
    this.c = paramBitmap;
    this.e = paramBoolean;
    this.d = paramCountDownLatch;
  }
  
  private void a(ImageManager.ImageReceiver paramImageReceiver, boolean paramBoolean)
  {
    ArrayList localArrayList = ImageManager.ImageReceiver.a(paramImageReceiver);
    int i = localArrayList.size();
    int j = 0;
    if (j < i)
    {
      a locala = (a)localArrayList.get(j);
      if (paramBoolean) {
        locala.a(ImageManager.b(this.a), this.c, false);
      }
      for (;;)
      {
        if (!(locala instanceof a.c)) {
          ImageManager.a(this.a).remove(locala);
        }
        j++;
        break;
        ImageManager.d(this.a).put(this.b, Long.valueOf(SystemClock.elapsedRealtime()));
        locala.a(ImageManager.b(this.a), ImageManager.c(this.a), false);
      }
    }
  }
  
  public void run()
  {
    je.a("OnBitmapLoadedRunnable must be executed in the main thread");
    boolean bool;
    if (this.c != null) {
      bool = true;
    }
    while (ImageManager.h(this.a) != null) {
      if (this.e)
      {
        ImageManager.h(this.a).a();
        System.gc();
        this.e = false;
        ImageManager.g(this.a).post(this);
        return;
        bool = false;
      }
      else if (bool)
      {
        ImageManager.h(this.a).b(new a.a(this.b), this.c);
      }
    }
    ImageManager.ImageReceiver localImageReceiver = (ImageManager.ImageReceiver)ImageManager.e(this.a).remove(this.b);
    if (localImageReceiver != null) {
      a(localImageReceiver, bool);
    }
    this.d.countDown();
    synchronized (ImageManager.a())
    {
      ImageManager.b().remove(this.b);
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.images.ImageManager.f
 * JD-Core Version:    0.7.0.1
 */