package com.telesoftas.deeper.ui.fragments;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class CalendarFragment$1
  implements View.OnTouchListener
{
  CalendarFragment$1(CalendarFragment paramCalendarFragment, GestureDetector paramGestureDetector) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.a.onTouchEvent(paramMotionEvent)) {
      return true;
    }
    if (paramMotionEvent.getAction() == 1) {
      CalendarFragment.a(this.b);
    }
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.CalendarFragment.1
 * JD-Core Version:    0.7.0.1
 */