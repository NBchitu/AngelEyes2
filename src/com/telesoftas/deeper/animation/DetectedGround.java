package com.telesoftas.deeper.animation;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.telesoftas.hardware.DeeperFishDataPacket;
import com.telesoftas.services.Signal;
import java.util.Iterator;

public class DetectedGround
  implements DataRenderer<DeeperFishDataPacket>
{
  private Path a;
  private Bitmap b;
  private Matrix c;
  private BitmapShader d;
  private Paint e;
  
  public float a(ImmutableList<Signal> paramImmutableList)
  {
    return 0.0F;
  }
  
  public void a() {}
  
  public void a(Canvas paramCanvas, RectF paramRectF, float paramFloat, ImmutableList<DeeperFishDataPacket> paramImmutableList, int paramInt)
  {
    this.a.rewind();
    this.a.moveTo(paramRectF.left, paramRectF.bottom);
    int i = paramImmutableList.size();
    float f1 = paramRectF.width() / i;
    float f2 = paramFloat * paramRectF.height();
    float f3 = paramRectF.left;
    float f4 = paramRectF.bottom;
    Iterator localIterator = paramImmutableList.iterator();
    float f5 = f3;
    float f8;
    for (float f6 = f4; localIterator.hasNext(); f6 = f8)
    {
      float[] arrayOfFloat = ((DeeperFishDataPacket)localIterator.next()).b();
      int j = arrayOfFloat.length;
      float f7 = f1 / j;
      f8 = f6;
      int k = 0;
      while (k < j)
      {
        float f9 = Math.min(paramRectF.top + f2 * arrayOfFloat[k], paramRectF.bottom);
        this.a.lineTo(f5 + f7 * k, f9);
        k++;
        f8 = f9;
      }
      f5 += f1;
    }
    this.a.lineTo(paramRectF.right, f6);
    this.a.lineTo(paramRectF.right, paramRectF.bottom);
    this.a.close();
    this.c.setTranslate(-f1 * (paramInt % this.b.getWidth()), 0.0F);
    this.d.setLocalMatrix(this.c);
    paramCanvas.drawPath(this.a, this.e);
  }
  
  public void a(View paramView)
  {
    this.b = BitmapFactory.decodeResource(paramView.getResources(), 2130837635);
    this.c = new Matrix();
    this.a = new Path();
    this.e = new Paint();
    this.e.setStyle(Paint.Style.FILL);
    int i = Color.argb(200, 229, 145, 256);
    int j = Color.argb(200, 179, 95, 10);
    LinearGradient localLinearGradient = new LinearGradient(0.0F, 0.0F, 0.0F, paramView.getHeight(), i, j, Shader.TileMode.CLAMP);
    this.d = new BitmapShader(this.b, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
    this.e.setShader(new ComposeShader(this.d, localLinearGradient, PorterDuff.Mode.SRC_OVER));
  }
  
  public void b()
  {
    if (this.b != null)
    {
      this.b.recycle();
      this.b = null;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.DetectedGround
 * JD-Core Version:    0.7.0.1
 */