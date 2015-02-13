package com.telesoftas.deeper.animation;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.telesoftas.services.Signal;

class RenderingScheduler$RenderingTask
  implements Supplier<RenderingTask>
{
  Canvas a;
  RectF b;
  float c;
  ImmutableList<Signal> d;
  int e;
  DataRenderer<Signal> f;
  
  public RenderingTask a()
  {
    return new RenderingTask();
  }
  
  public void a(DataRenderer<Signal> paramDataRenderer, Canvas paramCanvas, RectF paramRectF, float paramFloat, ImmutableList<Signal> paramImmutableList, int paramInt)
  {
    this.a = paramCanvas;
    this.b = paramRectF;
    this.c = paramFloat;
    this.d = paramImmutableList;
    this.f = paramDataRenderer;
    this.e = paramInt;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.RenderingScheduler.RenderingTask
 * JD-Core Version:    0.7.0.1
 */