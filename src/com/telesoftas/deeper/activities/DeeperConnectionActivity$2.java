package com.telesoftas.deeper.activities;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;

class DeeperConnectionActivity$2
  implements View.OnClickListener
{
  DeeperConnectionActivity$2(DeeperConnectionActivity paramDeeperConnectionActivity) {}
  
  public void onClick(View paramView)
  {
    paramView.setOnClickListener(null);
    if (DeeperConnectionActivity.a(this.a).getCurrentItem() < -1 + DeeperConnectionActivity.b(this.a).b())
    {
      DeeperConnectionActivity.a(this.a).setCurrentItem(1 + DeeperConnectionActivity.a(this.a).getCurrentItem());
      this.a.m().a(MapBuilder.a("Navigation", "slide_button", null, null).a());
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DeeperConnectionActivity.2
 * JD-Core Version:    0.7.0.1
 */