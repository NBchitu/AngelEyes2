package com.telesoftas.deeper.activities;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class DepthAlarmsSettingsActivity$2
  implements SeekBar.OnSeekBarChangeListener
{
  DepthAlarmsSettingsActivity$2(DepthAlarmsSettingsActivity paramDepthAlarmsSettingsActivity) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    int i = paramSeekBar.getMax() - paramInt;
    if (i == 0)
    {
      DepthAlarmsSettingsActivity.b(this.a).setReverseProgress(1);
      DepthAlarmsSettingsActivity.b(this.a, 1.0F);
    }
    for (;;)
    {
      if (i <= DepthAlarmsSettingsActivity.a(this.a).getProgress()) {
        DepthAlarmsSettingsActivity.a(this.a).setProgress(i - 1);
      }
      return;
      DepthAlarmsSettingsActivity.b(this.a, i);
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.activities.DepthAlarmsSettingsActivity.2
 * JD-Core Version:    0.7.0.1
 */