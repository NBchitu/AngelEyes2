package com.telesoftas.deeper.animation;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.fridaylab.deeper.ui.ViewTools;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableListIterator;
import com.telesoftas.deeper.ui.views.Panel;
import com.telesoftas.hardware.DeeperFishDataPacket;
import com.telesoftas.hardware.DeeperRawDataPacket;
import com.telesoftas.hardware.ImagingSignal;
import com.telesoftas.services.DeeperDataManager;
import com.telesoftas.services.Signal;
import com.telesoftas.utilities.deeper.SettingsUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;

public class SceneView
  extends SceneViewAbstract
{
  private ImmutableList<Signal> n;
  private ArrayDeque<DrawingRange> o;
  private float p = 2.0F;
  private ImagingSignal q = null;
  private Panel r;
  private boolean s = false;
  private int t = 0;
  private VerticalFlasher u = null;
  private DialFlasher v = null;
  
  public SceneView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public SceneView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public SceneView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Canvas paramCanvas, int paramInt, float paramFloat, DeeperRawDataPacket paramDeeperRawDataPacket)
  {
    byte[] arrayOfByte = paramDeeperRawDataPacket.b();
    int i = paramInt + (this.j - this.u.a());
    this.u.a(paramCanvas, i, this.a, paramFloat, arrayOfByte);
  }
  
  private void a(Canvas paramCanvas, boolean paramBoolean, DeeperRawDataPacket paramDeeperRawDataPacket)
  {
    int i = getResources().getDimensionPixelOffset(2131230778);
    if (paramBoolean) {}
    for (int j = this.u.a();; j = 0)
    {
      float f1 = 0.5F * (paramCanvas.getWidth() - j);
      float f2 = 0.5F * (paramCanvas.getHeight() - i);
      int k = ViewTools.a(0.8F * f2);
      if ((k >= 280) && (k <= 300)) {
        k = 288;
      }
      this.v.a(paramCanvas, paramDeeperRawDataPacket, ViewTools.a(f1), ViewTools.a(f2), k);
      return;
    }
  }
  
  private void d()
  {
    this.p = 2.0F;
    this.c = 0.85F;
    if (this.o == null) {}
    float f;
    do
    {
      return;
      f = a(this.n, this.o, 3600000000000L);
    } while (f < 0.0F);
    this.p = Math.max(f, 0.0965251F);
    this.c = (0.85F / this.p);
  }
  
  protected void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    this.l.b(paramInt);
    if (this.q != null) {
      this.l.a(-1, -1.0F, this.g.getInt(SettingsUtils.a, 0), -1L, paramFloat);
    }
    for (;;)
    {
      this.l.a(paramBoolean);
      return;
      this.l.a(-1, -1.0F, this.g.getInt(SettingsUtils.a, 0), -1L, -1.0F);
    }
  }
  
  protected void a(Canvas paramCanvas)
  {
    int i;
    boolean bool1;
    label38:
    float f1;
    label52:
    boolean bool2;
    if (this.g.getInt(SettingsUtils.s, 0) == 1)
    {
      i = 1;
      if (this.g.getInt(SettingsUtils.t, 1) != 1) {
        break label158;
      }
      bool1 = true;
      VerticalFlasher localVerticalFlasher = this.u;
      if (i == 0) {
        break label163;
      }
      f1 = 3.0F;
      localVerticalFlasher.a(f1);
      if ((!DeeperDataManager.a().c()) && (this.o != null) && (this.q != null)) {
        break label181;
      }
      if ((!bool1) || ((this.g.getInt(SettingsUtils.b, 1) != 0) && (i == 0))) {
        break label169;
      }
      bool2 = true;
      label109:
      if (!bool2) {
        break label175;
      }
    }
    label158:
    label163:
    label169:
    label175:
    for (int j = this.u.a();; j = 0)
    {
      a(j, 41.439999F, true);
      if (i != 0) {
        a(paramCanvas, bool2, null);
      }
      this.l.a(paramCanvas);
      return;
      i = 0;
      break;
      bool1 = false;
      break label38;
      f1 = 1.0F;
      break label52;
      bool2 = false;
      break label109;
    }
    label181:
    boolean bool3 = this.g.getBoolean(SettingsUtils.f, false);
    a();
    int k;
    int m;
    label226:
    Object localObject1;
    label237:
    int i1;
    label251:
    float f2;
    float f3;
    float f14;
    float f4;
    if (this.q.c() == 1)
    {
      k = 1;
      if ((!bool1) || (k == 0)) {
        break label575;
      }
      m = 1;
      if (m == 0) {
        break label581;
      }
      localObject1 = this.q;
      if (m == 0) {
        break label587;
      }
      i1 = this.u.a();
      f2 = 35.223999F / this.c;
      f3 = this.c;
      if (i == 0) {
        break label895;
      }
      f14 = 0.85F / Math.max(a(this.n, this.o, 5000000000L), 0.06399614F);
      f4 = 35.223999F / f14;
    }
    for (float f5 = f14;; f5 = f3)
    {
      Signal localSignal;
      label366:
      int i2;
      Object localObject2;
      if ((bool1) && (this.o.size() > 1)) {
        if (m == 0)
        {
          localSignal = (Signal)this.n.get(((DrawingRange)Iterators.a(this.o.iterator(), 1)).c());
          if (localSignal.c() != 1) {
            localObject1 = null;
          }
        }
        else
        {
          long l = ((Signal)this.n.get(((DrawingRange)this.o.getFirst()).b())).k();
          float f12 = (float)(System.nanoTime() - l);
          if ((localObject1 != null) && (f12 < 1.0E+009F))
          {
            float f13 = f12 / 1.0E+009F;
            if (m == 0) {
              f13 = 1.0F - f13;
            }
            i2 = (int)(f13 * this.u.a());
            localObject2 = localObject1;
          }
        }
      }
      for (;;)
      {
        label452:
        if ((i != 0) && (this.q != null) && (System.nanoTime() - this.q.k() > 1000000000L))
        {
          localObject2 = null;
          this.q = null;
        }
        if (localObject2 != null) {
          a(paramCanvas, this.u.a() - i2, f5, (DeeperRawDataPacket)localObject2);
        }
        if ((i != 0) && (k != 0))
        {
          a(paramCanvas, bool1, (DeeperRawDataPacket)this.q);
          label538:
          if ((m == 0) && (i != 0)) {
            break label860;
          }
        }
        label575:
        label581:
        label587:
        label860:
        for (boolean bool4 = true;; bool4 = false)
        {
          a(i2, f4, bool4);
          this.l.a(paramCanvas);
          return;
          k = 0;
          break;
          m = 0;
          break label226;
          localObject1 = null;
          break label237;
          i1 = 0;
          break label251;
          if (m != 0) {
            break label866;
          }
          i2 = i1;
          localObject2 = null;
          break label452;
          float f6 = i2;
          this.d.a(i2);
          Iterator localIterator = this.o.iterator();
          float f11;
          for (float f7 = f6; localIterator.hasNext(); f7 = f11)
          {
            DrawingRange localDrawingRange = (DrawingRange)localIterator.next();
            float f8 = ((Signal)this.n.get(localDrawingRange.b())).a(getContext());
            float f9 = f8 * localDrawingRange.d();
            float f10 = this.j - f7;
            f11 = f7 + f9;
            RectF localRectF = new RectF(f10 - f9, this.a, f10, this.k);
            ImmutableList localImmutableList = this.n.a(localDrawingRange.b(), 1 + localDrawingRange.c());
            DataRenderer localDataRenderer = a(localDrawingRange.a());
            if (localDataRenderer != null)
            {
              int i3 = (int)(this.t + i2 / f8);
              this.f.a(localDataRenderer, paramCanvas, localRectF, this.c, localImmutableList, i3);
              if ((bool3) && (localDrawingRange.a() == 1)) {
                this.f.a(this.d, paramCanvas, localRectF, this.c, localImmutableList, i3);
              }
            }
          }
          this.f.a();
          break label538;
        }
        label866:
        i2 = i1;
        localObject2 = localObject1;
        continue;
        localObject1 = localSignal;
        break label366;
        i2 = i1;
        localObject2 = localObject1;
      }
      label895:
      f4 = f2;
    }
  }
  
  public void a(Renderable paramRenderable, DataRenderer<DeeperFishDataPacket> paramDataRenderer, DataRenderer<Signal> paramDataRenderer1)
  {
    this.d = new DetectedFishes(DetectedFishes.a(getResources()), this.h);
    super.a(paramRenderable, paramDataRenderer, paramDataRenderer1);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject1 = null;
    this.s = paramBoolean2;
    this.q = null;
    ImmutableList localImmutableList = DeeperDataManager.a().a(getContext(), this.j);
    ArrayDeque localArrayDeque = new ArrayDeque();
    UnmodifiableListIterator localUnmodifiableListIterator = localImmutableList.a(localImmutableList.size());
    float f1 = 0.0F;
    int i = 2147483647;
    int j;
    Signal localSignal;
    int k;
    if (localUnmodifiableListIterator.hasPrevious())
    {
      j = localUnmodifiableListIterator.previousIndex();
      localSignal = (Signal)localUnmodifiableListIterator.previous();
      k = localSignal.c();
      if ((localObject1 != null) && (i == k)) {
        break label286;
      }
      DrawingRange localDrawingRange = new DrawingRange(k, j, j);
      localArrayDeque.addLast(localDrawingRange);
      localObject1 = localDrawingRange;
    }
    for (;;)
    {
      localObject1.a(j);
      if ((this.q == null) && ((localSignal instanceof ImagingSignal))) {
        this.q = ((ImagingSignal)localSignal);
      }
      float f2 = f1 + localSignal.a(getContext());
      if (f2 >= this.j) {
        if (localObject1 != null) {
          break label222;
        }
      }
      for (;;)
      {
        try
        {
          this.o = null;
          return;
        }
        finally
        {
          label222:
          if (this.r.a()) {
            continue;
          }
          invalidate();
        }
        f1 = f2;
        i = k;
        break;
        this.o = localArrayDeque;
        this.n = localImmutableList;
        if (paramBoolean1)
        {
          d();
          this.t = (1 + this.t);
        }
        if (!this.r.a())
        {
          invalidate();
          return;
        }
      }
      label286:
      k = i;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    b(paramCanvas);
    a(paramCanvas);
    if ((this.l != null) && (this.s)) {
      this.l.a(this);
    }
    super.onDraw(paramCanvas);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.j == 0) {}
    for (int i = 1;; i = 0)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      if ((i != 0) && (this.j > 0))
      {
        this.u = new VerticalFlasher(this, getResources().getDimensionPixelOffset(2131230775), this.k - this.a);
        this.v = new DialFlasher(getContext());
      }
      return;
    }
  }
  
  public void setHistoryPanel(Panel paramPanel)
  {
    this.r = paramPanel;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.animation.SceneView
 * JD-Core Version:    0.7.0.1
 */