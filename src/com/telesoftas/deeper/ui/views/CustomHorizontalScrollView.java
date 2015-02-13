package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class CustomHorizontalScrollView
  extends HorizontalScrollView
{
  private ScrollViewListener a = null;
  private float b = 1.0F;
  
  public CustomHorizontalScrollView(Context paramContext)
  {
    super(paramContext);
  }
  
  public CustomHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CustomHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void fling(int paramInt)
  {
    super.fling((int)(paramInt * this.b));
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null) {
      this.a.a(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.a != null) {
      this.a.a(this, paramInt1, paramInt2);
    }
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setFlingSpeedMod(float paramFloat)
  {
    if (paramFloat != 0.0F) {
      this.b = paramFloat;
    }
  }
  
  public void setScrollViewListener(ScrollViewListener paramScrollViewListener)
  {
    this.a = paramScrollViewListener;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.CustomHorizontalScrollView
 * JD-Core Version:    0.7.0.1
 */