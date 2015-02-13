package com.telesoftas.deeper.ui.fragments;

import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.telesoftas.deeper.ui.views.LogAdapter;

class LogFragment$1
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  LogFragment$1(LogFragment paramLogFragment, ViewGroup paramViewGroup) {}
  
  public void onGlobalLayout()
  {
    if (LogFragment.a(this.b).c() <= 0) {
      LogFragment.a(this.b, this.a.getHeight() - this.a.getPaddingTop() - this.a.getPaddingBottom());
    }
    if (LogFragment.a(this.b).d() <= 0) {
      LogFragment.b(this.b, this.a.getWidth() - this.a.getPaddingLeft() - this.a.getPaddingRight());
    }
    LogFragment.a(this.b).a(LogFragment.b(this.b));
    LogFragment.a(this.b).b(LogFragment.c(this.b));
    LogFragment.a(this.b).a(true);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogFragment.1
 * JD-Core Version:    0.7.0.1
 */