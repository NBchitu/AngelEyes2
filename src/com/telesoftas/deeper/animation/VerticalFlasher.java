package com.telesoftas.deeper.animation;

import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Shader.TileMode;
import android.view.View;
import com.telesoftas.utilities.deeper.SettingsUtils;

public class VerticalFlasher
{
  private final SharedPreferences a;
  private final Path b = new Path();
  private final Paint c;
  private final Matrix d = new Matrix();
  private final BitmapShader e;
  private final int f;
  private final int g;
  private float h;
  
  public VerticalFlasher(View paramView, int paramInt1, int paramInt2)
  {
    this.b.rewind();
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = 1.0F;
    this.c = new Paint();
    this.c.setStyle(Paint.Style.FILL);
    this.c.setAntiAlias(true);
    this.e = new BitmapShader(BitmapFactory.decodeResource(paramView.getResources(), 2130837618), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
    this.c.setShader(this.e);
    this.a = SettingsUtils.a(paramView.getContext());
  }
  
  private int a(byte paramByte, int paramInt)
  {
    int i = paramByte & 0xFF;
    if (i < paramInt) {
      i = 0;
    }
    return i;
  }
  
  private void a(float paramFloat1, int paramInt1, float paramFloat2, byte[] paramArrayOfByte, int paramInt2)
  {
    this.b.rewind();
    int i = paramInt1 + this.g;
    int j = paramArrayOfByte.length;
    float f1 = 0.5F * (this.f * this.h) / 255.0F;
    this.b.moveTo(paramFloat1, paramInt1);
    float f2 = paramInt1;
    for (int k = 0; (f2 < i) && (k < j); k++)
    {
      float f4 = f1 * a(paramArrayOfByte[k], paramInt2);
      this.b.lineTo(f4 + paramFloat1, f2);
      f2 += paramFloat2;
    }
    while (k > 0)
    {
      f2 -= paramFloat2;
      k--;
      float f3 = f1 * a(paramArrayOfByte[k], paramInt2);
      this.b.lineTo(paramFloat1 - f3, f2);
    }
    this.b.lineTo(paramFloat1, paramInt1);
  }
  
  public int a()
  {
    return (int)Math.ceil(this.f * this.h);
  }
  
  public void a(float paramFloat)
  {
    this.h = paramFloat;
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2, float paramFloat, byte[] paramArrayOfByte)
  {
    float f1 = paramFloat * this.g / paramArrayOfByte.length;
    a(paramInt1 + 0.5F * (this.f * this.h), paramInt2, f1, paramArrayOfByte, this.a.getInt(SettingsUtils.d, 0));
    this.d.setTranslate(paramInt1, 0.0F);
    this.d.preScale(this.f * this.h / 96.0F, 1.0F);
    this.e.setLocalMatrix(this.d);
    paramCanvas.drawPath(this.b, this.c);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.VerticalFlasher
 * JD-Core Version:    0.7.0.1
 */