package com.fridaylab.deeper.ui;

import android.view.animation.Interpolator;

public class SwitchInterpolator
  implements Interpolator
{
  private final float a;
  private final float b;
  private final float c;
  private float d;
  private float e;
  
  public SwitchInterpolator(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
  }
  
  public float a()
  {
    return this.e;
  }
  
  public void a(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public float getInterpolation(float paramFloat)
  {
    float f1 = paramFloat + this.d;
    if (f1 > 1.0F) {
      f1 -= 1.0F;
    }
    this.e = f1;
    if (f1 <= this.a) {
      return 0.0F;
    }
    if (f1 >= this.a + this.b + 2.0F * this.c) {
      return 0.0F;
    }
    if ((f1 >= this.a + this.c) && (f1 <= this.a + this.c + this.b)) {
      return 1.0F;
    }
    float f2 = (f1 - this.a) / (2.0F * this.c);
    if (f2 > 1.0F) {}
    for (float f3 = (f1 - this.a - this.b) / (2.0F * this.c);; f3 = f2) {
      return (float)(0.5D - 0.5D * Math.cos(6.283185307179586D * f3));
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.SwitchInterpolator
 * JD-Core Version:    0.7.0.1
 */