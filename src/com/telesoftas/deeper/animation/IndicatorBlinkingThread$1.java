package com.telesoftas.deeper.animation;

import android.graphics.Paint;

class IndicatorBlinkingThread$1
  implements Runnable
{
  IndicatorBlinkingThread$1(IndicatorBlinkingThread paramIndicatorBlinkingThread) {}
  
  public void run()
  {
    IndicatorBlinkingThread.a(this.a).setAlpha(255);
    IndicatorBlinkingThread.b(this.a).a(false, false);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.IndicatorBlinkingThread.1
 * JD-Core Version:    0.7.0.1
 */