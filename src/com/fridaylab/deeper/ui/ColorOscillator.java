package com.fridaylab.deeper.ui;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.widget.TextView;

@SuppressLint({"NewApi"})
public class ColorOscillator
{
  private final int a;
  private final int b;
  private final int c;
  private ColorOscillator$ColorFlipper d;
  private ObjectAnimator e;	// 实现动画,动画执行类
  
  public ColorOscillator(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public void a()
  {
    if (this.d != null)
    {
      this.d.a();
      this.d = null;
    }
    if (this.e != null)
    {
      this.e.end();
      this.e = null;
    }
  }
  
  public void a(Handler paramHandler, TextView paramTextView)
  {
    if (Build.VERSION.SDK_INT < 11)
    {
      this.d = new ColorOscillator$ColorFlipper(this, paramHandler, paramTextView);
      this.d.run();
      return;
    }
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = this.a;
    arrayOfInt[1] = this.b;
    this.e = ObjectAnimator.ofInt(paramTextView, "textColor", arrayOfInt);
    this.e.setDuration(this.c);
    this.e.setEvaluator(new ArgbEvaluator());
    this.e.setRepeatCount(-1);	// 不重复?还是不断重复
    this.e.setRepeatMode(Animation.REVERSE);	// 反方向执行
    this.e.setInterpolator(new AccelerateDecelerateInterpolator());
    this.e.start();
  }
  
  // d 和 e 都为null时返回 false, 否则返回 true
  public boolean b()
  {
    return (this.d != null) || (this.e != null);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.ColorOscillator
 * JD-Core Version:    0.7.0.1
 */