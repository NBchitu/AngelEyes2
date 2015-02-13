package com.fridaylab.deeper.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fridaylab.deeper.ui.ViewTools;
import java.util.concurrent.Callable;

public class SlideshowPage5
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
    this.e = Math.min(this.c / 1150.0F, this.d / 750.0F);
    this.f = (0.5F * (this.c - 1150.0F * this.e));
    this.g = (0.5F * (this.d - 750.0F * this.e));
    a();
    return Boolean.FALSE;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(2130903089, paramViewGroup, false);
    ViewTools.a(this.a, this);
    return this.a;
  }
  
  protected boolean a()
  {
    float f = b(25.0F);
    TextView localTextView1 = (TextView)this.a.findViewById(2131296571);
    localTextView1.setLayoutParams(d(389.0F, 689.0F, 160.0F, -2.0F));
    localTextView1.setTextSize(0, f);
    TextView localTextView2 = (TextView)this.a.findViewById(2131296564);
    localTextView2.setLayoutParams(c(13.0F, 530.0F, 180.0F, -2.0F));
    localTextView2.setTextSize(0, f);
    TextView localTextView3 = (TextView)this.a.findViewById(2131296565);
    localTextView3.setLayoutParams(d(377.0F, 22.0F, 132.0F, -2.0F));
    localTextView3.setTextSize(0, f);
    TextView localTextView4 = (TextView)this.a.findViewById(2131296572);
    localTextView4.setLayoutParams(c(785.0F, 222.0F, 180.0F, -2.0F));
    localTextView4.setTextSize(0, f);
    TextView localTextView5 = (TextView)this.a.findViewById(2131296573);
    localTextView5.setLayoutParams(c(810.0F, 432.0F, 132.0F, -2.0F));
    localTextView5.setTextSize(0, f);
    return true;
  }
}


/* Location:           C:\DISKD\fishfinder\apktool-install-windows-r05-ibot\classes_dex2jar.jar
 * Qualified Name:     com.fridaylab.deeper.ui.slideshow.SlideshowPage5
 * JD-Core Version:    0.7.0.1
 */