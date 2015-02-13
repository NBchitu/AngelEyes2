package com.telesoftas.utilities;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class ResizeAnimation
  extends Animation
{
  int a;
  int b;
  int c;
  int d;
  View e;
  View f;
  boolean g;
  
  public ResizeAnimation(View paramView, int paramInt, boolean paramBoolean)
  {
    this.e = paramView;
    this.a = 0;
    this.b = 0;
    this.c = paramInt;
    this.g = paramBoolean;
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (this.g) {}
    for (int i = (int)(paramFloat * this.c);; i = (int)(this.c * (1.0F - paramFloat)))
    {
      this.e.getLayoutParams().height = (i + this.a);
      this.e.requestLayout();
      if (this.f != null)
      {
        this.f.getLayoutParams().height = (this.e.getLayoutParams().height + this.d);
        this.f.requestLayout();
      }
      return;
    }
  }
  
  public void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean willChangeBounds()
  {
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.utilities.ResizeAnimation
 * JD-Core Version:    0.7.0.1
 */