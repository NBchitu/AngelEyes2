package com.fridaylab.deeper.ui.slideshow;

import android.content.res.Resources;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.fridaylab.deeper.ui.PulsingImageView;
import com.fridaylab.deeper.ui.SwitchInterpolator;

public class SlideshowPage1
  extends SlideshowPageFragment
{
  private PulsingImageView aj;
  private PulsingImageView ak;
  private PulsingImageView al;
  private final Runnable am = new SlideshowPage1.1(this);
  private int h = 0;
  private float i;
  
  public static SlideshowPage1 a(int paramInt1, int paramInt2)
  {
    SlideshowPage1 localSlideshowPage1 = new SlideshowPage1();
    localSlideshowPage1.g(a(2130903085, paramInt1, paramInt2));
    return localSlideshowPage1;
  }
  
  public void P()
  {
    super.P();
    this.i = this.aj.a();
    this.ak.a();
    this.al.a();
  }
  
  public void Q()
  {
    super.Q();
    this.b.removeCallbacks(this.am);
    this.h = 0;
    this.i = 0.0F;
    this.aj.b();
    this.ak.b();
    this.al.b();
  }
  
  protected boolean a()
  {
    TextView localTextView1 = (TextView)this.a.findViewById(2131296551);
    localTextView1.setLayoutParams(a(1028.0F, 260.0F));
    localTextView1.setTextSize(0, b(64.0F));
    CharSequence localCharSequence = localTextView1.getText();
    int j = TextUtils.indexOf(localCharSequence, "Deeper");
    if (j >= 0)
    {
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(localCharSequence);
      localSpannableStringBuilder.setSpan(new ForegroundColorSpan(-1547238), j, j + 6, 17);
      localTextView1.setText(localSpannableStringBuilder);
    }
    TextView localTextView2 = (TextView)this.a.findViewById(2131296552);
    RelativeLayout.LayoutParams localLayoutParams = a(1028.0F, 550.0F, -2.0F, 450.0F);
    localLayoutParams.setMargins(localLayoutParams.leftMargin, localLayoutParams.topMargin, j().getDimensionPixelOffset(2131230774), localLayoutParams.bottomMargin);
    localTextView2.setLayoutParams(localLayoutParams);
    localTextView2.setTextSize(0, b(32.0F));
    this.aj = ((PulsingImageView)this.a.findViewById(2131296548));
    this.ak = ((PulsingImageView)this.a.findViewById(2131296549));
    this.al = ((PulsingImageView)this.a.findViewById(2131296550));
    this.aj.setLayoutParams(a(177.0F, 502.0F, 673.0F, 320.0F));
    this.ak.setLayoutParams(a(112.0F, 521.0F, 808.0F, 375.0F));
    this.al.setLayoutParams(a(52.0F, 562.0F, 937.0F, 421.0F));
    this.i = 0.0F;
    this.aj.a(2100, new SwitchInterpolator(0.0F, 0.0F, 0.357F));
    this.ak.a(2100, new SwitchInterpolator(0.143F, 0.0F, 0.357F));
    this.al.a(2100, new SwitchInterpolator(0.285F, 0.0F, 0.357F));
    return true;
  }
  
  public void b()
  {
    super.b();
    this.b.post(this.am);
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.slideshow.SlideshowPage1
 * JD-Core Version:    0.7.0.1
 */