package com.telesoftas.deeper.ui.fragments;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.telesoftas.utilities.deeper.SettingsUtils;

class QuickSettingsFragment$3
  implements RadioGroup.OnCheckedChangeListener
{
  QuickSettingsFragment$3(QuickSettingsFragment paramQuickSettingsFragment) {}
  
  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    boolean bool;
    int i;
    if (paramInt == 2131296489)
    {
      bool = true;
      QuickSettingsFragment.a(this.a, bool);
      this.a.i.setEnabled(bool);
      i = 0;
      if (!bool) {
        break label67;
      }
    }
    for (;;)
    {
      QuickSettingsFragment.a(this.a).edit().putInt(SettingsUtils.b, i).apply();
      return;
      bool = false;
      break;
      label67:
      i = 1;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.QuickSettingsFragment.3
 * JD-Core Version:    0.7.0.1
 */