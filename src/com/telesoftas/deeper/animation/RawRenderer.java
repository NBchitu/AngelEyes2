package com.telesoftas.deeper.animation;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.telesoftas.hardware.DeeperRawDataPacket;
import com.telesoftas.hardware.HardwareJni;
import com.telesoftas.services.Signal;
import com.telesoftas.utilities.deeper.SettingsUtils;

public class RawRenderer
  implements DataRenderer<Signal>, RawSignalBuffer.Renderer
{
  private final int a;
  private RawSignalBuffer b;
  private SharedPreferences c;
  private int d;
  private int e = -1;
  
  public RawRenderer(int paramInt)
  {
    this.a = paramInt;
  }
  
  private void c()
  {
    if (this.b == null) {
      this.b = new RawSignalBuffer(this.a);
    }
  }
  
  public float a(ImmutableList<Signal> paramImmutableList)
  {
    c();
    return this.b.a(paramImmutableList);
  }
  
  public void a()
  {
    c();
    this.d = this.c.getInt(SettingsUtils.d, 0);
    this.b.a();
    if (this.e != this.d) {
      this.b.b();
    }
    this.e = this.d;
  }
  
  public void a(Canvas paramCanvas, RectF paramRectF, float paramFloat, ImmutableList<Signal> paramImmutableList, int paramInt)
  {
    c();
    this.b.a(paramImmutableList, this, paramCanvas, paramRectF, paramFloat);
  }
  
  public void a(View paramView)
  {
    this.c = SettingsUtils.a(paramView.getContext());
  }
  
  public void a(DeeperRawDataPacket paramDeeperRawDataPacket, int[] paramArrayOfInt)
  {
    HardwareJni.getRawSignalPixels(paramDeeperRawDataPacket.b(), paramDeeperRawDataPacket.e(), this.d, paramArrayOfInt, 0);
  }
  
  public void b()
  {
    if (this.b != null)
    {
      this.b.c();
      this.b = null;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.RawRenderer
 * JD-Core Version:    0.7.0.1
 */