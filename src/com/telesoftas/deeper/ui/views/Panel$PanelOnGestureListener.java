package com.telesoftas.deeper.ui.views;

import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;

class Panel$PanelOnGestureListener
  implements GestureDetector.OnGestureListener
{
  float a;
  float b;
  
  Panel$PanelOnGestureListener(Panel paramPanel) {}
  
  public void a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.a = paramInt2;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    this.a = 0.0F;
    this.b = 0.0F;
    if (Panel.h(this.c) != Panel.State.c) {
      return false;
    }
    Panel.a(this.c, Panel.State.a);
    Panel localPanel = this.c;
    if (Panel.a(this.c).getVisibility() == 0) {}
    for (boolean bool = true;; bool = false)
    {
      Panel.a(localPanel, bool);
      if (!Panel.j(this.c)) {
        Panel.a(this.c).setVisibility(0);
      }
      return true;
    }
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    Panel.a(this.c, Panel.State.e);
    Panel localPanel = this.c;
    if (Panel.b(this.c) == 1) {}
    for (;;)
    {
      Panel.c(localPanel, paramFloat2);
      this.c.post(this.c.b);
      return true;
      paramFloat2 = paramFloat1;
    }
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    float f1 = 0.0F;
    Panel.a(this.c, Panel.State.d);
    float f2;
    if (Panel.b(this.c) == 1)
    {
      this.a -= paramFloat2;
      if (Panel.c(this.c) == 0) {
        f2 = Panel.a(this.c, this.a, -Panel.e(this.c), 0);
      }
    }
    for (;;)
    {
      if ((f1 != Panel.n(this.c)) || (f2 != Panel.k(this.c)))
      {
        Panel.a(this.c, f1);
        Panel.b(this.c, f2);
        this.c.invalidate();
      }
      return true;
      f2 = Panel.a(this.c, this.a, 0, Panel.e(this.c));
      f1 = 0.0F;
      continue;
      this.b -= paramFloat1;
      if (Panel.c(this.c) == 2)
      {
        f1 = Panel.a(this.c, this.b, -Panel.d(this.c), 0);
        f2 = 0.0F;
      }
      else
      {
        f1 = Panel.a(this.c, this.b, 0, Panel.d(this.c));
        f2 = 0.0F;
      }
    }
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    this.c.post(this.c.b);
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.Panel.PanelOnGestureListener
 * JD-Core Version:    0.7.0.1
 */