package com.telesoftas.deeper.ui.views;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class Panel$1
  implements View.OnTouchListener
{
  int a;
  int b;
  boolean c;
  
  Panel$1(Panel paramPanel) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = -1;
    int j = paramMotionEvent.getAction();
    if (j == 0)
    {
      this.a = 0;
      this.b = 0;
      if (Panel.a(this.d).getVisibility() == 8)
      {
        if (Panel.b(this.d) != 1) {
          break label111;
        }
        if (Panel.c(this.d) == 0) {
          this.b = i;
        }
      }
      else
      {
        this.c = true;
      }
    }
    for (;;)
    {
      if ((!Panel.g(this.d).onTouchEvent(paramMotionEvent)) && (j == 1)) {
        this.d.post(this.d.b);
      }
      return false;
      i = 1;
      break;
      label111:
      if (Panel.c(this.d) == 2) {}
      for (;;)
      {
        this.a = i;
        break;
        i = 1;
      }
      if (this.c)
      {
        this.a *= Panel.d(this.d);
        this.b *= Panel.e(this.d);
        Panel.f(this.d).a(this.a, this.b);
        this.c = false;
        this.a = (-this.a);
        this.b = (-this.b);
      }
      paramMotionEvent.offsetLocation(this.a, this.b);
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.Panel.1
 * JD-Core Version:    0.7.0.1
 */