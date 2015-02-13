package com.telesoftas.deeper.activities;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.RelativeLayout;
import com.telesoftas.deeper.ui.fragments.CalendarFragment;
import com.telesoftas.deeper.ui.fragments.LogFragment;

class LogActivity$5
  implements Animation.AnimationListener
{
  LogActivity$5(LogActivity paramLogActivity, int paramInt, boolean paramBoolean) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    LogActivity.b(this.c, false);
    if (this.a == 2131296369)
    {
      LogActivity.f(this.c).setVisibility(8);
      LogActivity.c(this.c, false);
      if ((LogActivity.d(this.c) != null) && (LogActivity.d(this.c).p()) && (this.b))
      {
        LogActivity.b(this.c).a();
        LogActivity.d(this.c).a();
      }
    }
    if (this.a == 2131296370)
    {
      LogActivity.g(this.c).setVisibility(8);
      LogActivity.d(this.c, false);
    }
    LogActivity.h(this.c).setVisibility(8);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    LogActivity.b(this.c, true);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LogActivity.5
 * JD-Core Version:    0.7.0.1
 */