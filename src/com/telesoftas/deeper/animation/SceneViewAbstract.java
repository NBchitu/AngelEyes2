package com.telesoftas.deeper.animation;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.telesoftas.hardware.DeeperFishDataPacket;
import com.telesoftas.hardware.ImagingSignal;
import com.telesoftas.services.DeeperDataManager;
import com.telesoftas.services.Signal;
import java.util.Collection;
import java.util.Iterator;

public abstract class SceneViewAbstract
  extends ImageView
{
  protected static final Predicate<DrawingRange> m = new SceneViewAbstract.1();
  protected int a;
  protected int b;
  protected float c;
  protected DetectedFishes d;
  protected DataRenderer<DeeperFishDataPacket> e;
  protected RenderingScheduler f;
  protected SharedPreferences g = null;
  protected final RenderSettings h = new RenderSettings();
  protected int i;
  protected int j;
  protected int k;
  protected DepthScale l = null;
  private Renderable n;
  private DataRenderer<Signal> o;
  private DataRenderer<Signal> p;
  private Paint q;
  
  public SceneViewAbstract(Context paramContext)
  {
    super(paramContext);
  }
  
  public SceneViewAbstract(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public SceneViewAbstract(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  protected static float a(ImmutableList<Signal> paramImmutableList, Collection<DrawingRange> paramCollection, long paramLong)
  {
    long l1 = System.nanoTime();
    Iterator localIterator = Iterables.a(paramCollection, m).iterator();
    float f1 = -1.0F;
    label113:
    while (localIterator.hasNext())
    {
      DrawingRange localDrawingRange = (DrawingRange)localIterator.next();
      int i1 = localDrawingRange.c();
      int i2 = localDrawingRange.b();
      for (;;)
      {
        if (i1 < i2) {
          break label113;
        }
        ImagingSignal localImagingSignal = (ImagingSignal)paramImmutableList.get(i1);
        if (l1 - localImagingSignal.k() > paramLong) {
          break;
        }
        float f2 = localImagingSignal.f();
        if (f2 > f1) {
          f1 = f2;
        }
        i1--;
      }
    }
    return f1;
  }
  
  protected DataRenderer<Signal> a(int paramInt)
  {
    if (paramInt == 2) {
      return this.o;
    }
    if (paramInt == 1) {
      return this.p;
    }
    return null;
  }
  
  protected void a()
  {
    this.o.a();
    this.p.a();
  }
  
  public void a(Context paramContext)
  {
    this.c = 1.0F;
    this.q = new Paint();
    this.q.setColor(-65536);
    this.q.setStyle(Paint.Style.STROKE);
    this.q.setStrokeWidth(5.0F);
    this.g = paramContext.getSharedPreferences("prefs", 0);
  }
  
  public void a(Renderable paramRenderable, DataRenderer<DeeperFishDataPacket> paramDataRenderer, DataRenderer<Signal> paramDataRenderer1)
  {
    this.n = paramRenderable;
    this.e = paramDataRenderer;
    this.p = paramDataRenderer1;
    this.o = new ProcessedSignalRenderer(this.e, this.d);
    this.f = new RenderingScheduler(this.p);
  }
  
  public void b()
  {
    this.j = 0;
  }
  
  protected void b(Canvas paramCanvas)
  {
    this.n.a(paramCanvas);
  }
  
  public void c()
  {
    this.n.b();
    this.d.b();
    this.e.b();
    this.p.b();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    setWillNotDraw(false);
    if (this.j == 0)
    {
      this.j = getWidth();
      Resources localResources = getResources();
      this.a = localResources.getDimensionPixelOffset(2131230779);
      this.b = localResources.getDimensionPixelOffset(2131230778);
      this.k = getHeight();
      this.i = (this.k - this.a - this.b);
      this.l = new DepthScale(getContext(), this.i, this.j, this.a, this.k);
      this.l.a(this.l.b() - this.l.a());
      DeeperDataManager.a().a(3);
      this.n.a(this);
      this.e.a(this);
      this.d.a(this);
      this.o.a(this);
      this.p.a(this);
    }
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setShowFishDepth(boolean paramBoolean)
  {
    this.h.a(paramBoolean);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.SceneViewAbstract
 * JD-Core Version:    0.7.0.1
 */