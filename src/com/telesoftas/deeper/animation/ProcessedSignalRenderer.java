package com.telesoftas.deeper.animation;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.telesoftas.hardware.DeeperFishDataPacket;
import com.telesoftas.hardware.ImagingSignal;
import com.telesoftas.services.Signal;

public class ProcessedSignalRenderer
  implements DataRenderer<Signal>
{
  private final DataRenderer<DeeperFishDataPacket> a;
  private final DataRenderer<ImagingSignal> b;
  
  public ProcessedSignalRenderer(DataRenderer<DeeperFishDataPacket> paramDataRenderer, DataRenderer<ImagingSignal> paramDataRenderer1)
  {
    this.a = paramDataRenderer;
    this.b = paramDataRenderer1;
  }
  
  public float a(ImmutableList<Signal> paramImmutableList)
  {
    return 1.0F;
  }
  
  public void a() {}
  
  public void a(Canvas paramCanvas, RectF paramRectF, float paramFloat, ImmutableList<Signal> paramImmutableList, int paramInt)
  {
    this.a.a(paramCanvas, paramRectF, paramFloat, paramImmutableList, paramInt);
    this.b.a(paramCanvas, paramRectF, paramFloat, paramImmutableList, paramInt);
  }
  
  public void a(View paramView) {}
  
  public void b() {}
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.ProcessedSignalRenderer
 * JD-Core Version:    0.7.0.1
 */