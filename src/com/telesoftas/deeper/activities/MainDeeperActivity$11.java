package com.telesoftas.deeper.activities;

import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class MainDeeperActivity$11
  implements Animation.AnimationListener
{
  MainDeeperActivity$11(MainDeeperActivity paramMainDeeperActivity, int paramInt) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    MainDeeperActivity.b(this.b, false);
    if (this.a == 2131296369)
    {
      MainDeeperActivity.p(this.b).setVisibility(8);
      MainDeeperActivity.c(this.b, false);
    }
    if (this.a == 2131296370)
    {
      MainDeeperActivity.q(this.b).setVisibility(8);
      MainDeeperActivity.d(this.b, false);
    }
    MainDeeperActivity.n(this.b).setVisibility(4);
    this.b.E.c();
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    MainDeeperActivity.b(this.b, true);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.11
 * JD-Core Version:    0.7.0.1
 */