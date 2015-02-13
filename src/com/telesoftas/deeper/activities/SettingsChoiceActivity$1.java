package com.telesoftas.deeper.activities;

import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

class SettingsChoiceActivity$1
  implements SeekBar.OnSeekBarChangeListener
{
  SettingsChoiceActivity$1(SettingsChoiceActivity paramSettingsChoiceActivity) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    SettingsChoiceActivity.a(this.a);
    SettingsChoiceActivity.a(this.a, Float.valueOf((paramInt + 10) / 100.0F));
    SettingsChoiceActivity.b(this.a).setText(String.valueOf(paramInt + 10) + "%");
    WindowManager.LayoutParams localLayoutParams = this.a.getWindow().getAttributes();
    localLayoutParams.screenBrightness = SettingsChoiceActivity.c(this.a).floatValue();
    this.a.getWindow().setAttributes(localLayoutParams);
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.SettingsChoiceActivity.1
 * JD-Core Version:    0.7.0.1
 */