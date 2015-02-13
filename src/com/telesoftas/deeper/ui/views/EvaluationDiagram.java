package com.telesoftas.deeper.ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import com.telesoftas.utilities.CalendarUtils;
import com.telesoftas.utilities.DisplayUtils;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class EvaluationDiagram
  extends View
{
  private static final int s = Color.parseColor("#E05802");
  private static final int t = Color.parseColor("#FE863B");
  private float A = 0.0F;
  private float B;
  private float C;
  private float D;
  private float E;
  private float F;
  private float G;
  private float H;
  private final boolean I = true;
  private Bitmap J;
  private int K;
  private EvaluationTableView.ForecastData[] L;
  private final Context M;
  private Paint a;
  private Paint b;
  private Paint c;
  private Paint d;
  private Paint e;
  private Paint f;
  private Paint g;
  private Paint h;
  private Paint i;
  private Paint j;
  private Paint k;
  private Paint l;
  private Paint m;
  private Paint n;
  private final Rect o = new Rect();
  private RectF p;
  private Path q;
  private Path r;
  private int u;
  private final int v = 24;
  private Calendar w;
  private final Calendar x = Calendar.getInstance();
  private int y = 0;
  private int z = 0;
  
  public EvaluationDiagram(Context paramContext)
  {
    super(paramContext);
    this.M = paramContext;
    b();
  }
  
  public EvaluationDiagram(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.M = paramContext;
    b();
  }
  
  public EvaluationDiagram(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.M = paramContext;
    b();
  }
  
  private void a(Canvas paramCanvas)
  {
    b(paramCanvas, this.y);
    if (this.L != null)
    {
      this.w = ((Calendar)this.L[0].a.clone());
      this.w.add(6, this.u / 2);
    }
    int i1 = 0;
    if (i1 < this.u)
    {
      GregorianCalendar localGregorianCalendar;
      if ((this.L != null) && (this.L[i1] != null))
      {
        for (int i2 = 0; i2 < 24; i2++)
        {
          float f1 = 0.65F * (float)(this.L[i1].b[i2] * (-5 + this.y));
          this.p.left = (5.0F + i2 * this.A + this.D);
          this.p.top = (this.y - f1 - this.B - this.C + i1 * this.y);
          this.p.right = (this.p.left + this.A);
          this.p.bottom = (f1 + this.p.top - 5.0F);
          if (f1 != 0.0F) {
            a(paramCanvas, this.p);
          }
          a(this.p, this.B, this.A, i2);
          a(paramCanvas, this.p, this.B, this.C, i2);
        }
        localGregorianCalendar = (GregorianCalendar)this.L[i1].a.clone();
        localGregorianCalendar.add(6, i1);
        if (CalendarUtils.a(localGregorianCalendar, this.x)) {
          b(paramCanvas, i1, this.n);
        }
        a(paramCanvas, i1);
        if (localGregorianCalendar.get(2) != this.w.get(2)) {
          break label394;
        }
        a(paramCanvas, i1, this.j);
        b(paramCanvas, i1, localGregorianCalendar, this.e);
        if (!CalendarUtils.b(localGregorianCalendar)) {
          break label379;
        }
        a(paramCanvas, i1, localGregorianCalendar, this.i);
      }
      for (;;)
      {
        i1++;
        break;
        label379:
        a(paramCanvas, i1, localGregorianCalendar, this.f);
        continue;
        label394:
        a(paramCanvas, i1, this.k);
        b(paramCanvas, i1, localGregorianCalendar, this.g);
        a(paramCanvas, i1, localGregorianCalendar, this.h);
      }
    }
    b(paramCanvas, this.u / 2, this.l);
    paramCanvas.drawPath(this.q, this.d);
  }
  
  private void a(Canvas paramCanvas, int paramInt)
  {
    float f1 = this.G - 2.0F;
    paramCanvas.drawBitmap(BitmapFactory.decodeResource(getResources(), this.L[paramInt].c), null, new RectF(2.0F + (this.D / 2.0F - f1 / 2.0F), 2.0F + (paramInt * this.y + this.E + this.F), f1 + (this.D / 2.0F - f1 / 2.0F), paramInt * this.y + this.E + this.F + this.G - 2.0F / 2.0F), null);
  }
  
  private void a(Canvas paramCanvas, int paramInt, Paint paramPaint)
  {
    float f1 = this.H - 3.0F;
    float f2 = (this.D - (f1 + (1 * (-1 + this.L[paramInt].d) + f1 * (-1 + this.L[paramInt].d)))) / 2.0F;
    for (int i1 = 0; i1 < this.L[paramInt].d; i1++) {
      paramCanvas.drawCircle(f2 + i1 * 1 + f1 * i1 + f1 / 2.0F, paramInt * this.y + this.E + this.F + this.G + f1 / 2.0F, f1 / 2.0F - 3.0F / 2.0F, paramPaint);
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt, Calendar paramCalendar, Paint paramPaint)
  {
    String str = CalendarUtils.a(paramCalendar.get(7), this.M);
    this.f.getTextBounds(str, 0, str.length(), this.o);
    paramCanvas.drawText(str, this.D / 2.0F - this.o.width() / 2, paramInt * this.y + this.E + this.F, paramPaint);
  }
  
  private void a(Canvas paramCanvas, RectF paramRectF)
  {
    this.a.setShader(new LinearGradient(0.0F, paramRectF.top, 0.0F, paramRectF.bottom, s, t, Shader.TileMode.CLAMP));
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
    if (paramInt == 23)
    {
      String str2 = String.valueOf(24);
      float f2 = this.c.measureText(str2);
      paramCanvas.drawText(str2, paramRectF.right - f2 / 2.0F, paramFloat2 + (paramFloat1 + paramRectF.bottom), this.c);
    }
  }
  
  private void a(RectF paramRectF, float paramFloat1, float paramFloat2, int paramInt)
  {
    this.q.moveTo(paramRectF.left, paramFloat1 + paramRectF.bottom);
    this.q.lineTo(paramRectF.left, paramRectF.bottom);
    this.q.lineTo(paramRectF.right, paramRectF.bottom);
    if (paramInt == 23) {
      this.q.lineTo(paramRectF.right, paramFloat1 + paramRectF.bottom);
    }
  }
  
  @SuppressLint({"NewApi"})
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
    this.p = new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    this.e = new Paint();
    this.e.setColor(-1);
    this.e.setAntiAlias(true);
    this.g = new Paint();
    this.g.setColor(-7829368);
    this.g.setAntiAlias(true);
    this.f = new Paint();
    this.f.setColor(-1);
    this.f.setAntiAlias(true);
    this.h = new Paint();
    this.h.setColor(Color.parseColor("#4f4f4f"));
    this.i = new Paint();
    this.i.setColor(Color.parseColor("#f46114"));
    this.i.setAntiAlias(true);
    this.j = new Paint();
    this.j.setColor(Color.parseColor("#f46114"));
    this.j.setStyle(Paint.Style.FILL);
    this.j.setAntiAlias(true);
    this.k = new Paint();
    this.k.setColor(Color.parseColor("#4f4f4f"));
    this.k.setStyle(Paint.Style.FILL);
    this.k.setAntiAlias(true);
    this.l = new Paint();
    this.l.setColor(-1);
    this.l.setStyle(Paint.Style.STROKE);
    this.l.setStrokeWidth(3.0F);
    this.m = new Paint();
    this.m.setColor(Color.parseColor("#4f4f4f"));
    this.m.setStyle(Paint.Style.STROKE);
    this.m.setStrokeWidth(3.0F);
    this.n = new Paint();
    this.n.setColor(Color.parseColor("#f46114"));
    this.n.setStyle(Paint.Style.STROKE);
    this.n.setStrokeWidth(3.0F);
    this.q = new Path();
    this.r = new Path();
    if (Build.VERSION.SDK_INT >= 11) {
      setLayerType(1, null);
    }
    setDrawingCacheEnabled(true);
  }
  
  private void b(Canvas paramCanvas, int paramInt)
  {
    int i1 = 1;
    this.r.moveTo(0.0F, 0.0F);
    this.r.lineTo(0.0F, this.z - 10);
    this.r.arcTo(new RectF(0.0F, -20 + this.z, 20, this.z), 90.0F, 90.0F, i1);
    this.r.moveTo(10, this.z);
    this.r.lineTo(this.K - 10, this.z);
    this.r.arcTo(new RectF(-20 + this.K, -20 + this.z, this.K, this.z), 0.0F, 90.0F, i1);
    this.r.moveTo(this.K, this.z - 10);
    this.r.lineTo(this.K, 0.0F);
    while (i1 < this.u)
    {
      this.r.moveTo(0.0F, paramInt * i1);
      this.r.lineTo(this.K, paramInt * i1);
      i1++;
    }
    paramCanvas.drawPath(this.r, this.m);
  }
  
  private void b(Canvas paramCanvas, int paramInt, Paint paramPaint)
  {
    paramCanvas.drawRect(0.0F, paramInt * this.y, this.K, (paramInt + 1) * this.y, paramPaint);
  }
  
  private void b(Canvas paramCanvas, int paramInt, Calendar paramCalendar, Paint paramPaint)
  {
    String str = String.valueOf(paramCalendar.get(5));
    this.e.getTextBounds(str, 0, str.length(), this.o);
    paramCanvas.drawText(str, this.D / 2.0F - this.o.width() / 2, paramInt * this.y + this.E, paramPaint);
  }
  
  public void a(EvaluationTableView.ForecastData[] paramArrayOfForecastData)
  {
    this.L = paramArrayOfForecastData;
    invalidate();
  }
  
  public boolean a()
  {
    return this.L != null;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.y == 0)
    {
      this.z = getHeight();
      this.K = getWidth();
      this.y = (this.z / this.u);
      this.B = (0.17F * this.y);
      this.C = (0.18F * this.y);
      this.D = (0.12F * this.K);
      this.A = ((getWidth() - this.D - 20.0F) / 24.0F);
      this.E = (0.3F * this.y);
      this.F = (0.2F * this.y);
      this.G = (0.3F * this.y);
      this.H = (0.2F * this.y);
      this.e.setTextSize(this.E);
      this.g.setTextSize(this.E);
      this.f.setTextSize(this.F);
      this.h.setTextSize(this.F);
      this.i.setTextSize(this.F);
    }
    if ((this.L == null) && (this.J == null))
    {
      this.J = getDrawingCache();
      paramCanvas.setBitmap(this.J);
      return;
    }
    a(paramCanvas);
    buildDrawingCache();
  }
  
  public void setDaysCount(int paramInt)
  {
    this.u = paramInt;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.EvaluationDiagram
 * JD-Core Version:    0.7.0.1
 */