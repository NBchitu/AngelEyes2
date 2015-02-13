package com.telesoftas.deeper.animation;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class HistorySceneView$1
  implements SeekBar.OnSeekBarChangeListener
{
  HistorySceneView$1(HistorySceneView paramHistorySceneView) {}
  
  public void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      HistorySceneView.a(this.a, -paramInt);
      this.a.invalidate();
    }
  }
  
  public void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public void onStopTrackingTouch(SeekBar paramSeekBar) {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.HistorySceneView.1
 * JD-Core Version:    0.7.0.1
 */