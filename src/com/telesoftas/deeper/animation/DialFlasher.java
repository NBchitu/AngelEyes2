package com.telesoftas.deeper.animation;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.fridaylab.deeper.ui.ViewTools;
import com.fridaylab.util.DeferredLoader;
import com.telesoftas.hardware.DeeperRawDataPacket;
import com.telesoftas.hardware.HardwareJni;
import com.telesoftas.utilities.MathUtils;
import com.telesoftas.utilities.deeper.SettingsUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class DialFlasher
{
  private DeferredLoader a;
  private RectF b = new RectF();
  private Matrix c = new Matrix();
  private SharedPreferences d;
  private int[] e = new int[1130];
  private float[] f = new float[1130];
  private Paint g = new Paint();
  private Paint h = new Paint(2);
  private Paint i;
  private Paint j;
  private int[] k = new int[1120];
  private SparseArray<WeakReference<int[]>> l = new SparseArray();
  private SparseArray<WeakReference<float[]>> m = new SparseArray();
  private float n = -1.0F;
  private int o = -1;
  private int p = -1;
  private String[] q;
  
  public DialFlasher(Context paramContext)
  {
    this.d = SettingsUtils.a(paramContext);
    this.a = new DeferredLoader(paramContext.getResources(), 2130837594);
    this.h.setAntiAlias(true);
    this.g.setAntiAlias(true);
    this.g.setColor(-16777216);
    this.i = new Paint();
    this.i.setTextAlign(Paint.Align.CENTER);
    this.i.setAntiAlias(true);
    this.i.setColor(-1);
    this.i.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
    this.i.setTextAlign(Paint.Align.CENTER);
    this.j = new Paint();
    this.j.setAntiAlias(true);
    this.j.setColor(-1);
    this.j.setStyle(Paint.Style.STROKE);
    this.j.setStrokeWidth(1.3F * paramContext.getResources().getDisplayMetrics().density);
  }
  
  private static int a(float paramFloat, int paramInt)
  {
    int i1 = 2;
    int i2 = 1;
    float f1;
    int i3;
    int i4;
    switch (paramInt)
    {
    default: 
      f1 = 0.02413128F;
      i3 = 4;
      int i5 = i1;
      i1 = i2;
      i2 = i5;
      i4 = i1;
    }
    for (;;)
    {
      float f2 = f1 * (i4 * 6);
      if (f2 > paramFloat)
      {
        return ViewTools.a(1120.0F * f2);
        f1 = (float)(0.02413127571344376D / MathUtils.a(1.0D));
        i2 = 5;
        i3 = 6;
        break;
        f1 = (float)(0.02413127571344376D / MathUtils.b(1.0D));
        i1 = i2;
        i3 = 0;
        break;
      }
      if (i4 == i3) {
        i4 += i1 * 2;
      } else if (i4 > i3) {
        i4 += i2;
      } else {
        i4 += i1;
      }
    }
  }
  
  private static int a(int paramInt)
  {
    int i1 = Color.red(paramInt);
    int i2 = Color.green(paramInt);
    int i3 = Color.blue(paramInt);
    int i4 = Color.alpha(paramInt) * ((i3 + (i1 + i2)) / 3) / 255;
    return Color.rgb(i4, i4, i4);
  }
  
  private float[] a(float[] paramArrayOfFloat, int paramInt)
  {
    WeakReference localWeakReference = (WeakReference)this.m.get(paramInt);
    if (localWeakReference != null) {}
    for (float[] arrayOfFloat1 = (float[])localWeakReference.get();; arrayOfFloat1 = null)
    {
      if (arrayOfFloat1 != null)
      {
        System.arraycopy(paramArrayOfFloat, 0, arrayOfFloat1, 0, paramInt);
        return arrayOfFloat1;
      }
      float[] arrayOfFloat2 = Arrays.copyOf(paramArrayOfFloat, paramInt);
      this.m.append(paramInt, new WeakReference(arrayOfFloat2));
      return arrayOfFloat2;
    }
  }
  
  private int[] a(int[] paramArrayOfInt, int paramInt)
  {
    WeakReference localWeakReference = (WeakReference)this.l.get(paramInt);
    if (localWeakReference != null) {}
    for (int[] arrayOfInt1 = (int[])localWeakReference.get();; arrayOfInt1 = null)
    {
      if (arrayOfInt1 != null)
      {
        System.arraycopy(paramArrayOfInt, 0, arrayOfInt1, 0, paramInt);
        return arrayOfInt1;
      }
      int[] arrayOfInt2 = Arrays.copyOf(paramArrayOfInt, paramInt);
      this.l.append(paramInt, new WeakReference(arrayOfInt2));
      return arrayOfInt2;
    }
  }
  
  private static String[] a(int paramInt1, int paramInt2)
  {
    float f1 = (float)(41.439998626708984D * (paramInt1 / (6.0D / MathUtils.a(1.0D, paramInt2))) / 1120.0D);
    String[] arrayOfString = new String[6];
    for (int i1 = 0; i1 < 6; i1++) {
      arrayOfString[i1] = String.valueOf(ViewTools.a(f1 * i1));
    }
    return arrayOfString;
  }
  
  private static int b(int paramInt)
  {
    int i1 = Color.alpha(paramInt);
    if (i1 == 255) {
      return paramInt;
    }
    if (i1 == 0) {
      return -16777216;
    }
    return Color.rgb((64 + i1 * Color.red(paramInt)) / 255, (64 + i1 * Color.green(paramInt)) / 255, (64 + i1 * Color.blue(paramInt)) / 255);
  }
  
  private SweepGradient b(int paramInt1, int paramInt2)
  {
    this.e[0] = -16777216;
    this.f[0] = 0.0F;
    int i1 = Math.min(this.o, this.k.length);
    int i2 = 0;
    int i3 = 1;
    int i4 = 0;
    int i5 = -16777216;
    int i7;
    float f1;
    label174:
    label181:
    int i9;
    int i10;
    for (;;)
    {
      int[] arrayOfInt;
      if (i4 < i1)
      {
        i7 = b(this.k[i4]);
        f1 = 1.0F * i4 / this.o;
        if (f1 <= 0.99D) {
          break label181;
        }
        if (f1 < 1.0F)
        {
          arrayOfInt = this.e;
          if (i2 == 0) {
            break label174;
          }
        }
      }
      for (;;)
      {
        arrayOfInt[i3] = i5;
        this.f[i3] = f1;
        i3++;
        this.e[i3] = -16777216;
        this.f[i3] = 1.0F;
        int i6 = i3 + 1;
        return new SweepGradient(paramInt1, paramInt2, a(this.e, i6), a(this.f, i6));
        i5 = -16777216;
      }
      if (i5 != i7) {
        break;
      }
      i9 = i3;
      i10 = 1;
      i4++;
      i2 = i10;
      i3 = i9;
    }
    if (i2 != 0)
    {
      this.e[i3] = i5;
      this.f[i3] = (1.0F * (i4 - 1) / this.o);
    }
    for (int i8 = i3 + 1;; i8 = i3)
    {
      this.e[i8] = i7;
      this.f[i8] = f1;
      i9 = i8 + 1;
      i5 = i7;
      i10 = 0;
      break;
    }
  }
  
  public void a(Canvas paramCanvas, DeeperRawDataPacket paramDeeperRawDataPacket, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramDeeperRawDataPacket == null)
    {
      if (this.n > 0.0F) {
        for (int i6 = 0; i6 < this.k.length; i6++) {
          this.k[i6] = a(this.k[i6]);
        }
      }
      this.n = -1.0F;
      this.o = -1;
      this.c.setRotate(-90.0F, paramInt1, paramInt2);
      paramCanvas.save(1);
      paramCanvas.setMatrix(this.c);
      if (this.o <= 0) {
        break label621;
      }
      SweepGradient localSweepGradient = b(paramInt1, paramInt2);
      this.g.setShader(localSweepGradient);
    }
    for (;;)
    {
      paramCanvas.drawCircle(paramInt1, paramInt2, (int)(0.99D * paramInt3), this.g);
      paramCanvas.restore();
      Bitmap localBitmap = this.a.a();
      Rect localRect = new Rect(0, 0, localBitmap.getWidth(), localBitmap.getHeight());
      this.b.set(paramInt1 - paramInt3, paramInt2 - paramInt3, paramInt1 + paramInt3, paramInt2 + paramInt3);
      paramCanvas.drawBitmap(localBitmap, localRect, this.b, this.h);
      paramCanvas.drawCircle(paramInt1, paramInt2, 0.43F * paramInt3, this.j);
      if (this.o <= 0) {
        return;
      }
      this.i.setTextSize(paramInt3 / 12.0F);
      double d1 = 0.58D * paramInt3;
      double d2 = 0.5D * (this.i.descent() + this.i.ascent());
      for (int i5 = 0; i5 < 6; i5++)
      {
        double d3 = d2 * (Math.log(this.q[i5].length()) / Math.log(2.0D)) * Math.sin(1.047197551196598D * i5) + paramInt1 + d1 * Math.sin(1.047197551196598D * i5);
        double d4 = paramInt2 - d2 - d1 * Math.cos(1.047197551196598D * i5);
        paramCanvas.drawText(this.q[i5], (float)d3, (float)d4, this.i);
      }
      int i1 = this.d.getInt(SettingsUtils.d, 0);
      HardwareJni.getRawSignalPixels(paramDeeperRawDataPacket.b(), paramDeeperRawDataPacket.e(), i1, this.k, 1);
      float f1 = paramDeeperRawDataPacket.f();
      int i2 = this.d.getInt(SettingsUtils.a, 0);
      if (this.p != i2) {
        this.n = -1.0F;
      }
      this.p = i2;
      if (this.n < 0.0F)
      {
        this.o = a(f1 * 1.15F, i2);
        this.q = a(this.o, i2);
      }
      for (;;)
      {
        this.n = paramDeeperRawDataPacket.f();
        break;
        int i3 = a(1.09F * f1, i2);
        if (i3 > this.o)
        {
          this.o = i3;
          this.q = a(this.o, i2);
        }
        else if (i3 < this.o)
        {
          int i4 = a(f1 * 1.21F, i2);
          if (i4 != this.o)
          {
            this.o = i4;
            this.q = a(this.o, i2);
          }
        }
      }
      label621:
      this.g.setShader(null);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.DialFlasher
 * JD-Core Version:    0.7.0.1
 */