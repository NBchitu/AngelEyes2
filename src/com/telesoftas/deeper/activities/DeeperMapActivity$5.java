package com.telesoftas.deeper.activities;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.RelativeLayout.LayoutParams;

class DeeperMapActivity$5
  implements Animation.AnimationListener
{
  DeeperMapActivity$5(DeeperMapActivity paramDeeperMapActivity) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    ((RelativeLayout.LayoutParams)DeeperMapActivity.f(this.a).getLayoutParams()).topMargin = 9;
    DeeperMapActivity.f(this.a).requestLayout();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DeeperMapActivity.5
 * JD-Core Version:    0.7.0.1
 */