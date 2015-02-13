package com.telesoftas.deeper.animation;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.fridaylab.util.RecycleBin;
import com.google.common.collect.ImmutableList;
import com.telesoftas.services.Signal;
import java.util.ArrayList;
import java.util.List;

public class RenderingScheduler
{
  private final RecycleBin<RenderingScheduler.RenderingTask> a = new RecycleBin(new RenderingScheduler.RenderingTask(null));
  private final DataRenderer<Signal> b;
  private final List<RenderingScheduler.RenderingTask> c = new ArrayList();
  private final List<RenderingScheduler.RenderingTask> d = new ArrayList();
  
  public RenderingScheduler(DataRenderer<Signal> paramDataRenderer)
  {
    this.b = paramDataRenderer;
  }
  
  public void a()
  {
    int i = this.c.size();
    int j = -1;
    float f1 = 0.0F;
    int k = 0;
    float f2;
    if (k < i)
    {
      RenderingScheduler.RenderingTask localRenderingTask4 = (RenderingScheduler.RenderingTask)this.c.get(k);
      f2 = localRenderingTask4.f.a(localRenderingTask4.d);
      if (f2 <= f1) {
        break label313;
      }
    }
    for (int i3 = k;; i3 = j)
    {
      k++;
      j = i3;
      f1 = f2;
      break;
      for (int m = j; m >= 0; m--)
      {
        RenderingScheduler.RenderingTask localRenderingTask3 = (RenderingScheduler.RenderingTask)this.c.get(m);
        localRenderingTask3.f.a(localRenderingTask3.a, localRenderingTask3.b, localRenderingTask3.c, localRenderingTask3.d, localRenderingTask3.e);
      }
      for (int n = j + 1; n < i; n++)
      {
        RenderingScheduler.RenderingTask localRenderingTask2 = (RenderingScheduler.RenderingTask)this.c.get(n);
        localRenderingTask2.f.a(localRenderingTask2.a, localRenderingTask2.b, localRenderingTask2.c, localRenderingTask2.d, localRenderingTask2.e);
      }
      int i1 = this.d.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        RenderingScheduler.RenderingTask localRenderingTask1 = (RenderingScheduler.RenderingTask)this.d.get(i2);
        localRenderingTask1.f.a(localRenderingTask1.a, localRenderingTask1.b, localRenderingTask1.c, localRenderingTask1.d, localRenderingTask1.e);
      }
      this.a.a(this.d);
      this.a.a(this.c);
      return;
      label313:
      f2 = f1;
    }
  }
  
  public void a(DataRenderer<Signal> paramDataRenderer, Canvas paramCanvas, RectF paramRectF, float paramFloat, ImmutableList<Signal> paramImmutableList, int paramInt)
  {
    RenderingScheduler.RenderingTask localRenderingTask = (RenderingScheduler.RenderingTask)this.a.c();
    localRenderingTask.a(paramDataRenderer, paramCanvas, paramRectF, paramFloat, paramImmutableList, paramInt);
    if (paramDataRenderer == this.b)
    {
      this.c.add(localRenderingTask);
      return;
    }
    this.d.add(localRenderingTask);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.RenderingScheduler
 * JD-Core Version:    0.7.0.1
 */