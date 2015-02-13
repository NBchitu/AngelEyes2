package com.telesoftas.deeper.animation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.telesoftas.utilities.CalendarUtils;
import com.telesoftas.utilities.MathUtils;
import com.telesoftas.utilities.StringUtils;
import java.text.DecimalFormat;

public class DepthScale
{
  private int A;
  private final int B;
  private final int C;
  private long D = -1L;
  private boolean E = true;
  private IndicatorBlinkingThread F = null;
  private boolean G = true;
  private final Paint a = new Paint();
  private final Paint b = new Paint();
  private final Paint c = new Paint();
  private final Paint d = new Paint();
  private final Paint e = new Paint();
  private final Paint f = new Paint();
  private final Paint g = new Paint();
  private final Context h;
  private int i;
  private float j = 41.439999F;
  private float k = -1.0F;
  private int l;
  private final int m;
  private final float n;
  private final int o;
  private final int p;
  private final int q;
  private final int r;
  private final float s;
  private final float t;
  private String u;
  private int v = -1;
  private String w;
  private String x;
  private int y;
  private final int z;
  
  public DepthScale(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.h = paramContext;
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    this.B = paramInt1;
    this.y = paramInt2;
    this.z = paramInt3;
    float f1 = localDisplayMetrics.density;
    this.r = paramContext.getResources().getDimensionPixelOffset(2131230777);
    this.q = paramContext.getResources().getDimensionPixelOffset(2131230783);
    this.p = ((int)(0.035F * paramInt4));
    this.t = (3.6F * this.r);
    this.l = ((int)TypedValue.applyDimension(1, 1.5F, localDisplayMetrics));
    if (this.l <= 1) {
      this.l = 2;
    }
    this.m = (this.l / 2);
    this.n = (paramInt1 / 4.0F);
    this.a.setTextSize(this.r);
    this.a.setTextAlign(Paint.Align.RIGHT);
    this.a.setAntiAlias(true);
    this.a.setColor(-1);
    this.s = ((paramContext.getResources().getDimension(2131230779) - this.a.getFontSpacing()) / 2.0F);
    this.o = ((int)TypedValue.applyDimension(1, 5.0F, localDisplayMetrics));
    this.f.setARGB(178, 110, 110, 110);
    this.g.setColor(-16711936);
    this.g.setStyle(Paint.Style.FILL);
    this.g.setAlpha(0);
    this.b.setTextSize(this.r);
    this.b.setTextAlign(Paint.Align.RIGHT);
    this.b.setAntiAlias(true);
    this.b.setColor(-1);
    this.c.setTextSize(this.q);
    this.c.setTextAlign(Paint.Align.RIGHT);
    this.c.setAntiAlias(true);
    this.c.setColor(-1);
    this.d.setTextSize(this.p);
    this.d.setAntiAlias(true);
    this.d.setColor(-1);
    this.e.setTextSize(this.p);
    this.e.setAntiAlias(true);
    this.e.setColor(-16777216);
    this.e.setStyle(Paint.Style.STROKE);
    this.e.setStrokeWidth(f1);
    this.C = paramContext.getResources().getDimensionPixelOffset(2131230780);
    c(0);
  }
  
  private float a(float paramFloat)
  {
    return paramFloat + 0.15F * paramFloat;
  }
  
  public static void a(Canvas paramCanvas, String paramString, float paramFloat1, float paramFloat2, Paint paramPaint1, Paint paramPaint2)
  {
    paramCanvas.drawText(paramString, paramFloat1, paramFloat2, paramPaint1);
    paramCanvas.drawText(paramString, paramFloat1, paramFloat2, paramPaint2);
  }
  
  private String b(float paramFloat)
  {
    return StringUtils.b.format(MathUtils.a(paramFloat, this.v)) + this.w;
  }
  
  private String c()
  {
    if (this.i == 666) {
      return "---" + this.x;
    }
    return StringUtils.a.format(MathUtils.b(this.i, this.v)) + this.x;
  }
  
  private String c(float paramFloat)
  {
    if ((paramFloat > 0.0F) && (paramFloat <= 4.0F)) {}
    for (DecimalFormat localDecimalFormat = StringUtils.b;; localDecimalFormat = StringUtils.a) {
      return localDecimalFormat.format(MathUtils.a(paramFloat, this.v)) + this.w;
    }
  }
  
  private void c(int paramInt)
  {
    if (this.v == paramInt) {
      return;
    }
    this.v = paramInt;
    switch (paramInt)
    {
    default: 
      this.w = this.h.getString(2131427513);
      this.x = this.h.getString(2131427340);
      return;
    case 1: 
      this.w = this.h.getString(2131427424);
      this.x = this.h.getString(2131427421);
      return;
    case 2: 
      this.w = this.h.getString(2131427422);
      this.x = this.h.getString(2131427421);
      return;
    }
    this.w = this.h.getString(2131427424);
    this.x = this.h.getString(2131427340);
  }
  
  public int a()
  {
    return this.C;
  }
  
  public void a(int paramInt)
  {
    this.y = paramInt;
  }
  
  public void a(int paramInt1, float paramFloat1, int paramInt2, long paramLong, float paramFloat2)
  {
    this.i = paramInt1;
    c(paramInt2);
    this.j = paramFloat1;
    this.D = paramLong;
    this.k = paramFloat2;
  }
  
  public void a(Canvas paramCanvas)
  {
    int i1 = this.y;
    this.u = c();
    float f1 = this.s - this.a.ascent();
    float f2 = i1 + this.C - Math.abs(this.s);
    String str;
    int i2;
    if (!this.G)
    {
      if (this.D > 0L)
      {
        str = CalendarUtils.a(this.h, this.D);
        paramCanvas.drawText(str, f2 - 2.0F * this.t, f1, this.c);
        paramCanvas.drawText(b(this.j), f2, f1, this.a);
        paramCanvas.drawText(this.u, f2 - this.t, f1, this.b);
      }
    }
    else
    {
      i2 = this.y - this.A;
      if (this.E)
      {
        a(paramCanvas, "0", i2 + this.o, this.p + this.z, this.e, this.d);
        if (this.k == -1.0F) {
          break label794;
        }
      }
    }
    label794:
    for (float f3 = this.k;; f3 = 35.0F)
    {
      a(paramCanvas, c(a(f3 / 4.0F)), i2 + this.o, 1.0F * this.n - this.o + this.z, this.e, this.d);
      a(paramCanvas, c(a(f3 / 2.0F)), i2 + this.o, 2.0F * this.n - this.o + this.z, this.e, this.d);
      a(paramCanvas, c(a(3.0F * (f3 / 4.0F))), i2 + this.o, 3.0F * this.n - this.o + this.z, this.e, this.d);
      a(paramCanvas, c(a(f3)), i2 + this.o, 4.0F * this.n - this.o + this.z, this.e, this.d);
      paramCanvas.drawRect(i2 + (this.C - this.m), this.l + this.z, i2 + (this.C + this.m), this.B - this.l + this.z, this.f);
      paramCanvas.drawRect(i2 + 0, this.z, i2 + this.C, this.l + this.z, this.f);
      paramCanvas.drawRect(i2 + this.C / 2, this.n + this.z, i2 + this.C, this.n + this.l + this.z, this.f);
      paramCanvas.drawRect(i2 + 0, 2.0F * this.n + this.z, i2 + this.C, 2.0F * this.n + this.l + this.z, this.f);
      paramCanvas.drawRect(i2 + this.C / 2, 3.0F * this.n + this.z, i2 + this.C, 3.0F * this.n + this.l + this.z, this.f);
      paramCanvas.drawRect(i2 + 0, 4.0F * this.n - this.l + this.z, i2 + this.C, 4.0F * this.n + this.z, this.f);
      if (this.G) {
        paramCanvas.drawRect(i2 + 0, 5.0F + (4.0F * this.n - this.l + this.z), -3 + (i2 + this.C), 15.0F + (4.0F * this.n + this.z), this.g);
      }
      return;
      str = "---";
      break;
    }
  }
  
  public void a(SceneView paramSceneView)
  {
    if ((this.F != null) && (this.F.a())) {
      return;
    }
    this.F = new IndicatorBlinkingThread(this.g, paramSceneView);
    this.F.start();
  }
  
  public void a(boolean paramBoolean)
  {
    this.E = paramBoolean;
  }
  
  public int b()
  {
    return this.y;
  }
  
  public void b(int paramInt)
  {
    this.A = paramInt;
  }
  
  public void b(boolean paramBoolean)
  {
    this.G = paramBoolean;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.DepthScale
 * JD-Core Version:    0.7.0.1
 */