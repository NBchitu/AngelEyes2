package com.telesoftas.deeper.ui.fragments;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.telesoftas.deeper.ui.views.LogAdapter;

class LogFragment$3
  implements AbsListView.OnScrollListener
{
  LogFragment$3(LogFragment paramLogFragment) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (this.a.i)
    {
      LogFragment.a(this.a).a(false);
      if ((paramInt == 0) && (LogFragment.e(this.a) == 2))
      {
        LogFragment.c(this.a, LogFragment.f(this.a).getFirstVisiblePosition());
        LogFragment.g(this.a);
      }
      LogFragment.d(this.a, paramInt);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogFragment.3
 * JD-Core Version:    0.7.0.1
 */