package com.fridaylab.deeper.ui.slideshow;

import android.os.Handler;
import com.fridaylab.deeper.ui.PulsingImageView;

class SlideshowPage1$1
  implements Runnable
{
  SlideshowPage1$1(SlideshowPage1 paramSlideshowPage1) {}
  
  public void run()
  {
    switch (SlideshowPage1.a(this.a))
    {
    default: 
      SlideshowPage1.b(this.a).a(SlideshowPage1.e(this.a));
      SlideshowPage1.c(this.a).a(SlideshowPage1.e(this.a));
      SlideshowPage1.d(this.a).a(SlideshowPage1.e(this.a));
      return;
    case 0: 
      SlideshowPage1.b(this.a).setImageResource(2130837789);
    }
    for (;;)
    {
      SlideshowPage1.f(this.a);
      this.a.b.post(SlideshowPage1.g(this.a));
      return;
      SlideshowPage1.c(this.a).setImageResource(2130837790);
      continue;
      SlideshowPage1.d(this.a).setImageResource(2130837791);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.slideshow.SlideshowPage1.1
 * JD-Core Version:    0.7.0.1
 */