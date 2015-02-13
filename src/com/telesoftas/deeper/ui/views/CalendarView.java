package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.location.Location;
import android.util.MonthDisplayHelper;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.telesoftas.deeper.database.LocationData;
import com.telesoftas.utilities.CalendarUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarView
  extends SurfaceView
{
  private float a;
  private float b;
  private float c;
  private boolean d;
  private float e;
  private float f;
  private float g;
  private float h;
  private ArrayList<Integer> i;
  private boolean j = true;
  private MonthDisplayHelper k;
  private Paint l;
  private Paint m;
  private int n = -1;
  private Calendar o = null;
  private boolean p;
  private int q;
  private int r;
  private Bitmap s;
  private Bitmap t;
  private final ArrayList<CalendarView.OnCellSelectedListener> u = new ArrayList();
  private final Location v;
  private int[] w;
  private final Calendar x;
  private Path y;
  private final boolean z = false;
  
  public CalendarView(Context paramContext, Calendar paramCalendar, ArrayList<Integer> paramArrayList, int paramInt, boolean paramBoolean, Location paramLocation)
  {
    super(paramContext);
    this.x = paramCalendar;
    this.v = paramLocation;
    a(paramCalendar, paramArrayList, paramInt, paramBoolean);
  }
  
  private GregorianCalendar a(float paramFloat1, float paramFloat2)
  {
    float f1 = paramFloat1 / this.e;
    float f2 = paramFloat2 / this.f;
    int i1 = (int)f1;
    int i2 = (int)f2;
    int i3 = this.k.getDayAt(i2, i1);
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(this.k.getYear(), this.k.getMonth(), i3, this.x.get(11), this.x.get(12));
    if (!CalendarUtils.a(localGregorianCalendar, Calendar.getInstance())) {
      localGregorianCalendar.set(this.k.getYear(), this.k.getMonth(), i3, 23, 59);
    }
    if (i2 == 0) {
      if (i3 > 7) {
        localGregorianCalendar.set(2, -1 + this.k.getMonth());
      }
    }
    while (((i2 != 4) && (i2 != 5)) || (i3 >= 14)) {
      return localGregorianCalendar;
    }
    localGregorianCalendar.set(2, 1 + this.k.getMonth());
    return localGregorianCalendar;
  }
  
  private void a(int paramInt1, int paramInt2, Canvas paramCanvas, int paramInt3)
  {
    this.l.setStrokeWidth(2.0F);
    this.l.setColor(paramInt3);
    paramCanvas.drawRect(new RectF(1.0F + this.e * paramInt1, 1.0F + this.f * paramInt2, this.e * paramInt1 + this.e, this.f * paramInt2 + this.f - 1.0F), this.l);
  }
  
  private void a(Canvas paramCanvas)
  {
    int i1 = 0;
    this.m.setTextSize(this.b);
    this.m.setTextAlign(Paint.Align.CENTER);
    this.m.setTypeface(Typeface.DEFAULT_BOLD);
    this.m.setColor(Color.parseColor("#6A6A6A"));
    b(paramCanvas);
    if (this.p)
    {
      this.t = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), 2130837812), this.r, this.r, true);
      this.s = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), 2130837811), this.r, this.r, true);
    }
    int i2 = 0;
    while (i2 < 6)
    {
      int[] arrayOfInt = this.k.getDigitsForRow(i2);
      int i3 = 0;
      int i4 = i1;
      while (i3 < 7)
      {
        this.m.setStrokeWidth(0.0F);
        if ((i4 == 0) && (arrayOfInt[i3] == 1))
        {
          i4 = 1;
          this.m.setColor(-1);
          if ((this.i != null) && (this.i.contains(Integer.valueOf(arrayOfInt[i3]))) && (i4 != 0) && (!this.p)) {
            a(paramCanvas, i3, i2, this.k.getDayAt(i2, i3));
          }
          paramCanvas.drawText(Integer.toString(arrayOfInt[i3]), 1.0F + (this.e * i3 + this.e / 2.0F), this.f * i2 + this.q, this.m);
          if (!this.p) {
            break label528;
          }
          if (this.w == null) {
            break label449;
          }
        }
        int i7;
        label449:
        for (int i5 = this.w[(i3 + i2 * 7)];; i5 = 0)
        {
          int i6 = (int)(this.e / 2.0F);
          float f1 = i5 / 2.0F;
          i7 = (int)(i6 - f1 * this.r);
          if (i4 == 0) {
            break label455;
          }
          for (int i9 = 0; i9 < i5; i9++)
          {
            paramCanvas.drawBitmap(this.t, this.e * i3 + i7, this.f * i2 + this.f - 4.0F - this.r, this.l);
            i7 += 2 + this.r;
          }
          if ((i4 == 0) || (arrayOfInt[i3] != 1)) {
            break;
          }
          this.m.setColor(Color.parseColor("#6A6A6A"));
          i4 = 0;
          break;
        }
        label455:
        for (int i8 = 0; i8 < i5; i8++)
        {
          paramCanvas.drawBitmap(this.s, this.e * i3 + i7, this.f * i2 + this.f - 4.0F - this.r, this.l);
          i7 += 2 + this.r;
        }
        label528:
        i3++;
      }
      i2++;
      i1 = i4;
    }
    if (this.n > 0) {
      a(this.k.getColumnOf(this.n), this.k.getRowOf(this.n), paramCanvas, Color.parseColor("#f55600"));
    }
    if ((this.o != null) && (this.x.get(1) == this.o.get(1)) && (this.x.get(2) == this.o.get(2)))
    {
      Point localPoint = b(this.o);
      a(localPoint.x, localPoint.y, paramCanvas, -1);
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3)
  {
    this.l.setStyle(Paint.Style.FILL);
    this.l.setColor(Color.parseColor("#f55600"));
    paramCanvas.drawRect(new RectF(this.e * paramInt1, this.f * paramInt2, 1.0F + (this.e * paramInt1 + this.e), 1.0F + (this.f * paramInt2 + this.f)), this.l);
    this.l.setColor(-1);
    this.l.setStyle(Paint.Style.STROKE);
    this.l.setColor(-65536);
  }
  
  private void a(Calendar paramCalendar, ArrayList<Integer> paramArrayList, int paramInt, boolean paramBoolean)
  {
    setWillNotDraw(false);
    this.l = new Paint();
    this.l.setStrokeWidth(2.0F);
    this.l.setStyle(Paint.Style.STROKE);
    this.i = paramArrayList;
    this.m = new Paint();
    this.m.setAntiAlias(true);
    this.d = false;
    this.k = new MonthDisplayHelper(paramCalendar.get(1), paramCalendar.get(2), 2);
    if (paramInt > 0) {
      this.n = paramInt;
    }
    this.p = paramBoolean;
    setZOrderOnTop(true);
    getHolder().setFormat(-2);
    this.y = new Path();
    setDrawingCacheEnabled(true);
  }
  
  private boolean a(Calendar paramCalendar)
  {
    if (this.i == null) {}
    int i1;
    do
    {
      return false;
      i1 = paramCalendar.get(5);
    } while (!this.i.contains(Integer.valueOf(i1)));
    return true;
  }
  
  private Point b(Calendar paramCalendar)
  {
    return new Point(this.k.getColumnOf(paramCalendar.get(5)), this.k.getRowOf(paramCalendar.get(5)));
  }
  
  private void b()
  {
    this.e = ((this.c - 2.0F) / 7.0F);
    this.f = ((this.a - 2.0F) / 6.0F);
    this.b = (this.f / 2.0F);
    if (!this.p)
    {
      this.q = ((int)(this.f / 2.0F + this.b / 3.0F));
      return;
    }
    this.r = ((int)(0.28D * this.f));
    if (this.e < 6 + 4 * this.r) {
      this.r = ((int)(this.e / 4.0F - 2.0F));
    }
    this.q = ((int)(this.f / 2.0F + this.b / 3.0F - this.r / 2));
  }
  
  private void b(Canvas paramCanvas)
  {
    int i1 = 1;
    this.l.setColor(Color.parseColor("#6A6A6A"));
    for (int i2 = i1; i2 <= 5; i2++)
    {
      this.y.moveTo(0.0F, this.f * i2);
      this.y.lineTo(this.c, this.f * i2);
    }
    while (i1 <= 6)
    {
      this.y.moveTo(this.e * i1, 0.0F);
      this.y.lineTo(this.e * i1, this.a);
      i1++;
    }
    paramCanvas.drawPath(this.y, this.l);
  }
  
  public GregorianCalendar a(int paramInt1, int paramInt2)
  {
    int i1 = this.k.getDayAt(paramInt2, paramInt1);
    GregorianCalendar localGregorianCalendar = new GregorianCalendar(this.k.getYear(), this.k.getMonth(), i1);
    if (paramInt2 == 0) {
      if (i1 > 7) {
        localGregorianCalendar.set(2, -1 + this.k.getMonth());
      }
    }
    while (((paramInt2 != 4) && (paramInt2 != 5)) || (i1 >= 14)) {
      return localGregorianCalendar;
    }
    localGregorianCalendar.set(2, 1 + this.k.getMonth());
    return localGregorianCalendar;
  }
  
  public void a()
  {
    if ((this.w == null) && (this.v != null) && (this.v.getLatitude() != -666.0D)) {
      new CalendarView.CalendarAsyncTask(this).h();
    }
  }
  
  public Calendar getCalendar()
  {
    return this.x;
  }
  
  public Location getLocation()
  {
    return this.v;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    if (!this.d)
    {
      this.a = getMeasuredHeight();
      this.c = getMeasuredWidth();
      b();
      this.d = true;
    }
    this.l.setColor(-1);
    a(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0)
    {
      this.j = true;
      this.g = paramMotionEvent.getX();
      this.h = paramMotionEvent.getY();
    }
    while (!this.j)
    {
      return super.onTouchEvent(paramMotionEvent);
      if ((paramMotionEvent.getAction() == 1) && (Math.abs(paramMotionEvent.getX() - this.g) <= 25.0F) && (Math.abs(paramMotionEvent.getY() - this.h) <= 25.0F) && (this.j))
      {
        for (int i1 = 0; i1 < this.u.size(); i1++)
        {
          GregorianCalendar localGregorianCalendar = a(paramMotionEvent.getX(), paramMotionEvent.getY());
          ((CalendarView.OnCellSelectedListener)this.u.get(i1)).a(localGregorianCalendar, a(localGregorianCalendar));
        }
        return true;
      }
    }
    if ((paramMotionEvent.getAction() == 2) && (this.j) && ((Math.abs(paramMotionEvent.getX() - this.g) >= 25.0F) || (Math.abs(paramMotionEvent.getY() - this.h) >= 25.0F)))
    {
      this.j = false;
      return false;
    }
    return true;
  }
  
  public void setLocation(LocationData paramLocationData)
  {
    if (this.v != null)
    {
      this.v.setLongitude(paramLocationData.e());
      this.v.setLatitude(paramLocationData.c());
    }
  }
  
  public void setOnCellSelectedListener(CalendarView.OnCellSelectedListener paramOnCellSelectedListener)
  {
    this.u.add(paramOnCellSelectedListener);
  }
  
  public void setSelectedDay(Calendar paramCalendar)
  {
    this.o = paramCalendar;
    invalidate();
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.CalendarView
 * JD-Core Version:    0.7.0.1
 */