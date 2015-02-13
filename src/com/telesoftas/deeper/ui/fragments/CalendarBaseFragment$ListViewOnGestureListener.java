package com.telesoftas.deeper.ui.fragments;

import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;

class CalendarBaseFragment$ListViewOnGestureListener
  implements GestureDetector.OnGestureListener
{
  private final ListView b;
  
  public CalendarBaseFragment$ListViewOnGestureListener(CalendarBaseFragment paramCalendarBaseFragment, ListView paramListView)
  {
    this.b = paramListView;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    View localView = CalendarBaseFragment.a(this.a, this.b, this.b.getFirstVisiblePosition());
    int i = localView.getTop();
    int j = localView.getBottom();
    if (paramFloat2 >= 900.0F)
    {
      this.b.smoothScrollBy(i, i * -3);
      int m = this.b.getFirstVisiblePosition();
      CalendarBaseFragment.b(this.a, this.b, m);
      return true;
    }
    if (paramFloat2 <= -900.0F)
    {
      this.b.smoothScrollBy(j, j * 3);
      int k = 1 + this.b.getFirstVisiblePosition();
      CalendarBaseFragment.b(this.a, this.b, k);
      return true;
    }
    CalendarBaseFragment.a(this.a, this.b);
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
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.CalendarBaseFragment.ListViewOnGestureListener
 * JD-Core Version:    0.7.0.1
 */