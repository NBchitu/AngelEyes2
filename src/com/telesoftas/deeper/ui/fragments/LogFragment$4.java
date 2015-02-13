package com.telesoftas.deeper.ui.fragments;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.telesoftas.deeper.ui.views.LogAdapter;

class LogFragment$4
  implements Runnable
{
  LogFragment$4(LogFragment paramLogFragment, int paramInt) {}
  
  public void run()
  {
    int i = LogFragment.f(this.b).getFirstVisiblePosition();
    if (this.a == i)
    {
      LogFragment.a(this.b).a(true);
      if (LogFragment.f(this.b).getChildCount() > 2) {
        for (int j = 0; j < 3; j++)
        {
          View localView = LogFragment.f(this.b).getChildAt(j);
          ViewGroup localViewGroup = (ViewGroup)localView.findViewById(2131296376);
          if ((localViewGroup != null) && (localViewGroup.getTag() != null) && (localViewGroup.getTag().toString().compareTo("gallery_not_refresed") == 0)) {
            LogFragment.f(this.b).getAdapter().getView(i + j, localView, LogFragment.f(this.b));
          }
        }
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.LogFragment.4
 * JD-Core Version:    0.7.0.1
 */