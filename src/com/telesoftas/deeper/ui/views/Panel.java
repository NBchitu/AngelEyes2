package com.telesoftas.deeper.ui.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.fridaylab.deeper.R.styleable;

public class Panel
  extends LinearLayout
{
  View.OnTouchListener a = new Panel.1(this);
  Runnable b = new Panel.2(this);
  private boolean c;
  private final int d;
  private final int e;
  private final boolean f;
  private ImageView g;
  private View h;
  private Drawable i;
  private Drawable j;
  private final int k;
  private final int l;
  private float m;
  private float n;
  private float o;
  private Panel.OnPanelListener p;
  private Panel.State q;
  private Interpolator r;
  private final GestureDetector s;
  private int t;
  private int u;
  private final int v;
  private final Panel.PanelOnGestureListener w;
  private final Context x;
  
  public Panel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.x = paramContext;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.Panel);
    this.e = localTypedArray.getInteger(0, 750);
    this.d = localTypedArray.getInteger(i1, i1);
    this.f = localTypedArray.getBoolean(2, false);
    this.i = localTypedArray.getDrawable(3);
    this.j = localTypedArray.getDrawable(4);
    this.k = localTypedArray.getResourceId(6, 0);
    this.l = localTypedArray.getResourceId(5, 0);
    localTypedArray.recycle();
    if ((this.d == 0) || (this.d == i1)) {}
    for (;;)
    {
      this.v = i1;
      setOrientation(this.v);
      this.q = Panel.State.c;
      this.w = new Panel.PanelOnGestureListener(this);
      this.s = new GestureDetector(paramContext, this.w);
      this.s.setIsLongpressEnabled(false);
      return;
      i1 = 0;
    }
  }
  
  private float a(float paramFloat, int paramInt1, int paramInt2)
  {
    return Math.min(Math.max(paramFloat, paramInt1), paramInt2);
  }
  
  private void b()
  {
    if ((this.c) && (this.j != null)) {
      this.g.setImageDrawable(this.j);
    }
    for (;;)
    {
      if (this.p != null)
      {
        if (!this.c) {
          break;
        }
        this.p.b(this);
      }
      return;
      if ((!this.c) && (this.i != null)) {
        this.g.setImageDrawable(this.i);
      }
    }
    this.p.a(this);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1 ^ a())) {
      if (paramBoolean1) {
        break label56;
      }
    }
    label56:
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      if (!paramBoolean2) {
        break;
      }
      this.q = Panel.State.a;
      if (!this.c) {
        this.h.setVisibility(0);
      }
      post(this.b);
      return;
    }
    View localView = this.h;
    int i1 = 0;
    if (paramBoolean1) {}
    for (;;)
    {
      localView.setVisibility(i1);
      b();
      return;
      i1 = 8;
    }
  }
  
  public boolean a()
  {
    return this.h.getVisibility() == 0;
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    int i1;
    if ((this.q == Panel.State.a) && (!this.c))
    {
      if (this.v != 1) {
        break label101;
      }
      i1 = this.t;
      if ((this.d == 2) || (this.d == 0)) {
        i1 = -i1;
      }
      if (this.v != 1) {
        break label109;
      }
      paramCanvas.translate(0.0F, i1);
    }
    for (;;)
    {
      if ((this.q == Panel.State.d) || (this.q == Panel.State.e)) {
        paramCanvas.translate(this.m, this.n);
      }
      super.dispatchDraw(paramCanvas);
      return;
      label101:
      i1 = this.u;
      break;
      label109:
      paramCanvas.translate(i1, 0.0F);
    }
  }
  
  public View getContent()
  {
    return this.h;
  }
  
  public GestureDetector getGestureListener()
  {
    return this.s;
  }
  
  public View getHandle()
  {
    return this.g;
  }
  
  protected void onAnimationEnd()
  {
    super.onAnimationEnd();
    this.q = Panel.State.c;
    if (this.c) {
      this.h.setVisibility(8);
    }
    b();
  }
  
  protected void onAnimationStart()
  {
    super.onAnimationStart();
    this.q = Panel.State.b;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.g = ((ImageView)findViewById(this.l));
    if (this.g == null) {
      throw new RuntimeException("handleView attribute is required");
    }
    this.g.setOnTouchListener(this.a);
    this.h = findViewById(this.k);
    if (this.h == null) {
      throw new RuntimeException("contentView attribute is required");
    }
    if ((this.d == 0) || (this.d == 2)) {}
    for (int i1 = 0; getChildAt(i1) != this.h; i1 = 1) {
      throw new IllegalStateException("content is required to be at index " + i1);
    }
    if (this.j != null) {
      this.g.setImageDrawable(this.j);
    }
    this.h.setVisibility(8);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.u = this.h.getWidth();
    this.t = this.h.getHeight();
  }
  
  public void setHandle(int paramInt)
  {
    this.i = this.x.getResources().getDrawable(paramInt);
    this.j = this.x.getResources().getDrawable(paramInt);
    if (this.g != null) {
      this.g.setImageDrawable(this.j);
    }
  }
  
  public void setInterpolator(Interpolator paramInterpolator)
  {
    this.r = paramInterpolator;
  }
  
  public void setOnPanelListener(Panel.OnPanelListener paramOnPanelListener)
  {
    this.p = paramOnPanelListener;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.Panel
 * JD-Core Version:    0.7.0.1
 */