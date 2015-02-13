package com.telesoftas.deeper.activities;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class DepthAlarmsSettingsActivity$1
  implements SeekBar.OnSeekBarChangeListener
{
  DepthAlarmsSettingsActivity$1(DepthAlarmsSettingsActivity paramDepthAlarmsSettingsActivity) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramInt == 41.439999F)
    {
      DepthAlarmsSettingsActivity.a(this.a).setProgress(40);
      DepthAlarmsSettingsActivity.a(this.a, paramInt - 1);
    }
    for (;;)
    {
      if (paramInt >= DepthAlarmsSettingsActivity.b(this.a).getReverseProgress()) {
        DepthAlarmsSettingsActivity.b(this.a).setReverseProgress(paramInt + 1);
      }
      return;
      DepthAlarmsSettingsActivity.a(this.a, paramInt);
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DepthAlarmsSettingsActivity.1
 * JD-Core Version:    0.7.0.1
 */