package com.fridaylab.deeper.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Transformation;

public class PausableAlphaAnimation
  extends AlphaAnimation
{
  private long a;
  private boolean b;
  private float c;
  
  public PausableAlphaAnimation(float paramFloat1, float paramFloat2)
  {
    super(paramFloat1, paramFloat2);
  }
  
  public PausableAlphaAnimation(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public float a()
  {
    return this.c;
  }
  
  public boolean getTransformation(long paramLong, Transformation paramTransformation)
  {
    if ((this.b) && (this.a == 0L)) {
      this.a = (paramLong - getStartTime());
    }
    if (this.b) {
      setStartTime(paramLong - this.a);
    }
    boolean bool = super.getTransformation(paramLong, paramTransformation);
    this.c = paramTransformation.getAlpha();
    return bool;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.PausableAlphaAnimation
 * JD-Core Version:    0.7.0.1
 */