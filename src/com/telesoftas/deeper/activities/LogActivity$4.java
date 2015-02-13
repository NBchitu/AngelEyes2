package com.telesoftas.deeper.activities;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class LogActivity$4
  implements Animation.AnimationListener
{
  LogActivity$4(LogActivity paramLogActivity, int paramInt) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    LogActivity.b(this.b, false);
    if (this.a == 2131296369) {
      LogActivity.c(this.b, true);
    }
    if (this.a == 2131296370) {
      LogActivity.d(this.b, true);
    }
    LogActivity.e(this.b);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    LogActivity.b(this.b, true);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.LogActivity.4
 * JD-Core Version:    0.7.0.1
 */