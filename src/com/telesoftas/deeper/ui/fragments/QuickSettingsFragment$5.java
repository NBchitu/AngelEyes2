package com.telesoftas.deeper.ui.fragments;

import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.telesoftas.deeper.activities.VisualizationInfoActivity;
import com.telesoftas.utilities.deeper.SettingsUtils;

class QuickSettingsFragment$5
  implements View.OnClickListener
{
  QuickSettingsFragment$5(QuickSettingsFragment paramQuickSettingsFragment) {}
  
  public void onClick(View paramView)
  {
    int i = 1;
    FragmentActivity localFragmentActivity = this.a.i();
    if (localFragmentActivity != null)
    {
      if (QuickSettingsFragment.a(this.a).getInt(SettingsUtils.s, 0) != i) {
        break label56;
      }
      if (i == 0) {
        break label61;
      }
    }
    label56:
    label61:
    for (int j = 2130903057;; j = 2130903056)
    {
      this.a.a(VisualizationInfoActivity.a(localFragmentActivity, j));
      return;
      i = 0;
      break;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.QuickSettingsFragment.5
 * JD-Core Version:    0.7.0.1
 */