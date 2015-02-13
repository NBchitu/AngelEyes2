package com.telesoftas.deeper.animation;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.telesoftas.hardware.DeeperFishDataPacket;
import com.telesoftas.hardware.ImagingSignal;
import com.telesoftas.services.Signal;
import com.telesoftas.utilities.MathUtils;
import com.telesoftas.utilities.deeper.SettingsUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;

public class HistorySceneView
  extends SceneViewAbstract
{
  private ImmutableList<Signal> n;
  private ArrayDeque<DrawingRange> o;
  private float p;
  private int q = 0;
  private int r = 0;
  private SeekBar s = null;
  private boolean t = false;
  private float u = 41.439999F;
  
  public HistorySceneView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public HistorySceneView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public HistorySceneView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private int a(float paramFloat)
  {
    return (int)Math.max(Math.min(paramFloat, 0.0F), this.j - this.r);
  }
  
  private void d()
  {
    float f = a(this.n, this.o, 3600000000000L);
    if (f < 0.0F)
    {
      this.u = 41.439999F;
      this.c = 0.85F;
      return;
    }
    this.u = Math.max(f * 41.439999F, 4.0F);
    this.c = (0.85F / (this.u / 41.439999F));
  }
  
  protected void a(Canvas paramCanvas)
  {
    if (this.o == null) {
      return;
    }
    boolean bool = this.g.getBoolean(SettingsUtils.f, false);
    a();
    float f1 = this.j;
    Object localObject1 = null;
    Iterator localIterator = this.o.iterator();
    float f2 = f1;
    float f4;
    float f5;
    float f6;
    float f7;
    label245:
    float f8;
    label296:
    Object localObject2;
    for (;;)
    {
      if (localIterator.hasNext())
      {
        DrawingRange localDrawingRange = (DrawingRange)localIterator.next();
        float f3 = ((Signal)this.n.get(localDrawingRange.b())).a(getContext());
        f4 = f2 - f3 * localDrawingRange.d();
        f5 = f4 + this.q + this.r - this.j;
        f6 = f2 + this.q + this.r - this.j;
        if (f5 > this.j)
        {
          f2 = f4;
        }
        else
        {
          int i = localDrawingRange.b();
          int j = 1 + localDrawingRange.c();
          if (f6 > this.j)
          {
            int m = MathUtils.a(-1 + (int)Math.floor((f6 - this.j) / f3), 0, -1 + localDrawingRange.d());
            j -= m;
            f7 = f6 - f3 * m;
            if (f5 < 0.0F)
            {
              int k = MathUtils.a(-1 + (int)Math.floor(-f5 / f3), 0, -1 + localDrawingRange.d());
              i += k;
              f8 = f5 + f3 * k;
              RectF localRectF = new RectF(f8, this.a, f7, this.k);
              ImmutableList localImmutableList = this.n.a(i, j);
              if (localObject1 == null)
              {
                localObject2 = (Signal)this.n.get(j - 1);
                label353:
                DataRenderer localDataRenderer = a(localDrawingRange.a());
                if (localDataRenderer != null)
                {
                  this.f.a(localDataRenderer, paramCanvas, localRectF, this.c, localImmutableList, j);
                  if ((bool) && (localDrawingRange.a() == 1)) {
                    this.f.a(this.d, paramCanvas, localRectF, this.c, localImmutableList, j);
                  }
                }
                if (f8 > 0.0F) {
                  break;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      this.f.a();
      setScaleData((Signal)localObject2);
      this.l.a(paramCanvas);
      return;
      localObject1 = localObject2;
      f2 = f4;
      break;
      localObject2 = localObject1;
      break label353;
      f8 = f5;
      break label296;
      f7 = f6;
      break label245;
      localObject2 = localObject1;
    }
  }
  
  public void a(Renderable paramRenderable, DataRenderer<DeeperFishDataPacket> paramDataRenderer, DataRenderer<Signal> paramDataRenderer1)
  {
    this.d = new DetectedFishes(DetectedFishes.a(getResources()), this.h);
    super.a(paramRenderable, paramDataRenderer, paramDataRenderer1);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    b(paramCanvas);
    a(paramCanvas);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.t)
    {
      this.s.setPadding(this.s.getPaddingLeft(), this.s.getPaddingTop(), this.j - this.l.b() + this.s.getPaddingRight(), this.s.getPaddingBottom());
      this.t = true;
      this.l.b(false);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.r < this.j) {
      return true;
    }
    if (paramMotionEvent.getAction() == 0) {
      this.p = paramMotionEvent.getX();
    }
    for (;;)
    {
      if (this.s != null) {
        this.s.setProgress(-this.q);
      }
      invalidate();
      return true;
      if (paramMotionEvent.getAction() == 2)
      {
        float f = paramMotionEvent.getX();
        this.q = a(f - this.p + this.q);
        this.p = f;
      }
    }
  }
  
  public void setData(ImmutableList<Signal> paramImmutableList)
  {
    ArrayDeque localArrayDeque = new ArrayDeque();
    int i = 2147483647;
    UnmodifiableListIterator localUnmodifiableListIterator = paramImmutableList.a(paramImmutableList.size());
    float f = 0.0F;
    Object localObject1 = null;
    int j;
    Signal localSignal;
    Object localObject2;
    if (localUnmodifiableListIterator.hasPrevious())
    {
      j = localUnmodifiableListIterator.previousIndex();
      localSignal = (Signal)localUnmodifiableListIterator.previous();
      int k = localSignal.c();
      if ((localObject1 != null) && (i == k)) {
        break label257;
      }
      DrawingRange localDrawingRange = new DrawingRange(k, j, j);
      localArrayDeque.addLast(localDrawingRange);
      localObject2 = localDrawingRange;
      i = k;
    }
    for (;;)
    {
      ((DrawingRange)localObject2).a(j);
      f += localSignal.a(getContext());
      localObject1 = localObject2;
      break;
      if (localObject1 == null)
      {
        this.o = null;
        return;
      }
      this.o = localArrayDeque;
      this.n = paramImmutableList;
      this.r = ((int)f);
      this.q = (this.j - this.r);
      if (this.s != null)
      {
        if (this.r <= this.j) {
          break label232;
        }
        this.s.setEnabled(true);
        this.s.setMax(this.r - this.j);
        this.s.setProgress(this.r);
      }
      for (;;)
      {
        d();
        return;
        label232:
        this.s.setProgress(this.s.getMax());
        this.s.setEnabled(false);
      }
      label257:
      localObject2 = localObject1;
    }
  }
  
  public void setHistorySeekBar(SeekBar paramSeekBar)
  {
    this.s = paramSeekBar;
    paramSeekBar.setOnSeekBarChangeListener(new HistorySceneView.1(this));
  }
  
  protected void setScaleData(Signal paramSignal)
  {
    int i = this.g.getInt(SettingsUtils.a, 0);
    if (!(paramSignal instanceof ImagingSignal))
    {
      this.l.a(666, 41.439999F, i, -1L, this.u);
      return;
    }
    ImagingSignal localImagingSignal = (ImagingSignal)paramSignal;
    this.l.a(localImagingSignal.i(), localImagingSignal.g(), i, localImagingSignal.h(), this.u);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.HistorySceneView
 * JD-Core Version:    0.7.0.1
 */