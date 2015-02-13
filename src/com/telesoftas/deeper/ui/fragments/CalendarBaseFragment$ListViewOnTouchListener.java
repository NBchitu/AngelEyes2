package com.telesoftas.deeper.ui.fragments;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;

class CalendarBaseFragment$ListViewOnTouchListener
  implements View.OnTouchListener
{
  private final GestureDetector b;
  
  public CalendarBaseFragment$ListViewOnTouchListener(CalendarBaseFragment paramCalendarBaseFragment, GestureDetector paramGestureDetector)
  {
    this.b = paramGestureDetector;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.b.onTouchEvent(paramMotionEvent)) {
      return true;
    }
    if (paramMotionEvent.getAction() == 1) {
      CalendarBaseFragment.a(this.a, (ListView)paramView);
    }
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.CalendarBaseFragment.ListViewOnTouchListener
 * JD-Core Version:    0.7.0.1
 */