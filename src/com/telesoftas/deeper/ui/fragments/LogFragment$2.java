package com.telesoftas.deeper.ui.fragments;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class LogFragment$2
  implements View.OnTouchListener
{
  LogFragment$2(LogFragment paramLogFragment, GestureDetector paramGestureDetector) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (this.a.onTouchEvent(paramMotionEvent)) {
      return true;
    }
    if (paramMotionEvent.getAction() == 1) {
      LogFragment.d(this.b);
    }
    return false;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogFragment.2
 * JD-Core Version:    0.7.0.1
 */