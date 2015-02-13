package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Region.Op;
import android.util.AttributeSet;
import android.widget.TextView;

public class VerticalText
  extends TextView
{
  public VerticalText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public VerticalText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.translate(0.0F, getWidth());
    paramCanvas.rotate(-90.0F);
    paramCanvas.clipRect(0.0F, 0.0F, getWidth(), getHeight(), Region.Op.REPLACE);
    super.onDraw(paramCanvas);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt2, paramInt1);
    setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
  }
  
  protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return super.setFrame(paramInt1, paramInt2, paramInt1 + (paramInt4 - paramInt2), paramInt2 + (paramInt3 - paramInt1));
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.VerticalText
 * JD-Core Version:    0.7.0.1
 */