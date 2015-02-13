package com.telesoftas.deeper.animation;

import android.graphics.Paint;

class IndicatorBlinkingThread$2
  implements Runnable
{
  IndicatorBlinkingThread$2(IndicatorBlinkingThread paramIndicatorBlinkingThread) {}
  
  public void run()
  {
    IndicatorBlinkingThread.a(this.a).setAlpha(0);
    IndicatorBlinkingThread.b(this.a).a(false, false);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.IndicatorBlinkingThread.2
 * JD-Core Version:    0.7.0.1
 */