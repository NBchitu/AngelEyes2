package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

public class ScaledVideoView
  extends VideoView
{
  private int a = 0;
  private int b = 0;
  
  public ScaledVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ScaledVideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getDefaultSize(0, paramInt1);
    int j = getDefaultSize(0, paramInt2);
    int k;
    float f1;
    int i1;
    int n;
    if ((this.b > 0) && (this.a > 0))
    {
      k = 1;
      int m;
      if (this.b == j)
      {
        int i2 = this.a;
        m = 0;
        if (i2 == i) {}
      }
      else
      {
        m = 1;
      }
      if ((k == 0) || (m == 0)) {
        break label151;
      }
      f1 = i / this.a;
      float f2 = j / this.b;
      if (f2 <= f1) {
        break label130;
      }
      i1 = (int)Math.ceil(f2 * this.a);
      n = j;
    }
    for (;;)
    {
      setMeasuredDimension(i1, n);
      return;
      k = 0;
      break;
      label130:
      n = (int)Math.ceil(f1 * this.b);
      i1 = i;
      continue;
      label151:
      n = j;
      i1 = i;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.ScaledVideoView
 * JD-Core Version:    0.7.0.1
 */