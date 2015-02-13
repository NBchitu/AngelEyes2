package com.fridaylab.deeper.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;

public class PulsingImageView
  extends ImageView
{
  private PausableAlphaAnimation a;
  private SwitchInterpolator b;
  private int c;
  
  public PulsingImageView(Context paramContext)
  {
    super(paramContext);
  }
  
  public PulsingImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PulsingImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  @SuppressLint({"NewApi"})
  private void b(float paramFloat)
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      setAlpha(paramFloat);
      return;
    }
    setAlpha((int)(255.0F * paramFloat));
  }
  
  public float a()
  {
    clearAnimation();
    if (this.a != null) {
      b(this.a.a());
    }
    return this.b.a();
  }
  
  public void a(float paramFloat)
  {
    if (this.a == null)
    {
      this.a = new PausableAlphaAnimation(0.0F, 1.0F);
      this.a.setDuration(this.c);
      this.a.setInterpolator(this.b);
      this.a.setRepeatCount(-1);
    }
    this.b.a(paramFloat);
    b(1.0F);
    startAnimation(this.a);
  }
  
  public void a(int paramInt, SwitchInterpolator paramSwitchInterpolator)
  {
    this.c = paramInt;
    this.b = paramSwitchInterpolator;
  }
  
  public void b()
  {
    this.a = null;
    setImageResource(0);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.a == null) {
      return;
    }
    super.onDraw(paramCanvas);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.PulsingImageView
 * JD-Core Version:    0.7.0.1
 */