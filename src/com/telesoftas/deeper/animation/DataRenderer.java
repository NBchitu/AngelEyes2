package com.telesoftas.deeper.animation;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.google.common.collect.ImmutableList;
import com.telesoftas.services.Signal;

public abstract interface DataRenderer<T>
  extends SceneResource
{
  public abstract float a(ImmutableList<Signal> paramImmutableList);
  
  public abstract void a();
  
  public abstract void a(Canvas paramCanvas, RectF paramRectF, float paramFloat, ImmutableList<T> paramImmutableList, int paramInt);
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.DataRenderer
 * JD-Core Version:    0.7.0.1
 */