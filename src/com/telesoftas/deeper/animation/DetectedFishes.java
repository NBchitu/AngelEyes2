package com.telesoftas.deeper.animation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.telesoftas.deeper.activities.MainDeeperActivity;
import com.telesoftas.hardware.FishData;
import com.telesoftas.hardware.ImagingSignal;
import com.telesoftas.services.Signal;
import com.telesoftas.utilities.MathUtils;
import com.telesoftas.utilities.StringUtils;
import java.text.DecimalFormat;
import java.util.Iterator;

public class DetectedFishes
  implements DataRenderer<ImagingSignal>
{
  private final RenderSettings a;
  private Bitmap b = paramArrayOfBitmap[1];
  private Bitmap c = paramArrayOfBitmap[0];
  private Bitmap d = paramArrayOfBitmap[2];
  private Paint e;
  private Paint f;
  private float g;
  private int h;
  private final Rect i = new Rect();
  private final RectF j = new RectF();
  
  public DetectedFishes(Bitmap[] paramArrayOfBitmap, RenderSettings paramRenderSettings)
  {
    this.a = paramRenderSettings;
  }
  
  private static Bitmap a(Resources paramResources, SparseIntArray paramSparseIntArray, int paramInt)
  {
    int k = paramSparseIntArray.get(paramInt, -1);
    int m;
    if (k < 0)
    {
      m = paramInt * 2;
      k = paramSparseIntArray.get(m, -1);
      if (k < 0)
      {
        m = paramInt * 3;
        k = paramSparseIntArray.get(m, -1);
        if (k < 0)
        {
          int n = -1 + paramSparseIntArray.size();
          m = paramSparseIntArray.keyAt(n);
          k = paramSparseIntArray.valueAt(n);
        }
      }
    }
    for (;;)
    {
      Bitmap localBitmap1 = BitmapFactory.decodeResource(paramResources, k);
      if (paramInt == m) {
        return localBitmap1;
      }
      Bitmap localBitmap2 = Bitmap.createScaledBitmap(localBitmap1, (int)Math.round(localBitmap1.getWidth() / (1.0D * m / paramInt)), paramInt, true);
      localBitmap1.recycle();
      return localBitmap2;
      m = paramInt;
    }
  }
  
  public static Bitmap[] a(Resources paramResources)
  {
    Bitmap[] arrayOfBitmap = new Bitmap[3];
    SparseIntArray localSparseIntArray1 = c();
    SparseIntArray localSparseIntArray2 = d();
    arrayOfBitmap[0] = a(paramResources, localSparseIntArray1, paramResources.getDimensionPixelSize(2131230725));
    arrayOfBitmap[1] = a(paramResources, localSparseIntArray2, paramResources.getDimensionPixelSize(2131230724));
    arrayOfBitmap[2] = a(paramResources, localSparseIntArray2, paramResources.getDimensionPixelSize(2131230723));
    return arrayOfBitmap;
  }
  
  private static SparseIntArray c()
  {
    SparseIntArray localSparseIntArray = new SparseIntArray(7);
    localSparseIntArray.append(16, 2130837613);
    localSparseIntArray.append(21, 2130837614);
    localSparseIntArray.append(24, 2130837615);
    localSparseIntArray.append(32, 2130837616);
    localSparseIntArray.append(48, 2130837617);
    return localSparseIntArray;
  }
  
  private static SparseIntArray d()
  {
    SparseIntArray localSparseIntArray = new SparseIntArray(7);
    localSparseIntArray.append(24, 2130837606);
    localSparseIntArray.append(32, 2130837607);
    localSparseIntArray.append(36, 2130837608);
    localSparseIntArray.append(48, 2130837609);
    localSparseIntArray.append(64, 2130837610);
    localSparseIntArray.append(72, 2130837611);
    localSparseIntArray.append(96, 2130837612);
    return localSparseIntArray;
  }
  
  public float a(ImmutableList<Signal> paramImmutableList)
  {
    return 1.0F;
  }
  
  public void a() {}
  
  protected void a(float paramFloat1, RectF paramRectF, FishData[] paramArrayOfFishData, float paramFloat2, Canvas paramCanvas)
  {
    float f1 = paramFloat2 * paramRectF.height();
    int k = paramCanvas.getWidth() - this.h;
    int m = 0;
    if (m < paramArrayOfFishData.length)
    {
      FishData localFishData = paramArrayOfFishData[m];
      Bitmap localBitmap;
      label78:
      float f2;
      float f3;
      label138:
      float f4;
      String str;
      switch (DetectedFishes.1.a[localFishData.getFishRealSize().ordinal()])
      {
      default: 
        localBitmap = this.b;
        f2 = paramRectF.top + f1 * localFishData.getFishDepth() - localBitmap.getHeight() / 2;
        f3 = paramFloat1 + paramRectF.left;
        if (f3 + localBitmap.getWidth() <= k)
        {
          paramCanvas.drawBitmap(localBitmap, f3, f2, null);
          if (this.a.a())
          {
            f4 = 41.439999F * localFishData.getFishDepth();
            switch (MainDeeperActivity.n)
            {
            default: 
              str = StringUtils.b.format(f4);
            }
          }
        }
        break;
      }
      for (;;)
      {
        float f5 = this.e.measureText(str);
        float f6 = paramFloat1 + paramRectF.left + (localBitmap.getWidth() - f5) / 2.0F;
        if (f6 + f5 <= k) {
          DepthScale.a(paramCanvas, str, f6, f2 - 2.0F, this.f, this.e);
        }
        m++;
        break;
        localBitmap = this.c;
        break label78;
        localBitmap = this.d;
        break label78;
        if (f3 >= k) {
          break label138;
        }
        int n = (int)Math.ceil(k - f3);
        int i1 = localBitmap.getHeight();
        this.i.set(0, 0, n, i1);
        this.j.set(f3, f2, f3 + n, f2 + i1);
        paramCanvas.drawBitmap(localBitmap, this.i, this.j, null);
        break label138;
        str = StringUtils.a.format(MathUtils.a(f4));
        continue;
        str = StringUtils.b.format(MathUtils.b(f4));
      }
    }
  }
  
  public void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  public void a(Canvas paramCanvas, RectF paramRectF, float paramFloat, ImmutableList<ImagingSignal> paramImmutableList, int paramInt)
  {
    Iterator localIterator = paramImmutableList.iterator();
    for (int k = 0; localIterator.hasNext(); k++)
    {
      ImagingSignal localImagingSignal = (ImagingSignal)localIterator.next();
      a(k * this.g, paramRectF, localImagingSignal.j(), paramFloat, paramCanvas);
    }
  }
  
  public void a(View paramView)
  {
    Resources localResources = paramView.getResources();
    this.e = new Paint();
    this.e.setColor(-1);
    this.e.setTextSize(localResources.getDimensionPixelSize(2131230804));
    this.e.setStyle(Paint.Style.FILL);
    DisplayMetrics localDisplayMetrics = paramView.getContext().getResources().getDisplayMetrics();
    this.f = new Paint();
    this.f.setColor(-16777216);
    this.f.setTextSize(localResources.getDimensionPixelSize(2131230804));
    this.f.setStyle(Paint.Style.STROKE);
    this.f.setStrokeWidth(localDisplayMetrics.density);
    this.g = Signal.a(paramView.getContext(), 2);
  }
  
  public void b()
  {
    if (this.c != null)
    {
      this.c.recycle();
      this.c = null;
    }
    if (this.b != null)
    {
      this.b.recycle();
      this.b = null;
    }
    if (this.d != null)
    {
      this.d.recycle();
      this.d = null;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.DetectedFishes
 * JD-Core Version:    0.7.0.1
 */