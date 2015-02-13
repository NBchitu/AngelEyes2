package com.telesoftas.deeper.activities;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class FishAlarmsSettings$1
  implements Animation.AnimationListener
{
  FishAlarmsSettings$1(FishAlarmsSettings paramFishAlarmsSettings, boolean paramBoolean) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    FishAlarmsSettings.a(this.b, false);
    if (!this.a) {
      FishAlarmsSettings.b(this.b);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    FishAlarmsSettings.a(this.b, true);
    if (this.a) {
      FishAlarmsSettings.a(this.b);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.FishAlarmsSettings.1
 * JD-Core Version:    0.7.0.1
 */