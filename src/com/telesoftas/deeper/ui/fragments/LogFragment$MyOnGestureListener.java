package com.telesoftas.deeper.ui.fragments;

import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ListView;

class LogFragment$MyOnGestureListener
  implements GestureDetector.OnGestureListener
{
  int a = 100;
  float b = 0.0F;
  float c = 0.0F;
  
  LogFragment$MyOnGestureListener(LogFragment paramLogFragment) {}
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    this.b = paramMotionEvent.getX();
    this.c = paramMotionEvent.getY();
    return false;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    int j;
    if (LogFragment.f(this.d).getChildAt(0) != null)
    {
      int i = ((LinearLayout)LogFragment.f(this.d).getChildAt(0)).getTop();
      j = ((LinearLayout)LogFragment.f(this.d).getChildAt(0)).getBottom();
      if (paramFloat2 >= 900.0F) {
        LogFragment.f(this.d).smoothScrollBy(i, i * -3);
      }
    }
    else
    {
      return true;
    }
    if (paramFloat2 <= -900.0F)
    {
      LogFragment.f(this.d).smoothScrollBy(j, j * 3);
      return true;
    }
    LogFragment.d(this.d);
    return true;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogFragment.MyOnGestureListener
 * JD-Core Version:    0.7.0.1
 */