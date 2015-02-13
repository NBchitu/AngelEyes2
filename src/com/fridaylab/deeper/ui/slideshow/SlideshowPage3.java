package com.fridaylab.deeper.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fridaylab.deeper.ui.ViewTools;
import java.util.concurrent.Callable;

public class SlideshowPage3
  extends SlideshowPageFragment
  implements Callable<Boolean>
{
  public Boolean R()
  {
    this.c = this.a.getWidth();
    this.d = this.a.getHeight();
    if (this.d > this.c)
    {
      float f = this.c;
      this.c = this.d;
      this.d = f;
    }
    this.e = Math.max(this.c / 1848.0F, this.d / 1236.0F);
    this.f = (0.5F * (this.c - 1848.0F * this.e));
    this.g = (0.5F * (this.d - 1236.0F * this.e));
    a();
    return Boolean.FALSE;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if ((h() != null) && (h().containsKey("layoutId"))) {
      return super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    }
    this.a = paramLayoutInflater.inflate(2130903087, paramViewGroup, false);
    ViewTools.a(this.a, this);
    return this.a;
  }
  
  protected boolean a()
  {
    float f = b(37.0F);
    TextView localTextView1 = (TextView)this.a.findViewById(2131296561);
    localTextView1.setLayoutParams(c(1345.0F, 872.0F));
    localTextView1.setTextSize(0, f);
    TextView localTextView2 = (TextView)this.a.findViewById(2131296562);
    localTextView2.setLayoutParams(c(763.0F, 948.0F));
    localTextView2.setTextSize(0, f);
    TextView localTextView3 = (TextView)this.a.findViewById(2131296563);
    localTextView3.setLayoutParams(c(1086.0F, 800.0F));
    localTextView3.setTextSize(0, f);
    TextView localTextView4 = (TextView)this.a.findViewById(2131296564);
    localTextView4.setLayoutParams(b(1270.0F, 546.0F));
    localTextView4.setTextSize(0, f);
    TextView localTextView5 = (TextView)this.a.findViewById(2131296565);
    localTextView5.setLayoutParams(c(1308.0F, 694.0F));
    localTextView5.setTextSize(0, f);
    TextView localTextView6 = (TextView)this.a.findViewById(2131296566);
    localTextView6.setLayoutParams(c(1004.0F, 353.0F));
    localTextView6.setTextSize(0, f);
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.slideshow.SlideshowPage3
 * JD-Core Version:    0.7.0.1
 */