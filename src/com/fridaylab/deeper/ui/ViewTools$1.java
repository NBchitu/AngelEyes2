package com.fridaylab.deeper.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.concurrent.Callable;

final class ViewTools$1
  implements ViewTreeObserver.OnPreDrawListener
{
  ViewTools$1(View paramView, Callable paramCallable) {}
  
  public boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    try
    {
      Boolean localBoolean = (Boolean)this.b.call();
      if (localBoolean == null) {
        return true;
      }
      boolean bool = localBoolean.booleanValue();
      return bool;
    }
    catch (Exception localException)
    {
      throw new RuntimeException("rethrow", localException);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.ViewTools.1
 * JD-Core Version:    0.7.0.1
 */