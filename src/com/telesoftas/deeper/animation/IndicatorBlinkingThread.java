package com.telesoftas.deeper.animation;

import android.graphics.Paint;

public class IndicatorBlinkingThread
  extends Thread
{
  private SceneView a = null;
  private Paint b;
  private boolean c = true;
  
  public IndicatorBlinkingThread(Paint paramPaint, SceneView paramSceneView)
  {
    this.a = paramSceneView;
    this.b = paramPaint;
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  public void run()
  {
    this.a.post(new IndicatorBlinkingThread.1(this));
    try
    {
      Thread.sleep(500L);
      this.a.post(new IndicatorBlinkingThread.2(this));
    }
    catch (InterruptedException localInterruptedException1)
    {
      try
      {
        Thread.sleep(500L);
        label44:
        this.c = false;
        return;
        localInterruptedException1 = localInterruptedException1;
      }
      catch (InterruptedException localInterruptedException2)
      {
        break label44;
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.IndicatorBlinkingThread
 * JD-Core Version:    0.7.0.1
 */