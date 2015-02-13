package com.telesoftas.deeper.activities;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class DepthAlarmsSettingsActivity$3
  implements Animation.AnimationListener
{
  DepthAlarmsSettingsActivity$3(DepthAlarmsSettingsActivity paramDepthAlarmsSettingsActivity, boolean paramBoolean, View paramView) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    DepthAlarmsSettingsActivity.a(this.c, false);
    if (!this.a)
    {
      if (this.b == DepthAlarmsSettingsActivity.c(this.c)) {
        DepthAlarmsSettingsActivity.i(this.c);
      }
      if (this.b == DepthAlarmsSettingsActivity.e(this.c)) {
        DepthAlarmsSettingsActivity.j(this.c);
      }
      if (this.b == DepthAlarmsSettingsActivity.g(this.c)) {
        DepthAlarmsSettingsActivity.k(this.c);
      }
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    DepthAlarmsSettingsActivity.a(this.c, true);
    if (this.a)
    {
      if (this.b == DepthAlarmsSettingsActivity.c(this.c)) {
        DepthAlarmsSettingsActivity.d(this.c);
      }
      if (this.b == DepthAlarmsSettingsActivity.e(this.c)) {
        DepthAlarmsSettingsActivity.f(this.c);
      }
      if (this.b == DepthAlarmsSettingsActivity.g(this.c)) {
        DepthAlarmsSettingsActivity.h(this.c);
      }
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DepthAlarmsSettingsActivity.3
 * JD-Core Version:    0.7.0.1
 */