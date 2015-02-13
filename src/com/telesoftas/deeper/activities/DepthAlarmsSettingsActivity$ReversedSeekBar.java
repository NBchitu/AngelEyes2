package com.telesoftas.deeper.activities;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;

public class DepthAlarmsSettingsActivity$ReversedSeekBar
  extends SeekBar
{
  public DepthAlarmsSettingsActivity$ReversedSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public int getReverseProgress()
  {
    try
    {
      int i = getMax();
      int j = getProgress();
      int k = i - j;
      return k;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.scale(-1.0F, 1.0F, getWidth() / 2.0F, getHeight() / 2.0F);
    super.onDraw(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    paramMotionEvent.setLocation(getWidth() - paramMotionEvent.getX(), paramMotionEvent.getY());
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setReverseProgress(int paramInt)
  {
    try
    {
      super.setProgress(getMax() - paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DepthAlarmsSettingsActivity.ReversedSeekBar
 * JD-Core Version:    0.7.0.1
 */