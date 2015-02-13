package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import com.telesoftas.utilities.DisplayUtils;

public class EvaluationPhoneDiagram
  extends View
{
  private static final int g = Color.parseColor("#E05802");
  private static final int h = Color.parseColor("#FE863B");
  private Paint a;
  private Paint b;
  private Paint c;
  private Paint d;
  private double[] e;
  private RectF f;
  
  public EvaluationPhoneDiagram(Context paramContext)
  {
    super(paramContext);
    b();
  }
  
  public EvaluationPhoneDiagram(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  public EvaluationPhoneDiagram(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    b();
  }
  
  private void a(Canvas paramCanvas, RectF paramRectF)
  {
    this.a.setShader(new LinearGradient(0.0F, paramRectF.top, 0.0F, paramRectF.bottom, g, h, Shader.TileMode.CLAMP));
    paramCanvas.drawRect(paramRectF.left, paramRectF.top, paramRectF.right, paramRectF.bottom, this.a);
    float[] arrayOfFloat = new float[12];
    arrayOfFloat[0] = paramRectF.left;
    arrayOfFloat[1] = paramRectF.bottom;
    arrayOfFloat[2] = paramRectF.left;
    arrayOfFloat[3] = paramRectF.top;
    arrayOfFloat[4] = paramRectF.left;
    arrayOfFloat[5] = paramRectF.top;
    arrayOfFloat[6] = paramRectF.right;
    arrayOfFloat[7] = paramRectF.top;
    arrayOfFloat[8] = paramRectF.right;
    arrayOfFloat[9] = paramRectF.top;
    arrayOfFloat[10] = paramRectF.right;
    arrayOfFloat[11] = paramRectF.bottom;
    paramCanvas.drawLines(arrayOfFloat, this.b);
  }
  
  private void a(Canvas paramCanvas, RectF paramRectF, float paramFloat1, float paramFloat2, int paramInt)
  {
    String str1 = String.valueOf(paramInt);
    float f1 = this.c.measureText(str1);
    paramCanvas.drawText(str1, paramRectF.left - f1 / 2.0F, paramFloat2 + (paramFloat1 + paramRectF.bottom), this.c);
    if (paramInt == -1 + this.e.length)
    {
      String str2 = String.valueOf(this.e.length);
      float f2 = this.c.measureText(str2);
      paramCanvas.drawText(str2, paramRectF.right - f2 / 2.0F, paramFloat2 + (paramFloat1 + paramRectF.bottom), this.c);
    }
  }
  
  private void b()
  {
    this.b = new Paint();
    this.b.setStyle(Paint.Style.STROKE);
    this.b.setColor(-16777216);
    this.a = new Paint();
    this.a.setStyle(Paint.Style.FILL);
    this.d = new Paint();
    this.d.setColor(-1);
    this.d.setStyle(Paint.Style.STROKE);
    this.d.setAntiAlias(true);
    this.c = new Paint();
    this.c.setColor(-1);
    this.c.setStyle(Paint.Style.FILL);
    this.c.setAntiAlias(true);
    this.c.setTextSize(DisplayUtils.a(getContext(), 9));
    this.f = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.e = new double[24];
    for (int i = 0; i < 23; i++) {
      this.e[i] = 0.0D;
    }
  }
  
  private void b(Canvas paramCanvas, RectF paramRectF, float paramFloat1, float paramFloat2, int paramInt)
  {
    float[] arrayOfFloat = new float[8];
    arrayOfFloat[0] = paramRectF.left;
    arrayOfFloat[1] = (paramFloat1 + paramRectF.bottom);
    arrayOfFloat[2] = paramRectF.left;
    arrayOfFloat[3] = paramRectF.bottom;
    arrayOfFloat[4] = paramRectF.left;
    arrayOfFloat[5] = paramRectF.bottom;
    arrayOfFloat[6] = paramRectF.right;
    arrayOfFloat[7] = paramRectF.bottom;
    paramCanvas.drawLines(arrayOfFloat, this.d);
    if (paramInt == -1 + this.e.length) {
      paramCanvas.drawLine(paramRectF.right, paramRectF.bottom, paramRectF.right, paramFloat1 + paramRectF.bottom, this.d);
    }
  }
  
  public boolean a()
  {
    for (int i = 0;; i++)
    {
      boolean bool = false;
      if (i < 23)
      {
        if (this.e[i] != 0.0D) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.e != null)
    {
      float f1 = (getWidth() - 20.0F) / this.e.length;
      float f2 = -1 + getHeight();
      float f3 = f2 * 0.17F;
      float f4 = f2 * 0.18F;
      for (int i = 0; i < this.e.length; i++)
      {
        float f5 = 0.65F * (float)(this.e[i] * f2);
        this.f.left = (5.0F + f1 * i);
        this.f.top = (f2 - f5 - f3 - f4);
        this.f.right = (f1 + this.f.left);
        this.f.bottom = (f2 - f3 - f4);
        a(paramCanvas, this.f);
        b(paramCanvas, this.f, f3, f1, i);
        a(paramCanvas, this.f, f3, f4, i);
      }
    }
    super.onDraw(paramCanvas);
  }
  
  public void setRatesArray(double[] paramArrayOfDouble)
  {
    this.e = paramArrayOfDouble;
    invalidate();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.EvaluationPhoneDiagram
 * JD-Core Version:    0.7.0.1
 */