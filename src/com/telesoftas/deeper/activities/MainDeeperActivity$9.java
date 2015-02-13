package com.telesoftas.deeper.activities;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;

class MainDeeperActivity$9
  implements View.OnClickListener
{
  MainDeeperActivity$9(MainDeeperActivity paramMainDeeperActivity, View paramView, String paramString) {}
  
  public void onClick(View paramView)
  {
    this.c.s = null;
    this.a.setVisibility(8);
    MainDeeperActivity.n(this.c).setVisibility(4);
    if (this.c.o)
    {
      this.c.o = false;
      this.c.m().a(MapBuilder.a("Promo", "close_banner", this.b, null).a());
    }
    while (!this.c.p) {
      return;
    }
    this.c.p = false;
    this.c.m().a(MapBuilder.a("Promo", "close_email", null, null).a());
    MainDeeperActivity.k(this.c).edit().putInt("PROMO_TIMES_SHOWN", 4).apply();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.9
 * JD-Core Version:    0.7.0.1
 */