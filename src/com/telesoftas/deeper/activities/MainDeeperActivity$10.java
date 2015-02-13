package com.telesoftas.deeper.activities;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class MainDeeperActivity$10
  implements Animation.AnimationListener
{
  MainDeeperActivity$10(MainDeeperActivity paramMainDeeperActivity, int paramInt) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    MainDeeperActivity.b(this.b, false);
    if (this.a == 2131296369) {
      MainDeeperActivity.c(this.b, true);
    }
    if (this.a == 2131296370) {
      MainDeeperActivity.d(this.b, true);
    }
    MainDeeperActivity.o(this.b);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    MainDeeperActivity.b(this.b, true);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.10
 * JD-Core Version:    0.7.0.1
 */