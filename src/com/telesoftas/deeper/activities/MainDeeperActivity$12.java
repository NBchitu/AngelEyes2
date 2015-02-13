package com.telesoftas.deeper.activities;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.telesoftas.deeper.animation.SceneView;
import com.telesoftas.utilities.deeper.SettingsUtils;

class MainDeeperActivity$12
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  MainDeeperActivity$12(MainDeeperActivity paramMainDeeperActivity) {}
  
  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    if (paramString.equals(SettingsUtils.d)) {
      MainDeeperActivity.b(this.a).invalidate();
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.MainDeeperActivity.12
 * JD-Core Version:    0.7.0.1
 */