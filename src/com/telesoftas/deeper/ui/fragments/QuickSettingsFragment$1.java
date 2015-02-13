package com.telesoftas.deeper.ui.fragments;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.telesoftas.utilities.deeper.SettingsUtils;

class QuickSettingsFragment$1
  implements SeekBar.OnSeekBarChangeListener
{
  QuickSettingsFragment$1(QuickSettingsFragment paramQuickSettingsFragment) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    this.a.f.setText(QuickSettingsFragment.a(this.a, paramInt));
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    int i = 20 - paramSeekBar.getProgress();
    QuickSettingsFragment.a(this.a).edit().putInt(SettingsUtils.d, i).apply();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.fragments.QuickSettingsFragment.1
 * JD-Core Version:    0.7.0.1
 */