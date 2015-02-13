package com.fridaylab.deeper.ui;

import android.os.Handler;
import android.widget.TextView;

class ColorOscillator$ColorFlipper
  implements Runnable
{
  private final Handler b;
  private final TextView c;
  private boolean d = false;
  
  public ColorOscillator$ColorFlipper(ColorOscillator paramColorOscillator, Handler paramHandler, TextView paramTextView)
  {
    this.b = paramHandler;
    this.c = paramTextView;
  }
  
  public void a()
  {
    this.b.removeCallbacks(this);
  }
  
  public void run()
  {
    TextView localTextView = this.c;
    int i;
    if (this.d)
    {
      i = ColorOscillator.a(this.a);
      localTextView.setTextColor(i);
      if (this.d) {
        break label68;
      }
    }
    label68:
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      this.b.postDelayed(this, ColorOscillator.c(this.a));
      return;
      i = ColorOscillator.b(this.a);
      break;
    }
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.ColorOscillator.ColorFlipper
 * JD-Core Version:    0.7.0.1
 */