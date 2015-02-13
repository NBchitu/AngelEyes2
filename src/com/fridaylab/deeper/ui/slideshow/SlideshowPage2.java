package com.fridaylab.deeper.ui.slideshow;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.fridaylab.deeper.ui.PulsingImageView;
import com.fridaylab.deeper.ui.SwitchInterpolator;

public class SlideshowPage2
  extends SlideshowPageFragment
{
  private PulsingImageView aj;
  private PulsingImageView ak;
  private PulsingImageView al;
  private PulsingImageView am;
  private PulsingImageView an;
  private PulsingImageView ao;
  private PulsingImageView ap;
  private PulsingImageView aq;
  private PulsingImageView ar;
  private final Runnable as = new SlideshowPage2.1(this);
  private int h = 0;
  private float i;
  
  private void R()
  {
    this.aj.a(this.i);
    this.ak.a(this.i);
    this.al.a(this.i);
    this.am.a(this.i);
    this.an.a(this.i);
    this.ao.a(this.i);
    this.ap.a(this.i);
    this.aq.a(this.i);
    this.ar.a(this.i);
  }
  
  public static SlideshowPage2 a(int paramInt1, int paramInt2)
  {
    SlideshowPage2 localSlideshowPage2 = new SlideshowPage2();
    localSlideshowPage2.g(a(2130903086, paramInt1, paramInt2));
    return localSlideshowPage2;
  }
  
  public void P()
  {
    super.P();
    this.i = this.aj.a();
    this.ak.a();
    this.al.a();
    this.am.a();
    this.an.a();
    this.ao.a();
    this.ap.a();
    this.aq.a();
    this.ar.a();
  }
  
  public void Q()
  {
    super.Q();
    this.b.removeCallbacks(this.as);
    this.h = 0;
    this.i = 0.0F;
    this.aj.b();
    this.ak.b();
    this.al.b();
    this.am.b();
    this.an.b();
    this.ao.b();
    this.ap.b();
    this.aq.b();
    this.ar.b();
  }
  
  protected boolean a()
  {
    TextView localTextView = (TextView)this.a.findViewById(2131296553);
    localTextView.setLayoutParams(b(164.0F, 38.0F, 772.0F, 236.0F));
    localTextView.setTextSize(0, b(64.0F));
    this.aj = ((PulsingImageView)this.a.findViewById(2131296548));
    this.ak = ((PulsingImageView)this.a.findViewById(2131296549));
    this.al = ((PulsingImageView)this.a.findViewById(2131296550));
    this.am = ((PulsingImageView)this.a.findViewById(2131296555));
    this.an = ((PulsingImageView)this.a.findViewById(2131296556));
    this.ao = ((PulsingImageView)this.a.findViewById(2131296557));
    this.ap = ((PulsingImageView)this.a.findViewById(2131296558));
    this.aq = ((PulsingImageView)this.a.findViewById(2131296559));
    this.ar = ((PulsingImageView)this.a.findViewById(2131296560));
    this.aj.setLayoutParams(a(863.0F, 316.0F, 141.0F, 141.0F));
    this.ak.setLayoutParams(a(948.0F, 220.0F, 144.0F, 323.0F));
    this.al.setLayoutParams(a(958.0F, 170.0F, 197.0F, 417.0F));
    this.am.setLayoutParams(a(971.0F, 123.0F, 246.0F, 503.0F));
    this.an.setLayoutParams(a(1405.0F, 600.0F, 76.0F, 113.0F));
    this.ao.setLayoutParams(a(329.0F, 498.0F, 437.0F, 208.0F));
    this.ap.setLayoutParams(a(279.0F, 521.0F, 543.0F, 243.0F));
    this.aq.setLayoutParams(a(210.0F, 543.0F, 714.0F, 294.0F));
    this.ar.setLayoutParams(a(160.0F, 577.0F, 796.0F, 364.0F));
    this.i = 0.0F;
    this.aj.a(2600, new SwitchInterpolator(0.25F, 0.35F, 0.2F));
    this.ak.a(2600, new SwitchInterpolator(0.5F, 0.0F, 0.2F));
    this.al.a(2600, new SwitchInterpolator(0.6F, 0.0F, 0.2F));
    this.am.a(2600, new SwitchInterpolator(0.7F, 0.0F, 0.2F));
    this.an.a(260000, new SwitchInterpolator(0.008F, 0.982F, 0.0004F));
    this.ao.a(2600, new SwitchInterpolator(0.0F, 0.0F, 0.2F));
    this.ap.a(2600, new SwitchInterpolator(0.075F, 0.0F, 0.2F));
    this.aq.a(2600, new SwitchInterpolator(0.15F, 0.0F, 0.2F));
    this.ar.a(2600, new SwitchInterpolator(0.225F, 0.0F, 0.2F));
    return true;
  }
  
  public void b()
  {
    super.b();
    this.b.post(this.as);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.slideshow.SlideshowPage2
 * JD-Core Version:    0.7.0.1
 */