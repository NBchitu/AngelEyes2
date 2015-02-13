package com.telesoftas.deeper.ui.views;

import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;

class Panel$2
  implements Runnable
{
  Panel$2(Panel paramPanel) {}
  
  public void run()
  {
    int i = 1;
    label60:
    int i5;
    int i2;
    if (Panel.h(this.a) == Panel.State.e)
    {
      Panel localPanel3 = this.a;
      if ((Panel.c(this.a) == 0) || (Panel.c(this.a) == 2))
      {
        int i8 = i;
        if (Panel.i(this.a) <= 0.0F) {
          break label343;
        }
        int i10 = i;
        Panel.a(localPanel3, i8 ^ i10);
      }
    }
    else
    {
      if (Panel.b(this.a) != i) {
        break label432;
      }
      i5 = Panel.e(this.a);
      if (Panel.j(this.a)) {
        break label349;
      }
      if (Panel.c(this.a) == 0) {
        i5 = -i5;
      }
      i2 = i5;
      i5 = 0;
      label123:
      if (Panel.h(this.a) != Panel.State.d) {
        break label375;
      }
      if (Math.abs(Panel.k(this.a) - i2) >= Math.abs(Panel.k(this.a) - i5)) {
        break label806;
      }
      Panel localPanel2 = this.a;
      if (Panel.j(this.a)) {
        break label370;
      }
      label184:
      Panel.a(localPanel2, i);
    }
    for (;;)
    {
      int i6 = (int)Panel.k(this.a);
      int i7 = i2;
      i2 = i6;
      i5 = i7;
      label213:
      if ((Panel.h(this.a) == Panel.State.e) && (Panel.l(this.a))) {}
      int n;
      int i1;
      label343:
      label349:
      label370:
      boolean bool;
      for (int m = Math.max((int)(1000.0F * Math.abs((i5 - i2) / Panel.i(this.a))), 20) / 2;; m = Panel.m(this.a) * Math.abs(i5 - i2) / Panel.e(this.a) / 4)
      {
        n = 0;
        i1 = i5;
        j = 0;
        Panel.a(this.a, Panel.b(this.a, 0.0F));
        if (m != 0) {
          break label703;
        }
        Panel.a(this.a, Panel.State.c);
        if (Panel.j(this.a)) {
          Panel.a(this.a).setVisibility(8);
        }
        Panel.o(this.a);
        return;
        int i9 = 0;
        break;
        int i11 = 0;
        break label60;
        if (Panel.c(this.a) == 0) {
          i5 = -i5;
        }
        i2 = 0;
        break label123;
        bool = false;
        break label184;
        label375:
        if (Panel.h(this.a) != Panel.State.e) {
          break label213;
        }
        i2 = (int)Panel.k(this.a);
        break label213;
      }
      label432:
      int j = Panel.d(this.a);
      int k;
      if (!Panel.j(this.a))
      {
        if (Panel.c(this.a) == 2) {
          j = -j;
        }
        k = j;
        j = 0;
        label468:
        if (Panel.h(this.a) != Panel.State.d) {
          break label640;
        }
        if (Math.abs(Panel.n(this.a) - k) >= Math.abs(Panel.n(this.a) - j)) {
          break label801;
        }
        Panel localPanel1 = this.a;
        if (Panel.j(this.a)) {
          break label635;
        }
        label527:
        Panel.a(localPanel1, bool);
      }
      for (;;)
      {
        int i3 = (int)Panel.n(this.a);
        int i4 = k;
        k = i3;
        j = i4;
        for (;;)
        {
          if ((Panel.h(this.a) != Panel.State.e) || (!Panel.l(this.a))) {
            break label665;
          }
          m = Math.max((int)(1000.0F * Math.abs((j - k) / Panel.i(this.a))), 20) / 2;
          n = k;
          i1 = 0;
          i2 = 0;
          break;
          if (Panel.c(this.a) == 2) {
            j = -j;
          }
          k = 0;
          break label468;
          label635:
          bool = false;
          break label527;
          label640:
          if (Panel.h(this.a) == Panel.State.e) {
            k = (int)Panel.n(this.a);
          }
        }
        label665:
        m = Panel.m(this.a) * Math.abs(j - k) / Panel.d(this.a) / 2;
        n = k;
        i1 = 0;
        i2 = 0;
        break;
        label703:
        TranslateAnimation localTranslateAnimation = new TranslateAnimation(n, j, i2, i1);
        localTranslateAnimation.setDuration(m);
        if ((Panel.h(this.a) == Panel.State.e) && (Panel.l(this.a))) {
          localTranslateAnimation.setInterpolator(new LinearInterpolator());
        }
        for (;;)
        {
          this.a.startAnimation(localTranslateAnimation);
          return;
          if (Panel.p(this.a) != null) {
            localTranslateAnimation.setInterpolator(Panel.p(this.a));
          }
        }
        label801:
        k = j;
      }
      label806:
      i2 = i5;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.telesoftas.deeper.ui.views.Panel.2
 * JD-Core Version:    0.7.0.1
 */