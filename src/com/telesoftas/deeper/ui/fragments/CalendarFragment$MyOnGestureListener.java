package com.telesoftas.deeper.ui.fragments;

import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.ListView;

class CalendarFragment$MyOnGestureListener
  implements GestureDetector.OnGestureListener
{
  int a = 100;
  float b = 0.0F;
  float c = 0.0F;
  
  CalendarFragment$MyOnGestureListener(CalendarFragment paramCalendarFragment) {}
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    this.b = paramMotionEvent.getX();
    this.c = paramMotionEvent.getY();
    return false;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    LinearLayout localLinearLayout = (LinearLayout)CalendarFragment.a(this.d, CalendarFragment.b(this.d), CalendarFragment.b(this.d).getFirstVisiblePosition());
    int i = localLinearLayout.getTop();
    int j = localLinearLayout.getBottom();
    if (paramFloat2 >= 900.0F)
    {
      CalendarFragment.b(this.d).smoothScrollBy(i, i * -3);
      int m = CalendarFragment.b(this.d).getFirstVisiblePosition();
      CalendarFragment.a(this.d, m);
      return true;
    }
    if (paramFloat2 <= -900.0F)
    {
      CalendarFragment.b(this.d).smoothScrollBy(j, j * 3);
      int k = 1 + CalendarFragment.b(this.d).getFirstVisiblePosition();
      CalendarFragment.a(this.d, k);
      return true;
    }
    CalendarFragment.a(this.d);
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
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.CalendarFragment.MyOnGestureListener
 * JD-Core Version:    0.7.0.1
 */