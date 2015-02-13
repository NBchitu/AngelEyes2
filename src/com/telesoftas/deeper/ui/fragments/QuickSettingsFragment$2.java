package com.telesoftas.deeper.ui.fragments;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.telesoftas.utilities.deeper.SettingsUtils;

class QuickSettingsFragment$2
  implements CompoundButton.OnCheckedChangeListener
{
  QuickSettingsFragment$2(QuickSettingsFragment paramQuickSettingsFragment) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    QuickSettingsFragment.a(this.a).edit().putBoolean(SettingsUtils.f, paramBoolean).apply();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.QuickSettingsFragment.2
 * JD-Core Version:    0.7.0.1
 */