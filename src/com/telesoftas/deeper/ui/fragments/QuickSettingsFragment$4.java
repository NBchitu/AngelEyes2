package com.telesoftas.deeper.ui.fragments;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.telesoftas.utilities.deeper.SettingsUtils;

class QuickSettingsFragment$4
  implements RadioGroup.OnCheckedChangeListener
{
  QuickSettingsFragment$4(QuickSettingsFragment paramQuickSettingsFragment) {}
  
  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    if (this.a.c.isEnabled()) {
      if (paramInt != 2131296494) {
        break label48;
      }
    }
    label48:
    for (int i = 1;; i = 2)
    {
      QuickSettingsFragment.a(this.a).edit().putInt(SettingsUtils.c, i).apply();
      return;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.QuickSettingsFragment.4
 * JD-Core Version:    0.7.0.1
 */