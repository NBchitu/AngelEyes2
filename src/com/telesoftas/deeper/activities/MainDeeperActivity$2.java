package com.telesoftas.deeper.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.MapBuilder;
import com.telesoftas.deeper.animation.HistorySceneView;
import com.telesoftas.deeper.animation.SceneView;
import com.telesoftas.deeper.ui.views.Panel;

class MainDeeperActivity$2
  implements View.OnClickListener
{
  MainDeeperActivity$2(MainDeeperActivity paramMainDeeperActivity) {}
  
  public void onClick(View paramView)
  {
    if (MainDeeperActivity.f(this.a).a())
    {
      MainDeeperActivity.b(this.a).setVisibility(0);
      MainDeeperActivity.f(this.a).a(false, true);
      return;
    }
    if (MainDeeperActivity.a(this.a) != null) {
      MainDeeperActivity.a(this.a).setVisibility(0);
    }
    MainDeeperActivity.e(this.a).setVisibility(4);
    MainDeeperActivity.f(this.a).a(true, true);
    this.a.m().a(MapBuilder.a("Sonar", "show_history", null, null).a());
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.2
 * JD-Core Version:    0.7.0.1
 */