package com.telesoftas.deeper.activities;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.ui.views.Panel;
import com.telesoftas.deeper.ui.views.Panel.OnPanelListener;

class MainDeeperActivity$6
  implements Panel.OnPanelListener
{
  MainDeeperActivity$6(MainDeeperActivity paramMainDeeperActivity) {}
  
  public void a(Panel paramPanel)
  {
    if (MainDeeperActivity.j(this.a)) {}
    int i;
    do
    {
      return;
      i = MainDeeperActivity.k(this.a).getInt("MainAct_launchCounterForOptionsDrawer", 0);
    } while (i < 0);
    MainDeeperActivity.k(this.a).edit().putInt("MainAct_launchCounterForOptionsDrawer", -1).apply();
    this.a.m().a(MapBuilder.a("Navigation", "options_drawer", "discovered", Long.valueOf(i)).a());
  }
  
  public void b(Panel paramPanel) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.6
 * JD-Core Version:    0.7.0.1
 */